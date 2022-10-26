package escuelaing.edu.co;
import spark.Request;
import spark.Response;
import spark.Spark.*;

import static spark.Spark.get;
import static spark.Spark.port;
import org.json.simple.JSONObject;

public class App 
{
    public static void main( String[] args )
    {port(getPort());
       get("/espalindromo",App::getPalindromo);


        //System.out.println(Calculadora.validarSiEsPalindromo("12344321"));

    }

     private static Object getPalindromo(Request req,Response res){
       String value=req.queryParams("value");
       String resultado=Palindromo.validarSiEsPalindromo(value);
       JSONObject json=new JSONObject();
       json.put("output",resultado);
       json.put("input",value);
       json.put("operation","palíndromo");
       return json;
    }

    private static int getPort(){
        if(System.getenv("PORT")!=null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}
