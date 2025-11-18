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

	public void parler(String texte) {
		System.out.println("(" + nom + ")" + " - " + texte);
	}

	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonFavoris);
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavoris + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler(
					"J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		} else {
			parler(
					"Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un " + bien + " kimono à " + prix + " sous.");
		}
	}

	protected void gagnerArgent(int gain) {
		argent += gain;
	}

	protected void perdreArgent(int perte) {
		argent -= perte;
	}

}
