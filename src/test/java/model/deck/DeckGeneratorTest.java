package model.deck;

import model.card.*;
import model.type.RealmValue;
import model.type.TreasureValue;
import model.type.VictoryValue;
import org.junit.Test;

import java.util.Deque;

import static model.deck.DeckGenerator.*;
import static org.junit.Assert.*;

public class DeckGeneratorTest {

	@Test
	public void testGenerationDeck() {
		Deque<Card> deck = getAllGameCards();

		assertEquals(500, deck.size());

		assertEquals(NB_COPPER_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == TreasureValue.COPPER).count());
		assertEquals(NB_SILVER_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == TreasureValue.SILVER).count());
		assertEquals(NB_GOLD_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == TreasureValue.GOLD).count());
		assertEquals(130, deck.stream().filter(c -> c instanceof TreasureCard).count());

		assertEquals(NB_DOMAIN_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == VictoryValue.DOMAIN).count());
		assertEquals(NB_DUCHY_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == VictoryValue.DUCHY).count());
		assertEquals(NB_PROVINCE_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == VictoryValue.PROVINCE).count());
		assertEquals(48, deck.stream().filter(c -> c instanceof VictoryCard).count());

		assertEquals(NB_DEFAULT_REALM_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == RealmValue.WORKSHOP).count());
		assertEquals(NB_DEFAULT_REALM_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == RealmValue.ADVENTURER).count());
		assertEquals(NB_DEFAULT_REALM_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == RealmValue.LIBRARY).count());
		assertEquals(NB_DEFAULT_REALM_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == RealmValue.LUMBERJACK).count());
		assertEquals(NB_DEFAULT_REALM_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == RealmValue.BUREAUCRAT).count());
		assertEquals(NB_DEFAULT_REALM_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == RealmValue.CELLAR).count());
		assertEquals(NB_DEFAULT_REALM_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == RealmValue.CHANCELLOR).count());
		assertEquals(NB_DEFAULT_REALM_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == RealmValue.COUNCIL_CHAMBER)
						.count());
		assertEquals(NB_DEFAULT_REALM_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == RealmValue.CHAPEL).count());
		assertEquals(NB_DEFAULT_REALM_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == RealmValue.MOAT).count());
		assertEquals(NB_DEFAULT_REALM_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == RealmValue.SPY).count());
		assertEquals(NB_DEFAULT_REALM_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == RealmValue.FEAST).count());
		assertEquals(NB_DEFAULT_REALM_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == RealmValue.FESTIVAL).count());
		assertEquals(NB_DEFAULT_REALM_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == RealmValue.FORGE).count());
		assertEquals(NB_DEFAULT_REALM_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == RealmValue.LABORATORY).count());
		assertEquals(NB_DEFAULT_REALM_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == RealmValue.MARKET).count());
		assertEquals(NB_DEFAULT_REALM_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == RealmValue.MILITIA).count());
		assertEquals(NB_DEFAULT_REALM_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == RealmValue.MINE).count());
		assertEquals(NB_DEFAULT_REALM_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == RealmValue.PAWNSHOP).count());
		assertEquals(NB_DEFAULT_REALM_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == RealmValue.RENOVATION).count());
		assertEquals(NB_DEFAULT_REALM_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == RealmValue.THRONE_ROOM)
						.count());
		assertEquals(NB_DEFAULT_REALM_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == RealmValue.WITCH).count());
		assertEquals(NB_DEFAULT_REALM_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == RealmValue.VILLAGE).count());
		assertEquals(NB_DEFAULT_REALM_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == RealmValue.THIEF).count());
		assertEquals(NB_YARD_CARDS,
				deck.stream().filter(c -> c.getType().getValue() == RealmValue.YARD).count());
		assertEquals(252, deck.stream().filter(c -> c instanceof RealmCard).count());


		assertEquals(NB_CURSE_CARDS, deck.stream().filter(c -> c instanceof CurseCard).count());
		assertEquals(NB_PREPARATION_CARDS,
				deck.stream().filter(c -> c instanceof PreparationCard).count());
		assertEquals(NB_BLANK_CARDS, deck.stream().filter(c -> c instanceof BlankCard).count());
	}

}