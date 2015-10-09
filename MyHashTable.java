import java.util.*;

@SuppressWarnings("unchecked")
class MyHashTable {
	Node[] nodeObj;
	private String key;
	private int value;
	private int size;
	private int indxCount;
	
	MyHashTable(int size) {
		this.size = 11;
		indxCount = 0;
		nodeObj = new Node[size];
	}
	
	Node first=null;
	Node last;
	public void insertElement(int value) {
		int hashCode = hashFunction(value);
		if(nodeObj[hashCode] == null) {
			nodeObj[hashCode] = new Node(value);
			
		} else {
			Node temp = new Node(value);
			temp.setNextKey(nodeObj[hashCode]);
			nodeObj[hashCode] = temp;
		}
	}

	public int hashFunction(int dkey) {
		int hashCode = dkey % 11;
		return hashCode;
	}
	
	public void print(){
		for(int i = 0; i < size; i++) {
			if(nodeObj[i] != null) {
				if (nodeObj[i].getNextKey() == null)
					System.out.print(nodeObj[i].getKey());
				else{
					Node temp = nodeObj[i];
					System.out.print(temp.getKey());
					while(temp != null) {
						temp = temp.getNextKey();
						if(temp!= null)
							System.out.print( " --> " + temp.getKey());
					}
				}
				System.out.println();
			}
			
		}
	}

}
