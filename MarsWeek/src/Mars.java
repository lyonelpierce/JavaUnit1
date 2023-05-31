import java.util.Scanner;
public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "Tatooine";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        Scanner scanner = new Scanner(System.in);

        meals = meals - (shipPopulation * 0.75);
        System.out.println(meals);

        meals = meals + (meals * .5);
        shipPopulation = shipPopulation + 5;
        System.out.println(meals);
        System.out.println(shipPopulation);

        String landingLocation = "The Hill";
        if(landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz landing on the plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the plain");
        }

        landing  = landingCheck(10);

        MarsExpedition expedition = new MarsExpedition();
        expedition.marsExpedition();

        FindingsList findingsList = new FindingsList();
        findingsList.findingsList();
    }

    private static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for (int minute = 0; minute <= minutesLeft; minute++) {
            if (((minute % 3) == 0) && ((minute % 2) == 0)) {
                System.out.println("Keep Center");
            } else if ((minute % 2) == 0) {
                System.out.println("Right");
            } else if ((minute % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }

}