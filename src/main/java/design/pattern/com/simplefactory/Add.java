package design.pattern.com.simplefactory;

/**
 * @Description: asd
 * @author: weichao 2019/1/24 20 31
 * @version 1.0.1
 */
public class Add extends AbstractOperation{

    @Override
    public String caculate(String a , String b) {
        Double result = Double.valueOf(a) + Double.valueOf(b);
        return String.valueOf(result.intValue());
    }
}
