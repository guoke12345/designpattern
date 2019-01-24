package design.pattern.com.simplefactory;

/**
 * @Description:
 * @author : weichao 2019/1/24 20 38
 * @Version 1.0.1
 */
public class OperationFactory {
    public static AbstractOperation createOperat(Character s) {
        AbstractOperation operation = null;
        switch (s) {
            case '+':
                operation = new Add();
                break;
            case '-':
                operation = new Add();
                break;
            default:
                operation = null;
        }
        return operation;
    }
}
