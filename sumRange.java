public class sumRange {
    public static int sumOfRange(int low,int up){
        int result = 0;
        for(int i=low;i<=up;i++){
            result = result + i;
        }
        return result;
    }

    public static void main (String[] args) {
        int re = sumOfRange(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        System.out.println(re);
    }
    
}