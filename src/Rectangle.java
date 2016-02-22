/**
 * Created by Ivan on 22.02.2016.
 */
public class Rectangle {
    public int a;

    public Rectangle(int b) {
        this.a=b;
    }

    public int pow(){
        int result = a*a;
        return result;
    }

    public int powl(int a, int n){
        int res  = 1;
        for (int i=1; i<=n; i++) res*=a;
        return res;
    }
}
