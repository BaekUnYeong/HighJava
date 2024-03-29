package kr.or.ddit.basic;

class Util {
	/*
	 * 제너릭 메서드 <T, R> R method(T t)
	 * 
	 * 파라미터 타입과 리턴타입으로 타입 파라미터를 가지는 메서드
	 * 
	 * 선언방법 : 리턴타입 앞에 <> 기호를 추가하고 타입 파라미터를 기술 후 사용함.
	 */
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {

		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());

		return keyCompare && valueCompare;
	}
}

class Pair<K, V> {
	private K key;
	private V value;

	public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
}

public class T04_GenericMethodTest {
	public static void main(String[] args) {

		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "한승희");
		Pair<Integer, String> p2 = new Pair<Integer, String>(2, "가나다");

		boolean result1 = Util.compare(p1, p2);

		if (result1)
			System.out.println("논리적으로 동일한 객체");
		else
			System.out.println("논리적으로 동일하지 않은 객체");

		Pair<String, String> p3 = new Pair<>("001", "가나다");
		Pair<String, String> p4 = new Pair<>("002", "가나다");

		boolean result2 = Util.compare(p3, p4);

		if (result2)
			System.out.println("논리적으로 동일한 객체");
		else
			System.out.println("논리적으로 동일하지 않은 객체");
	}
}
