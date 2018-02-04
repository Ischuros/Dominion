package model;

import model.card.Card;
import model.deck.DeckGenerator;

import java.util.Set;

public class Game {

	private Set<Card> copperCards;
	private Set<Card> silverCards;
	private Set<Card> goldCards;
	private Set<Card> domainCards;
	private Set<Card> duchyCards;
	private Set<Card> provinceCards;
	private KingdomCardManager kingdomCardManager;

	public Game() {
		this.copperCards = DeckGenerator.generateCopperCards();
		this.silverCards = DeckGenerator.generateSilverCards();
		this.goldCards = DeckGenerator.generateGoldCards();
		this.domainCards = DeckGenerator.generateDomainCards();
		this.duchyCards = DeckGenerator.generateDuchyCards();
		this.provinceCards = DeckGenerator.generateProvinceCards();
		this.kingdomCardManager = new KingdomCardManager();
	}
}
