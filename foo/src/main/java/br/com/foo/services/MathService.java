package br.com.foo.services;

import br.com.foo.exception.UnsuportedMathOperationException;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    private Double convertToDouble(String strNumber) {
        String number = strNumber.replaceAll(",", ".");
        return Double.parseDouble(number);
    }

    public boolean isNumeric(String strNumber) {
        if (strNumber == null) {
            return false;
        }
        String number = strNumber.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]");
    }

    public boolean isNumeric(String strNumber, String strNumberTwo) {
        if (strNumber == null || strNumberTwo == null) {
            return false;
        }
        String number = strNumber.replaceAll(",", ".");
        String numberTwo = strNumberTwo.replace(",", ".");
        if (number.matches("[-+]?[0-9]*\\.?[0-9]") && numberTwo.matches("[-+]?[0-9]*\\.?[0-9]")) {
            return true;
        }
        return false;
    }

    public Double sum(String numberOne, String numberTwo) {
        if (!isNumeric(numberOne, numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }
        Double sum = convertToDouble(numberOne) + convertToDouble(numberTwo);
        return sum;
    }

    public Double subtraction(String numberOne, String numberTwo) {
        if (!isNumeric(numberOne, numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }
        Double subtraction = convertToDouble(numberOne) - convertToDouble(numberTwo);
        return subtraction;
    }

    public Double multiplication(String numberOne, String numberTwo) {
        if (!isNumeric(numberOne, numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }
        Double multiplication = convertToDouble(numberOne) * convertToDouble(numberTwo);
        return multiplication;
    }

    public Double division(String numberOne, String numberTwo) {
        if (!isNumeric(numberOne, numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }
        if (convertToDouble(numberTwo) == 0) {
            throw new UnsuportedMathOperationException("Number cannot be divisible by zero");
        }
        Double division = convertToDouble(numberOne) / convertToDouble(numberTwo);
        return division;
    }

    public Double mean(String numberOne, String numberTwo) {
        if(!isNumeric(numberOne, numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }
        Double mean = (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2;
        return mean;
    }

    public Double squareRoot(String numberOne) {
        if(!isNumeric(numberOne)) {
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }
        Double squareRoot = (double) Math.sqrt(convertToDouble(numberOne));
        return squareRoot;
    }
}
