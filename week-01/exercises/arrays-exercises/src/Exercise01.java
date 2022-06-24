public class Exercise01 {

    public static void main(String[] args) {
        // String[] legendaryCreatures = {"fairies", "goblins", "gnomes", "unicorns", "harpies", "solar fish"};
        //     System.out.println(legendaryCreatures[2]); // third creature - gnomes
        // 1. Print the first, fourth, and sixth creature to the console.
        String[] hostCities = {"New York", "New Jersey","Los Angeles","Dallas", "San Francisco", "Miami", "Atlanta",
                "Seattle", "Houston", "Philadelphia", "Kansas City", "Boston" };
        //System.out.printf(hostCities[0]);
        System.out.println();
       for(int i = 0; i < hostCities.length; i++) {
           if(i > 9) {
               System.out.println(hostCities[i]);
                 }
            }

    }
}
