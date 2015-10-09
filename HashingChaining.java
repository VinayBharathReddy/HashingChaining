public class HashingChaining {
	public static void main(String[] vb) {
		int[] input = {96, 43, 72, 68, 63, 28, 50};
		MyHashTable hashObj = new MyHashTable(11);
		for(int i = 0; i < input.length; i++) {
			hashObj.insertElement(input[i]);
		}
		hashObj.print();
	}
}