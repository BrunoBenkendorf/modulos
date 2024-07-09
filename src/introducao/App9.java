package introducao;

import introducao.exercicio6.EquipeDeVendas;
import introducao.exercicio6.Gerente;
import introducao.exercicio6.Vendedor;

public class App9 {
    public static void main(String[] args) {
        var vend1 = new Vendedor();
        vend1.setId(1);
        vend1.setNome("Zezinho");
        vend1.setPerComissao(2);
        vend1.setMetaVendas(2000);
        vend1.setTelefone("5555-2222");

        var vend2 = new Vendedor();
        vend2.setId(2);
        vend2.setNome("João");
        vend2.setPerComissao(3);
        vend2.setMetaVendas(2400);
        vend2.setTelefone("5555-1112");

        var vend3 = new Vendedor();
        vend3.setId(3);
        vend3.setNome("Lucas");
        vend3.setPerComissao(4);
        vend3.setMetaVendas(1000);
        vend3.setTelefone("5555-3333");

        var vend4 = new Vendedor();
        vend4.setId(4);
        vend4.setNome("Josesinho");
        vend4.setPerComissao(5);
        vend4.setMetaVendas(2000);
        vend4.setTelefone("5555-4444");

        var vend5 = new Vendedor();
        vend5.setId(5);
        vend5.setNome("luis");
        vend5.setPerComissao(3);
        vend5.setMetaVendas(3000);
        vend5.setTelefone("5555-5555");

        var geren1 = new Gerente();
        geren1.setId(1);
        geren1.setNome("Sr. Burns");
        geren1.setSetor("Diretoria");
        geren1.setTelefone("5555-6666");
    
        var geren2 = new Gerente();
        geren2.setId(2);
        geren2.setNome("Sr. Richfield");
        geren2.setSetor("Diretoria");
        geren2.setTelefone("5555-7777");

        EquipeDeVendas equipe1 = new EquipeDeVendas();
        equipe1.setGestor(geren1);
        equipe1.getListaVendedores().add(vend1);
        vend1.setEquipe(equipe1);
        equipe1.getListaVendedores().add(vend2);
        vend2.setEquipe(equipe1);
        equipe1.getListaVendedores().add(vend3);
        vend3.setEquipe(equipe1);

        var retorno = equipe1.listarEquipe();
        System.out.println(retorno);

        EquipeDeVendas equipe2 = new EquipeDeVendas();
        equipe2.setGestor(geren2);
        equipe2.getListaVendedores().add(vend4);
        vend4.setEquipe(equipe2);
        equipe2.getListaVendedores().add(vend5);
        vend5.setEquipe(equipe2);

        retorno = equipe2.listarEquipe();
        System.out.println(retorno);
    }
}
