package leon.sms.pojo;
/** 
* @author Leon
* @date 创建时间：2018年4月7日 下午12:20:57
* @version 1.0
* 类说明 :
* 
*/
public class Goods
{
	private String name;
	private int number;
	private float unitPrice;

	public Goods()
	{
		super();
	}
	public Goods(String name, int number, float unitPrice)
	{
		super();
		this.name = name;
		this.number = number;
		this.unitPrice = unitPrice;
	}
	@Override
	public String toString()
	{
		return "Goods [name=" + name + ", number=" + number + ", unitPrice=" + unitPrice + "]";
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getNumber()
	{
		return number;
	}
	public void setNumber(int number)
	{
		this.number = number;
	}
	public float getUnitPrice()
	{
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice)
	{
		this.unitPrice = unitPrice;
	}
}
