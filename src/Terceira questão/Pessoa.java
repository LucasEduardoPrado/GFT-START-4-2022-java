public class Pessoa {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    String nome =  leitor.nextDouble();
    String sexo = leitor.nextDouble();
    Date dataNascimento = leitor.nextDouble();

    System.out.printf("Informe o seu ((F)Feminino ou (M)Masculino): ");
      sexo = in.next();

      if(sexo == "f" || sexo == "F"){
        return sexo;
      }
      if(sexo == "m" || sexo == "M"){
        return sexo;
      }
    }

    public static int dataNascimento(Date data) {
      Calendar cData = Calendar.getInstance();
      Calendar cHoje= Calendar.getInstance();
      cData.setTime(data);
      cData.set(Calendar.YEAR, cHoje.get(Calendar.YEAR));
      int idade = cData.after(cHoje) ? -1 : 0;
      cData.setTime(data);
      idade += cHoje.get(Calendar.YEAR) - cData.get(Calendar.YEAR);
      return idade;
    }
    public void imprimeTempoVidaRestante() {
      if (sexo == "m" || sexo == "M"){
        resultado = idade - 73;
      }
      else if (sexo == "f" || sexo == "F"){
        resultado = idade - 80;
      }
      
    }

    System.out.println(resultado);

    

    
  }
    
}
