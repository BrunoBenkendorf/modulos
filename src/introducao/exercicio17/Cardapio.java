package introducao.exercicio17;

import java.util.ArrayList;

public class Cardapio {
    private ArrayList<ItemCardapio>listaItemCardapio = new ArrayList<>();

    public ArrayList<ItemCardapio> getListaItemCardapio() {
        return listaItemCardapio;
    }

    public void setListaItemCardapio(ArrayList<ItemCardapio> listaItemCardapio) {
        this.listaItemCardapio = listaItemCardapio;
    }

    public String gerarCardapio(){
        StringBuilder montador = new StringBuilder();
        montador.append("Cardápio\n");
        for(var umItem : listaItemCardapio){
            if(umItem.isDisponivel()){
                var umPrato= umItem.getPrato();
                montador.append("\nNome:");
                montador.append(umPrato.getNome());
                montador.append("\nPreço:");
                montador.append(umPrato.getPreco());
            }
        }
        return montador.toString();
    }
    public static void main(String[] args) {
        Cardapio card = new Cardapio();

        Prato prato1 = new Prato();
        prato1.setNome("Bifão");
        prato1.setPreco(10f);

        Prato prato2 = new Prato();
        prato2.setNome("Feijoada");
        prato2.setPreco(30f);

        Prato prato3 = new Prato();
        prato3.setNome("Dobradinha");
        prato3.setPreco(50f);

        Prato prato4 = new Prato();
        prato4.setNome("Hamburguer");
        prato4.setPreco(20f);

        ItemCardapio item1 = new ItemCardapio();
        item1.setDisponivel(true);

        ItemCardapio item2 = new ItemCardapio();
        item2.setDisponivel(true);

        ItemCardapio item3 = new ItemCardapio();
        item3.setDisponivel(false);

        ItemCardapio item4 = new ItemCardapio();
        item4.setDisponivel(true);

        item1.setPrato(prato1);
        item2.setPrato(prato2);
        item3.setPrato(prato3);
        item4.setPrato(prato4);

        card.getListaItemCardapio().add(item1);
        card.getListaItemCardapio().add(item2);
        card.getListaItemCardapio().add(item3);
        card.getListaItemCardapio().add(item4);

        var resultado = card.gerarCardapio();
        System.out.println(resultado);
    }
}
