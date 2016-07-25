package it.morfoza;


import spark.Spark;

public class CalculatorWeb {
    public static void main(String[] arg) {

        Spark.get("/calculator", (request, response)-> {return "Siema";});
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
