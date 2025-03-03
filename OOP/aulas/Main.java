package aulas;

public class Main{
    public static void main(String[] args){
        Livro livro1 = new Livro();
        livro1.isbn = "1247832561023";
        livro1.nome = "Kama Sutra";
        livro1.valor = 20.00;
        
        System.out.println("O nome do livro é " + livro1.nome);
        System.out.println("Seu valor é R$" + livro1.valor);
    }
}