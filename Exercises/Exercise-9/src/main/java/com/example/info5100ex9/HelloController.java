package com.example.info5100ex9;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label answer;
    public TextField number1;
    public TextField number2;

    @FXML
    protected void onOperationClick(ActionEvent event) {

        //Extractions
        String type = ((Control)event.getTarget()).getId();
        String a = number1 != null ?number1.getText() : "0";
        String b = number2 != null ?number2.getText() : "0";

        //Logic
        int ans = 0;
        switch(type) {
            case "multiply":
                ans = getInt(a) * getInt(b);
                break;
            case "divide":
                ans = getInt(b) != 0 ?getInt(a) / getInt(b) : 0;
                break;
            case "add":
                ans = getInt(a) + getInt(b);
                break;
            case "subtract":
                ans = getInt(a) - getInt(b);
                break;
            case "modulus":
                ans = getInt(b) != 0 ?getInt(a) % getInt(b) : 0;
                break;

        }
        //Result
        answer.setText(String.valueOf(ans));
    }

    @FXML
    protected void onReset() {
        //Setter
        answer.setText("");
        number1.setText("");
        number2.setText("");
    }

    /*
    This function is written to parse string and convert to int.
    */
    public int getInt(String s){
        try{
            return Integer.parseInt(s.trim());
        }catch(Exception e){
            return 0;
        }
    }
}