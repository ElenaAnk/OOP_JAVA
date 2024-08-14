package org.example;


import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class CalculatorPresenter {
    public CalculatorView view;
    public CalculatorModel model;



    public CalculatorPresenter (CalculatorView view,CalculatorModel model){
        this.view = view;
        this.model = model;

    }

    public  void performOperation (String operation, double x, double y) {

        switch (operation){
            case "+":
                model.calculatorAdd(x,y);
                break;

            case "*":
                model.calculatorMultiply(x,y);
                break;
            case "/":
                model.calculatorDivide(x,y);
                break;
            default:
                System.out.println("Некорректная операция");
        }

     view.displayResult(model.getResult());

    }
    public void logger(String operation, double x, double y, double result) throws IOException {

        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Main.class.getName());
        FileHandler fh = new FileHandler("log.txt");

        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        logger.info("" + x + operation + y + "=" + result);

    }


}
