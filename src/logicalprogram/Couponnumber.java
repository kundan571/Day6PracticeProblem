package logicalprogram;
public class Couponnumber {
    public static void main(String[] args)
    {
        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
        int max=1000;
        int random=(int) (Math.random()*max);
        StringBuffer stringbuffer = new StringBuffer();

        while (random>0)
        {
            stringbuffer.append(chars[random % chars.length]);
            random /= chars.length;
        }

        String couponCode=stringbuffer.toString();
        System.out.println("Coupon Code: "+couponCode);
    }
}