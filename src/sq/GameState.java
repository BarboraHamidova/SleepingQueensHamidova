package sq;

import sq.AwokenQueenPosition;
import sq.Card;

import java.util.*;

public class GameState {
    private final Integer numberOfPlayers;
    private Integer onTurn;
    private Set<SleepingQueenPosition> sleepingQueens;
    private Map<HandPosition, Optional<Card>> cards;
    private Map<AwokenQueenPosition, Queen> awokenQueens;
    private List<Card> cardsDiscardedLastTurn;

    /* Probably everything should be final and constructor should initialize everything */

    public GameState(int numberOfPlayers, int onTurn, Set<SleepingQueenPosition> sleepingQueens, Map<HandPosition, Optional<Card>> cards, Map<AwokenQueenPosition, Queen> awokenQueens, List<Card> cardsDiscardedLastTurn){
        this.numberOfPlayers = numberOfPlayers;

    }

}
