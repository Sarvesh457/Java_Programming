import java.awt.event.*;
import javax.swing.*;

class  Clac implements  ActionListener
{
    JFrame fobj;
    JButton bobj1,bobj2,bobj3,bobj4;
    JTextField tobj1,tobj2;
    JLabel NumberLabel1,NumberLabel2,ResultLabel;

    public void createCalculator(String title,int width,int hight)
    {
        fobj = new JFrame(title); 
        fobj.setBackground(134); 
        
        // Labels
        NumberLabel1 = new JLabel("Enter First Number:");
        NumberLabel1.setBounds(50, 50, 150, 30);

        NumberLabel2 = new JLabel("Enter Second Number:");
        NumberLabel2.setBounds(50, 100, 150, 30);

        // Text Fields
        tobj1 = new JTextField();
        tobj1.setBounds(220, 50, 150, 30);

        tobj2 = new JTextField();
        tobj2.setBounds(220, 100, 150, 30);

        // Buttons 
        bobj1 = new JButton("+");
        bobj1.setBounds(50, 160, 120, 30);

        bobj2 = new JButton("-");
        bobj2.setBounds(180, 160, 120, 30);

        bobj3 = new JButton("*");
        bobj3.setBounds(310, 160, 130, 30);

        bobj4 = new JButton("/");
        bobj4.setBounds(450, 160, 120, 30);

        // Result 
        ResultLabel = new JLabel("");
        ResultLabel.setBounds(220, 220, 250, 30);


        fobj.add(bobj1);
        fobj.add(bobj2);
        fobj.add(bobj3);
        fobj.add(bobj4);
        fobj.add(tobj1);
        fobj.add(tobj2);
        fobj.add(NumberLabel1);
        fobj.add(NumberLabel2);
        fobj.add(ResultLabel);

        bobj1.addActionListener(this);
        bobj2.addActionListener(this);
        bobj3.addActionListener(this);
        bobj4.addActionListener(this);

        fobj.setLayout(null);

        fobj.setSize(width,hight);

        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    public void actionPerformed(ActionEvent aobj)
    {
        String num1 = tobj1.getText();
        String num2 = tobj2.getText();

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        double result = 0;

        if(aobj.getSource() == bobj1)
        {
            result = n1+n2;
        }
        else if(aobj.getSource() == bobj2)
        {
            result = n1-n2;
        }
        else if(aobj.getSource() == bobj3)
        {
            result = n1*n2;
        }
        else if(aobj.getSource() == bobj4)
        {
            result = (double)n1/n2;
        }

        ResultLabel.setText("Total:-"+result);
    }

}
class Calculator
{
    public static void main(String A[])
    {
        Clac cobj = new Clac();
        cobj.createCalculator("Calculator",650, 400);
        
    }
}
