/**
 * Created by USER on 11/10/2017.
 */
public class VectorHelper {

    public static void apply(int v[], Function<Integer, Integer> m)
    {
        for(int i = 0; i < v.length; i++)
        {
            v[i] = m.apply(v[i]);
        }
    }

    public static int[] maxAndMin(int[] v)
    {
        int res[] = new int[2];
        res[0] = res[1] = v[0];
        for(int i = 1; i < v.length; i++)
        {
            if(v[i] > res[0]) res[0] = v[i];
            if(v[i] < res[1]) res[1] = v[i];
        }       return res;

    }
}
