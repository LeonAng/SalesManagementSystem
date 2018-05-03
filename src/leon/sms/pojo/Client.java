package leon.sms.pojo;
/** 
* @author Leon
* @date 创建时间：2018年4月7日 下午12:14:58
* @version 1.0
* 类说明 :
* 
*/
public class Client
{
	private String name;
	private String phoneNumber;
	public Client()
	{
		super();
	}
	
	public Client(String name, String phoneNumber)
	{
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString()
	{
		return "Client [name=" + name + ", phoneNumber=" + phoneNumber + ", projectsNum="  + "]";
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
}
