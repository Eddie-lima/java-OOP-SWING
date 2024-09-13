public class Uchiha extends Ninja{
    String nivelDoSharingan = "Sharingan 2";
    public void sharinganAtivado(){
        System.out.println("Sharingan Ativado");
    }

    @Override
    public void ataqueBase() {
        System.out.println("jogou uma Kunai de fogo");
    }
}
