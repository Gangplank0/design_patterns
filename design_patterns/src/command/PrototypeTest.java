package command;
/**
 * @todo
 * @author 成明俊
 * @email 1047914020@qq.com
 * @date 2019年11月19日
 */
//具体原型类
class Realizetype implements Cloneable{
	Realizetype(){
		System.out.println("具体原型创建成功");
	}
	public Object clone() throws CloneNotSupportedException{
		System.out.println("具体原型复制成功");
		return (Realizetype)super.clone();	
	}
}

public class PrototypeTest {
	public static void main(String[] args)throws CloneNotSupportedException
	{
		Realizetype obj1=new Realizetype();
        Realizetype obj2=(Realizetype)obj1.clone();
        System.out.println("obj1==obj2?"+(obj1==obj2));
	}

}
