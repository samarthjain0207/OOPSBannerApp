public class BannerApp {
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {

        for (CharacterPatternMap p : patterns) {
            if (p.getCharacter() == ch) {
                return p.getPattern();
            }
        }

        return null;
    }

    public static void main(String[] args) {
        String[] patternO = {
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        };
        String[] patternP = {
            "******   ",
            "**    ** ",
            "**    ** ",
            "******   ",
            "**       ",
            "**       ",
            "**       "
        };
        String[] patternS = {
            "   ***** ",
            "  **     ",
            "**       ",
            "  *****  ",
            "      ** ",
            " **   ** ",
            "  *****  "
        };
        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', patternO),
                new CharacterPatternMap('P', patternP),
                new CharacterPatternMap('S', patternS)
        };

        String word = "OOPS";
        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] p = getCharacterPattern(ch, patterns);
                if (p != null) {
                    line.append(p[i]).append("  ");
                }
            }

            System.out.println(line.toString());
        }
    }
}