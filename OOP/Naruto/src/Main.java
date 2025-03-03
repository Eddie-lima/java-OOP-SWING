public class Main {
    public static void main(String[] args) throws Exception {
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.temBiju = true;
        System.out.println(naruto.nome);
        
        Uchiha sasuke = new Uchiha();

        sasuke.sharinganAtivado();
        sasuke.nome = "Sasuke Uchiha";
        System.out.print(sasuke.nome + " ");
        sasuke.ataqueBase();

        // System.out.println();
        
        // System.out.print(naruto.nome + " ");
        // naruto.ataqueBase();
    }
}
