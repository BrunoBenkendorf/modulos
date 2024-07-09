package introducao.avaliacao30;

public class Procedimento {
    private String nome;
    private float valor;
    private Pet pet;

    public String getNome() {
        return nome;
    }
    public Pet getPet() {
        return pet;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
