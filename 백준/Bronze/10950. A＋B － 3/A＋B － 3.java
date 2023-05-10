import java.awt.Frame;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.imageio.stream.ImageInputStream;

public class Main {
    public static void main(String[] args) {
        
    	ArrayList<Integer> arrayList1 = new ArrayList();
    	ArrayList<Integer> arrayList2 = new ArrayList();
    	
    	Scanner sc = new Scanner(System.in);
    	int arrSize = sc.nextInt();
    	
    	
    	
    	for(int i =0; i<arrSize; i++) {
    		arrayList1.add(0);
    		arrayList2.add(0);
    	}
    	
    	for(int j=0; j<arrSize; j++) {
    		int first = sc.nextInt();
    		int second = sc.nextInt();
    		arrayList1.add(j, first);
    		arrayList2.add(j, second);
    	}
    	
    	
    	for(int k=0; k<arrSize; k++) {
    		System.out.println(arrayList1.get(k)+arrayList2.get(k));
    	}
    	
    	sc.close();
    	
    }
}