public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        String concatenacao = "?";

        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);


        int numero = 5;
        numero ++;

        System.out.println(++ numero);


        boolean verdadeiro = true;
        System.out.println("Inverteu " + !verdadeiro);

        int modulo = 18 % 3;
        System.out.println(modulo);

        double resultado = (10 * 7) + (20/4);
        System.out.println(resultado);
    }
}
