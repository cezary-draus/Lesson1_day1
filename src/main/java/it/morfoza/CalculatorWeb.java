package it.morfoza;


import spark.Spark;

public class CalculatorWeb {
    public static void main(String[] arg) {

        String port = System.getenv("PORT");

        if (port != null) {
            int portInt = Integer.parseInt(port);
            Spark.port(portInt);
        }

        Spark.get("/calculator", (request, response) -> {
            return "<html> <b>Cześć Tomasz, I love you <3 Tego się spodziewałeś? ;)</b></html>";
        });
        Spark.get("/contact", ((request, response) -> {
            return "<html>" +
                    "<form action=\"/calculator\">" +
                    "<input name=\"number1\">" +
                    "<input name=\"number2\">" +
                    "<input type=\"submit\">" +
                    "</form>" +
                    "</html>";

        }));
    }
}
