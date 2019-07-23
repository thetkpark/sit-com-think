public class fuck {
    public static String firstTwo(String str) {
        int len = str.length();
        if(len==0) return "";
        if(len>=0 && len<=2) return str;
        
        return str.substring(0,2);
      }

    public static void main (String[] args) {
        firstTwo("Hello");
    }
}
  