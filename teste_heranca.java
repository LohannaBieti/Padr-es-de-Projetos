public class teste_heranca {
    public static void main(String[] args) {
        professor prof = new professor();
        prof.cpf = "888";
        prof.telefone = "4198423542";
        prof.matricula = "666";
        System.out.println(prof.Salvar());
        //prof.Salvar();

        System.out.println("Parte estudante");
        estudante e1 = new estudante();
        e1.cpf = "888";
        System.out.println(e1.Salvar());

        processador processador = new processador();
        processador.processar(prof);
    }
}
