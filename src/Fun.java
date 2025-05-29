
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Fun extends javax.swing.JFrame {

    String[][] quiz = new String[6][6];
    int question = 0;
    int score =0;
    
    public Fun() {
        initComponents();
        setLocation(600,500);
        setSize(760,540);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        FunCategory();
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
    
    public void FunCategory()
    { 
        quiz[0][0] = "Ποιος σκηνοθέτησε το θρίλερ “ Τα σαγόνια του καρχαρία 1” το 1975;";
        quiz[0][1]="Στίβεν Σπίλμπεργκ";
        quiz[0][2]="Μάρτιν Σκορτσέζε";
        quiz[0][3]="Κουεντίν Ταραντίνο";
        quiz[0][4]="Ντάρεν Αρονόφσκι";
        quiz[0][5]="1";
        
        quiz[1][0]= "Ποίος είναι ο σεναριογράφος της  γνωστής σειράς “στο παρά πέντε”;";
        quiz[1][1]="Μ.Ρέππας";
        quiz[1][2]="Γ.Καπουτζίδης";
        quiz[1][3]="Α.Ρήγας";
        quiz[1][4]="Δ.Αποστόλου";
        quiz[1][5] ="2";
        
        quiz[2][0]= "Πως ονομαζόταν ο σκύλος του γνωστού ήρωα κόμικς, Τέντεν;";
        quiz[2][1]="Μιλού";
        quiz[2][2]="Μπαλού";
        quiz[2][3]="Μελού";
        quiz[2][4]="Μπλου";
        quiz[2][5] ="1";
        
        quiz[3][0]= "Πως ονομαζόταν το πλοίο του πειρατή Τζακ Σπάροου;";
        quiz[3][1]="Μπλέ φάλαινα";
        quiz[3][2]="Κόκκινο κοράλλι";
        quiz[3][3]="Μαύρο Μαργαριτάρι";
        quiz[3][4]="Άσπρο δελφίνι";
        quiz[3][5] ="3";
        
        quiz[4][0]= "Τι χρησιμοποιεί η Μαίρη πόπινς  για να πετάξει;";
        quiz[4][1]="Αεροπλάνο";
        quiz[4][2]="Ομπρέλα";
        quiz[4][3]="Χαλί";
        quiz[4][4]="Σκούπα";
        quiz[4][5] ="2";
        

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 131, 60));

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

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        jButton3.setText("jButton3");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 131, 60), 4));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("jButton5");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 131, 60), 4));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 131, 60), 4));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 131, 60), 4));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(142, 142, 142))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(298, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(150, 150, 150))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
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
        QuitFun q= new QuitFun();
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
            java.util.logging.Logger.getLogger(Fun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fun().setVisible(true);
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
