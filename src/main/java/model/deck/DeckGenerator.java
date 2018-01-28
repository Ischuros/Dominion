package model.deck;

import model.card.*;
import model.type.RealmValue;
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
	static final int NB_DEFAULT_REALM_CARDS = 10;
	static final int NB_YARD_CARDS = 12;
	static final int NB_CURSE_CARDS = 30;
	static final int NB_PREPARATION_CARDS = 33;
	static final int NB_BLANK_CARDS = 7;

	private DeckGenerator() {

	}

	public static Deque<Card> getAllGameCards() {
		Deque<Card> list = new LinkedList<>();

		list.addAll(generateTreasureCards());
		list.addAll(generateVictoryCards());
		list.addAll(generateRealmCards());
		list.addAll(generateCurseCards());
		list.addAll(generatePreparationCards());
		list.addAll(generateBlankCards());

		return list;
	}

	private static List<Card> generateBlankCards() {
		List<Card> cards = new ArrayList<>();

		for(int i=0; i<NB_BLANK_CARDS; i++) {
			cards.add(new BlankCard());
		}

		return cards;
	}

	private static List<Card> generatePreparationCards() {
		List<Card> cards = new ArrayList<>();

		for(int i=0; i<NB_PREPARATION_CARDS; i++) {
			cards.add(new PreparationCard());
		}

		return cards;
	}

	private static List<Card> generateCurseCards() {
		List<Card> cards = new ArrayList<>();

		for(int i=0; i<NB_CURSE_CARDS; i++) {
			cards.add(new CurseCard());
		}

		return cards;
	}

	private static List<Card> generateRealmCards() {
		List<Card> cards = new ArrayList<>();

		for(int i=0; i<NB_DEFAULT_REALM_CARDS; i++) {
			cards.add(new RealmCard(RealmValue.ADVENTURER));
			cards.add(new RealmCard(RealmValue.WORKSHOP));
			cards.add(new RealmCard(RealmValue.LIBRARY));
			cards.add(new RealmCard(RealmValue.LUMBERJACK));
			cards.add(new RealmCard(RealmValue.BUREAUCRAT));
			cards.add(new RealmCard(RealmValue.CELLAR));
			cards.add(new RealmCard(RealmValue.CHANCELLOR));
			cards.add(new RealmCard(RealmValue.COUNCIL_CHAMBER));
			cards.add(new RealmCard(RealmValue.CHAPEL));
			cards.add(new RealmCard(RealmValue.MOAT));
			cards.add(new RealmCard(RealmValue.SPY));
			cards.add(new RealmCard(RealmValue.FEAST));
			cards.add(new RealmCard(RealmValue.FESTIVAL));
			cards.add(new RealmCard(RealmValue.FORGE));
			cards.add(new RealmCard(RealmValue.LABORATORY));
			cards.add(new RealmCard(RealmValue.MARKET));
			cards.add(new RealmCard(RealmValue.MILITIA));
			cards.add(new RealmCard(RealmValue.MINE));
			cards.add(new RealmCard(RealmValue.PAWNSHOP));
			cards.add(new RealmCard(RealmValue.RENOVATION));
			cards.add(new RealmCard(RealmValue.THRONE_ROOM));
			cards.add(new RealmCard(RealmValue.WITCH));
			cards.add(new RealmCard(RealmValue.VILLAGE));
			cards.add(new RealmCard(RealmValue.THIEF));
		}

		for(int i=0; i<NB_YARD_CARDS; i++) {
			cards.add(new RealmCard(RealmValue.YARD));
		}

		return cards;
	}

	private static List<Card> generateVictoryCards() {
		List<Card> cards = new ArrayList<>();
		for(int i=0; i<NB_DOMAIN_CARDS; i++) {
			cards.add(new VictoryCard(VictoryValue.DOMAIN));
		}
		for(int i=0; i<NB_DUCHY_CARDS; i++) {
			cards.add(new VictoryCard(VictoryValue.DUCHY));
		}
		for(int i=0; i<NB_PROVINCE_CARDS; i++) {
			cards.add(new VictoryCard(VictoryValue.PROVINCE));
		}

		return cards;
	}

	private static List<Card> generateTreasureCards() {
		List<Card> cards = new ArrayList<>();
		for(int i=0; i<NB_COPPER_CARDS; i++) {
			cards.add(new TreasureCard(TreasureValue.COPPER));
		}
		for(int i=0; i<NB_SILVER_CARDS; i++) {
			cards.add(new TreasureCard(TreasureValue.SILVER));
		}
		for(int i=0; i<NB_GOLD_CARDS; i++) {
			cards.add(new TreasureCard(TreasureValue.GOLD));
		}

		return cards;
	}
}
