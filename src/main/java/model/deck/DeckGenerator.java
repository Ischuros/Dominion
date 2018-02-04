package model.deck;

import model.card.*;
import model.type.KingdomValue;
import model.type.TreasureValue;
import model.type.VictoryValue;

import java.util.*;


public class DeckGenerator {

	static final int NB_COPPER_CARDS = 60;
	static final int NB_SILVER_CARDS = 40;
	static final int NB_GOLD_CARDS = 30;
	static final int NB_DOMAIN_CARDS = 24;
	static final int NB_DUCHY_CARDS = 12;
	static final int NB_PROVINCE_CARDS = 12;
	static final int NB_REALM_CARDS = 10;
	static final int NB_CURSE_CARDS = 30;
	static final int NB_PREPARATION_CARDS = 33;
	static final int NB_BLANK_CARDS = 7;

	private DeckGenerator() {

	}

	public static List<Card> generateBlankCards() {
		List<Card> cards = new ArrayList<>();

		for (int i = 0; i < NB_BLANK_CARDS; i++) {
			cards.add(new BlankCard());
		}

		return cards;
	}

	public static List<Card> generatePreparationCards() {
		List<Card> cards = new ArrayList<>();

		for (int i = 0; i < NB_PREPARATION_CARDS; i++) {
			cards.add(new PreparationCard());
		}

		return cards;
	}

	public static List<Card> generateCurseCards() {
		List<Card> cards = new ArrayList<>();

		for (int i = 0; i < NB_CURSE_CARDS; i++) {
			cards.add(new CurseCard());
		}

		return cards;
	}

	public static Set<Card> generateRealmCard(KingdomValue value) {
		Set<Card> cards = new HashSet<>();
		for (int i = 0; i < NB_REALM_CARDS; i++) {
			cards.add(new KingdomCard(value));
		}
		return cards;
	}

	public static Set<Card> generateProvinceCards() {
		Set<Card> cards = new HashSet<>();
		for (int i = 0; i < NB_PROVINCE_CARDS; i++) {
			cards.add(new VictoryCard(VictoryValue.PROVINCE));
		}
		return cards;
	}

	public static Set<Card> generateDuchyCards() {
		Set<Card> cards = new HashSet<>();
		for (int i = 0; i < NB_DUCHY_CARDS; i++) {
			cards.add(new VictoryCard(VictoryValue.DUCHY));
		}
		return cards;
	}

	public static Set<Card> generateDomainCards() {
		Set<Card> cards = new HashSet<>();
		for (int i = 0; i < NB_DOMAIN_CARDS; i++) {
			cards.add(new VictoryCard(VictoryValue.DOMAIN));
		}
		return cards;
	}

	public static Set<Card> generateGoldCards() {
		Set<Card> cards = new HashSet<>();
		for (int i = 0; i < NB_GOLD_CARDS; i++) {
			cards.add(new TreasureCard(TreasureValue.GOLD));
		}
		return cards;
	}

	public static Set<Card> generateSilverCards() {
		Set<Card> cards = new HashSet<>();
		for (int i = 0; i < NB_SILVER_CARDS; i++) {
			cards.add(new TreasureCard(TreasureValue.SILVER));
		}
		return cards;
	}

	public static Set<Card> generateCopperCards() {
		Set<Card> cards = new HashSet<>();
		for (int i = 0; i < NB_COPPER_CARDS; i++) {
			cards.add(new TreasureCard(TreasureValue.COPPER));
		}
		return cards;
	}
}
