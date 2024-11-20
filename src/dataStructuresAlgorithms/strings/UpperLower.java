package dataStructuresAlgorithms.strings;

public class UpperLower {

    /*
    * 3. Convert all the uppercase to lower
    */
    public static void main(String[] args) {
        String st = "WElcometoInDiA";
        UpperCasetoLowerCase(st);

    }
    public static void UpperCasetoLowerCase(String st) {
        char[] s = st.toCharArray();

        for (int i = 0; i < s.length; i++) {
            char ch = s[i];

            if (ch >= 'A' && ch <= 'Z') {
                char ansch = (char) (ch - 'A' + 'a');
                s[i] = ansch;
            }
        }

        for(char c: s){
            System.out.print(c);
        }

    }
}
