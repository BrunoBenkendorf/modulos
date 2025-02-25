package introducao.exercicio10;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Produto> listaProdutos = new ArrayList<>();
    
    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }
    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
    public float calcSomaProdutos(){
        float total = 0;
        for(int i=0 ;i< getListaProdutos().size();i++){
        total = total +getListaProdutos().get(0).getValor();
        }
        /*for(var umProduto : getListaProdutos()){
            total = total + umProduto.getValor();
        }*/

        return total;
    }
        public static void main(String[] args) {
            Pedido pedido1 = new Pedido();
            
            Produto produto1 = new Produto();
            produto1.setNome("Banana");
            produto1.setValor(3.5f);
            pedido1.getListaProdutos().add(produto1);

            
            Produto produto2 = new Produto();
            produto2.setNome("Laranja");
            produto2.setValor(2.2f);
            pedido1.getListaProdutos().add(produto2);

            Produto produto3 = new Produto();
            produto3.setNome("Maça");
            produto3.setValor(7.2f);
            pedido1.getListaProdutos().add(produto3);
            
            Produto produto4 = new Produto();
            produto4.setNome("Pêra");
            produto4.setValor(25f);
            pedido1.getListaProdutos().add(produto4);

            float guardar = pedido1.calcSomaProdutos();
            System.out.println(guardar);
     
        }
    }
    

