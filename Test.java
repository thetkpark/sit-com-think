public class Test {
    public static void main (String[] args){
        boolean p = true;
        boolean q = false;
        boolean r = false;
        boolean result = (!(p||q)&&r) || p && (p||(!r));

        System.out.println(result);
    }
}