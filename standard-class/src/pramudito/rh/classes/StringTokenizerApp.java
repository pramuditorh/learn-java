package pramudito.rh.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        /*
        * Tokenizer vs Split
        * Tokenizer lebih hemat memory daripada split
        * */

        String name = "Snipan Kardel Sharpeye";
        StringTokenizer st = new StringTokenizer(name, " ");

        System.out.println(st);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
