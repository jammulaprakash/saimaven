public class candies {
    int count1;
    public candies(){
        count1=0;
    }

    public void find(String[] a1, String m) {
        count1 = 0;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i].equals(m)) {
                count1 = count1 + 1;//count1 is for medium count
            }
        }
        System.out.println(count1);
    }
}
            class candyman extends candies {

                public void printfun() {
                    System.out.println("candyman details");
                }
            }

            class lollipop extends candies {
                public void printfun() {
                    System.out.println("lollipop details");
                }

            }

