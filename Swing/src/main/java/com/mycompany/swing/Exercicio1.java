/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swing;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
/**
 *
 * @author Cristhian
 */
public class Exercicio1 {
    public static void main(String[] args) {
        
        String N1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String N2 = JOptionPane.showInputDialog("Digite o segundo número:");
        
        try {
            int n1 = Integer.parseInt(N1);  // Converte os valores para inteiros
            int n2 = Integer.parseInt(N2);
            String resultado = "";
            
            //verificadores com if
            if(n1 > n2){ resultado = "O valor maior é " +n1;    }

            if(n1 < n2){  resultado = "O maior valor é "+n2;    }
            
            else{    
                if(n1 == n2){   resultado = n1 + " e "+ n2 + " são iguais"; }
                
                else{
                  resultado = "não foi possivel achar o valor";
                }
            }
            

            //painel personalizado para exibir o resultado
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

            // Adiciona o título "Resultado" no topo
            JLabel title = new JLabel("Resultado");
            title.setHorizontalAlignment(SwingConstants.CENTER);
            title.setFont(title.getFont().deriveFont(18.0f)); // Define o tamanho da fonte
            title.setForeground(Color.BLUE);
            panel.add(title);

            JLabel message = new JLabel(resultado +"\n \n by JP");
            message.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(message);

            // Exibe o diálogo com o painel personalizado
            JOptionPane.showMessageDialog(null, panel, "Mensagem", JOptionPane.PLAIN_MESSAGE);
            
        } catch (NumberFormatException e) {
            // Trata a exceção caso o usuário não insira um número válido
            JOptionPane.showMessageDialog(null, 
                "Insira algum número.", "Erro", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
}
