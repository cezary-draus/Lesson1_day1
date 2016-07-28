package it.morfoza;


import spark.ModelAndView;
import spark.Spark;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.HashMap;
import java.util.Map;

import static it.morfoza.Calculator.sume;

public class CalculatorWeb {
    public static void main(String[] arg) {

        String port = System.getenv("PORT");

        if (port != null) {
            int portInt = Integer.parseInt(port);
            Spark.port(portInt);
        }
        /*Spark.port(1025*/
Spark.staticFileLocation("/webfiles");
        Spark.get("/user2", (request, response) -> {
            String name = request.queryParams("name");
            String phonenumber = request.queryParams("phonenumber");


            Map<String, Object> model = new HashMap();
            model.put("name", name);
            model.put("phonenumber",phonenumber);
            return  new ModelAndView(model, "userresult.ftl");
        }, new FreeMarkerEngine());


        Spark.get("/calculator", (request, response) -> {
            String number1 = request.queryParams("number1");
            String number2 = request.queryParams("number2");
            String operation = request.queryParams("operation");
            int number1a = Integer.parseInt(number1);
            int number2a = Integer.parseInt(number2);
int result;

            if (operation.equals("+")){
                result = Calculator.sume(number1a,number2a);

            } else {
                 result = Calculator.minus(number1a,number2a);

            }



            Map<String, Object> model = new HashMap();
            model.put("result", result);
            model.put("number1",number1);
            model.put("number2",number2);
            model.put("operation",operation);
            return  new ModelAndView(model, "result.ftl");
        }, new FreeMarkerEngine());

                    /*"<html> <b>Elo, uczę się programować ;) Your numbers:" +
                    " " +
                    number1 +
                    ", " +
                    number2 +
                    "  Twój wynik dodawania to:" +
                    result +
                    "</b></html>";*/



        /*Map<String, Object> model = new HashMap();
        Spark.get("/user", (request, response) -> {
            return new ModelAndView(null, "user.ftl");*/

      /*  }, new FreeMarkerEngine());*/
    }
}
