public class _4UpperCaseLetter {
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder(" ");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append (ch);

        for (int i=1; i<str.length(); i++){
            ch = str.charAt(i);
            if (i < str.length()-1 && ch == ' '){
                sb.append (ch);
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append (ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(toUpperCase("i am akash dwivedi g"));
    }
}
