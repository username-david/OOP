public class Pair<K,V> {
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key =  key;
		this.value = value;
	}
	public K getKey() {
		return this.key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return this.value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey());
    }
	
	public static void main(String[]  args) {
		Pair<Integer, Integer> p1 = new Pair<>(1, 1000);
		Pair<Integer, Integer> p2 = new Pair<>(1, 2000);
		/* new Pait<Interget,String> if java version < 7*/
		Integer value = p1.getValue();
		System.out.println("Is same " + Pair.compare(p1, p2));

	}
}


