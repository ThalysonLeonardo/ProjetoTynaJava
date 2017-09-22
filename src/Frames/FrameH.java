package Frames;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class FrameH extends javax.swing.JFrame {

    static Jogador Play1 = new Jogador();
    static Jogador Play2 = new Jogador();
    static Jogador Play3 = new Jogador();
    
    int N_Tentativas = 0;
    int Sequencia = 0;
    
    long TempoIni = System.currentTimeMillis();
    long Tempo;
    
    List<String> lista = new ArrayList<>();
    int[] contador = new int[27];
    
    public FrameH() {
        try {
            BufferedWriter writeFile = new BufferedWriter(new FileWriter("Condição 8.csv"));

            writeFile.write(" ; ;Play1;Play2;Play3; ;Tempo\n");

            writeFile.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        setExtendedState(FrameA.MAXIMIZED_BOTH);
        initComponents();
        
         String[] cor = {"Azul","Vermelho","Verde"};
         for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                for(int k=1;k<=3;k++)
                    lista.add(cor[i-1] + " " + cor[j-1] + " " + cor[k-1]);
            }
        }
         
        for(String l : lista){
            System.out.println(l);
        }
        
        for(int i=0;i<=26;i++){
            contador[i] = 0;
        }    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Frame_Parabens = new javax.swing.JFrame();
        jLabel6 = new javax.swing.JLabel();
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
        jLabel1 = new javax.swing.JLabel();
        Pontos_Play1 = new javax.swing.JLabel();
        JLabel0 = new javax.swing.JLabel();
        Pontos_Play2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Pontos_Play3 = new javax.swing.JLabel();

        Frame_Parabens.setLocationByPlatform(true);
        Frame_Parabens.setResizable(false);
        Frame_Parabens.setSize(new java.awt.Dimension(480, 160));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel6.setText("Parabéns, vocês acertaram!");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout Frame_ParabensLayout = new javax.swing.GroupLayout(Frame_Parabens.getContentPane());
        Frame_Parabens.getContentPane().setLayout(Frame_ParabensLayout);
        Frame_ParabensLayout.setHorizontalGroup(
            Frame_ParabensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Frame_ParabensLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(64, 64, 64))
        );
        Frame_ParabensLayout.setVerticalGroup(
            Frame_ParabensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Frame_ParabensLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel6)
                .addContainerGap(63, Short.MAX_VALUE))
        );

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

        jLabel1.setText("Pontos:");

        Pontos_Play1.setText("0");

        JLabel0.setText("Pontos:");

        Pontos_Play2.setText("0");

        jLabel2.setText("Pontos:");

        Pontos_Play3.setText("0");

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
                                    .addComponent(Led_Play1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Pontos_Play1)))
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Button_Azul_Play2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Led_Play2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JLabel0)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Pontos_Play2)))
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Pontos_Play3))
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
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Pontos_Play1)
                    .addComponent(JLabel0)
                    .addComponent(Pontos_Play2)
                    .addComponent(jLabel2)
                    .addComponent(Pontos_Play3))
                .addGap(18, 18, 18)
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
            Play1.Ponto_ind++;
            if(Play1.Aceso){
                Led_Play1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Luz_Azul.png")));
                if(Play2.Aceso && Play3.Aceso){
                    Pontos_Play1.setText(Integer.toString(Play1.Ponto_ind));
                    Pontos_Play2.setText(Integer.toString(Play2.Ponto_ind));
                    Pontos_Play3.setText(Integer.toString(Play3.Ponto_ind));
                }
            }
        }
    }//GEN-LAST:event_Button_Azul_Play1ActionPerformed

    private void Button_Vermelho_Play1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Vermelho_Play1ActionPerformed
        if(!Play1.Aceso){
            Play1.Acender_Vermelho();
            Play1.Ponto_ind++;
            if(Play1.Aceso){
                Led_Play1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Luz_Vermelho.png")));
                if(Play2.Aceso && Play3.Aceso){
                    Pontos_Play1.setText(Integer.toString(Play1.Ponto_ind));
                    Pontos_Play2.setText(Integer.toString(Play2.Ponto_ind));
                    Pontos_Play3.setText(Integer.toString(Play3.Ponto_ind));
                }
            }
        }
    }//GEN-LAST:event_Button_Vermelho_Play1ActionPerformed

    private void Button_Verde_Play1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Verde_Play1ActionPerformed
        if(!Play1.Aceso){
            Play1.Acender_Verde();
            Play1.Ponto_ind++;
            if(Play1.Aceso){
                Led_Play1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Luz_Verde.png")));
                Sequencia++;
                if(Sequencia == 3){
                    Play1.Ponto_ind -= (Play1.Controle_Azul + Play1.Controle_Verde + Play1.Controle_Vermelho);
                    Play2.Ponto_ind -= (Play2.Controle_Azul + Play2.Controle_Verde + Play2.Controle_Vermelho);
                    Play3.Ponto_ind -= (Play3.Controle_Azul + Play3.Controle_Verde + Play3.Controle_Vermelho);
                    
                    Frame_Parabens.setVisible(true);
                }
                else{
                    if(Play2.Aceso && Play3.Aceso){
                        Pontos_Play1.setText(Integer.toString(Play1.Ponto_ind));
                        Pontos_Play2.setText(Integer.toString(Play2.Ponto_ind));
                        Pontos_Play3.setText(Integer.toString(Play3.Ponto_ind));
                    }
                }
            }
        }
    }//GEN-LAST:event_Button_Verde_Play1ActionPerformed

    private void Button_Azul_Play2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Azul_Play2ActionPerformed
        if(!Play2.Aceso){
            Play2.Acender_Azul();
            Play2.Ponto_ind++;
            if(Play2.Aceso){
                Led_Play2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Luz_Azul.png")));
                Sequencia++;
                if(Sequencia == 3){
                    Play1.Ponto_ind -= (Play1.Controle_Azul + Play1.Controle_Verde + Play1.Controle_Vermelho);
                    Play2.Ponto_ind -= (Play2.Controle_Azul + Play2.Controle_Verde + Play2.Controle_Vermelho);
                    Play3.Ponto_ind -= (Play3.Controle_Azul + Play3.Controle_Verde + Play3.Controle_Vermelho);
                    
                    Frame_Parabens.setVisible(true);
                }
                else{
                    if(Play1.Aceso && Play3.Aceso){
                        Pontos_Play1.setText(Integer.toString(Play1.Ponto_ind));
                        Pontos_Play2.setText(Integer.toString(Play2.Ponto_ind));
                        Pontos_Play3.setText(Integer.toString(Play3.Ponto_ind));
                    }
                }
            }
        }
    }//GEN-LAST:event_Button_Azul_Play2ActionPerformed

    private void Button_Vermelho_Play2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Vermelho_Play2ActionPerformed
        if(!Play2.Aceso){
            Play2.Acender_Vermelho();
            Play2.Ponto_ind++;
            if(Play2.Aceso){
                Led_Play2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Luz_Vermelho.png")));
                if(Play1.Aceso && Play3.Aceso){
                    Pontos_Play1.setText(Integer.toString(Play1.Ponto_ind));
                    Pontos_Play2.setText(Integer.toString(Play2.Ponto_ind));
                    Pontos_Play3.setText(Integer.toString(Play3.Ponto_ind));
                }
            }
        }
    }//GEN-LAST:event_Button_Vermelho_Play2ActionPerformed

    private void Button_Verde_Play2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Verde_Play2ActionPerformed
        if(!Play2.Aceso){
            Play2.Acender_Verde();
            Play2.Ponto_ind++;
            if(Play2.Aceso){
                Led_Play2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Luz_Verde.png")));
                if(Play1.Aceso && Play3.Aceso){
                    Pontos_Play1.setText(Integer.toString(Play1.Ponto_ind));
                    Pontos_Play2.setText(Integer.toString(Play2.Ponto_ind));
                    Pontos_Play3.setText(Integer.toString(Play3.Ponto_ind));
                }
            }
        }
    }//GEN-LAST:event_Button_Verde_Play2ActionPerformed

    private void Button_Azul_Play3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Azul_Play3ActionPerformed
        if(!Play3.Aceso){
            Play3.Acender_Azul();
            Play3.Ponto_ind++;
            if(Play3.Aceso){
                Led_Play3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Luz_Azul.png")));
                if(Play1.Aceso && Play2.Aceso){
                    Pontos_Play1.setText(Integer.toString(Play1.Ponto_ind));
                    Pontos_Play2.setText(Integer.toString(Play2.Ponto_ind));
                    Pontos_Play3.setText(Integer.toString(Play3.Ponto_ind));
                }
            }
        }
    }//GEN-LAST:event_Button_Azul_Play3ActionPerformed

    private void Button_Vermelho_Play3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Vermelho_Play3ActionPerformed
        if(!Play3.Aceso){
            Play3.Acender_Vermelho();
            Play3.Ponto_ind++;
            if(Play3.Aceso){
                Led_Play3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Luz_Vermelho.png")));
                Sequencia++;
                if(Sequencia == 3){
                    Play1.Ponto_ind -= (Play1.Controle_Azul + Play1.Controle_Verde + Play1.Controle_Vermelho);
                    Play2.Ponto_ind -= (Play2.Controle_Azul + Play2.Controle_Verde + Play2.Controle_Vermelho);
                    Play3.Ponto_ind -= (Play3.Controle_Azul + Play3.Controle_Verde + Play3.Controle_Vermelho);
                    
                    Frame_Parabens.setVisible(true);
                }
                else{
                    if(Play1.Aceso && Play2.Aceso){
                        Pontos_Play1.setText(Integer.toString(Play1.Ponto_ind));
                        Pontos_Play2.setText(Integer.toString(Play2.Ponto_ind));
                        Pontos_Play3.setText(Integer.toString(Play3.Ponto_ind));
                    }
                }
            }
        }
    }//GEN-LAST:event_Button_Vermelho_Play3ActionPerformed

    private void Button_Verde_Play3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Verde_Play3ActionPerformed
        if(!Play3.Aceso){
            Play3.Acender_Verde();
            Play3.Ponto_ind++;
            if(Play3.Aceso){
                Led_Play3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Luz_Verde.png")));
                if(Play1.Aceso && Play2.Aceso){
                    Pontos_Play1.setText(Integer.toString(Play1.Ponto_ind));
                    Pontos_Play2.setText(Integer.toString(Play2.Ponto_ind));
                    Pontos_Play3.setText(Integer.toString(Play3.Ponto_ind));
                }
            }
        }
    }//GEN-LAST:event_Button_Verde_Play3ActionPerformed

    private void TentativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TentativaActionPerformed
        if(Play1.Aceso && Play2.Aceso && Play3.Aceso){
            
            for(int i=0;i<=26;i++){
                String cor = lista.get(i);
                if(cor.equals(Play1.cor + " " + Play2.cor + " " + Play3.cor)){
                    contador[i]++;
                    break;
                }
            }
            
            N_Tentativas++;
            
            Tempo = (System.currentTimeMillis() - TempoIni)/1000;
            
            try {
                FileWriter writeFile = new FileWriter("Condição 8.csv", true);

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
            
            Sequencia = 0;
            
            Label_Tentativas.setText(Integer.toString(N_Tentativas));
            
            TempoIni = System.currentTimeMillis();
        
            if(N_Tentativas == 20){
               N_Tentativas = 0;
                Play1.Ponto_ind = 0;
                Play2.Ponto_ind = 0;
                Play3.Ponto_ind = 0;
           //     dispose();
           //     new FrameD1().setVisible(true);
            }
           
           for(int i=0;i<=26;i++){
                if(contador[i] == 10 && N_Tentativas >= 20){
                    contador[i] = 0;
                    
                    dispose();
                    new FrameD1().setVisible(true);
                    
                    System.out.println("Chegou a 3 combinações");
                    System.out.println("Combinação " + lista.get(i));
                    break;
                }
            }
        }
    }//GEN-LAST:event_TentativaActionPerformed

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
    private javax.swing.JFrame Frame_Parabens;
    private javax.swing.JLabel JLabel0;
    private javax.swing.JLabel Label_Tentativas;
    private static javax.swing.JLabel Led_Play1;
    private static javax.swing.JLabel Led_Play2;
    private static javax.swing.JLabel Led_Play3;
    private javax.swing.JLabel Pontos_Play1;
    private javax.swing.JLabel Pontos_Play2;
    private javax.swing.JLabel Pontos_Play3;
    private javax.swing.JButton Tentativa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
