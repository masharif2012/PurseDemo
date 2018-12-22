import java.util.Arrays;

public class Anagram { //it is under String categoryy will come in midterm exampsvm
    public static void main(String[] args) {
        String b = "APPLE";                  //Anagram means comparison all the letters are same or not
        String e = "ELpPA";                  //if same it is anagram if not then not annagram

        //isAnagram(b,e);
        System.out.println(isAnagram(b,e));
    }

    public static boolean isAnagram(String str1, String str2) {
        if(str1.length()!=str2.length()){
            return false;
        }
        str1 =str1.toUpperCase();
        str2=str2.toUpperCase();
        char[]str1c=str1.toCharArray();
        Arrays.sort(str1c);
        char[]str2c=str2.toCharArray();
        Arrays.sort(str2c);

        return Arrays.equals(str1c,str2c);

    }


}
