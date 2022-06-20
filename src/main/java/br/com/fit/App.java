package br.com.fit;

/**
 * Hello world!
 *
 */
public class App {
    
    public boolean isPalindromeWord(final String word) {
        String value = word.replaceAll("\\W", "");
        StringBuffer sb = new StringBuffer("");

        for (int i = value.length() - 1; i >= 0; i--) {
            sb.append(String.valueOf(value.charAt(i)));
        }

        return value.equalsIgnoreCase(sb.toString());
    }
}
