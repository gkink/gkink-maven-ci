/**
 * Created by Giorgi on 5/8/2016.
 */
public class Addition {

    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return add(add(a, b), c);
    }
}
