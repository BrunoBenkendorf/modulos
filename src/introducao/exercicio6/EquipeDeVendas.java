package introducao.exercicio6;

import java.util.ArrayList;

public class EquipeDeVendas {
   private Gerente gestor;
   private ArrayList<Vendedor> listaVendedores = new ArrayList<>();
   
   public Gerente getGestor() {
      return gestor;
   }

   public ArrayList<Vendedor> getListaVendedores() {
      return listaVendedores;
   }

   public void setListaVendedores(ArrayList<Vendedor> listaVendedores) {
      this.listaVendedores = listaVendedores;
   }

   public void setGestor(Gerente gestor) {
      this.gestor = gestor;
   }
     
   public String listarEquipe(){
      StringBuilder montadorDeStrings = new StringBuilder();
      montadorDeStrings.append("GERENTE");
      montadorDeStrings.append("Nome: "+this.getGestor().getNome()+"\n");
      montadorDeStrings.append(String.format("Setor: %s \n",this.getGestor().getSetor()));
      montadorDeStrings.append(String.format("Telefone: %s \n",this.getGestor().getTelefone()));
      montadorDeStrings.append(String.format("Id: %s \n", this.getGestor().getId()));

      for(var umVendedor : this.getListaVendedores()){
         montadorDeStrings.append("VENDEDORES \n");
         montadorDeStrings.append(String.format("Id: %s\n",umVendedor.getId()));
         montadorDeStrings.append(String.format("Nome: %s\n",umVendedor.getNome()));
         montadorDeStrings.append(String.format("Telefone: %s \n",umVendedor.getTelefone()));
         montadorDeStrings.append(String.format("Meta Venda: %s \n",umVendedor.getMetaVendas()));
         montadorDeStrings.append(String.format("Comissão: %f \n", umVendedor.getPerComissao()));
         /* valMETA         100%
            valcomissao     perccomissao
          */
         var valcomissao = (umVendedor.getMetaVendas() * umVendedor.getPerComissao()) / 100f;
         montadorDeStrings.append(String.format("Val comissao: %f \n", valcomissao));   
     }
     return montadorDeStrings.toString();
   }
    
    
}
