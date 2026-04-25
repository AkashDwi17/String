import java.util.Arrays;

public class _6IsAnagram {
    public static boolean isAnagram (String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()){
            char[]str1ToCharArr = str1.toCharArray();
            char[]str2ToCharArr = str2.toCharArray();

            Arrays.sort(str1ToCharArr);
            Arrays.sort(str2ToCharArr);

            if (Arrays.equals (str1ToCharArr, str2ToCharArr)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("earth", "heart"));
        System.out.println(isAnagram("earth", "hart"));
        System.out.println(isAnagram("earth", "heprt"));
    }
}
