public interface Sweets {
    public void calculate_weight(int d,int f);
}
class Laddu implements Sweets{
    public void calculate_weight(int d, int f) {
        int total_weight=d*f;
        System.out.println("Weight of Laddu:"+total_weight);
    }
}
