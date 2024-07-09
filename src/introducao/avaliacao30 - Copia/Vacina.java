package introducao.avaliacao30;

import java.util.Date;

public class Vacina {
    private String nome;
    private Date dataAplicacao;
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
    public Date getDataAplicacao() {
        return dataAplicacao;
    }
    public void setDataAplicacao(Date dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

}
