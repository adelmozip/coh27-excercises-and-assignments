package learn.cards;

public enum Suit {
    SPADES("Spades"),
    HEARTS("Hearts"),
    CLUBS("Clubs"),
    DIAMONDS("Diamonds");
    private final String displayName;


    //constr
    Suit(String displayName) {
        this.displayName = displayName;
    }

    //getter for the display name
    public String getDisplayName() {
        return displayName;
    }
}
