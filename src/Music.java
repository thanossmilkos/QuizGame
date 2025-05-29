
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Music extends javax.swing.JFrame {

    String[][] quiz = new String[6][6];
    int question = 0;
    int score =0;
    
    public Music() {
        initComponents();
        setLocation(600,300);
        setSize(760,540);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        MusicCategory();
        update();
    }
    public void close()
    {
       WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
      
    }
    
    public void someoneScored()
{
    score++;

    jLabel2.setText("Score:  " + score +"/5");
    
}
    public void update(){
        jLabel1.setText(quiz[question][0]);
        jButton2.setText(quiz[question][1]);jButton3.setText(quiz[question][2]);
        jButton4.setText(quiz[question][3]);jButton5.setText(quiz[question][4]);
        jLabel2.setText("Score:  " + score +"/5");
    }
    
    public void MusicCategory()
    { 
        quiz[0][0] = "Πόσες χορδές έχει η κιθάρα;";
        quiz[0][1]="2";
        quiz[0][2]="4";
        quiz[0][3]="10";
        quiz[0][4]="6";
        quiz[0][5]="4";
        
        quiz[1][0]= "Η εθνικότητα του Έλτον Τζον ειναι...";
        quiz[1][1]="Βρετανική";
        quiz[1][2]="Καναδέζικη";
        quiz[1][3]="Μαλτέζικη";
        quiz[1][4]="Αμερικάνικη";
        quiz[1][5] ="2";
        
        quiz[2][0]= "Τι είναι το ουκουλέλε;";
        quiz[2][1]="Μουσικό όργανο";
        quiz[2][2]="Τραγούδι";
        quiz[2][3]="Είδος μουσικής";
        quiz[2][4]="Χορός";
        quiz[2][5] ="1";
        
        quiz[3][0]= "Σε ποιό είδος μουσικής διακρήθηκε ο Johnny Cash;";
        quiz[3][1]="Country";
        quiz[3][2]="Jazz";
        quiz[3][3]="Rock";
        quiz[3][4]="Pop";
        quiz[3][5] ="1";
        
        quiz[4][0]= "Με ποιο όργανο έχει πολλές ομοιότητες η λατέρνα;";
        quiz[4][1]="Πιάνο";
        quiz[4][2]="Βιολί";
        quiz[4][3]="Σαξόφωνο";
        quiz[4][4]="Τύμπανο";
        quiz[4][5] ="1";
        
        

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(146, 91, 157));

        jButton1.setText("Quit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Score:");

        jPanel2.setBackground(new java.awt.Color(87, 67, 107));

        jButton4.setText("jButton4");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(146, 91, 157), 4));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(146, 91, 157), 4));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(146, 91, 157), 4));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("jButton5");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(146, 91, 157), 4));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(130, 130, 130))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mm.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1)))
                .addContainerGap(223, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        close();
        QuitMusic q= new QuitMusic();
        q.setVisible(true);
        q.setLocation(800,400);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(quiz[question][5]=="1"){
            someoneScored();
            
            
        }
        if(question == 4){
            switch(score){
                case 0:
                    close();
                    BadFinish b= new BadFinish();
                    b.setVisible(true);
                    b.setLocation(800,400);
                    break;
                case 1:
                    close();
                    Score1 S = new Score1();
                    S.setVisible(true);
                    S.setLocation(800,400);
                    break;
                case 2:
                    close();
                    Score2 D = new Score2();
                    D.setVisible(true);
                    D.setLocation(800,400);
                    break;
                case 3:
                    close();
                    Score3 F = new Score3();
                    F.setVisible(true);
                    F.setLocation(800,400);
                    break;
                case 4:
                    close();
                    Score4 G = new Score4();
                    G.setVisible(true);
                    G.setLocation(800,400);
                    break;
                case 5:
                    close();
                    Finish f= new Finish();
                    f.setVisible(true);
                    f.setLocation(800,400);
                    break;
                default:
                
                
            }
            
        }
        question++;
        update();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(quiz[question][5]=="2"){
            someoneScored();
        }
        if(question == 4){
            switch(score){
                case 0:
                    close();
                    BadFinish b= new BadFinish();
                    b.setVisible(true);
                    b.setLocation(800,400);
                    break;
                case 1:
                    close();
                    Score1 S = new Score1();
                    S.setVisible(true);
                    S.setLocation(800,400);
                    break;
                case 2:
                    close();
                    Score2 D = new Score2();
                    D.setVisible(true);
                    D.setLocation(800,400);
                    break;
                case 3:
                    close();
                    Score3 F = new Score3();
                    F.setVisible(true);
                    F.setLocation(800,400);
                    break;
                case 4:
                    close();
                    Score4 G = new Score4();
                    G.setVisible(true);
                    G.setLocation(800,400);
                    break;
                case 5:
                    close();
                    Finish f= new Finish();
                    f.setVisible(true);
                    f.setLocation(800,400);
                    break;
                default:
                
                
            }
            
        }
        question++;
        update();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(quiz[question][5]=="3"){
            someoneScored();
        }
        if(question == 4){
            switch(score){
                case 0:
                    close();
                    BadFinish b= new BadFinish();
                    b.setVisible(true);
                    b.setLocation(800,400);
                    break;
                case 1:
                    close();
                    Score1 S = new Score1();
                    S.setVisible(true);
                    S.setLocation(800,400);
                    break;
                case 2:
                    close();
                    Score2 D = new Score2();
                    D.setVisible(true);
                    D.setLocation(800,400);
                    break;
                case 3:
                    close();
                    Score3 F = new Score3();
                    F.setVisible(true);
                    F.setLocation(800,400);
                    break;
                case 4:
                    close();
                    Score4 G = new Score4();
                    G.setVisible(true);
                    G.setLocation(800,400);
                    break;
                case 5:
                    close();
                    Finish f= new Finish();
                    f.setVisible(true);
                    f.setLocation(800,400);
                    break;
                default:
                
                
            }
            
        }
        question++;
        update();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(quiz[question][5]=="4"){
           someoneScored();
        }
        if(question == 4){
            switch(score){
                case 0:
                    close();
                    BadFinish b= new BadFinish();
                    b.setVisible(true);
                    b.setLocation(800,400);
                    break;
                case 1:
                    close();
                    Score1 S = new Score1();
                    S.setVisible(true);
                    S.setLocation(800,400);
                    break;
                case 2:
                    close();
                    Score2 D = new Score2();
                    D.setVisible(true);
                    D.setLocation(800,400);
                    break;
                case 3:
                    close();
                    Score3 F = new Score3();
                    F.setVisible(true);
                    F.setLocation(800,400);
                    break;
                case 4:
                    close();
                    Score4 G = new Score4();
                    G.setVisible(true);
                    G.setLocation(800,400);
                    break;
                case 5:
                    close();
                    Finish f= new Finish();
                    f.setVisible(true);
                    f.setLocation(800,400);
                    break;
                default:
                
                
            }
            
        }
        question++;
        update();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        
    }//GEN-LAST:event_jButton2MouseClicked
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Music.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Music.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Music.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Music.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Music().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
