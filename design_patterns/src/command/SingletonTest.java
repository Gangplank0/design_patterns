package command;
/**
 * @todo
 * @author 成明俊
 * @email 1047914020@qq.com
 * @date 2020年3月20日
 */
class Singleton{
	//使用一个变量来缓存曾经创建的实例
	private static Singleton instance;
	//将构造器使用private修饰，隐藏该构造器
	private Singleton() {}
		//提供一个静态方法，用于返回Singleton实例
		//该方法可以加入自定义的控制，保证只产生一个Singleton对象
	public static Singleton getInstance() {
		//如果instance为null,表面还不曾创建Singleton对象
		//如果instacne不为null,则表明已经创建了Singleton对象，将不会执行该方法
		if(instance == null) {
			//创建一个Singleton对象，将其缓存起来
			instance = new Singleton();
		}
		return instance;
	}

}
public class SingletonTest{
	public static void main(String[] args) {
		//创建Singleton对象不能通过构造器，只能通过getInstance方法
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2);
	}
	
}

