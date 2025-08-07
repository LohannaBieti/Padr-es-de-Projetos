public class professor extends pessoa{
    public String matricula;
    public String titulacao;

    @Override
    public boolean Salvar(){
       System.out.println("Salvando na tabela professor");
       return true;
    }
}
