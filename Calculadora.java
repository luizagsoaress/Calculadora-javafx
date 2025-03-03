package javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Calculadora extends Application {
    private int valor = 0;
    private int valor2 = 0;
    private int resultado = 0;
    boolean primeiroValor = true;
    private int botaoValor = 0;
    @Override
    public void start(Stage stage) {

        AnchorPane root = new AnchorPane(); 
        root.setStyle("-fx-background-color: darkgray;");
        
        
        
        Rectangle rectangle = new Rectangle(600, 550);
        rectangle.setFill(Color.WHITE);
        
        TextField textfield = new TextField();
        textfield.setPromptText("digite aqui...");
        textfield.setLayoutX(125);
        textfield.setLayoutY(75);
        
        textfield.setFont(Font.font("Raleway", FontWeight.BOLD, 20));
        
      
        Button button1 = new Button("0");
        Button button2 = new Button("1");
        Button button3 = new Button("2");
        Button button4 = new Button("3");
        Button button5 = new Button("4");
        Button button6 = new Button("5");
        Button button7 = new Button("6");
        Button button8 = new Button("7");
        Button button9 = new Button("8");
        Button button10 = new Button("9");
        Button button11 = new Button("/");
        Button button12 = new Button("*");
        Button button13 = new Button("+");
        Button button14 = new Button("-");
        Button button15 = new Button("=");
        
     
        button1.setPrefHeight(40);
        button1.setPrefWidth(100);
        
        textfield.setPrefHeight(50);
        textfield.setPrefWidth(400);
        
        button2.setPrefHeight(40);
        button2.setPrefWidth(100);

        button3.setPrefHeight(40);
        button3.setPrefWidth(100);

        button4.setPrefHeight(40);
        button4.setPrefWidth(100);

        button5.setPrefHeight(40);
        button5.setPrefWidth(100);

        button6.setPrefHeight(40);
        button6.setPrefWidth(100);

        button7.setPrefHeight(40);
        button7.setPrefWidth(100);

        button8.setPrefHeight(40);
        button8.setPrefWidth(100);

        button9.setPrefHeight(40);
        button9.setPrefWidth(100);

        button10.setPrefHeight(40);
        button10.setPrefWidth(100);
        
        button11.setPrefHeight(40);
        button11.setPrefWidth(100);
        
        button12.setPrefHeight(40);
        button12.setPrefWidth(100);
        
        button13.setPrefHeight(80);
        button13.setPrefWidth(50);
        
        button14.setPrefHeight(80);
        button14.setPrefWidth(50);
        
        button15.setPrefHeight(80);
        button15.setPrefWidth(50);

        
        root.setTopAnchor(button1, 420.0); //cima
        root.setLeftAnchor(button1, 75.0); //lado
        
        root.setTopAnchor(rectangle, 25.0); //cima
        root.setLeftAnchor(rectangle, 25.0); //lado

        root.setTopAnchor(button2, 180.0);
        root.setLeftAnchor(button2, 75.0);

        root.setTopAnchor(button3, 180.0);
        root.setLeftAnchor(button3, 225.0);

        root.setTopAnchor(button4, 180.0);
        root.setLeftAnchor(button4, 375.0);

        root.setTopAnchor(button5, 260.0);
        root.setLeftAnchor(button5, 75.0);

        root.setTopAnchor(button6, 260.0);
        root.setLeftAnchor(button6, 225.0);

        root.setTopAnchor(button7, 260.0);
        root.setLeftAnchor(button7, 375.0);

        root.setTopAnchor(button8, 340.0);
        root.setLeftAnchor(button8, 75.0);

        root.setTopAnchor(button9, 340.0);
        root.setLeftAnchor(button9, 225.0);

        root.setTopAnchor(button10, 340.0);
        root.setLeftAnchor(button10, 375.0);
        
        root.setTopAnchor(button11, 420.0);
        root.setLeftAnchor(button11, 225.0);
        
        root.setTopAnchor(button12, 420.0);
        root.setLeftAnchor(button12, 375.0);
        
        root.setTopAnchor(button13, 180.0);
        root.setLeftAnchor(button13, 525.0);
        
        root.setTopAnchor(button14, 280.0);
        root.setLeftAnchor(button14, 525.0);
        
        root.setTopAnchor(button15, 380.0);
        root.setLeftAnchor(button15, 525.0);
        
        button1.setOnAction(event -> textfield.setText(textfield.getText() + button1.getText()));
        button2.setOnAction(event ->textfield.setText(textfield.getText() + button2.getText()));
        button3.setOnAction(event ->textfield.setText(textfield.getText() + button3.getText()));
        button4.setOnAction(event ->textfield.setText(textfield.getText() + button4.getText()));
        button5.setOnAction(event ->textfield.setText(textfield.getText() + button5.getText()));
        button6.setOnAction(event ->textfield.setText(textfield.getText() + button6.getText()));
        button7.setOnAction(event ->textfield.setText(textfield.getText() + button7.getText()));
        button8.setOnAction(event ->textfield.setText(textfield.getText() + button8.getText()));
        button9.setOnAction(event ->textfield.setText(textfield.getText() + button9.getText()));
        button10.setOnAction(event ->textfield.setText(textfield.getText() + button10.getText()));
       
        button11.setOnAction(event -> {
            if(primeiroValor){
                valor = Integer.parseInt(textfield.getText());
                
                primeiroValor = false;
                botaoValor = 11;
            }  
        });
        button12.setOnAction(event -> {
            if(primeiroValor){
                valor = Integer.parseInt(textfield.getText());
                
                primeiroValor = false;
                botaoValor = 12;
            }  
        });
        button13.setOnAction(event -> {
            if(primeiroValor){
                valor = Integer.parseInt(textfield.getText());
                
                primeiroValor = false;
                botaoValor = 13;
            }  
        });
        button14.setOnAction(event -> {
            if(primeiroValor){
                valor = Integer.parseInt(textfield.getText());
                
                primeiroValor = false;
                botaoValor = 14;
            }  
        });


        
        button15.setOnAction(event -> {
            valor2 = Integer.parseInt(textfield.getText());
            textfield.clear();
            
            if(botaoValor == 11){
                if(valor2 != 0){
                resultado = valor / valor2;
                String string = String.valueOf(resultado);
                textfield.setPromptText(string);
              }
            }
            if(botaoValor == 12){
                resultado = valor * valor2;
                String string = String.valueOf(resultado);
                textfield.setPromptText(string);
            }
            if(botaoValor == 13){
                resultado = valor + valor2;
                String string = String.valueOf(resultado);
                textfield.setPromptText(string);
            }
            if(botaoValor == 14){
                resultado = valor - valor2;
                String string = String.valueOf(resultado);
                textfield.setPromptText(string);
            }
            
            primeiroValor = true;
        });
        
        System.out.println(valor);
        
       
        root.getChildren().addAll(rectangle, textfield, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15);
      
       
        Scene scene = new Scene(root, 650, 600);  
        
        stage.setTitle("Calculadora Java");
      
        stage.setScene(scene);
      
        stage.show();
    }
}