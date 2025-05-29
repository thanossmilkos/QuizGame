
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Geography extends javax.swing.JFrame {

    String[][] quiz = new String[6][6];
    int question = 0;
    int score =0;

    public Geography() {
        initComponents();
        setLocation(600,300);
        setSize(850,600);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        GeographyCategory();
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
    
    public void GeographyCategory()
    { 
        quiz[0][0] = "Ποιο είναι το δεύτερο ψηλότερο βουνό στην Ελλάδα;";
        quiz[0][1]="Σμόλικας";
        quiz[0][2]="Βόρας";
        quiz[0][3]="Όλυμπος";
        quiz[0][4]="Γκιώνα";
        quiz[0][5]="1";

        quiz[1][0]= "Σε ποίο σύμπλεγμα νησιών ανήκει η Σέριφος;";
        quiz[1][1]="Επτάνησα";
        quiz[1][2]="Δωδεκάνησα";
        quiz[1][3]="Κυκλάδες";
        quiz[1][4]="Βόρειες Σποράδες";
        quiz[1][5] ="3";

        quiz[2][0]= "Πόσες λευκές ρίγες έχει η ελληνική σημαία;";
        quiz[2][1]="Τέσσερις";
        quiz[2][2]="Πέντε";
        quiz[2][3]="Επτά";
        quiz[2][4]="Οκτώ";
        quiz[2][5] ="1";

        quiz[3][0]= "Στη σημαία ποιάς χώρας δεσπόζει ένα φύλλο σφενδάμου;";
        quiz[3][1]="Λίβανου";
        quiz[3][2]="Καναδάς";
        quiz[3][3]="Ισπανίας";
        quiz[3][4]="Ινδίας";
        quiz[3][5] ="2";

        quiz[4][0]= "Ποια οροσειρά θεωρείται το γεωγραφικό όριο μεταξύ Ευρώπης και Ασίας;";
        quiz[4][1]="Πυρηναία";
        quiz[4][2]="Καρπάθια";
        quiz[4][3]="Κιλιμάντζαρο";
        quiz[4][4]="Ουράλια";
        quiz[4][5] ="4";
        
        

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

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

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jButton2.setText("jButton2");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("jButton5");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));
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
                .addGap(170, 170, 170)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(153, 153, 153))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/geo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        close();
        QuitGeo q= new QuitGeo();
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
        if(quiz[question][5] == "3"){
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
            java.util.logging.Logger.getLogger(Geography.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Geography.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Geography.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Geography.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Geography().setVisible(true);
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
