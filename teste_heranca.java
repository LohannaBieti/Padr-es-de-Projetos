public class teste_heranca {
    public static void main(String[] args) {
       estudante estudante = new estudante();
       estudante.cpf = "222";
       System.out.println(estudante.Salvar());

       professor prof = new professor();
       prof.cpf = "111";
       faculdade up = new faculdade();
       up.processar(estudante);

    }
}
