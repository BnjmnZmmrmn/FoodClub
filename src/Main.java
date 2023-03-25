public class Main {
    public static void main(String[] args) {
        String shipwreckD = "Shipwreck\n" +
                "Pirates\n" +
                "Ned the Skipper\tFranchisco Corvallio\n" +
                "Bonnie Pip Culliford\tAdmiral Blackbeard\n" +
                " \n" +
                "Courses\n" +
                "Ultimate Burger\tCinnamon Swirl\n" +
                "Grapity Slush\tMustard Ice Cream\n" +
                "Hot Cakes\tAsparagus Pie\n" +
                "Fresh Seaweed Pie\tOrange Negg\n" +
                "Fungi Pizza\tWild Chocomato\n" +
                " \n";
        String lagoonD = "Lagoon\n" +
                "Pirates\n" +
                "Captain Crossblades\tOl' Stripey\n" +
                "Stuff-A-Roo\tGooblah the Grarrl\n" +
                " \n" +
                "Courses\n" +
                "Broccoli and Cheese Pizza\tEye Candy\n" +
                "Anchovies\tWild Chocomato\n" +
                "Mallowicious Bar\tHotfish\n" +
                "Hot Cakes\tStreaky Bacon\n" +
                "Broccoli\tFlaming Fire Faerie Pizza\n" +
                " \n";
        String treasureIslandD = "Treasure Island\n" +
                "Pirates\n" +
                "Scurvy Dan the Blade\tSquire Venable\n" +
                "Buck Cutlass\tLucky McKyriggan\n" +
                " \n" +
                "Courses\n" +
                "Hot Tyrannian Pepper\tCinnamon Swirl\n" +
                "Mustard Ice Cream\tJoint Of Ham\n" +
                "Worm and Leech Pizza\tBacon Muffin\n" +
                "Ultimate Burger\tBroccoli and Cheese Pizza\n" +
                "Rainborific Slush\tHotfish\n" +
                " ";
        String hiddenCoveD = "Hidden Cove\n" +
                "Pirates\n" +
                "Fairfax the Deckhand\tSir Edmund Ogletree\n" +
                "Orvinn the First Mate\tPuffo the Waister\n" +
                " \n" +
                "Courses\n" +
                "Bubbling Blueberry Pizza\tRasmelon\n" +
                "Fungi Pizza\tRainbow Negg\n" +
                "Fish Negg\tTangy Tropic Slush\n" +
                "Bacon Muffin\tOrange Negg\n" +
                "Flaming Fire Faerie Pizza\tRainborific Slush\n" +
                " \n";
        String harpoonHarrysD = "Harpoon Harry's\n" +
                "Pirates\n" +
                "Federismo Corvallio\tThe Tailhook Kid\n" +
                "Young Sproggie\tPeg Leg Percival\n" +
                " \n" +
                "Courses\n" +
                "Strochal\tRainbow Negg\n" +
                "Fish Negg\tBroccoli\n" +
                "Ultimate Burger\tBubbling Blueberry Pizza\n" +
                "Tangy Tropic Slush\tRainborific Slush\n" +
                "Wriggling Grub\tOrange Negg\n" +
                " \n";

        Location shipwreck = new Location(shipwreckD);
        Location lagoon = new Location(lagoonD);
        Location treasureIsland = new Location(treasureIslandD);
        Location hiddenCove = new Location(hiddenCoveD);
        Location harpoonHarrys = new Location(harpoonHarrysD);

        System.out.println("Shipwreck: " + shipwreck.getRankings());
        System.out.println("Lagoon: " + lagoon.getRankings());
        System.out.println("Treasure Island: " + treasureIsland.getRankings());
        System.out.println("Hidden Cove: " + hiddenCove.getRankings());
        System.out.println("Harpoon Harry's: " + harpoonHarrys.getRankings());
    }
}