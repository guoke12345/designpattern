package design.pattern.com.simplefactory;

/**
 * @Description:
 * @author : weichao 2019/1/24 20 30
 * @version 1.0.1
 */
public  abstract  class AbstractOperation extends Patamter{
    /**
     * 啊算法撒旦
     * @param a
     * @param b
     * @return
     */
    public abstract String caculate(String a, String b);
}
