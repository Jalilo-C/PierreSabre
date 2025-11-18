package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boissonFavoris, int argent) {
		super(nom, boissonFavoris, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int argent = getargent();
		int argentDonne =  argent / 10;
		parler(beneficiaire.getNom() + " prend ces " +  argentDonne + " sous.");
		perdreArgent(argentDonne);
		beneficiaire.gagnerArgent(argentDonne);
		beneficiaire.parler(argentDonne + " sous ! Je te remercie généreux donateur!");
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur * 2;
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (force >= adversaire.getReputation()) {
			parler("Je t’ai eu petit yakusa!");
			int argentPique = adversaire.perdre();
			gagnerArgent(argentPique);
			honneur++;
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			int argentPerdu = getargent();
			adversaire.gagner(argentPerdu);
			perdreArgent(argentPerdu);
			honneur--;
		}
	}
}
