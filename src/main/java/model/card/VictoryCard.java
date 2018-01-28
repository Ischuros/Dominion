package model.card;

import model.type.Type;
import model.type.VictoryValue;

public class VictoryCard  extends  Card {

	public VictoryCard(VictoryValue value) {
		super(new Type<>(value));
	}
}
