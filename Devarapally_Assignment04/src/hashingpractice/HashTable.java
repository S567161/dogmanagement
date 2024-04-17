package hashingpractice;
/**
*
* @author S567161 Udaykiranreddy Devarapally
*/

public class HashTable {

	private int[] hashArray;
	
	public HashTable(int size) {
		hashArray = new int[size];
		for(int i=0;i<size;i++) {
			hashArray[i]=-1;
		}
	}
	
	private int getHashIndex(int key) {
		return key% hashArray.length;
	}
	
	public void add(int element) {
		int i=getHashIndex(element);
		while(hashArray[i]!=-1) {
			i=(i+1)%hashArray.length;
		}
		hashArray[i]=element;
	}
	
	public int search(int element) {
	    int i = getHashIndex(element);
	    int st = i; 
	    while (hashArray[i] != -1) {
	        if (hashArray[i] == element) {
	            return i; 
	        }
	        i = (i + 1) % hashArray.length;
	        if (i == st) { 
	            break;
	        }
	    }
	    return -1; 
	}
	
	public void print() {
        System.out.print("Elements in the Hash Table: [");
        for (int i = 0; i < hashArray.length; i++) {
			if (hashArray[i] != -1) {
				System.out.print(hashArray[i]);
				if (i < hashArray.length - 1)
					System.out.print(", ");
			}
		}
        System.out.println("]");
        
    }
}
