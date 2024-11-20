package dataStructuresAlgorithms.strings;

public class RemoveVowels {

    /*
        1. Remove Vowels from a String.
    */
    public static void main(String[] args) {

        String st = "onceuponatime";
        RemoveVowels(st);



    }
    public static void RemoveVowels(String st){
        for(int i= 0; i < st.length(); i++){
            char ch = st.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                continue;
            }
            System.out.print(ch);
        }
    }
}
