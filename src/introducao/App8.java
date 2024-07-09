package introducao;

import java.util.Calendar;
import java.util.GregorianCalendar;

import introducao.exercicio5.Agenda;
import introducao.exercicio5.Agendamento;
import introducao.exercicio5.Medico;
import introducao.exercicio5.Paciente;

public class App8 {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();
        Paciente paciente2 = new Paciente();
        Paciente paciente3 = new Paciente();
        Paciente paciente4 = new Paciente();
        Medico medico1 = new Medico();
        Medico medico2 = new Medico();

        paciente1.setId(1);
        paciente1.setNome("João");
        paciente1.setTelefone("9999-9999");

        paciente2.setId(2);
        paciente2.setNome("Jeff");
        paciente2.setTelefone("8888-8888");

        paciente3.setId(4);
        paciente3.setNome("Jonas");
        paciente3.setTelefone("5555-5555");

        paciente4.setId(5);
        paciente4.setNome("Jasmin");
        paciente4.setTelefone("9898-9898");

        medico1.setId(1);
        medico1.setNome("Ronaldo");
        medico1.setCRM("1234");

        medico2.setId(2);
        medico2.setNome("Ricardinho");
        medico2.setCRM("5555");

        var agenda1 = new Agenda();
        agenda1.setId(1);
        agenda1.setMedico(medico1);

        var agenda2 = new Agenda();
        agenda2.setId(2);
        agenda2.setMedico(medico2);

        Agendamento agendamento1 = new Agendamento();
        agendamento1.setId(1);
        agendamento1.setMedico(medico1);
        agendamento1.setPaciente(paciente1);
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.set(2022, 02 , 01, 13,00);
        agendamento1.setDataHora(calendario.getTime());
        agenda1.getListaAgendamentos().add(agendamento1);

        Agendamento agendamento2 = new Agendamento();
        agendamento2.setId(2);
        agendamento2.setMedico(medico2);
        agendamento2.setPaciente(paciente1);
        calendario.set(2022, 02 , 10, 12 ,00);
        agendamento2.setDataHora(calendario.getTime());
        agenda2.getListaAgendamentos().add(agendamento2);

        Agendamento agendamento3 = new Agendamento();
        agendamento3.setId(3);
        agendamento3.setMedico(medico1);
        agendamento3.setPaciente(paciente2);
        calendario.set(2022, 02 , 02, 11 ,00);
        agendamento3.setDataHora(calendario.getTime());
        agenda1.getListaAgendamentos().add(agendamento3);

        Agendamento agendamento4 = new Agendamento();
        agendamento4.setId(4);
        agendamento4.setMedico(medico2);
        agendamento4.setPaciente(paciente2);
        calendario.set(2022, 02 , 11, 13 ,00);
        agendamento4.setDataHora(calendario.getTime());
        agenda2.getListaAgendamentos().add(agendamento4);

        Agendamento agendamento5 = new Agendamento();
        agendamento5.setId(5);
        agendamento5.setMedico(medico1);
        agendamento5.setPaciente(paciente3);
        calendario.set(2022, 02 , 03, 10 ,00);
        agendamento5.setDataHora(calendario.getTime());
        agenda1.getListaAgendamentos().add(agendamento5);

        Agendamento agendamento6 = new Agendamento();
        agendamento6.setId(6);
        agendamento6.setMedico(medico2);
        agendamento6.setPaciente(paciente3);
        calendario.set(2022, 02 , 12, 12 ,00);
        agendamento6.setDataHora(calendario.getTime());
        agenda2.getListaAgendamentos().add(agendamento6);

        Agendamento agendamento7 = new Agendamento();
        agendamento7.setId(7);
        agendamento7.setMedico(medico1);
        agendamento7.setPaciente(paciente4);
        calendario.set(2022, 02 , 04, 9 ,00);
        agendamento7.setDataHora(calendario.getTime());
        agenda1.getListaAgendamentos().add(agendamento7);

        Agendamento agendamento8 = new Agendamento();
        agendamento8.setId(8);
        agendamento8.setMedico(medico2);
        agendamento8.setPaciente(paciente4);
        calendario.set(2022, 02 , 13, 14 ,00);
        agendamento8.setDataHora(calendario.getTime());
        agenda2.getListaAgendamentos().add(agendamento8);

        agenda1.imprimirAgenda();
        agenda2.imprimirAgenda();
    } 
    
}
