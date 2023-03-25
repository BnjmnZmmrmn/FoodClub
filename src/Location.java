import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Location {

    static final int _NUMPIRATES = 4;
    static final int _NUMCOURSES = 10;
    static final PirateRoster pR = new PirateRoster();

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
    private ArrayList<String> _NAMES = new ArrayList<>(_NUMPIRATES);

    private String _ID;

    public Location(String iData) {
        String[] data = iData.split("\t|\n");
        _ID = data[0];
        for (int p = 0; p < _NUMPIRATES; p++) {
            _NAMES.add(data[p+2]);
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

    private int foodVal(String fav, String weak) {
        String[] favS = fav.split(" ");
        String[] weakS = weak.split(" ");
        int tot = 0;
        for (int i = 0; i < favS.length; i ++) {
            String val = favS[i];
            if (val.equals("m")) {
                tot += _FOODS[0];
            } else if (val.equals("sl")) {
                tot += _FOODS[1];
            } else if (val.equals("b")) {
                tot += _FOODS[2];
            } else if (val.equals("sf")) {
                tot += _FOODS[3];
            } else if (val.equals("gf")) {
                tot += _FOODS[4];
            } else if (val.equals("c")) {
                tot += _FOODS[5];
            } else if (val.equals("v")) {
                tot += _FOODS[6];
            } else if (val.equals("d")) {
                tot += _FOODS[7];
            } else if (val.equals("n")) {
                tot += _FOODS[8];
            } else if (val.equals("sm")) {
                tot += _FOODS[9];
            } else if (val.equals("p")) {
                tot += _FOODS[10];
            } else if (val.equals("spf")) {
                tot += _FOODS[11];
            } else if (val.equals("f")) {
                tot += _FOODS[12];
            }
        }
        for (int i = 0; i < weakS.length; i ++) {
            String val = weakS[i];
            if (val.equals("m")) {
                tot -= _FOODS[0];
            } else if (val.equals("sl")) {
                tot -= _FOODS[1];
            } else if (val.equals("b")) {
                tot -= _FOODS[2];
            } else if (val.equals("sf")) {
                tot -= _FOODS[3];
            } else if (val.equals("gf")) {
                tot -= _FOODS[4];
            } else if (val.equals("c")) {
                tot -= _FOODS[5];
            } else if (val.equals("v")) {
                tot -= _FOODS[6];
            } else if (val.equals("d")) {
                tot -= _FOODS[7];
            } else if (val.equals("n")) {
                tot -= _FOODS[8];
            } else if (val.equals("sm")) {
                tot -= _FOODS[9];
            } else if (val.equals("p")) {
                tot -= _FOODS[10];
            } else if (val.equals("spf")) {
                tot -= _FOODS[11];
            } else if (val.equals("f")) {
                tot -= _FOODS[12];
            }
        }
        return tot;
    }

    private ArrayList<String> copy() {
        ArrayList<String> ret = new ArrayList<String>(4);
        for (int i = 0; i < _NUMPIRATES; i ++) {
            ret.add(_NAMES.get(i));
        }
        return ret;
    }

    public String getRankings() {
        ArrayList<String> pOne = pR.getPirate(_NAMES.get(0));
        ArrayList<String> pTwo = pR.getPirate(_NAMES.get(1));
        ArrayList<String> pThree = pR.getPirate(_NAMES.get(2));
        ArrayList<String> pFour = pR.getPirate(_NAMES.get(3));

        int pOneS = Integer.parseInt(pOne.get(0));
        int pTwoS = Integer.parseInt(pTwo.get(0));
        int pThreeS = Integer.parseInt(pThree.get(0));
        int pFourS = Integer.parseInt(pFour.get(0));

        ArrayList<Integer> strenVals = new ArrayList<Integer>(_NUMPIRATES);
        strenVals.add(pOneS);
        strenVals.add(pTwoS);
        strenVals.add(pThreeS);
        strenVals.add(pFourS);

        int pOneF = foodVal(pOne.get(1), pOne.get(2));
        int pTwoF = foodVal(pTwo.get(1), pTwo.get(2));
        int pThreeF = foodVal(pThree.get(1), pThree.get(2));
        int pFourF = foodVal(pFour.get(1), pFour.get(2));

        ArrayList<String> names = copy();
        ArrayList<Integer> foodVals = new ArrayList<Integer>(_NUMPIRATES);
        foodVals.add(pOneF);
        foodVals.add(pTwoF);
        foodVals.add(pThreeF);
        foodVals.add(pFourF);


        String ret = "";
        int count = 0;
        while (!foodVals.isEmpty()) {
            int tot = foodVals.get(0);
            int ind = 0;
            for (int i = 1; i < foodVals.size(); i ++) {
                if (tot < foodVals.get(i)) {
                    tot = foodVals.get(i);
                    ind = i;
                } else if (tot == foodVals.get(i)) {
                    if (strenVals.get(ind) < strenVals.get(i)) {
                        ind = i;
                    }
                }
            }
            count ++;
            ret += count + ".";
            ret += names.get(ind);
            ret += "  ";
            foodVals.remove(ind);
            strenVals.remove(ind);
            names.remove(ind);
        }
        return ret;
    }
}
