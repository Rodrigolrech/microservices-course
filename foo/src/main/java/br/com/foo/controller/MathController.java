package br.com.foo.controller;

import br.com.foo.exception.UnsuportedMathOperationException;
import br.com.foo.services.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @Autowired
    private MathService service;

    @RequestMapping(value="/sum/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        Double sum = service.sum(numberOne, numberTwo);
        return sum;
    }

    @RequestMapping(value="/subtraction/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        Double subtraction = service.subtraction(numberOne, numberTwo);
        return subtraction;
    }

    @RequestMapping(value="/multiplication/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        Double multiplication = service.multiplication(numberOne, numberTwo);
        return multiplication;
    }

   @RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
   public double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        Double division = service.division(numberOne, numberTwo);
        return division;
   }

   @RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
   public double mean(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        Double mean = service.mean(numberOne, numberTwo);
        return mean;
   }

   @RequestMapping(value = "/squareRoot/{numberOne}", method = RequestMethod.GET)
   public double squareRoot(@PathVariable("numberOne") String numberOne) throws Exception {
        Double squareRoot = service.squareRoot(numberOne);
        return squareRoot;
   }

}
