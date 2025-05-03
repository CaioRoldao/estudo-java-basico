package HERANCA;

public class test {

    public static void main(String[] args) {

//        PessoaFisica pf = new PessoaFisica();
//        pf.setNome("Lorenzo");
//        pf.setCpf("12345657");
//
//
//        PessoaJuridica pj = new PessoaJuridica();
//        pj.setNome("nepal ltda");
//        pj.setCnpj("1234567/0001-33");
        Pessoa p = new PessoaFisica();
        ((PessoaFisica) p).setCpf("37442409830");
        System.out.println(p.getDocumebtoFormatado());

        Pessoa pj = new PessoaJuridica();
        ((PessoaJuridica) pj).setCnpj("23484296000169");
        System.out.println(pj.getDocumebtoFormatado());

    }





}
