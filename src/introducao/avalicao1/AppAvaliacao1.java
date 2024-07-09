package introducao.avalicao1;

public class AppAvaliacao1 {
    public static void main(String[] args) {
      var obra1 = new Obra();  
      var eng1 = new Engenheiro();
      eng1.setNome("Rick Sanchez");
      eng1.setNumero(1234);
      eng1.setSalario(10000);
      eng1.setFormacao("Engenheiro Civil");

      var cons1 = new Construtor();
      cons1.setNome("Huguinho");
      cons1.setNumero(1111);
      cons1.setSalario(3000);
      cons1.setTerceirizado(false);

      var cons2 = new Construtor();
      cons2.setNome("Luizinho");
      cons2.setNumero(2222);
      cons2.setSalario(2500);
      cons2.setTerceirizado(true);
      
      var eng2 = new Engenheiro();
      eng2.setNome("Emmett Brown");
      eng2.setNumero(4321);
      eng2.setSalario(15000);
      eng2.setFormacao("Engenheiro Civil");

      var cons3 = new Construtor();
      cons3.setNome("Zezinho");
      cons3.setNumero(3333);
      cons3.setSalario(3000);
      cons3.setTerceirizado(false);
    
      var mat1 = new MaterialDeConstrução();
      mat1.setNome("Viga de madeira");
      mat1.setPreco(20);

      var item1 = new ItemDeConstrucao();
      item1.setQuantidade(500);
      item1.setProduto(mat1);

      var mat2 = new MaterialDeConstrução();
      mat2.setNome("Saco de cimento");
      mat2.setPreco(80);

      var item2 = new ItemDeConstrucao();
      item2.setProduto(mat2);
      item2.setQuantidade(800);

      var mat3 = new MaterialDeConstrução();
      mat3.setNome("Vergalhão de Aço");
      mat3.setPreco(50);

      var item3 = new ItemDeConstrucao();
      item3.setProduto(mat3);
      item3.setQuantidade(900);

      var item4 = new ItemDeConstrucao();
      item4.setProduto(mat2);
      item4.setQuantidade(1000);

      var fase1 = new FaseDaObra();
      fase1.setNome("Fundação");
      fase1.setEncarregado(eng2);
      fase1.getListaConstrutores().add(cons3);
      cons3.setFase(fase1);
      fase1.getListaItens().add(item3);
      item3.setFase(fase1);
      fase1.getListaItens().add(item4);
      item4.setFase(fase1);
      fase1.calcularValorFaseDaObra();

      var fase2 = new FaseDaObra();
      fase2.setNome("PrimeiroAndar");
      fase2.setEncarregado(eng1);
      fase2.getListaConstrutores().add(cons1);
      cons1.setFase(fase2);
      fase2.getListaConstrutores().add(cons2);
      cons2.setFase(fase2);
      fase2.getListaItens().add(item1);
      item1.setFase(fase2);
      fase2.getListaItens().add(item2);
      item2.setFase(fase2);
      fase2.calcularValorFaseDaObra();

       obra1.getListaFases().add(fase1);
      fase1.setObra(obra1);
       obra1.getListaFases().add(fase2);
       fase2.setObra(obra1);
     String retono = obra1.listarDadoDaObra();
     System.out.println(retono);
     
     var calc = obra1.calcularValorTotalDaObra();
     System.out.println(calc);

    }
    
}
