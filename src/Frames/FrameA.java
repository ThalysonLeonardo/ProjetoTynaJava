package Frames;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FrameA extends javax.swing.JFrame {

    static Jogador Play1 = new Jogador();
    static Jogador Play2 = new Jogador();
    static Jogador Play3 = new Jogador();
    
    int N_Tentativas = 0;
    
    long TempoIni = System.currentTimeMillis();
    long Tempo;  
    
    public FrameA() {
        try {
            BufferedWriter writeFile = new BufferedWriter(new FileWriter("Condição 1.csv"));

            writeFile.write(" ; ;Play1;Play2;Play3; ;Tempo\n");

            writeFile.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        setExtendedState(FrameA.MAXIMIZED_BOTH);
        initComponents();    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Led_Play1 = new javax.swing.JLabel();
        Led_Play2 = new javax.swing.JLabel();
        Led_Play3 = new javax.swing.JLabel();
        Button_Azul_Play1 = new javax.swing.JButton();
        Button_Verde_Play1 = new javax.swing.JButton();
        Button_Azul_Play2 = new javax.swing.JButton();
        Button_Azul_Play3 = new javax.swing.JButton();
        Button_Verde_Play2 = new javax.swing.JButton();
        Button_Verde_Play3 = new javax.swing.JButton();
        Button_Vermelho_Play1 = new javax.swing.JButton();
        Button_Vermelho_Play2 = new javax.swing.JButton();
        Button_Vermelho_Play3 = new javax.swing.JButton();
        Tentativa = new javax.swing.JButton();
        Label_Tentativas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 150));

        Led_Play1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Luz_Apagada.png"))); // NOI18N

        Led_Play2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Luz_Apagada.png"))); // NOI18N

        Led_Play3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Luz_Apagada.png"))); // NOI18N

        Button_Azul_Play1.setText("Azul");
        Button_Azul_Play1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Azul_Play1ActionPerformed(evt);
            }
        });

        Button_Verde_Play1.setText("Verde");
        Button_Verde_Play1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Verde_Play1ActionPerformed(evt);
            }
        });

        Button_Azul_Play2.setText("Azul");
        Button_Azul_Play2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Azul_Play2ActionPerformed(evt);
            }
        });

        Button_Azul_Play3.setText("Azul");
        Button_Azul_Play3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Azul_Play3ActionPerformed(evt);
            }
        });

        Button_Verde_Play2.setText("Verde");
        Button_Verde_Play2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Verde_Play2ActionPerformed(evt);
            }
        });

        Button_Verde_Play3.setText("Verde");
        Button_Verde_Play3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Verde_Play3ActionPerformed(evt);
            }
        });

        Button_Vermelho_Play1.setText("Vermelho");
        Button_Vermelho_Play1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Vermelho_Play1ActionPerformed(evt);
            }
        });

        Button_Vermelho_Play2.setText("Vermelho");
        Button_Vermelho_Play2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Vermelho_Play2ActionPerformed(evt);
            }
        });

        Button_Vermelho_Play3.setText("Vermelho");
        Button_Vermelho_Play3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Vermelho_Play3ActionPerformed(evt);
            }
        });

        Tentativa.setText("R");
        Tentativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TentativaActionPerformed(evt);
            }
        });

        Label_Tentativas.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button_Vermelho_Play1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(Button_Vermelho_Play2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(Button_Vermelho_Play3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button_Verde_Play1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(Button_Verde_Play2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(Button_Verde_Play3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Button_Azul_Play1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Led_Play1))
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Button_Azul_Play2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Led_Play2))
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Button_Azul_Play3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Led_Play3))))
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Label_Tentativas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tentativa)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Led_Play2)
                    .addComponent(Led_Play1)
                    .addComponent(Led_Play3))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_Azul_Play1)
                    .addComponent(Button_Azul_Play2)
                    .addComponent(Button_Azul_Play3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_Vermelho_Play1)
                    .addComponent(Button_Vermelho_Play2)
                    .addComponent(Button_Vermelho_Play3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_Verde_Play1)
                    .addComponent(Button_Verde_Play2)
                    .addComponent(Button_Verde_Play3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tentativa)
                    .addComponent(Label_Tentativas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void Button_Azul_Play1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Azul_Play1ActionPerformed
        if(!Play1.Aceso){
            Play1.Acender_Azul();
            if(Play1.Aceso)
                Led_Play1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Luz_Azul.png")));
        }
    }//GEN-LAST:event_Button_Azul_Play1ActionPerformed

    private void Button_Vermelho_Play1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Vermelho_Play1ActionPerformed
        if(!Play1.Aceso){
            Play1.Acender_Vermelho();
            if(Play1.Aceso)
                Led_Play1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Luz_Vermelho.png")));
        }
    }//GEN-LAST:event_Button_Vermelho_Play1ActionPerformed

    private void Button_Verde_Play1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Verde_Play1ActionPerformed
        if(!Play1.Aceso){
            Play1.Acender_Verde();
            if(Play1.Aceso)
                Led_Play1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Luz_Verde.png")));
        }
    }//GEN-LAST:event_Button_Verde_Play1ActionPerformed

    private void Button_Azul_Play2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Azul_Play2ActionPerformed
        if(!Play2.Aceso){
            Play2.Acender_Azul();
            if(Play2.Aceso)
                Led_Play2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Luz_Azul.png")));
        }
    }//GEN-LAST:event_Button_Azul_Play2ActionPerformed

    private void Button_Vermelho_Play2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Vermelho_Play2ActionPerformed
        if(!Play2.Aceso){
            Play2.Acender_Vermelho();
            if(Play2.Aceso)
                Led_Play2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Luz_Vermelho.png")));
        }
    }//GEN-LAST:event_Button_Vermelho_Play2ActionPerformed

    private void Button_Verde_Play2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Verde_Play2ActionPerformed
        if(!Play2.Aceso){
            Play2.Acender_Verde();
            if(Play2.Aceso)
                Led_Play2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Luz_Verde.png")));
        }
    }//GEN-LAST:event_Button_Verde_Play2ActionPerformed

    private void Button_Azul_Play3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Azul_Play3ActionPerformed
        if(!Play3.Aceso){
            Play3.Acender_Azul();
            if(Play3.Aceso)
                Led_Play3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Luz_Azul.png")));
        }
    }//GEN-LAST:event_Button_Azul_Play3ActionPerformed

    private void Button_Vermelho_Play3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Vermelho_Play3ActionPerformed
        if(!Play3.Aceso){
            Play3.Acender_Vermelho();
            if(Play3.Aceso)
                Led_Play3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Luz_Vermelho.png")));
        }
    }//GEN-LAST:event_Button_Vermelho_Play3ActionPerformed

    private void Button_Verde_Play3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Verde_Play3ActionPerformed
        if(!Play3.Aceso){
            Play3.Acender_Verde();
            if(Play3.Aceso)
                Led_Play3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Luz_Verde.png")));
        }
    }//GEN-LAST:event_Button_Verde_Play3ActionPerformed

    private void TentativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TentativaActionPerformed
        if(Play1.Aceso && Play2.Aceso && Play3.Aceso){
            
            N_Tentativas++;
            
            Tempo = (System.currentTimeMillis() - TempoIni)/1000;
            
            try {
                FileWriter writeFile = new FileWriter("Condição 1.csv", true);

                writeFile.write(" ;" + "Azul;" + Play1.Controle_Azul + ";" + Play2.Controle_Azul + ";" + Play3.Controle_Azul + "\n");
                writeFile.write(N_Tentativas + ";" + "Vermelho;" + Play1.Controle_Vermelho + ";" + Play2.Controle_Vermelho + ";" + Play3.Controle_Vermelho + "; ;" + Tempo + "\n");
                writeFile.write(" ;" + "Verde;" + Play1.Controle_Verde + ";" + Play2.Controle_Verde + ";" + Play3.Controle_Verde + "\n");
                writeFile.write("\n");
                
                writeFile.close();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        
            Play1.Zerar();
            Play2.Zerar();
            Play3.Zerar();
        
            Led_Play1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Luz_Apagada.png")));
            Led_Play2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Luz_Apagada.png")));
            Led_Play3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Luz_Apagada.png")));
        
            Label_Tentativas.setText(Integer.toString(N_Tentativas));
            
            TempoIni = System.currentTimeMillis();
        
            if(N_Tentativas == 20){
                N_Tentativas = 0;
                dispose();
                new FrameB().setVisible(true);
            }
            
            
        }
    }//GEN-LAST:event_TentativaActionPerformed

   public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
                new FrameA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Azul_Play1;
    private javax.swing.JButton Button_Azul_Play2;
    private javax.swing.JButton Button_Azul_Play3;
    private javax.swing.JButton Button_Verde_Play1;
    private javax.swing.JButton Button_Verde_Play2;
    private javax.swing.JButton Button_Verde_Play3;
    private javax.swing.JButton Button_Vermelho_Play1;
    private javax.swing.JButton Button_Vermelho_Play2;
    private javax.swing.JButton Button_Vermelho_Play3;
    private javax.swing.JLabel Label_Tentativas;
    private static javax.swing.JLabel Led_Play1;
    private static javax.swing.JLabel Led_Play2;
    private static javax.swing.JLabel Led_Play3;
    private javax.swing.JButton Tentativa;
    // End of variables declaration//GEN-END:variables
}
