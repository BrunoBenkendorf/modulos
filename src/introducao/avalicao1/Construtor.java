package introducao.avalicao1;

public class Construtor extends Colaborador {
    private boolean terceirizado;
    private FaseDaObra fase;
    public FaseDaObra getFase() {
        return fase;
    }

    public void setFase(FaseDaObra fase) {
        this.fase = fase;
    }

    public boolean isTerceirizado() {
        return terceirizado;
    }

    public void setTerceirizado(boolean terceirizado) {
        this.terceirizado = terceirizado;
    }

    
}
