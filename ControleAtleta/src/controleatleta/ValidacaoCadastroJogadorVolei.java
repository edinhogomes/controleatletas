/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleatleta;

import java.text.ParseException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JTextField;
import javax.swing.JLabel;

/**
 *
 * @author edinho
 */
public final class ValidacaoCadastroJogadorVolei {

    public ValidacaoCadastroJogadorVolei() {
    }

    private String mensagemErro = "";
    private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    //private javax.swing.JLabel JLabelDoCampo;
    
        public String getMensagemErro() {
            if(mensagemErro.isEmpty()){
                
                throw new IllegalArgumentException("nao ha mensagem a ser exibida.");
                
            } else {
                
                return mensagemErro;
            }
        }

    public boolean validarSeCampoTipoTextoVazio(JTextField textFieldCampoTexto, JLabel labelCampoTexto) {

        if (textFieldCampoTexto.getText().trim().length() == 0) {
            mensagemErro = "O valor do campo " + labelCampoTexto.getText() + " não foi informado.";
            textFieldCampoTexto.requestFocus();
            return false;
        } else {

            return true;

        }
    }

    public boolean validarCampoTextoData(JTextField textFieldCampoTexto, JLabel labelCampoTexto) {

        try {
            dateFormat.parse(textFieldCampoTexto.getText());
            return true;
        } catch (ParseException ex) {
            mensagemErro = "O valor do campo " + labelCampoTexto.getText() + " é inválido. Erro: " + ex.getMessage();
            textFieldCampoTexto.requestFocus();
            return false;
        }

    }

    public boolean validarCampoTextoNumericoDouble(JTextField textFieldCampoTexto, JLabel labelCampoTexto) {

        try {
            Double.parseDouble(textFieldCampoTexto.getText());
            return true;
        } catch (Exception ex) {
            mensagemErro = "O valor do campo " + labelCampoTexto.getText() + " é inválido. Erro: " + ex.getMessage();
            textFieldCampoTexto.requestFocus();
            return false;
        }
    
}

    public boolean validarCampoTextoNumeroCasa(JTextField textFieldCampoTexto, JLabel labelCampoTexto) {
        
        if (!textFieldCampoTexto.getText().equals("")) {
        
            try {
                Integer.parseInt(textFieldCampoTexto.getText());
                return true;
            } catch (Exception ex) {
                mensagemErro = "O valor do campo " + labelCampoTexto.getText() + " é inválido. Erro: " + ex.getMessage();
                textFieldCampoTexto.requestFocus();
                return false;
            }

        } else {

            return true;
        }
    }
}

       