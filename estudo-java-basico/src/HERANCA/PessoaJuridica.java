package HERANCA;

public  class PessoaJuridica extends Pessoa {


    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {

        this.cnpj = cnpj;
    }

   public String getDocumebtoFormatado() {
      return String.format("%s.%s.%s/%s-%s",
              cnpj.substring(0,2),
              cnpj.substring(2,5),
              cnpj.substring(5,8),
              cnpj.substring(8,12),
              cnpj.substring(12));

    }
}
