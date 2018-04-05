package leon.sms.pojo;
/** 
* @author Leon
* @date 创建时间：2018年4月5日 下午3:37:20
* @version 1.0
* 类说明 :
* 
*/
public class User
{
	private String name;
	private String keyword;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getKeyword()
	{
		return keyword;
	}
	public void setKeyword(String keyword)
	{
		this.keyword = keyword;
	}
	@Override
	public String toString()
	{
		return "User [name=" + name + ", keyword=" + keyword + "]";
	}
	
}
