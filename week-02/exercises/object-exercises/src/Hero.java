public class Hero {

    private String name;
    private Power[] powers;
    private String capeColor;

    public Hero(String name, Power[] powers) {
        this.name = name;
        this.powers = powers;
    }

    public String getName() {
        return name;
    }

    public Power[] getPowers() {
        return powers;
    }

    public String toLine() {
        Power[] powers = getPowers();
        String[] powerNames = new String[powers.length];
        for(int i=0; i < powers.length; i++) {
            powerNames[i] = powers[i].getPowerName();
        }
        return String.format("%s (%s)", getName(), String.join(",", powerNames));
    }
}
