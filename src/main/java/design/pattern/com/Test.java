package design.pattern.com;

import design.pattern.com.simplefactory.AbstractOperation;
import design.pattern.com.simplefactory.OperationFactory;

/**
 * @Description:
 * @author : weichao 2019/1/24 20 28
 * @Version 1.0.1
 */
public class Test {
    public static void main(String[] args) {
        AbstractOperation operation = OperationFactory.createOperat('+');
        if (operation == null){
            System.out.println("結果為null");
        }
        System.out.println(operation.caculate("11","23"));
    }
}
