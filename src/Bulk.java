public class Bulk {
    public static String duplicate(char str, int duplicator) {
        String finalStr = "";

        for(int i = 0; i < duplicator; i++) {
            finalStr += str;
        }
        return finalStr;
    }

    public static String duplicate(String str, int duplicator) {
        String finalStr = "";

        for(int i = 0; i < duplicator; i++) {
            finalStr += str;
        }
        return finalStr;
    }

    public static String remove(String str, char toRemove) {
        String finalStr = "";
        String strs[] = str.split(String.valueOf(toRemove));
        
        for (String string : strs) {
            finalStr += string;
        }

        return finalStr;
    }

    public static String remove(String str, String toRemove) {
        String finalStr = "";
        String strs[] = str.split(toRemove);
        
        for (String string : strs) {
            finalStr += string;
        }

        return finalStr;
    }
}
