package it.morfoza;

/**
 * Created by michalina on 09/08/16.
 */

public class CalculatrorMain {
    public static void main (String[] args){
        if (args.length>0 && args[0].equals("text")){
            CalculatorConsol.runOnConsol(args);
        }else {
            //CalculatorSpark.runOnSpark(args);
            CalculatorSpringBoot.runOnSpringBoot(args);
        }
    }
}
