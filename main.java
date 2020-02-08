
public class main {
    public static void main(String args[]) {
        mars c = new mars();
        Laddu s = new Laddu();
        candyman a = new candyman();
        int d=20;
        int f=15;
        System.out.println("The total weight of the sweets in the given gifts boxs together is:");
        System.out.println("laddu details");
        s.calculate_weight(d,f);
        float arr1[] = {(float) 2.57, (float) 3.89, (float) 6.10, (float) 1.45, (float) 3.96};
        String arr2[] = {"medium", "medium", "small", "large", "small", "large", "medium", "large", "large", "small", "medium", "large"};
        System.out.println("The sorted list of nutrients for the given cholocates ranges at :");
        c.printfun();
        c.sort(arr1);
        String m = "medium";
        String l = "large";
        String st = "small";
        a.printfun();
        System.out.println("The  total number of medium ranged candies in given list:");
        a.find(arr2,m);
        System.out.println("The  total number of large ranged candies in given list:");
        a.find(arr2,l);
        System.out.println("The  total number of small ranged candies in given list:");
        a.find(arr2,st);


    }
}