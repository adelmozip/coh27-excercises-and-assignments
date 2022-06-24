public class Exercise04 {

    public static void main(String[] args) {
        // 1. Declare an array to hold the names of the world's oceans.
        // Set its value using array literal notation.
        // 2. Loop over each element and print it.
        String[] worldOceans = new String[] {"Pacific", "Atlantic", "Indian", "Arctic", "Southern"};

        for(int i = 0; i < worldOceans.length; i++) {
            System.out.println(worldOceans[i]);
        }
    }
}
