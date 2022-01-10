import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

import layout.TableLayout;

public class Main {
	
    public static void main(String [] args){

    	ArrayList<SortAlgorithm> sorters = new ArrayList<SortAlgorithm>();
    	
    	sorters.add(new BubbleSort());
    	sorters.add(new InsertionSort());
    	sorters.add(new MergeSort());
    	
    	int[] testarray = {5,4,9,6,12,44,777,44,5};
    	
    	for(int i = 0; i < sorters.size(); i++) {
    		System.out.println("using sort algorithm: " + sorters.get(i).getType());
    		int[] out = sorters.get(i).sort(testarray);
    		for(int j = 0; j < out.length; j++) {
    			System.out.print(out[j] + " ");
    		}
    		System.out.println();
    	}
    	
    	buildGui(sorters);
    	
    }
    
    private static void buildGui(ArrayList<SortAlgorithm> sorters) {
    	
    	try { 
    		// please let it look better
    	    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    	} catch (Exception e) {
    	    e.printStackTrace();
    	}
    	
    	JFrame frame = new JFrame("Debugging Sorting Algos");
    	frame.setBounds(300, 300, 500, 125);
    	
    	double border = 10;
    	
    	AlgorithmType[] comboList = {AlgorithmType.BUBBLESORT, AlgorithmType.INSERTIONSORT, AlgorithmType.MERGESORT};
    	
    	JComboBox algoChooser = new JComboBox<AlgorithmType>(comboList);
    	JTextField arrayInputField = new JTextField();
    	JButton start = new JButton("Sort");
    	
    	double size[][] = {
    			{border, 0.7, border, 0.3, border},
    			{border, 25, border, 25, border}
    	};
    	
    	frame.setLayout(new TableLayout(size));
    	
    	start.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			
    			startSorting(arrayInputField.getText(), (AlgorithmType)algoChooser.getSelectedItem(), sorters);
    			
    		}
    	});
    	
    	frame.add(algoChooser, "1,1,3,1");
    	frame.add(arrayInputField, "1,3");
    	frame.add(start, "3,3");
    	
    	frame.setVisible(true);
    	
    }
    
    private static void startSorting(String input, AlgorithmType type, ArrayList<SortAlgorithm> sorters) {
    	
    	// expect input to be like '3,56,89,12,777,3', split by ',' and convert each to int then put back into int[] array
    	int[] inputArray = Arrays.stream(input.split(",")).mapToInt(i -> Integer.parseInt(i)).toArray();
    	
    	for(int i = 0; i < sorters.size(); i++) {
    		if(sorters.get(i).getType() == type) {
    			JOptionPane.showMessageDialog(null, Arrays.stream(sorters.get(i).sort(inputArray)).boxed().map(j -> String.valueOf(j)).collect(Collectors.joining(",")));
    			break;
    		}
    	}
    	
    }
    
}
