package HERANCA;

public class PessoaFisica extends Pessoa{

    private String cpf;

    public String getCpf() {
        return  cpf;

    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getDocumebtoFormatado() {
        return 
               String.format("%s.%s.%s-%s",
                cpf.substring(0,3),
                cpf.substring(3,6),
                cpf.substring(6,9),
                cpf.substring(9));
    }
}
