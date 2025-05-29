import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.* ;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

class welcomePage extends JPanel {
    
    JButton play ,
            howItWorks ,
            about ,
            exit ;
    
    static boolean go  = false ;
    
    welcomePage(JFrame window) {
        
        setSize(window.getSize().width,window.getSize().height);
        setLayout(null);
        setBackground(Color.DARK_GRAY);
        window.setContentPane(this);
        
        play = new JButton ("Play");
        play.setBackground(new Color(255,255,255)) ;
        play.setBounds(300,50,200,50);
        add(play);
        
        howItWorks = new JButton ("How It Works");
        howItWorks.setBackground(new Color(255,255,255)) ;
        howItWorks.setBounds(300,150,200,50);
        add(howItWorks);
        
        about = new JButton ("About");
        about.setBackground(new Color(255,255,255)) ;
        about.setBounds(300,250,200,50);
        add(about);
        
        exit = new JButton ("Exit");
        exit.setBackground(new Color(255,255,255)) ;
        exit.setBounds(300,350,200,50);
        add(exit);
        
        window.setVisible(true);
        
    }
    
    void choose (int time) {
        
        play.addActionListener((ActionEvent e) -> {
            go = true ;
            setVisible(false);
        });
        
        howItWorks.addActionListener((ActionEvent e) -> {
            new how(time);
        });
        
        about.addActionListener((ActionEvent e) -> {
            new about () ;
        });
        
        exit.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        
        while (!go) {
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {}
        }
        
        go = false ;
    
    }
    
}

class how  extends JFrame{
  how (int time) {
      setSize(400,400);
      setLocationRelativeTo(null);
      setResizable(false);
      JPanel pan = new JPanel () ;
      pan.setSize(this.getSize().width,this.getSize().height);
      pan.setBackground(Color.DARK_GRAY);
      pan.setLayout(null);
      setContentPane(pan);
      JLabel howLabel = new JLabel("<html><center>You Have "+ time/60+" min "+time%60 +" s To Answer 10 Different Questions"
                              + " And You Can Use The Helping Tools Such As 50:50 To remove two options "
                                    + "Or The Hint To give You A Little Clue About The Answer.</center></html>");
      howLabel.setFont(new Font("Verdana", Font.BOLD, 15));
      howLabel.setBounds(8,5,350,150);
      howLabel.setForeground(Color.white);
      JLabel border = new JLabel() ;
      border.setBorder(new LineBorder(Color.white, 2, true));
      border.setBounds(10,5,365,350);
      JLabel img = new JLabel(new ImageIcon(getClass().getResource("how it works.jpg")));
      img.setBounds(8,160,350,150);
      border.add(howLabel);
      border.add(img);
      pan.add(border);
      setVisible(true);
  }
}

class about  extends JFrame{
  about () {
      setSize(400,400);
      setResizable(false);
      setLocationRelativeTo(null);
      JPanel pan = new JPanel () ;
      pan.setSize(this.getSize().width,this.getSize().height);
      pan.setBackground(Color.DARK_GRAY);
      pan.setLayout(null);
      setContentPane(pan);
      JLabel border = new JLabel() ;
      border.setBorder(new LineBorder(Color.white, 2, true));
      border.setBounds(10,5,370,350);
      pan.add(border);
      JLabel me =new JLabel (new ImageIcon(getClass().getResource("me.png")));
      JLabel myName =new JLabel ("<html><center>Mendja Wadie<center></html>") ;
      JLabel copyright = new JLabel ("<html><center>Copyright © 2020 Mendja Wadie TP GL ,Inc. All rights reserved"
                                       + ".<center></html>");
      JLabel contact = new JLabel ("<html>"
                                       + "Product Version: Quiz Game 1.0.0<br/>"+ 
                                          "Updates : <a href='' style='color:white;'> Check for update</a><br/>" +
                                          "Contact : mendja2014@gamil.com<br/>"+
                                          "GitHub  : <a href=''>https://github.com/wadiemendja</a>"
                                           + "</html>");
      copyright.setBounds(85,290,200,30);
      copyright.setForeground(Color.white);
      border.add(copyright);
      contact.setBounds(80,140,250,150);
      contact.setForeground(Color.white);
      border.add(contact);
      myName.setBounds(0,110,80,20);
      myName.setFont(new Font("Verdana", Font.BOLD, 10));
      myName.setForeground(Color.white);
      me.setBounds(140,10,80,130);
      me.add(myName);
      JSeparator sep = new JSeparator();
      JSeparator sep2 = new JSeparator();
      sep.setBounds(30,150,300,5);
      sep2.setBounds(55,275,250,5);
      border.add(sep);
      border.add(sep2);
      border.add(me);
      setVisible(true);
  }
}

class quiz2 {
    
    String question ,
            op1 ,
            op2 ,
            op3 , 
            op4 ,
            correct_answer ,
            hint;
    
    quiz2 (String question , String op1 , String op2 ,String op3, String op4 , String corrAns , String hint) {
        this.question = question ;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3 ;
        this.op4 = op4 ;
        this.correct_answer = corrAns ;
        this.hint = hint ;
    }
}

class questions extends JPanel {
    
    JLabel Q ,
           hintLabel;
    
    JButton option1 ,
            option2,
            option3,
            option4 ;  
    
    String correct_answer,
            hint  ;

    static boolean next = false ;
    static int score = 0 ;
    
    static JLabel timer = new JLabel ("00 : 00 : 000") ;
    static counter count = new counter ();
    
    questions (quiz2 obj , JFrame window) {
            
      Q = new JLabel (obj.question);
      hintLabel = new JLabel("Hint");
      option1 = new JButton (obj.op1) ;
      option2 = new JButton (obj.op2) ;
      option3 = new JButton (obj.op3) ;
      option4 = new JButton (obj.op4) ;
      correct_answer = obj.correct_answer ;
      hint = obj.hint ; 

      JPanel pan = new JPanel () ;     
      pan.setLayout(null);
      pan.setBorder(BorderFactory.createLineBorder(Color.gray));
      pan.setBackground(Color.DARK_GRAY);
      window.setContentPane(pan);
      setLayout(null);
      setBackground(Color.getHSBColor(154, 254, 25));
      setBounds(90,170,600,200);
      setBorder(BorderFactory.createLineBorder(Color.black));
      pan.add(this);
      
      add(Q); add(option1); add(option2); add(option3); add(option4);
      
      Q.setBounds(110,8,400,50);
      Q.setBorder(new LineBorder(Color.blue, 2, true));
      Q.setHorizontalAlignment(JLabel.CENTER);
      option1.setBounds(90,70,200,40); option1.setBackground(new Color(255,255,255)) ; 
      option2.setBounds(90,140,200,40); option2.setBackground(new Color(255,255,255)) ;
      option3.setBounds(330,70,200,40);  option3.setBackground(new Color(255,255,255)) ;
      option4.setBounds(330,140,200,40); option4.setBackground(new Color(255,255,255)) ;
      option1.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED)); 
      option2.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
      option3.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
      option4.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
      
      timer.setBounds(250,400,300,50);
      timer.setFont(new Font("Verdana", Font.BOLD, 40));
      timer.setHorizontalAlignment(JLabel.CENTER);
      timer.setBorder(BorderFactory.createLineBorder(Color.white));
      timer.setForeground(Color.white);
      pan.add(timer);
      
      JButton hintBTN = new JButton(new ImageIcon(getClass().getResource("hint.png")));
      JButton half = new JButton(new ImageIcon(getClass().getResource("50 50.png")));
      
      pan.add(half); pan.add(hintBTN); pan.add(hintLabel);
      hintBTN.setBounds(200,50,80,80);
      hintBTN.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
      half.setBounds(500,50,80,80);
      half.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
      hintLabel.setBounds(290,50,200,80);
      hintLabel.setHorizontalAlignment(JLabel.CENTER);
      hintLabel.setForeground(Color.white);
      hintLabel.setBorder(new LineBorder(Color.white, 2, true));  
       
            hintBTN.addActionListener((ActionEvent e) -> {
                hintLabel.setText(hint);
            });
            
            half.addActionListener((ActionEvent e) -> {
                    if (!option1.getText().equals(correct_answer)) {
                      option1.setEnabled(false);
                      option1.setBackground(Color.red);
                    }else if (!option2.getText().equals(correct_answer)) {
                      option2.setEnabled(false);
                      option2.setBackground(Color.red);
                    }
                    if (!option3.getText().equals(correct_answer)) {
                      option3.setEnabled(false);
                      option3.setBackground(Color.red);
                    }else if (!option4.getText().equals(correct_answer)) {
                      option4.setEnabled(false);
                      option4.setBackground(Color.red);
                    }
            });
            
      window.setVisible(true);              
    }
    
    void getAnswer (int time) throws InterruptedException {
        
            option1.addActionListener((ActionEvent e) -> {
                if (option1.getText().equals(correct_answer)) score++ ;  
                next = true ;
            });

            option2.addActionListener((ActionEvent e) -> {
                if (option2.getText().equals(correct_answer)) score++ ;  
                next = true ;
            });

            option3.addActionListener((ActionEvent e) -> {
                if (option3.getText().equals(correct_answer)) score++ ;  
                next = true ;
            });

            option4.addActionListener((ActionEvent e) -> {
                if (option4.getText().equals(correct_answer)) score++ ;  
                next = true ;
           });

        while (next == false ) {
        
            timer.setText(String.format("%02d", count.M)+" : "+String.format("%02d", count.S)+" : "+String.format("%03d", count.Ms)); 
               count.Ms++ ;
               Thread.sleep(1);
               if (count.Ms==999){
                   count.S++ ;
                   count.Ms=0 ;
               }
               if (count.S==59){
                   count.M++ ;
                   count.S=0;
               }
               
               if ((count.S + count.M*60) > time-3 ) {
                   
                   timer.setForeground(Color.red);
                   
                        if ((count.S + count.M*60)==time) { 
                            return ;
                        }
               }
        
        } 
        
        next = false ;
  
    }
    
    int getScore() {return score ;}
    
    counter getTime () {return count ;}
    
    void Reset () {
        
            count.M=0 ; 
            count.Ms=0 ; 
            count.S=0;
            score = 0 ;
    
    }
    
}

class scorePane extends JPanel {
    
    JButton playAgain ,
            exit ;
    
    JLabel scoreLabel ;
    
    static boolean again =false;
    
    scorePane (JFrame window , int score , int nbrQ) {
        
        setSize(window.getSize().width,window.getSize().height);
        setLayout(null);
        setBackground(Color.DARK_GRAY);
        window.setContentPane(this);
        
        playAgain = new JButton ("Back To Menu");
        playAgain.setBackground(new Color(255,255,255)) ;
        playAgain.setBounds(300,250,200,50);
        add(playAgain);
        
        exit = new JButton ("Exit");
        exit.setBackground(new Color(255,255,255)) ;
        exit.setBounds(300,350,200,50);
        add(exit);
        
        scoreLabel = new JLabel ("You Got : "+score+"/"+nbrQ);
        scoreLabel.setHorizontalAlignment(JLabel.CENTER);
        scoreLabel.setFont(new Font("Verdana", Font.BOLD, 40));
        scoreLabel.setForeground(Color.white);
        scoreLabel.setBorder(new LineBorder(Color.white, 2, true));
        scoreLabel.setBounds(200,100,400,100);
        add(scoreLabel);
        
        window.setVisible(true);
        
    }
    
    void choose () {
        
        playAgain.addActionListener((ActionEvent e) -> {
            again= true ;
        });
        
        exit.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        
        while (!again) {
            try {        
                Thread.sleep(0);
            } catch (InterruptedException ex) {}
        }
        
        again = false ;
        
    }
    
}

public class Quiz {
    public static void main(String[] args) throws InterruptedException {
        
      JFrame window = new JFrame ("Quiz Game") ;  
      window.setSize(800,500);
      window.setLocationRelativeTo(null);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setResizable(false);

    while (true) {  
      
      int nbr =0 , score=0 , m=0 , s=0 ;
      int time = 60 ; //sec  
        
      welcomePage welcome = new welcomePage (window);
      welcome.choose(time);
        
        quiz2 [] qObj = {
            new quiz2("Question 1","op1","op2","op3","op4","op1","hint 1"),
            new quiz2("Question 2","op1","op2","op3","op4","op4","hint 2"),
            new quiz2("Question 3","op1","op2","op3","op4","op3","hint 3"),
            new quiz2("Question 4","op1","op2","op3","op4","op2","hint 4")
        };
        
        while (nbr != qObj.length && s<time ) {
            questions quiz = new questions(qObj[nbr], window);
            quiz.getAnswer(time); 
            m = quiz.getTime().M ;
            s = quiz.getTime().S ;
            score = quiz.getScore();
            if (nbr == qObj.length-1 || (s==time)) quiz.Reset();
            nbr++ ;
        }
        
        int nbrQ = qObj.length ;  
        scorePane scorePane = new scorePane (window,score,nbrQ) ;
        scorePane.choose();
     
     }    
      
    }    
}
