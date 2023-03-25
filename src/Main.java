public class Main {
    public static void main(String[] args) {
        String shipwreckD = "Shipwreck\n" +
                "Pirates\n" +
                "Fairfax the Deckhand\tBonnie Pip Culliford\n" +
                "Lucky McKyriggan\tGooblah the Grarrl\n" +
                " \n" +
                "Courses\n" +
                "Streaky Bacon\tAnchovies\n" +
                "Wriggling Grub\tBroccoli\n" +
                "Fresh Seaweed Pie\tBacon Muffin\n" +
                "Cinnamon Swirl\tBubbling Blueberry Pizza\n" +
                "Sushi\tLemon Blitz\n" +
                " \n";
        String lagoonD = "Lagoon\n" +
                "Pirates\n" +
                "Franchisco Corvallio\tOrvinn the First Mate\n" +
                "Sir Edmund Ogletree\tThe Tailhook Kid\n" +
                " \n" +
                "Courses\n" +
                "Sushi\tFungi Pizza\n" +
                "Flaming Fire Faerie Pizza\tNegg Stew\n" +
                "Cinnamon Swirl\tHotfish\n" +
                "Hot Tyrannian Pepper\tUltimate Burger\n" +
                "Wild Chocomato\tStreaky Bacon\n" +
                " ";
        String treasureIslandD = "Treasure Island\n" +
                "Pirates\n" +
                "Stuff-A-Roo\tOl' Stripey\n" +
                "Ned the Skipper\tPeg Leg Percival\n" +
                " \n" +
                "Courses\n" +
                "Streaky Bacon\tFresh Seaweed Pie\n" +
                "Hotfish\tApple Onion Rings\n" +
                "Rasmelon\tStrochal\n" +
                "Mallowicious Bar\tCinnamon Swirl\n" +
                "Broccoli\tSushi\n" +
                " ";
        String hiddenCoveD = "Hidden Cove\n" +
                "Pirates\n" +
                "Scurvy Dan the Blade\tCaptain Crossblades\n" +
                "Admiral Blackbeard\tBuck Cutlass\n" +
                " \n" +
                "Courses\n" +
                "Anchovies\tIce Chocolate Cake\n" +
                "Eye Candy\tUltimate Burger\n" +
                "Bubbling Blueberry Pizza\tWild Chocomato\n" +
                "Sushi\tSpicy Wings\n" +
                "Asparagus Pie\tRainborific Slush\n" +
                " ";
        String harpoonHarrysD = "Harpoon Harry's\n" +
                "Pirates\n" +
                "Puffo the Waister\tSquire Venable\n" +
                "Federismo Corvallio\tYoung Sproggie\n" +
                " \n" +
                "Courses\n" +
                "Worm and Leech Pizza\tBacon Muffin\n" +
                "Hot Cakes\tEye Candy\n" +
                "Anchovies\tSuper Lemon Grape Slush\n" +
                "Grapity Slush\tBroccoli and Cheese Pizza\n" +
                "Asparagus Pie\tStreaky Bacon\n" +
                " ";

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