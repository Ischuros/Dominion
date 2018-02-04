package model;

import model.card.TreasureCard;
import model.card.VictoryCard;
import model.deck.DeckGenerator;

import java.util.Set;

public class Game {

	private Set<TreasureCard> copperCards;
	private Set<TreasureCard> silverCards;
	private Set<TreasureCard> goldCards;
	private Set<VictoryCard> estateCards;
	private Set<VictoryCard> duchyCards;
	private Set<VictoryCard> provinceCards;
	private KingdomCardManager kingdomCardManager;

	public Game() {
		this.copperCards = DeckGenerator.generateCopperCards();
		this.silverCards = DeckGenerator.generateSilverCards();
		this.goldCards = DeckGenerator.generateGoldCards();
		this.estateCards = DeckGenerator.generateEstateCards();
		this.duchyCards = DeckGenerator.generateDuchyCards();
		this.provinceCards = DeckGenerator.generateProvinceCards();
		this.kingdomCardManager = new KingdomCardManager();
	}
}
