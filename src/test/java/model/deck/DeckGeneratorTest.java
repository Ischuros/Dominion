package model.deck;

import model.type.KingdomValue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckGeneratorTest {

	@Test
	public void generateBlankCardsTest() {
		assertEquals(DeckGenerator.NB_BLANK_CARDS, DeckGenerator.generateBlankCards().size());
	}

	@Test
	public void generatePreparationCardsTest() {
		assertEquals(DeckGenerator.NB_PREPARATION_CARDS,
				DeckGenerator.generatePreparationCards().size());
	}

	@Test
	public void generateCurseCardsTest() {
		assertEquals(DeckGenerator.NB_CURSE_CARDS, DeckGenerator.generateCurseCards().size());
	}

	@Test
	public void generateRealmCardsTest() {
		assertEquals(DeckGenerator.NB_REALM_CARDS,
				DeckGenerator.generateRealmCard(KingdomValue.WOODCUTTER).size());
	}

	@Test
	public void generateProvinceCardsTest() {
		assertEquals(DeckGenerator.NB_PROVINCE_CARDS, DeckGenerator.generateProvinceCards().size());
	}

	@Test
	public void generateDuchyCardsTest() {
		assertEquals(DeckGenerator.NB_DUCHY_CARDS, DeckGenerator.generateDuchyCards().size());
	}

	@Test
	public void generateDomainCardsTest() {
		assertEquals(DeckGenerator.NB_DOMAIN_CARDS, DeckGenerator.generateDomainCards().size());
	}

	@Test
	public void generateGoldCardsTest() {
		assertEquals(DeckGenerator.NB_GOLD_CARDS, DeckGenerator.generateGoldCards().size());
	}

	@Test
	public void generateSilverCardsTest() {
		assertEquals(DeckGenerator.NB_SILVER_CARDS, DeckGenerator.generateSilverCards().size());
	}

	@Test
	public void generateCopperCardsTest() {
		assertEquals(DeckGenerator.NB_COPPER_CARDS, DeckGenerator.generateCopperCards().size());
	}
}