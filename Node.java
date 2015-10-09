class Node {
	private int key;
	private Node nxtKey;
	Node(int key) {
		this.key = key;
		// this.nxtKey = nxtKey;
	}
	public void setKey(int key) {
		this.key = key;
	}

	public void setNextKey(Node nxtKey) {
		this.nxtKey = nxtKey;
	}


	public int getKey() {
		return key;
	}

	public Node getNextKey() {
		return nxtKey;
	}

	public String toString() {
		return key + "  " +nxtKey;
	} 
}