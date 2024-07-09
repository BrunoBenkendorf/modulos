package introducao.exercicio6;

public class Vendedor extends Funcionario{
    private float perComissao;
    private float metaVendas;
    private EquipeDeVendas equipe;

    
    
    public float getPerComissao() {
        return perComissao;
    }
    public EquipeDeVendas getEquipe() {
        return equipe;
    }
    public void setEquipe(EquipeDeVendas equipe) {
        this.equipe = equipe;
    }
    public void setPerComissao(float perComissao) {
        this.perComissao = perComissao;
    }
    public float getMetaVendas() {
        return metaVendas;
    }
    public void setMetaVendas(float metaVendas) {
        this.metaVendas = metaVendas;
    }

    
    
}
