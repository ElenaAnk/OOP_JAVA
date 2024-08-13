package org.example;


import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;

public class Main{
    public static void main(String[] args) throws IOException {

        CalculatorView view = new CalculatorView();
        CalculatorModel model = new CalculatorModel();

        CalculatorPresenter presenter = new CalculatorPresenter(view, model);

        String operation = view.getOperation();
        Double x = view.GetMake();
        Double y = view.GetMake();
        presenter.performOperation(operation,x,y);
        presenter.logger(operation,x,y,model.getResult());



        }
    }
