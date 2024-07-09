package introducao.avalicao1;

import java.util.ArrayList;

public class FaseDaObra {
    private ArrayList<ItemDeConstrucao> listaItens = new ArrayList<>();
    private Engenheiro encarregado;
    private ArrayList<Construtor> listaConstrutores = new ArrayList<>();
    private String nome;
    private Obra obra;

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public ArrayList<ItemDeConstrucao> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<ItemDeConstrucao> listaItens) {
        this.listaItens = listaItens;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Engenheiro getEncarregado() {
        return encarregado;
    }

    public void setEncarregado(Engenheiro encarregado) {
        this.encarregado = encarregado;
    }

    public ArrayList<Construtor> getListaConstrutores() {
        return listaConstrutores;
    }

    public void setListaConstrutores(ArrayList<Construtor> listaConstrutores) {
        this.listaConstrutores = listaConstrutores;
    }

    public float calcularValorFaseDaObra() {
        float total;
        total = encarregado.getSalario();
        for (var umConstrutor : listaConstrutores) {
            total = total + umConstrutor.getSalario();
        }
        for (var umItem : listaItens) {
            var quantidade = umItem.getQuantidade();
            var preco = umItem.getProduto().getPreco();
            total = total + (quantidade * preco);
        }
        System.out.println("Total Fase:" + total);
        return total;

    }
}
