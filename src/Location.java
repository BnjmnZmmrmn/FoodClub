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

    /** m sl b sf gf c v d n sm p spf f
     *  0 1  2 3  4  5 6 7 8 9 10 11 12*/
    private int[] _FOODS = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private ArrayList<String> _NAMES = new ArrayList<>(4);

    private String _ID;

    public Location(String iData) {
        String[] data = iData.split("\t|\n");
        _ID = data[0];
        for (int p = 0; p < _NUMPIRATES; p++) {
            _NAMES.set(p, data[p+2]);
        }
        for (int c = 0; c < _NUMCOURSES; c++) {
            String vals = _COURSEVALS.get(data[c+8]);
            assignVals(vals);
        }
    }

    /** m sl b sf gf c v d n sm p spf f
     *  0 1  2 3  4  5 6 7 8 9 10 11 12*/
    private void assignVals(String vals) {
        String[] split = vals.split(" ");
        for (int i = 0; i < split.length; i ++) {
            String val = split[i];
            if (val.equals("m")) {
                _FOODS[0] ++;
            } else if (val.equals("sl")) {
                _FOODS[1] ++;
            } else if (val.equals("b")) {
                _FOODS[2] ++;
            } else if (val.equals("sf")) {
                _FOODS[3] ++;
            } else if (val.equals("gf")) {
                _FOODS[4] ++;
            } else if (val.equals("c")) {
                _FOODS[5] ++;
            } else if (val.equals("v")) {
                _FOODS[6] ++;
            } else if (val.equals("d")) {
                _FOODS[7] ++;
            } else if (val.equals("n")) {
                _FOODS[8] ++;
            } else if (val.equals("sm")) {
                _FOODS[9] ++;
            } else if (val.equals("p")) {
                _FOODS[10] ++;
            } else if (val.equals("spf")) {
                _FOODS[11] ++;
            } else if (val.equals("f")) {
                _FOODS[12] ++;
            }
        }
    }
}
