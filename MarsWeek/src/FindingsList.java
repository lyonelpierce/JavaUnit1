import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public class FindingsList {
    public void findingsList() throws InterruptedException {
        Thread.sleep(500);

        System.out.println("Welcome back from your expedition. Time to catalog everything you found.");

        ArrayList<String> rockList = new ArrayList<String>();

        System.out.println("Rock data downloaded.");

        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        System.out.println(rockList);

        System.out.println("Wait a second that last on is not a rock we need to delete that one from the list");

        rockList.remove("not rock");

        System.out.println(rockList);

        Thread.sleep(1000);

        HashMap<String, String> fossilDirectory = new HashMap<>();

        System.out.println("Fossil data downloaded");

        fossilDirectory.put("Bird", "The fossil has wings implying it was capable of flight");
        fossilDirectory.put("Fish", "The fossil is vaguely fish shaped implies there was once water");
        fossilDirectory.put("Tooth", "The tooth from an unknown fossil");

        System.out.println("Which of the fossils would you like to learn more about? (Bird, Fish, Tooth)");

        Scanner input = new Scanner(System.in);

        String fossilChoice = input.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Fish")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Tooth")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }

        Thread.sleep(700);

        HashSet<String> supplies = new HashSet<>();

        supplies.add("Teleporter");
        supplies.add("Stun gun");
        supplies.add("Insta-Heal Capsules");

        Iterator itr = supplies.iterator();

        System.out.println("Supplies Before Expedition:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        supplies.remove("Stun gun");

        Iterator itr1 = supplies.iterator();

        System.out.println("Supplies After Expedition:");
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

        input.close();
    }
}