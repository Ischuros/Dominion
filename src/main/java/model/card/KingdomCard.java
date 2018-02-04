package model.card;

import model.type.KingdomValue;
import model.type.Type;

public class KingdomCard extends Card {

	public KingdomCard(KingdomValue value) {
		super(new Type<>(value));
	}
}
