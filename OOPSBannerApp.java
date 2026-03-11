import java.util.HashMap;
import java.util.Map;
public class OOPSBannerApp {
    public static Map<Character, String[]> buildCharacterPatterns() {
        Map<Character, String[]> patternMap = new HashMap<>();
        String[] O = {
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        };
        String[] P = {
             "******   ",
            "**    ** ",
            "**    ** ",
            "******   ",
            "**       ",
            "**       ",
            "**       "
        };
        String[] S = {
             "   ***** ",
            "  **     ",
            "**       ",
            "  *****  ",
            "      ** ",
            " **   ** ",
            "  *****  "
        };
        patternMap.put('O', O);
        patternMap.put('P', P);
        patternMap.put('S', S);
        return patternMap;
    }
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {
        int rows = 7;
        for (int i = 0; i < rows; i++) {
            StringBuilder line = new StringBuilder();
            for (char c : word.toCharArray()) {
                String[] pattern = patternMap.get(c);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }
            System.out.println(line.toString());
        }
    }
    public static void main(String[] args) {
        Map<Character, String[]> characterPatterns = buildCharacterPatterns();
        String word = "OOPS";
        renderBanner(word, characterPatterns);
    }
}