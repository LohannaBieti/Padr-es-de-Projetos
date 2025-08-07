public class processador {
    public void processar(professor p){
        System.out.println("Salvando cpf:" + p.cpf);
        p.Salvar();
    }
    public void processar(estudante e){
        System.out.println("Salvando cpf:" + e.cpf);
        e.Salvar();
    }
}
