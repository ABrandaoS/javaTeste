public class Operadores {
    public static void main(String[] args) {
        
        int a,b;

        a = 5;
        b = 5;

        String resultado;

        if (a==b) {
            resultado = "verdadeiro";
        } else resultado = "falso";

        System.out.println(resultado);

        resultado = (a==b) ? "verdadeiro" : "falso";
       
        System.out.println(resultado);
        
    }


}
