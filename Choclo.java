
public class Choclo {
    int noofchoclo;
    float calories;
    int weight;

    public void getnoofchoclo(int noofchoclo)
    {
        int noof=noofchoclo;

    }

    public void getWeight(int weight)
    {
        int we=weight;
    }
    public void sort(float[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j])
                {
                    float temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length - 1; i++)
        {
            System.out.print(a[i] + ", ");
        }
        System.out.println(a[a.length - 1]);

    }
}
class star extends Choclo{

    public void printfun()
    {
        System.out.println("5star details");
    }
}
class mars extends Choclo{
    public void printfun()
    {
        System.out.println("mars details");
    }
}

