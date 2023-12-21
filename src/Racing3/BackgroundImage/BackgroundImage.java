package Racing3.BackgroundImage;

import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import java.awt.*;

import Racing3.Run;


public class BackgroundImage extends JPanel implements Runnable{
    List<Image> images;
    public int count;
    public int timeInterval = 1000;

    public BackgroundImageDelegate delegate;

    public void makeList(){
        images = new ArrayList<Image>();
        for(int i = 1; i  < 6; i ++){
            Image temp = new ImageIcon(Run.RESOURCE_PATH + i + ".jpeg").getImage();
            images.add(temp);
        }
    }


    public void paintComponent(Graphics g) {
            
        super.paintComponent(g);
        //System.out.println("paint : " + count);
        g.drawImage(images.get(count % 5), 0, 0, this);
        repaint();
    }
    

    

    public BackgroundImage(){
        makeList();
        setLayout(null);
    }


    @Override
    public void run() {
        while (true) {
                try{
                    Thread.sleep(timeInterval);
                } catch(InterruptedException exception) {
                    exception.printStackTrace();
                }
                if(timeInterval < 0) {
                    timeInterval = 10;
                    System.out.println("timeInterval is lower than 0");
                    continue;
                }
                count++;
                System.out.println(count);
            }
    }
}

// public class BackgroundImage extends JFrame implements move{
//     public static String RESOURCE_PATH = "app/src/main/resources/";
//     List<Image> images;

//     Thread timer = new Thread(){
//             public void run() {
//                 while (true) {
//                 try{
//                     Thread.sleep(timeInterval);
//                 } catch(InterruptedException exception) {
//                     exception.printStackTrace();
//                 }
//                 if(timeInterval < 0) {
//                     timeInterval = 10;
//                     System.out.println("timeInterval is lower than 0");
//                     continue;
//                 }
//                 count++;
//                 System.out.println(count);
//             }
//         };
//     };

//     int count = 0;

//     int timeInterval = 3000;

//     Input input = new Input();
    
//     public void makeList(){
//         images = new ArrayList<Image>();
//         for(int i = 1; i  < 6; i ++){
//             Image temp = new ImageIcon(RESOURCE_PATH + i + ".jpeg").getImage();
//             images.add(temp);
//         }
//     }

//     class MyPanel extends JPanel {
//         public void paintComponent(Graphics g) {
            
//             super.paintComponent(g);
//             //System.out.println("paint : " + count);
//             g.drawImage(images.get(count % 5), 0, 0, this);
//             repaint();
//         }
//     }

//     public void fast() {
//         if (timeInterval == 0){
//             return;
//         }
//         System.out.println("go fast: " + timeInterval);
//         if(timeInterval < 1000){
//             timeInterval -= 50;
//             return;
//         }
//         if(timeInterval < 500){
//             timeInterval -= 10;
//             return;
//         }
//         timeInterval -= 100;
//     }

//     public void slow() {
//         System.out.println("go slow: " + timeInterval ) ;
//         timeInterval += 100;
//     }



//     BackgroundImage(){
//         makeList();

//         input.delegate = this;

//         addKeyListener(input);

//         JPanel testBackground = new MyPanel();
//         setTitle("test background");
// 		setContentPane(testBackground);
// 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setSize(images.get(0).getWidth(this), images.get(0).getHeight(this));
//         setVisible(true);


//         timer.start();
//     }

//     public static void main(String[] args) {
//         new BackgroundImage();

//     }
// }
