import javax.swing.*;
public class ExampleS extends JFrame {
JLabel l1,l2,l3,l4;
JTextField t1,t2;
Jbutton b1;
public ExampleS(){}
public ExampleS(String  s){
super(s);}
public void setComponents(){
l1=new JLabel("addition of two numbers");
l2=new JLabel("First Number: ");
l3=new JLabel("Second Number:" );
l4=new JLabel("Addition of two numbers: ");
t1=new JTextField();
t2=new JTextField();
b1=new Jbutton("Add: ");
add(l1);
add(l2);
add(l3);
add(l4);
add(t1);
add(t2);
add(b1);
}
public static void main(String []args)
{
ExampleS jf=new ExampleS("Swing Example");
jf.setcomponents();
jf.setsize(300,500);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

