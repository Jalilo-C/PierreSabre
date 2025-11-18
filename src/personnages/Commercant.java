package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public int seFaireExtorquer() {
		int argent = getargent();
		parler("J’ai tout perdu! Le monde est trop injuste...");	
		perdreArgent(argent);
		return argent;
	}
	
	public void recevoirArgent(int argent) {
		parler(argent + " sous ! Je te remercie généreux donateur!");
		gagnerArgent(argent);
	}
	
	
}
