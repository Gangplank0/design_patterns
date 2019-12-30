package command;

import java.lang.reflect.InvocationHandler;



/**
 * @todo
 * @author 成明俊
 * @email 1047914020@qq.com
 * @date 2019年11月26日
 */
public class ProxyTest1 {
	public static void main(String[] args){
		   ProxyHandler proxyHandler=new ProxyHandler();
		   IPrinter printer=(IPrinter) proxyHandler.newProxyInstance(new Printer());
		   printer.print();

}
public interface IPrinter {
    void print();
}

public class ProxyHandler implements InvocationHandler {
    private Object targetObject;//被代理的对象
    //将被代理的对象传入获得它的类加载器和实现接口作为Proxy.newProxyInstance方法的参数。
    public  Object newProxyInstance(Object targetObject){
        this.targetObject = targetObject;
        //targetObject.getClass().getClassLoader()：被代理对象的类加载器
        //targetObject.getClass().getInterfaces()：被代理对象的实现接口
        //this 当前对象，该对象实现了InvocationHandler接口所以有invoke方法，通过invoke方法可以调用被代理对象的方法
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),targetObject.getClass().getInterfaces(),this);
    }
    //该方法在代理对象调用方法时调用
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("记录日志");
        return method.invoke(targetObject,args);
    }
}

public class Printer {
    public void print(){
        System.out.println("记录日志！");
        System.out.println("打印！");
    }
  }
