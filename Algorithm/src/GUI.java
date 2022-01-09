import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.concurrent.Flow;

public class GUI implements ActionListener {

    public void GUIStart(){

        boolean OnlyOneScreen = false;

        JFrame screenCountFrame = new JFrame();
        screenCountFrame.setSize(300,300);
        screenCountFrame.setBackground(Color.BLACK);

        JLabel screenCountLabel = new JLabel();
        screenCountLabel.setText("Verwenden sie mehr als 1 Bildschirm?");
        screenCountLabel.setVisible(true);
        screenCountLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        screenCountLabel.setVerticalTextPosition(SwingConstants.TOP);

        JButton btn_yesToScreenCount = new JButton();
        btn_yesToScreenCount.setBounds(10, 220, 100, 50);
        btn_yesToScreenCount.setText("Ja");
        btn_yesToScreenCount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Sie haben mehr als 1 Bildschirm... Program wird auf den Default Bildschirm laufen.");
                final boolean OnlyOneScreen = false;
            }
        });

        JButton btn_noToScreenCount = new JButton();
        btn_noToScreenCount.setBounds(190, 220, 100, 50);
        btn_noToScreenCount.setText("Nein");
        btn_noToScreenCount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Sie haben nur 1 Bildschirm... Program wird jetzt laufen. :) ");
                final boolean OnlyOneScreen = true;
            }
        });
        screenCountFrame.add(btn_yesToScreenCount);
        screenCountFrame.add(btn_noToScreenCount);
        screenCountFrame.add(screenCountLabel);

        screenCountFrame.setVisible(true);
        screenCountFrame.setLayout(null);

    }

    public void GUIMain(){
        //Will only run after the confirmation from the ScreenCount Frame (Condition: Either of the buttons is pressed)

        JFrame mainframe = new JFrame();//creating instance of JFrame
        mainframe.setSize(860, 640);
        mainframe.setTitle("Algorithm Tester");
        
        mainframe.setLayout(new GridLayout(5, 3));//using GridLayout
        mainframe.setVisible(true);//making the frame visible
    }

    public static void main(String [] args) {

        //Instance for Merge Algorithm Classes
        BubbleSort BubbleSortInstance = new BubbleSort();
        MergeSort MergeSort = new MergeSort();

        //Kein ahnung was ich hier gemacht ehrlich gesagt rip, aber das soll mit GUI sein, und dann in Main angerufen i guess.



        //Array Declarations
        int[] BubblyArray = {1, 3, 2, 5, 4, 7, 6};
        int[] MergeArray = {1,3,2,5,4,6,8,7,9,10,13,12,11,15,14};

        //TODO: IF BubbleSort button pressed then:
        //JOptionPane.showMessageDialog(mainframe, "Arrays werden durch Bubble Sort geordnet...");
        BubbleSortInstance.bubbleSort(BubblyArray);

        //TODO: IF MergeSort button pressed then:
        //JOptionPane.showMessageDialog(mainframe, "Arrays werden durch Merge Sort geordnet...");


        //TODO: Fill Array1Result TextField with:
        BubbleSortInstance.printArray(BubblyArray);

        //TODO: Fill Array2Result TextField with:


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
