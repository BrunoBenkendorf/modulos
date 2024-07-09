package introducao.avalicao1;

public class ItemDeConstrucao {
    private MaterialDeConstrução produto;
    private FaseDaObra fase;
    private int quantidade;
    
   
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public FaseDaObra getFase() {
        return fase;
    }

    public void setFase(FaseDaObra fase) {
        this.fase = fase;
    }

    public MaterialDeConstrução getProduto() {
        return produto;
    }

    public void setProduto(MaterialDeConstrução produto) {
        this.produto = produto;
    }

   

  
    
}
