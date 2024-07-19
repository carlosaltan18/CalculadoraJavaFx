package org.carlosaltan.sistema;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class FXMLDocumentController implements Initializable {
    float valor1, valor2; 
    int op; 
    
    @FXML private TextField txtPantalla; 
    @FXML private Button btnCero;
    @FXML private Button btnUno; 
    @FXML private Button btnDos; 
    @FXML private Button btnTres; 
    @FXML private Button btnCuatro; 
    @FXML private Button btnCinco; 
    @FXML private Button btnSeis; 
    @FXML private Button btnSiete; 
    @FXML private Button btnOcho; 
    @FXML private Button btnNueve; 
    @FXML private Button btnMas; 
    @FXML private Button btnMenos; 
    @FXML private Button btnMulti; 
    @FXML private Button btnDiv; 
    @FXML private Button btnIgual; 
    @FXML private Button btnPunto; 
    @FXML private Button btnMasMenos; 
    @FXML private Button btnRaiz; 
    @FXML private Button btnCuadrado; 
    @FXML private Button btnUnoX; 
    @FXML private Button btnPorciento; 
    @FXML private Button btnCe; 
    @FXML private Button btnC; 
    @FXML private ImageView imgCerrar; 
    
    
   
    
    @FXML 
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnUno){
            txtPantalla.setText(txtPantalla.getText()+"1");
        }else if(event.getSource() == btnDos){
            txtPantalla.setText(txtPantalla.getText()+"2");
        }else if(event.getSource() == btnTres){
            txtPantalla.setText(txtPantalla.getText()+"3");
        }else if(event.getSource() == btnCuatro){
            txtPantalla.setText(txtPantalla.getText()+"4");
        }else if (event.getSource() == btnCinco){
            txtPantalla.setText(txtPantalla.getText()+"5");
        }else if (event.getSource() == btnSeis  ){
            txtPantalla.setText(txtPantalla.getText()+ "6");
        }else if (event.getSource() == btnSiete){
            txtPantalla.setText(txtPantalla.getText()+ "7");
        }else if (event.getSource() == btnOcho){
            txtPantalla.setText(txtPantalla.getText()+ "8");
        }else if (event.getSource() == btnNueve){
            txtPantalla.setText(txtPantalla.getText() + "9");
        }else if(event.getSource() == btnCero){
            txtPantalla.setText(txtPantalla.getText() + "0");
        }else if (event.getSource() == btnCe) {
            txtPantalla.setText("");  
        }else if (event.getSource() == btnC) {
            if(txtPantalla.getText().length()!=0){
            txtPantalla.setText(txtPantalla.getText().substring(0, txtPantalla.getText().length()-1));
            } 
        }else if (event.getSource() == btnMas){
            valor1 = Float.parseFloat(txtPantalla.getText()); 
            txtPantalla.setText("");
            op = 1; 
        }else if (event.getSource() == btnMenos){
            valor1 = Float.parseFloat(txtPantalla.getText()); 
            txtPantalla.setText("");
            op = 2; 
        }else if (event.getSource() == btnMulti){
            valor1 = Float.parseFloat(txtPantalla.getText()); 
            txtPantalla.setText("");
            op = 3; 
        }else if (event.getSource() == btnDiv){
            valor1 = Float.parseFloat(txtPantalla.getText()); 
            txtPantalla.setText("");
            op = 4; 
        }else if (event.getSource() == btnCuadrado){
            valor1 = Float.parseFloat(txtPantalla.getText()); 
            op = 5; 
        }else if (event.getSource() == btnRaiz){
            valor1 = Float.parseFloat(txtPantalla.getText()); 
            op = 6; 
        }else if (event.getSource() == btnUnoX){
            valor1 = Float.parseFloat(txtPantalla.getText()); 
            op = 7; 
        }else if(event.getSource()== btnIgual){
            float resultado;
            valor2 = Float.parseFloat(txtPantalla.getText()); 
            switch(op){
                case 1: 
                    resultado = valor1 + valor2; 
                    txtPantalla.setText(String.valueOf(resultado));
                    break; 
                case 2: 
                    resultado = valor1 - valor2; 
                    txtPantalla.setText(String.valueOf(resultado));
                    break;
                case 3: 
                    resultado = valor1 * valor2; 
                    txtPantalla.setText(String.valueOf(resultado));
                    break;
                case 4: 
                    resultado = valor1 / valor2; 
                    txtPantalla.setText(String.valueOf(resultado));
                    break;
                case 5: 
                    resultado =  (float) Math.pow(valor1, 2); 
                    txtPantalla.setText(String.valueOf(resultado));
                    break;
                case 6: 
                    resultado =  (float) Math.sqrt(valor1); 
                    txtPantalla.setText(String.valueOf(resultado));
                    break;  
                case 7: 
                    resultado =  1/valor1; 
                    txtPantalla.setText(String.valueOf(resultado));
                    break;
                    
                    
            }
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
