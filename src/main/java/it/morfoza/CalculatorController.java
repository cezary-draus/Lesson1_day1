package it.morfoza;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by michalina on 09/08/16.
 */
@Controller
public class CalculatorController {

    @RequestMapping("/yeah")

    public String yeah(){
        return "yeah";
    }

}
