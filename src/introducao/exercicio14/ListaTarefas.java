package introducao.exercicio14;

import java.util.ArrayList;

public class ListaTarefas {
    private ArrayList<Tarefa>listaTarefas = new ArrayList<>();
   
    public ArrayList<Tarefa> getListaTarefas() {
        return listaTarefas;
    }

    public void setListaTarefas(ArrayList<Tarefa> listaTarefas) {
        this.listaTarefas = listaTarefas;
    }

    public float calculaTempoTotal(){
      float total =0;
      for(var umaTarefa: listaTarefas){
          total = total +umaTarefa.getTipo().getTempo();
      }

      return total;
    }
    
    public static void main(String[] args) {
        ListaTarefas lista1 = new ListaTarefas();
        
        Tarefa tar1 = new Tarefa();
        tar1.setNome("Passear");

        var tar2 = new Tarefa();
        tar2.setNome("Pescar");

        var tar3 = new Tarefa();
        tar3.setNome("Fazer compras");

        var tar4 = new Tarefa();
        tar4.setNome("Estudar");

        var tar5 = new Tarefa();
        tar5.setNome("Trabalhar");
        
        var tar6 = new Tarefa();
        tar6.setNome("Aprender Orientação a Objetos");

        lista1.getListaTarefas().add(tar1);
        lista1.getListaTarefas().add(tar2);
        lista1.getListaTarefas().add(tar3);
        lista1.getListaTarefas().add(tar4);
        lista1.getListaTarefas().add(tar5);
        lista1.getListaTarefas().add(tar6);

        TipoTarefa tipo1 = new TipoTarefa();
        tipo1.setNome("Facíl");
        tipo1.setTempo(10f);

        TipoTarefa tipo2 = new TipoTarefa();
        tipo2.setNome("Médio");
        tipo2.setTempo(15f);

        TipoTarefa tipo3 = new TipoTarefa();
        tipo3.setNome("Difícil");
        tipo3.setTempo(20f);

        tar1.setTipo(tipo1);
        tar2.setTipo(tipo1);

        tar3.setTipo(tipo2);
        tar4.setTipo(tipo2);

        tar5.setTipo(tipo3);
        tar6.setTipo(tipo3);

        var guardar = lista1.calculaTempoTotal();
        System.out.println("Tempo total: "+guardar);
    }
}