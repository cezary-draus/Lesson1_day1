package it.morfoza;


import spark.ModelAndView;
import spark.Spark;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.HashMap;
import java.util.Map;

public class CalculatorWeb {
    public static void main(String[] arg) {

        String port = System.getenv("PORT");

        if (port != null) {
            int portInt = Integer.parseInt(port);
            Spark.port(portInt);
        }
        Spark.staticFileLocation("/webfiles");
        Spark.get("/calculator", (request, response) -> {
            String number1 = request.queryParams("number1");
            String number2 = request.queryParams("number2");

            int number1a = Integer.parseInt(number1);
            int number2a = Integer.parseInt(number2);
            int result = number1a + number2a;

            Map<String, Object> model = new HashMap();
            model.put("result", result);
            model.put("number1",number1);
            model.put("number2",number2);
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

        Spark.get("/contact", ((request, response) -> {
            return "<html>" +
                    "<form action=\"/calculator\">" +
                    "<input name=\"number1\">" +
                    "<input name=\"number2\">" +
                    "<input type=\"submit\">" +
                    "</form>" +
                    "</html>";

        }));


       /* Map<String, Object> model = new HashMap();
        Spark.get("/user", (request, response) -> {
            return new ModelAndView(null, "user.ftl");

        }, new FreeMarkerEngine());*/
    }
}
