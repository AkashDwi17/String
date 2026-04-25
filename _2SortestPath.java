public class _2SortestPath {
    public static float validPath (String str){
        int x = 0;
        int y = 0;

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'E'){
                x++;
            }
            else if (ch == 'N'){
                y++;
            }
            else if (ch == 'S'){
                y--;
            }
            else{
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (int) Math.sqrt(x2+y2);
    }
    
    public static void main(String[] args) {
        System.out.println(validPath("WNEENESENNN"));
    }   
}
