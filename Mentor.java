public class Mentor {

    public static boolean q1(){
        boolean p = true;
        boolean q = false;
        boolean r = false;
        boolean result = (!(p||q)&&r) || p && (p||(!r));

        return result;
    }
    public static void q2(){
        char element1 = 'a';
        char element2 = 'B';
        //97+66
        int result = element1 + element2;
        System.out.println((char) result);
        String result2 = String.valueOf(element1) + String.valueOf(element2);
        System.out.println(result2);
    }

    public static void q3(){
        int a = 10;
        float b = 11.1f;
        double c = 12.11;
        String d = "00";

        int result = a + (int) b + (int) c;

        System.out.println("" + result + d);
    }

    public static void q4(){
        int n = 10;
        int x = 13;
        System.out.println(n+n+x+ ++x);
    }

    public static void q5(){
        byte a = 100;
        System.out.println((byte) (a+100));
    }
        
    public static void main (String[] args){
        
    }
}