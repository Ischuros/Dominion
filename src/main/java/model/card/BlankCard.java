package model.card;

import model.type.Type;

public class BlankCard extends Card {

	public BlankCard() {
		super(new Type<Void>(null));
	}
}
