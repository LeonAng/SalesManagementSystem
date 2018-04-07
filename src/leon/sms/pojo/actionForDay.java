package leon.sms.pojo;

import java.sql.Date;

/** 
* @author Leon
* @date 创建时间：2018年4月7日 下午12:39:49
* @version 1.0
* 类说明 :
* 
*/
public class actionForDay
{
	private Date saleDate;
	private int number;
	public actionForDay()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public actionForDay(Date saleDate, int number)
	{
		super();
		this.saleDate = saleDate;
		this.number = number;
	}
	@Override
	public String toString()
	{
		return "actionForDay [saleDate=" + saleDate + ", number=" + number + "]";
	}
	public Date getSaleDate()
	{
		return saleDate;
	}
	public void setSaleDate(Date saleDate)
	{
		this.saleDate = saleDate;
	}
	public int getNumber()
	{
		return number;
	}
	public void setNumber(int number)
	{
		this.number = number;
	}
}
