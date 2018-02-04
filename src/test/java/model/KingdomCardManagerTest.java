package model;

import model.card.KingdomCard;
import model.deck.DeckGenerator;
import model.type.KingdomValue;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static org.junit.Assert.*;

public class KingdomCardManagerTest {

	@Test
	public void cardsGenerationTest() {
		Set<Set<KingdomCard>> allCards = new KingdomCardManager().getAllCards();

		assertEquals(10, allCards.size());
		Set<KingdomValue> values = new HashSet<>();
		for(Iterator<Set<KingdomCard>> it = allCards.iterator(); it.hasNext();) {
			Set<KingdomCard> cards = it.next();
			assertEquals(DeckGenerator.NB_REALM_CARDS, cards.size());
			values.add((KingdomValue) cards.iterator().next().getType().getValue());
		}

		assertEquals(10, values.size());
	}
}