
public class Persona {
	String nome;
	int altezza;

	public Persona(String nome, int altezza) {
	this.nome = nome;
	this.altezza = altezza;
	}
	
	public String getNome() { //prototipo del metodo
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
	
	public String toString() {
		return "Nome: " + nome + "\nAltezza: " + altezza;
	}
}
