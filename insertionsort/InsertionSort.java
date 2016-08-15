package insertionsort;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;

class Graph extends JPanel {

    public void paintGraph (Graphics g){

        ArrayList<Integer> scores = new ArrayList<Integer>(10);

        Random r = new Random();

        for (int i : scores){
            i = r.nextInt(20);
            System.out.println(r);
        }

        int y1;
        int y2;

        for (int i = 0; i < scores.size(); i++){
            y1 = scores.get(i);
            y2 = scores.get(i+1);
            g.drawLine(i, y1, i+1, y2);
        }
    }
}
public class InsertionSort extends JPanel{
    
    
    public static void main(String[] args) 
    {
        int recursion = 100;
        long[] time = new long[recursion];
        for(int i = 1; i < recursion ; i++)
        {
            InsSort a = new InsSort(i*100);
            long startTime = System.nanoTime();
            a.sort();
            long endTime = System.nanoTime();
            time[i] = endTime - startTime;
        }
        
        for(int i = 1; i < recursion ; i++)
        {
            System.out.println( /*(i*100) + "   " + */time[i]);
        }   
    }
}
