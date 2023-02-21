package dominio;
import java.util.stream.Stream;
public class ej2_8_lambda {
    public static int sumalistapares (int[] lista){
        return  Stream.iterate(0,i->i+1).limit(lista.length).map(i->lista[i]).filter(i->i%2==0).reduce(0,(a,b)->a+b);
    }
}
