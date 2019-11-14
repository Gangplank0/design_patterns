package command;
/**
 * @todo
 * @author 成明俊
 * @email 1047914020@qq.com
 * @date 2019年11月14日
 */
public class Dependence_Inversion {
	
	public static void main(String[] args) {
		Customer wang=new Customer();
		System.out.println("顾客购买以下商品：");
		wang.shopping(new ShaoguanShop());
		wang.shopping(new WuyuanShop());	
	}	
}

interface Shop{
	public String sell();
}

class ShaoguanShop implements Shop {
	public String sell() {
		return "韶关土特产：香菇、木耳......";
	}	
}

class WuyuanShop implements Shop{
	public String sell() {
		return "婺源特产：西瓜、芒果......";
	}
}

class Customer{
	public void shopping(Shop shop) {
		System.out.println(shop.sell());
	}
}

