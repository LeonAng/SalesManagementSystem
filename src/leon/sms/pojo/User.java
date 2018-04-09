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
	private String passWord;
	private boolean isAdmin;
	private int projectsNum;

	public User()
	{
		super();
	}
	public User(String name, String passWord)
	{
		super();
		this.name = name;
		this.passWord = passWord;
	}
	public User(String name, String passWord, boolean isAdmin)
	{
		super();
		this.name = name;
		this.passWord = passWord;
		this.isAdmin = isAdmin;
		this.projectsNum = 0;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getPassWord()
	{
		return passWord;
	}
	public void setPassWord(String passWord)
	{
		this.passWord = passWord;
	}
	public boolean isAdmin()
	{
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin)
	{
		this.isAdmin = isAdmin;
	}
	public int getProjectsNum()
	{
		return projectsNum;
	}
	public void setProjectsNum(int projectsNum)
	{
		this.projectsNum = projectsNum;
	}
	public boolean equals(User user)
	{
		if (this.name.equals(user.getName()) && this.passWord.equals(user.getPassWord()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public String toString()
	{
		return "User [name=" + name + ", passWord=" + passWord + ", isAdmin=" + isAdmin + ", projectsNum=" + projectsNum
				+ "]";
	}
}
