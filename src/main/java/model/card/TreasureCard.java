package model.card;

import model.type.TreasureValue;
import model.type.Type;

public class TreasureCard extends Card {

	public TreasureCard(TreasureValue value) {
		super(new Type<>(value));
	}
}
