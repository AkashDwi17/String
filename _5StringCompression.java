public class _5StringCompression {
    public static String StringCompression (String str){
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<str.length(); i++){
            Integer count = 1;
            char ch = str.charAt(i);
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                i++;
                count ++;
            }
            sb.append(ch);
            if (count > 1){
                sb.append (count.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(StringCompression("aaaaabbbbcccdde"));
    }
}
