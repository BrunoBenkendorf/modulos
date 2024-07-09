package introducao.avaliacao30;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class AppAvaliacao30 {
    public static void main(String[] args) {
        

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Zezinho");
        pessoa1.setTelefone("9999-9999");

        Vacina vac1 = new Vacina();
        vac1.setNome("Gripe Canina");
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.set(2022, 06, 01);
        vac1.setDataAplicacao(calendario.getTime());

        var vac2 = new Vacina();
        vac2.setNome("Anti-Rabica");
        Calendar calendario1 = GregorianCalendar.getInstance();
        calendario1.set(2022, 07, 01);
        vac2.setDataAplicacao(calendario1.getTime());

        var proc1 = new Procedimento();
        proc1.setNome("Banho");
        proc1.setValor(120f);

        var proc2 = new Procedimento();
        proc2.setNome("Tosa");
        proc2.setValor(250f);

        Pet pet1 = new Pet();
        pet1.setNome("Lulu");
        Calendar calendario2 = GregorianCalendar.getInstance();
        calendario2.set(2015, 12, 01);
        pet1.setDataNascimento(calendario2.getTime());
        pet1.setDono(pessoa1);
        pet1.getListaDeVacinas().add(vac1);
        vac1.setPet(pet1);
        pet1.getListaDeVacinas().add(vac2);
        vac2.setPet(pet1);
        pet1.getListaDeProcedimento().add(proc1);
        proc1.setPet(pet1);
        pet1.getListaDeProcedimento().add(proc2);
        proc2.setPet(pet1);

        var pessoa2 = new Pessoa();
        pessoa2.setNome("Luizinho");
        pessoa2.setTelefone("8888-9999");

        var vac3 = new Vacina();
        vac3.setNome("Gripe Canina");
        Calendar calendario3 = GregorianCalendar.getInstance();
        calendario3.set(2022, 06, 01);
        vac3.setDataAplicacao(calendario3.getTime());

        var proc3 = new Procedimento();
        proc3.setNome("Banho");
        proc3.setValor(90f);

        var proc4 = new Procedimento();
        proc4.setNome("Tosa");
        proc4.setValor(150f);

        var proc5 = new Procedimento();
        proc5.setNome("Hospedagem");
        proc5.setValor(600f);

        Pet pet2 = new Pet();
        pet2.setNome("Precioso");
        Calendar calendario4 = GregorianCalendar.getInstance();
        calendario4.set(2018,12,01);
        pet2.setDataNascimento(calendario4.getTime());
        pet2.setDono(pessoa2);
        pet2.getListaDeVacinas().add(vac3);
        vac3.setPet(pet2);
        pet2.getListaDeProcedimento().add(proc3);
        proc3.setPet(pet2);
        pet2.getListaDeProcedimento().add(proc4);
        proc4.setPet(pet2);
        pet2.getListaDeProcedimento().add(proc5);
        proc5.setPet(pet2);

        var guarda1 = pet1.gerarHistoricoMedico();
        System.out.println(guarda1);
        var guarda2 = pet1.somarValoresProcedimentos();
        System.out.println("Valor total: " + guarda2);
        var guarda3 = pet2.gerarHistoricoMedico();
        System.out.println(guarda3);
        var guarda4 = pet2.somarValoresProcedimentos();
        System.out.println("Valor total: "+guarda4);

    }
    
}
