package mavendemo.mvdemo1;
import org.apache.commons.math3.util.ArithmeticUtils;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int a = ArithmeticUtils.gcd(456,64);  //计算两个数的最大公约数
    	System.out.println(a);
        System.out.println( "Hello World!" );
        
    }
}
