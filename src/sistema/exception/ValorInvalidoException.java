package sistema.exception;

public class ValorInvalidoException extends Exception {
    private String nomeCampo = "";

    public ValorInvalidoException(String mensagem, Exception origem, String nomeCampo) {
        super(mensagem, origem);
        this.nomeCampo = nomeCampo;
    }

    public ValorInvalidoException(String mensagem, Exception origem) {
        super(mensagem,origem);//super se refere a SuperClasse(Pai) Exception
        //super(); chama o construtor da SuperClasse

    }
}
 