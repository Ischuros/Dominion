package model.type;

public class Type<V> {

	private V value;

	public Type(V value) {
		this.value = value;
	}

	public V getValue() {
		return value;
	}
}
