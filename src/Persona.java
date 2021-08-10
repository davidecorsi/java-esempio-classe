
public class Persona {
	String nome; // tipo riferimento
	int altezza; // tipo primitivo

	public Persona(String nome, int altezza) { //prototipo del metodo
	this.nome = nome;
	this.altezza = altezza;
	}
	
	public String getNome() {
	return nome;
	}
	
	public int getAltezza() {
	return altezza;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
}
