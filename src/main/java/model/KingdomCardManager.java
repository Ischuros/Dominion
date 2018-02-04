package model;

import model.card.KingdomCard;
import model.deck.DeckGenerator;
import model.type.KingdomValue;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class KingdomCardManager {

	public static final int NB_KINGDOM_CARDS = 10;

	private Set<Set<KingdomCard>> cards;

	private void init() {
		int max = KingdomValue.values().length;
		Set<Integer> values = new HashSet<>();

		while (values.size() < NB_KINGDOM_CARDS) {
			Integer value = ThreadLocalRandom.current().nextInt(0, max);
			if (!values.contains(value)) {
				values.add(value);
			}
		}

		this.cards = new HashSet<>();
		values.forEach(i -> cards.add(DeckGenerator.generateKingdomCard(KingdomValue.values()[i])));
	}
}
