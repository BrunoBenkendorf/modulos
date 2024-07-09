package introducao.avaliacao30;

import java.util.ArrayList;
import java.util.Date;

public class Pet {
    private String nome;
    private Date dataNascimento;
    private Pessoa dono;
    private ArrayList<Procedimento> listaDeProcedimento = new ArrayList<>();
    private ArrayList<Vacina> listaDeVacinas = new ArrayList<>();
     

    public String getNome() {
        return nome;
    }
    public ArrayList<Vacina> getListaDeVacinas() {
        return listaDeVacinas;
    }
    public void setListaDeVacinas(ArrayList<Vacina> listaDeVacinas) {
        this.listaDeVacinas = listaDeVacinas;
    }
    public ArrayList<Procedimento> getListaDeProcedimento() {
        return listaDeProcedimento;
    }
    public void setListaDeProcedimento(ArrayList<Procedimento> listaDeProcedimento) {
        this.listaDeProcedimento = listaDeProcedimento;
    }
    public Pessoa getDono() {
        return dono;
    }
    public void setDono(Pessoa dono) {
        this.dono = dono;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String gerarHistoricoMedico(){
        StringBuilder montador = new StringBuilder();
        montador.append("\n Nome pet: " + getNome());
        montador.append("\n Data Nascimento: " + getDataNascimento());
        montador.append("\n Nome Dono: "+getDono().getNome());
        montador.append("\n Telefone Dono: "+getDono().getTelefone());

        for(var umaVacina : getListaDeVacinas()){
            montador.append("\n Nome da Vacina: "+umaVacina.getNome());
            montador.append("\n Data Aplicação: "+umaVacina.getDataAplicacao());
        }
        return montador.toString();
    }

    public float somarValoresProcedimentos(){
        float total = 0;
        for(var umProcedimento : getListaDeProcedimento()){
            total += umProcedimento.getValor();
        }
        return total;
    }
}
