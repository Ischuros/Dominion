package model.card;

import model.type.Type;

public abstract class Card {

	private Type type;

	public Card(Type type) {
		this.type = type;
	}

	public Type getType() {
		return type;
	}
}
