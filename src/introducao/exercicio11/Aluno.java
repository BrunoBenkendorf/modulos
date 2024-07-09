package introducao.exercicio11;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Nota> listaNotas = new ArrayList<>();

    public ArrayList<Nota> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Nota> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float calcMediaNotas() {
        float media = 0;
        float soma = 0;
        for (int i = 0; i < listaNotas.size(); i++) {
            var umaNota = listaNotas.get(i);
            soma = soma + umaNota.getValor();
        }
        media = soma / listaNotas.size();
        return media;
    }

    public static void main(String[] args) {
        Aluno zezinho = new Aluno();
        zezinho.setNome("Zezinho da Silva");
        Nota nota1 = new Nota();
        nota1.setValor(5);
        zezinho.getListaNotas().add(nota1);

        Nota nota2 = new Nota();
        nota2.setValor(7);
        zezinho.getListaNotas().add(nota2);

        Nota nota3 = new Nota();
        nota3.setValor(6);
        zezinho.getListaNotas().add(nota3);

        var resultado = zezinho.calcMediaNotas();
        System.out.println("Media: " + resultado);
    }

}
