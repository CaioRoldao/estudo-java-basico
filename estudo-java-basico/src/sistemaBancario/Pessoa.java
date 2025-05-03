package sistemaBancario;

public class Pessoa {


    private String nome;
    private String documento;

    public Pessoa() {}

    public Pessoa(String nome, String documento){
     this.nome = nome;
     this.documento = documento;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDocumento() {
        return this.documento;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDocumento(String documento){
        this.documento = documento;
    }
}