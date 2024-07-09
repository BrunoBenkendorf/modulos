package introducao.avalicao1;

import java.util.ArrayList;

public class Obra {
    private ArrayList<FaseDaObra> listaFases = new ArrayList<>();

    public ArrayList<FaseDaObra> getListaFases() {
        return listaFases;
    }

    public void setListaFases(ArrayList<FaseDaObra> listaFases) {
        this.listaFases = listaFases;
    }

    public String listarDadoDaObra() {
        StringBuilder montador = new StringBuilder();
        for (var umaFase : listaFases) {
            montador.append("\n Nome Fase: " + umaFase.getNome());
            for (var umItem : umaFase.getListaItens()) {
                montador.append("\n Quantidade:" + umItem.getQuantidade());
                montador.append("\n Nome Produto: " + umItem.getProduto().getNome());
                montador.append("\n Preço Produto: " + umItem.getProduto().getPreco());
            }

            for (var umEncarregado : listaFases) {
                montador.append("\n Nome Encarregado: " + umEncarregado.getEncarregado().getNome());
                montador.append("\n Numero Encarregado:  " + umEncarregado.getEncarregado().getNumero());
                montador.append("\n Salario Encarregado:  " + umEncarregado.getEncarregado().getSalario());
                montador.append("\n Formação: " + umEncarregado.getEncarregado().getFormacao());
            }
            for (var umConstrutor : umaFase.getListaConstrutores()) {
                montador.append("\n Nome do Construtor:" + umConstrutor.getNome());
                montador.append("\n Numero Construtor: " + umConstrutor.getNumero());
                montador.append("\n Salario Construtor: " + umConstrutor.getSalario());
                montador.append("\n Fase Construtor: " + umConstrutor.getFase().getNome());
                montador.append("\n Terceirizado: " + umConstrutor.isTerceirizado());
            }

        }

        return montador.toString();
    }

    public float calcularValorTotalDaObra() {
        float total = 0;

        for (var umaFase : listaFases) {

            total = total + umaFase.calcularValorFaseDaObra();

        }
        System.out.println("Total Obra:" + total);

        return total;

    }
}
