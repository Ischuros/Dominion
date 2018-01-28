package model.card;

import model.type.RealmValue;
import model.type.Type;

public class RealmCard extends Card {

	public RealmCard(RealmValue value) {
		super(new Type<>(value));
	}
}
