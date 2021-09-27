package searchingelements;



public class SearchingElements {
	
	//Description:
	//Enter the element to search N
	//if N is present in the array then print the element
	//otherwise print the location where we insert the element
	
	public static void main(String[] args) {
		
		//array
		int elements[]= {2,3,4,6,8,9};
		
		//element to search
		int elementtosearch=5;
		
		for(int i=0;i<elements.length;i++) {
			//if element is present in the array then print the element
			if(elementtosearch==elements[i]) {
				System.out.println(elements[i]);
			}
			else {
				//otherwise print the location where we can insert the element
				if(elements[i]<elementtosearch&&elements[i+1]>elementtosearch) {
					System.out.println(i+1);
				}
			}
		}
		
		

	}

}
