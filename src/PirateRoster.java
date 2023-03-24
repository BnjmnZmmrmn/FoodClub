import javax.print.attribute.standard.PresentationDirection;
import java.util.*;

public class PirateRoster {

    static final int _PIRATECOUNT = 20;
    static final Map<String, String> _STRENGTHS = new HashMap<String, String>() {{
        put("Scurvy Dan the Blade","87");
        put("Young Sproggie","73");
        put("Orvinn the First Mate","52");
        put("Lucky McKyriggan","82");
        put("Sir Edmund Ogletree","79");
        put("Peg Leg Percival","73");
        put("Bonnie Pip Culliford","76");
        put("Puffo the Waister","68");
        put("Stuff-A-Roo","59");
        put("Squire Venable","61");
        put("Captain Crossblades","66");
        put("Ol' Stripey","74");
        put("Ned the Skipper","79");
        put("Fairfax the Deckhand","71");
        put("Gooblah the Grarrl","93");
        put("Franchisco Corvallio","81");
        put("Federismo Corvallio","81");
        put("Admiral Blackbeard","76");
        put("Buck Cutlass","89");
        put("The Tailhook Kid","81");
    }};

    /** m = Meats, sl = Slushies, b = Breads, sf = Salty Foods, gf = Gross Foods, c = Candy, v = Vegestables
     * d = Dairy, n = Neggs, sm = Smoothies, p = Pizza, spf = Spicy Foods, f = Fruits*/
    static final Map<String, String> _FAVOURITES = new HashMap<String, String>() {{
        put("Scurvy Dan the Blade","sf m");
        put("Young Sproggie","m n");
        put("Orvinn the First Mate","c sl p");
        put("Lucky McKyriggan","gf");
        put("Sir Edmund Ogletree","d");
        put("Peg Leg Percival","spf");
        put("Bonnie Pip Culliford","c sm");
        put("Puffo the Waister","c sm sl");
        put("Stuff-A-Roo","p");
        put("Squire Venable","b");
        put("Captain Crossblades","sl p");
        put("Ol' Stripey","m sl");
        put("Ned the Skipper","m");
        put("Fairfax the Deckhand","v f");
        put("Gooblah the Grarrl","m");
        put("Franchisco Corvallio","spf m");
        put("Federismo Corvallio","gf p");
        put("Admiral Blackbeard","v f");
        put("Buck Cutlass","c");
        put("The Tailhook Kid","v");
    }};
    static final Map<String, String> _WEAKNESSES = new HashMap<String, String>() {{
        put("Scurvy Dan the Blade","c");
        put("Young Sproggie","gf");
        put("Orvinn the First Mate","f");
        put("Lucky McKyriggan","p");
        put("Sir Edmund Ogletree","b");
        put("Peg Leg Percival","sm");
        put("Bonnie Pip Culliford","spf");
        put("Puffo the Waister","m");
        put("Stuff-A-Roo","n");
        put("Squire Venable","f");
        put("Captain Crossblades","sf");
        put("Ol' Stripey","b");
        put("Ned the Skipper","d");
        put("Fairfax the Deckhand","sf");
        put("Gooblah the Grarrl","s");
        put("Franchisco Corvallio","c");
        put("Federismo Corvallio","sm");
        put("Admiral Blackbeard","d");
        put("Buck Cutlass","v");
        put("The Tailhook Kid","n");
    }};

    public ArrayList<String> getPirate(String name) {
        ArrayList<String> ret = new ArrayList<String>(0);
        ret.add(_STRENGTHS.get(name));
        ret.add(_FAVOURITES.get(name));
        ret.add(_WEAKNESSES.get(name));
        return ret;
    }
}
