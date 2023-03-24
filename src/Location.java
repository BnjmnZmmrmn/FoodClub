import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Location {

    static final int _NUMPIRATES = 4;
    static final int _NUMCOURSES = 10;

    /** m = Meats, sl = Slushies, b = Breads, sf = Salty Foods, gf = Gross Foods, c = Candy, v = Vegestables
     * d = Dairy, n = Neggs, sm = Smoothies, p = Pizza, spf = Spicy Foods, f = Fruits*/
    static final Map<String, String> _COURSEVALS = new HashMap<String, String>() {{
        put("Ultimate Burger","m");
        put("Grapity Slush","sl");
        put("Hot Cakes","b");
        put("Fresh Seaweed Pie","sf gf");
        put("Fungi Pizza","gf p");
        put("Cinnamon Swirl","c b");
        put("Asparagus Pie","v");
        put("Mustard Ice Cream","d gf");
        put("Orange Negg","n");
        put("Wild Chocomato","d sm");
        put("Broccoli and Cheese Pizza","v d p");
        put("Anchovies","sf m");
        put("Mallowicious Bar","c");
        put("Broccoli","v");
        put("Eye Candy","c gf");
        put("Hotfish","sf m");
        put("Streaky Bacon","m");
        put("Flaming Fire Faerie Pizza","spf v p");
        put("Hot Tyrannian Pepper","spf v");
        put("Worm and Leech Pizza","gf p");
        put("Rainborific Slush","sl");
        put("Joint Of Ham","m");
        put("Bacon Muffin","m b");
        put("Bubbling Blueberry Pizza","f p");
        put("Fish Negg","n");
        put("Rasmelon","d sm");
        put("Rainbow Negg","n");
        put("Tangy Tropic Slush","sl");
        put("Strochal","c");
        put("Wriggling Grub","gf");
    }};

    private HashMap<String, Integer> _FOODS;
    private String _ID;
    private String _DATA;

    public Location() {

    }
}
