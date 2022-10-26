package escuelaing.edu.co;


    public class Palindromo {


    public static String validarSiEsPalindromo(String palabra){
        int counter = 0;
        int longWord = palabra.length()-1;
        boolean isError = false;

        while ((counter<longWord) && (!isError)){
            if (palabra.charAt(counter) == palabra.charAt(longWord)){
                counter++;
                longWord--;
            } else {
                isError = true;
            }
        }
        if (!isError){
            return "Si es palíndromo";
        }else{
            return "No es palíndromo";
        }

    }
}
