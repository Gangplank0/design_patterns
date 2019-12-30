package command;
/**
 * @todo
 * @author 成明俊
 * @email 1047914020@qq.com
 * @date 2019年11月25日
 */
public class Client {
	
	//产品角色
public static void main(String[] args) {
	Builder builder = new ConcreteBuilder();
	Director director = new Director(builder);
	Product product = director.construct();
	product.show();
}
}
//产品角色
class Product
{
    private String partA;
    private String partB;
    private String partC;
    public void setPartA(String partA)
    {
        this.partA=partA;
    }
    public void setPartB(String partB)
    {
        this.partB=partB;
    }
    public void setPartC(String partC)
    {
        this.partC=partC;
    }
    public void show()
    {
        //显示产品的特性
    }
}
//抽象建造者
abstract class Builder{
	//创建产品对象
	protected Product product = new Product();
	public abstract void buildPartA();
	public abstract void buildPartB();
	public abstract void buildPartC();
	//返回产品对象
	public Product getResult() {
		return product;
	}
}
//具体建造者
public class ConcreteBuilder extends Builder{
    public void buildPartA()
    {
        product.setPartA("建造 PartA");
    }
    public void buildPartB()
    {
        product.setPartA("建造 PartB");
    }
    public void buildPartC()
    {
        product.setPartA("建造 PartC");
    }
}

class Director
{
	private Builder builder;
	public Director(Builder builder)
	{
		this.builder=builder;
	}
	  //产品构建与组装方法
    public Product construct()
    {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}



	

