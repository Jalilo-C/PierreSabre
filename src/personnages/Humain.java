package personnages;

public class Humain {
	private String nom;
	private String boissonFavoris;
	private int argent;

	public Humain(String nom, String boissonFavoris, int argent) {
		this.nom = nom;
		this.boissonFavoris = boissonFavoris;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getargent() {
		return argent;
	}

	public String parler(String texte) {
		return "(" + nom + ")" + " - " + texte;
	}

	public void direBonjour() {
		System.out.println(parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonFavoris));
	}

	public void boire() {
		System.out.println(parler("Mmmm, un bon verre de " + boissonFavoris + " ! GLOUPS !"));
	}

	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			System.out.println(parler(
					"J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous"));
			perdreArgent(prix);
		} else {
			System.out.println(parler(
					"Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un " + bien + " kimono à " + prix + " sous."));
		}
	}

	public void gagnerArgent(int gain) {
		argent += gain;
	}

	public void perdreArgent(int perte) {
		argent -= perte;
	}

}
