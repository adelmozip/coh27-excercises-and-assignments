package learn.cards;

public class Card {

    // 1. Add a Suit and Rank field to the Card class. DONE
    // 2. Add a constructor that accepts a Suit and Rank and sets the appropriate fields. DONE
    // 3. Add getters for both suit and rank. DONE

    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }



    public String getName() {

        // 4. Complete the getName method.
        // Given a card's suit and rank, getName returns a String in the format:
        // "[rank] of [suit]"

        // Examples:
        // Ace of Clubs
        // 5 of Diamonds
        // King of Hearts
        // 9 of Spades

        String name = suit.getDisplayName();
        String rankText = rank.getDisplayName();
        return String.format("%s of %s", rankText, name);
       /* switch (suit) {
            case SPADES:
                name = "Spades";
                break;
            case HEARTS:
                name = "Hearts";
                break;
            case CLUBS:
                name = "Clubs";
                break;
            case DIAMONDS:
                name = "Diamonds";
                break;
        }

        switch (rank) {
            case ACE:
                rankText = "Ace";
                break;

        }*/

        // Note: it's unlikely you'll be able to use the enum name directly since enum naming conventions
        // don't match the required output.

    }
}
