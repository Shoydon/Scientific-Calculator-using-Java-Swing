import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorGUI {
    public static void main(String[] args) {
        new Calc();
    }
}
class Calc extends JFrame implements ActionListener{
    JLabel info=new JLabel();
    JTextField  space;
    JButton n0,n1,n2,n3,n4,n5,n6,n7,n8,n9,add,sub,mul,div,del,ac,ans,power,sin,cos,tan,x_1,logx,back;
    static double res=0,temp=0,a=0;
    static char op=0;

    Calc(){
        
        space=new JTextField();
        space.setBounds(10,10,170,20);
        info.setBounds(190,10,200,20);

        sin=new JButton("sin x");
        sin.setBounds(10, 40, 70, 50);
        cos=new JButton("cos x");
        cos.setBounds(90, 40, 70, 50);
        tan=new JButton("tan x");
        tan.setBounds(170, 40, 70, 50);
        logx=new JButton("logx");
        logx.setBounds(250, 40, 70, 50);

        n7=new JButton("7");
        n7.setBounds(10, 100, 50, 50);
        n8=new JButton("8");
        n8.setBounds(70, 100, 50, 50);
        n9=new JButton("9");
        n9.setBounds(130, 100, 50, 50);
        n4=new JButton("4");
        n4.setBounds(10, 160, 50, 50);
        n5=new JButton("5");
        n5.setBounds(70, 160, 50, 50);
        n6=new JButton("6");
        n6.setBounds(130, 160, 50, 50);
        n1=new JButton("1");
        n1.setBounds(10, 220, 50, 50);
        n2=new JButton("2");
        n2.setBounds(70, 220, 50, 50);
        n3=new JButton("3");
        n3.setBounds(130, 220, 50, 50);
        n0=new JButton("0");
        n0.setBounds(70, 280, 50, 50);

        add=new JButton("+");
        add.setBounds(220, 100, 50, 50);
        sub=new JButton("-");
        sub.setBounds(220, 160, 50, 50);
        mul=new JButton("X");
        mul.setBounds(220, 220, 50, 50);
        div=new JButton("/");
        div.setBounds(220, 280, 50, 50);
        power=new JButton("x^y");
        power.setBounds(280, 100, 60, 50);
        x_1=new JButton("1/x");
        x_1.setBounds(280, 160, 60, 50);

        del=new JButton("DEL");
        del.setBounds(10, 340, 70, 50);
        ac=new JButton("AC");
        ac.setBounds(90, 340, 70, 50);
        ans=new JButton("=");
        ans.setBounds(170, 340, 70, 50);
        back=new JButton("<-");
        back.setBounds(250, 340, 70, 50);

        add(space);
        add(n1);
        add(n2);
        add(n3);
        add(n4);
        add(n5);
        add(n6);
        add(n7);
        add(n8);
        add(n9);
        add(n0);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(del);
        add(ac);
        add(ans);
        add(power);
        add(sin);
        add(cos);
        add(tan);
        add(logx);
        add(info);
        add(x_1);
        add(back);

        n1.addActionListener(this);
        n2.addActionListener(this);
        n3.addActionListener(this);
        n4.addActionListener(this);
        n5.addActionListener(this);
        n6.addActionListener(this);
        n7.addActionListener(this);
        n8.addActionListener(this);
        n9.addActionListener(this);
        n0.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        div.addActionListener(this);
        mul.addActionListener(this);
        del.addActionListener(this);
        ac.addActionListener(this);
        ans.addActionListener(this);
        power.addActionListener(this);
        sin.addActionListener(this);
        cos.addActionListener(this);
        tan.addActionListener(this);
        logx.addActionListener(this);
        x_1.addActionListener(this);
        back.addActionListener(this);

        setSize(400, 500);
        setLayout(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==n1){
            temp=temp*10+Integer.parseInt(n1.getText());
            space.setText(""+temp);
        }
        else if(ae.getSource()==n2){
            temp=temp*10+Integer.parseInt(n2.getText());
            space.setText(""+temp);
        }
        else if(ae.getSource()==n3){
            temp=temp*10+Integer.parseInt(n3.getText());
            space.setText(""+temp);
        }
        else if(ae.getSource()==n4){
            temp=temp*10+Integer.parseInt(n4.getText());
            space.setText(""+temp);
        }
        else if(ae.getSource()==n5){
            temp=temp*10+Integer.parseInt(n5.getText());
            space.setText(""+temp);
        }
        else if(ae.getSource()==n6){
            temp=temp*10+Integer.parseInt(n6.getText());
            space.setText(""+temp);
        }
        else if(ae.getSource()==n7){
            temp=temp*10+Integer.parseInt(n7.getText());
            space.setText(""+temp);
        }
        else if(ae.getSource()==n8){
            temp=temp*10+Integer.parseInt(n8.getText());
            space.setText(""+temp);
        }
        else if(ae.getSource()==n9){
            temp=temp*10+Integer.parseInt(n9.getText());
            space.setText(""+temp);
        }
        else if(ae.getSource()==n0){
            temp=temp*10+Integer.parseInt(n0.getText());
            space.setText(""+temp);
        }
        
        else if(ae.getSource()==ac){
            res=a;
            temp=0;
            a=0;
            op=0;
            space.setText("");
            info.setText("");
        }
        else if(ae.getSource()==del){
            temp/=10;
            space.setText(""+(double)(int)temp);
        }
        else if(ae.getSource()==back){
            space.setText(""+res);
        }
        else if(ae.getSource()==ans){
            if(op=='+'){
                a+=temp;
                temp=a;
                space.setText(""+a);  
            }
            else if(op=='-'){
                a-=temp;
                temp=a;
                space.setText(""+a);
            }
            else if(op=='/'){
                if(a==0&&temp==0){
                    info.setText("Indeterminate");
                    space.setText("");
                }
                
                else if(temp==0){
                    info.setText("Cannot divide by zero");
                    space.setText("");
                }
                
                else{
                    a/=temp;
                    temp=a;
                    space.setText(""+a);
                }
            }
            else if(op=='*'){
                a*=temp;
                temp=a;
                space.setText(""+a);
            }
            else if(op=='^'){
                a=Math.pow(a,temp);
                temp=a;
                space.setText(""+a);
            }
            else if(op=='s'){
                a=Math.toRadians(a);
                double i=Math.sin(a);
                space.setText(""+i);
                temp=i;
            }
            else if(op=='c'){
                a=Math.toRadians(a);
                double i=Math.cos(a);
                space.setText(""+i);
                temp=i;
            }
            else if(op=='t'){
                a=Math.toRadians(a);
                double i=Math.tan(a);
                space.setText(""+i);
                temp=i;
            }
            else if(op=='l'){
                if(temp>0){
                    space.setText(""+(Math.log(a)/Math.log(temp)));
                    temp=Math.log(a)/Math.log(temp);
                }
                else if(temp==0){
                    space.setText(""+Math.log(a));
                    temp=Math.log(a);
                }
                else{
                    space.setText("");
                    info.setText("Invalid base");
                }
            }
            else if(op=='!'){
                if(a!=0){
                    a=1/a;
                    temp=a;
                    space.setText(""+a);
                }
                else{
                    info.setText("Cannot divide by zero");
                    space.setText("");
                }
            }
        }
        else if(ae.getSource()==add){
            a=temp;
            temp=0;
            space.setText(a+" + ");
            op='+';
        }
        else if(ae.getSource()==sub){
            a=temp;
            temp=0;
            space.setText(a+" - ");
            op='-';
        }
        else if(ae.getSource()==div){
            a=temp;
            temp=0;
            space.setText(a+" / ");
            op='/';
        }
        else if(ae.getSource()==mul){
            a=temp;
            temp=0;
            space.setText(a+" X ");
            op='*';
        }
        else if(ae.getSource()==power){
            a=temp;
            temp=0;
            space.setText("");
            op='^';
        }
        else if(ae.getSource()==sin){
            a=temp;
            temp=0;
            space.setText("sin("+a+")");
            op='s';
        }
        else if(ae.getSource()==cos){
            a=temp;
            temp=0;
            space.setText("cos("+a+")");
            op='c';
        }
        else if(ae.getSource()==tan){
            a=temp;
            temp=0;
            space.setText("tan("+a+")");
            op='t';
        }
        else if(ae.getSource()==logx){
            a=temp;
            temp=0;
            space.setText("log("+a+")");
            info.setText("Enter base(press 0 for base e)");
            op='l';
        }
        else if(ae.getSource()==x_1){
            a=temp;
            temp=0;
            space.setText("1/"+a);
            op='!';
        }
    }
}