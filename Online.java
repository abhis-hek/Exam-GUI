/*Online Java Paper Test*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Online extends JFrame implements ActionListener {
    JFrame loginpage =new JFrame();
    JFrame instructions =new JFrame();
    JFrame testpage =new JFrame();

    JLabel l=new JLabel();
    JLabel name=new JLabel("Student ID");
    JLabel pass= new JLabel("Password");
    JLabel can=new JLabel("Candidate Login");
    JButton login = new JButton("L O G I N");

    JRadioButton[] jb =new JRadioButton[5];
    JButton next=new JButton("N E X T");
    JButton b1=new JButton("Next");
    JButton b2=new JButton("Result");
    JButton b3=new JButton ("Previous");
    ButtonGroup bg=new ButtonGroup();

    int count=0,current=0;

    JTextField name1= new JTextField();
    JPasswordField pass1= new JPasswordField();
    JCheckBox showpass = new JCheckBox("Show Password");

    ImageIcon img=new ImageIcon("sample3.jpg");
    JLabel background = new JLabel("",img,JLabel.CENTER);

    ImageIcon img1=new ImageIcon("sample9.jpg");
    JLabel back = new JLabel("",img1,JLabel.CENTER);
    ImageIcon img2=new ImageIcon("Capture2.jpg");
    JLabel back1 = new JLabel("",img2,JLabel.CENTER);


    Online()
    {
        login();
    }

    public void login(){
        login.setBackground(new Color(203, 203, 203, 255));
        login.setBounds(560, 330, 180, 35);
        login.setVisible(true);
        login.setFont(new Font("Impact",Font.PLAIN, 22));
        login.addActionListener(this);

        name.setBounds(550, 155, 140, 30);
        name.setFont(new Font("Open Sans",Font.BOLD, 14));
        name1.setBounds(550, 180, 200, 30);
        name1.setBackground(new Color(227, 227, 227, 255));

        pass.setBounds(550, 220, 140, 30);
        pass.setFont(new Font("Rubix",Font.BOLD, 14));
        pass1.setBounds(550, 245, 200, 30);
        pass1.setBackground(new Color(227, 227, 227, 255));

        showpass.setBounds(550, 270, 200, 50);
        showpass.setOpaque(false);
        showpass.setContentAreaFilled(false);
        showpass.setBorderPainted(false);
        showpass.addActionListener(this);
        can.setFont(new Font("Impact",Font.PLAIN, 47));
        can.setBounds(512, 72, 350, 50);

        loginpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginpage.setLayout(null);
        loginpage.setResizable(false);
        loginpage.setSize(875, 600);
        loginpage.setVisible(true);
        loginpage.setLocation(250,100);
        loginpage.setVisible(true);
        loginpage.add(name);
        loginpage.add(pass);
        loginpage.add(name1);
        loginpage.add(pass1);
        loginpage.add(showpass);
        loginpage.add(login);
        loginpage.add(can);
        background.setBounds(0,0,1000,600);
        loginpage.add(background);
        back.setBounds(0,0,875,600);
    }

    public void instructions(){
        loginpage.dispose();

        next.setBounds(361, 524, 150, 36);
        next.setBackground(new Color(236, 236, 236, 255));
        next.setFont(new Font("Impact",Font.PLAIN, 20));
        next.setVisible(true);
        next.addActionListener(this);

        instructions.getContentPane().setBackground(new Color(0xFFFFFF));
        instructions.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        instructions.setLayout(null);
        instructions.setResizable(false);
        instructions.setSize(875, 600);
        instructions.setVisible(true);
        instructions.setLocation(250,100);
        instructions.setVisible(true);
        instructions.add(next);
        back1.setBounds(0,0,875,524);
        instructions.add(back1);

    }
    public void mcq(){
        instructions.dispose();
        testpage.add(l);
        for(int i=0;i<5;i++)
        {
            jb[i]=new JRadioButton();
            add(jb[i]);
            bg.add(jb[i]);
        }

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b1.setBounds(220,350,100,30);
        b2.setBounds(400,350,100,30);
        b3.setBounds(600,350,100,30);
        b1.setBackground(new Color(244, 255, 161, 226));
        b2.setBackground(new Color(244, 255, 161, 226));
        b3.setBackground(new Color(244, 255, 161, 226));
        l.setBounds(150,90,800,30);
        l.setFont(new Font("Rubix",Font.BOLD, 22));
        testpage.add(b1);
        testpage.add(b2);
        testpage.add(b3);
        b2.setVisible(false);
        set();

        jb[0].setBounds(170,140,100,20);
        jb[0].setBackground(new Color(255, 255, 255, 255));
        jb[0].setFont(new Font("Rubix",Font.BOLD, 16));
        testpage.add(jb[0]);
        jb[1].setBounds(170,180,100,20);
        jb[1].setBackground(new Color(255, 255, 255, 255));
        jb[1].setFont(new Font("Rubix",Font.BOLD, 16));
        testpage.add(jb[1]);
        jb[2].setBounds(170,220,100,20);
        jb[2].setBackground(new Color(255, 255, 255, 255));
        jb[2].setFont(new Font("Rubix",Font.BOLD, 16));
        testpage.add(jb[2]);
        jb[3].setBounds(170,260,100,20);
        jb[3].setBackground(new Color(255, 255, 255, 255));
        jb[3].setFont(new Font("Rubix",Font.BOLD, 16));
        testpage.add(jb[3]);
        testpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        testpage.setLayout(null);
        testpage.setLocation(250,100);
        testpage.setVisible(true);
        testpage.setSize(875,600);
        testpage.add(back);

    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==login){
            String user;
            String pwd;
            user=name1.getText();
            pwd=pass1.getText();
            if (user.equalsIgnoreCase("4216") && pwd.equalsIgnoreCase("010203")){
                instructions();
            }
            else{
                JOptionPane.showMessageDialog(this,"Invalid username or password");
            }
        }

        if (e.getSource() == showpass) {
            if (showpass.isSelected()) {
                pass1.setEchoChar((char) 0);
            } else {
                pass1.setEchoChar('*');
            }
        }


        if(e.getSource()==next){
            mcq();
        }


        if(e.getSource()==b1)
        {
            if(check())
                count=count+1;
            current++;
            set();
            if(current==9)
            {
                b1.setVisible(false);
                b2.setVisible(true);
            }
        }


        if(e.getSource()==b3)
        {
            if(check())
                count=count-1;
            current--;
            set();
            if (current<9){
                b1.setVisible(true);
                b2.setVisible(false);
            }

        }


        if(e.getActionCommand().equals("Result"))
        {
            if(check())
                count=count+1;
            current++;
            if(count<5)
                //System.out.println("correct ans="+count);
                JOptionPane.showMessageDialog(this,"Correct answers = "+count+ "\n" + "YOU have FAILED"  );
            else
                JOptionPane.showMessageDialog(this,"Correct answers = "+count +"\n" + "YOU have PASSED"  );
            System.exit(0);
        }
    }


    public void set()
    {
        jb[4].setSelected(true);
        if(current==0)
        {
            l.setText("Q1: Which one among these is not a datatype");
            jb[0].setText("int");jb[1].setText("Float");jb[2].setText("boolean");jb[3].setText("char");
        }
        if(current==1)
        {
            l.setText("Q2: What is the extension of java code files?");
            jb[0].setText(".js");jb[1].setText(".txt");jb[2].setText(".class");jb[3].setText(".java");
        }
        if(current==2)
        {
            l.setText("Q3: Number of primitive data types in Java are?");
            jb[0].setText("6");jb[1].setText("7");jb[2].setText("8");jb[3].setText("9");
        }
        if(current==3)
        {
            l.setText("Q4: String class is defined in which package");
            jb[0].setText("lang");jb[1].setText("Swing");jb[2].setText("Applet");jb[3].setText("awt");
        }
        if(current==4)
        {
            l.setText("Q5: What is the size of float and double in java?");
            jb[0].setText("32 & 64");jb[1].setText("32 & 32");jb[2].setText("64 & 64");jb[3].setText("64 & 32");
        }
        if(current==5)
        {
            l.setText("Q6: Which one among these is not a keyword");
            jb[0].setText("class");jb[1].setText("int");jb[2].setText("get");jb[3].setText("if");
        }
        if(current==6)
        {
            l.setText("Q7: Which one among these is not a class ");
            jb[0].setText("Swing");jb[1].setText("Actionperformed");jb[2].setText("ActionEvent");jb[3].setText("Button");
        }
        if(current==7)
        {
            l.setText("Q8: Which of the following is not OOPS concept in Java?");
            jb[0].setText("Inheritance");jb[1].setText("Encapsulation");jb[2].setText("Polymorphism");jb[3].setText("Compilation");
        }
        if(current==8)
        {
            l.setText("Q9: Which of the following is not an access modifier?");
            jb[0].setText("Protected");jb[1].setText("void");jb[2].setText("Public");jb[3].setText("Private");
        }
        if(current==9)
        {
            l.setText("Q10: Which one among these is not a valid component");
            jb[0].setText("JButton");jb[1].setText("JList");jb[2].setText("JButtonGroup");jb[3].setText("JTextArea");
        }
        l.setBounds(150,90,900,30);
        for(int i=0,j=0;i<=120;i+=40,j++) {
            jb[j].setBounds(170, 140 + i, 200, 20);
            jb[j].setBackground(new Color(255, 255, 255, 255));
        }

    }
    boolean check()
    {
        if(current==0)
            return(jb[1].isSelected());
        if(current==1)
            return(jb[3].isSelected());
        if(current==2)
            return(jb[2].isSelected());
        if(current==3)
            return(jb[0].isSelected());
        if(current==4)
            return(jb[0].isSelected());
        if(current==5)
            return(jb[2].isSelected());
        if(current==6)
            return(jb[1].isSelected());
        if(current==7)
            return(jb[3].isSelected());
        if(current==8)
            return(jb[1].isSelected());
        if(current==9)
            return(jb[2].isSelected());
        return false;
    }
    public static void main(String s[])
    {

        new Online();
    }


}
