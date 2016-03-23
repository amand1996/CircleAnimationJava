/**
 * Created by aman on 7/9/15.
 */
import javax.swing.*;
import java.awt.*;

public class CircleAnimation{
    int x= 70;
    int y= 70;
    int i;
    JFrame frame;
    public static void main(String args[]){
        CircleAnimation gui = new CircleAnimation();
        gui.go();
    }

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);

        for(i=0; i<160; i++){
            if(i<40){
                x++;
                y++;
            }
            if(i>=40 && i<80){
                x--;
                y--;
            }
            if(i>=80 && i<120){
                x--;
                y++;
            }
            if(i>=120 && i<160){
                x--;
                y--;
            }

            drawPanel.repaint();

            try{
                Thread.sleep(50);
            }catch(Exception ex){}
        }
    }



    class MyDrawPanel extends JPanel{

        public void paintComponent(Graphics g){
            g.setColor(Color.white);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            g.setColor(Color.green);
            g.fillOval(x, y, 40, 40);

        }
    }

}
