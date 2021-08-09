
public class Main {
	public static void main(String[] args) {
		
		// Utilizzo il costruttore per istanziare un oggetto per la classe Persona
		Persona p1 = new Persona("Alessandro", 170);
		Persona p2 = new Persona("Francesco", 175);
		
		// Visualizzo le variabili delle 2 istanze
		System.out.println("Persona 1:");
		System.out.println(p1.getNome());
		System.out.println(p1.getAltezza());
		
		System.out.println();
		
		System.out.println("Persona 2:");
		System.out.println(p2.getNome());
		System.out.println(p2.getAltezza());
		
		System.out.println();
		
		// Utilizzo i metodi setter per modificare le variabili dell'istanza
		p1.setNome("Daniele");
		p1.setAltezza(180);
		
		// Stampo l'istanza modificata
		System.out.println("Persona 1 modificata:");
		System.out.println(p1.getNome());
		System.out.println(p1.getAltezza());
	}
}
