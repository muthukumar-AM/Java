package listtotation;

import java.util.ArrayList;
import java.util.List;

public class ListRotation {
	public List<Integer> rotateList(List<Integer> listtorotate,int noofRotations){
		for (int i = 0; i < noofRotations; i++) {
	           
            int temp = listtorotate.get(0);
           
            for (int j = 0; j < listtorotate.size()-1; j++) {
            	listtorotate.set(j, listtorotate.get(j + 1));
            }
            listtorotate.set(listtorotate.size()-1, temp);
        }
        return listtorotate;

		
	}
	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		System.out.println("Original List :"+numbers);
		ListRotation numberlist=new ListRotation();
		int numberofRotations=2;
		List<Integer> rotatedList=numberlist.rotateList(numbers,numberofRotations);
		
		System.out.println("rotated List :"+rotatedList);

	}

}
