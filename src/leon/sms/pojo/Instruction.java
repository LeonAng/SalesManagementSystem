package leon.sms.pojo;
/** 
* @author Leon
* @date 创建时间：2018年4月7日 下午12:35:40
* @version 1.0
* 类说明 :
* 
*/
public class Instruction
{
	private int id;
	private String staffName;
	private String managerName;
	private String content;
	
	public Instruction()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Instruction(int id, String staffName, String managerName, String content)
	{
		super();
		this.id = id;
		this.staffName = staffName;
		this.managerName = managerName;
		this.content = content;
	}
	public Instruction(String staffName, String managerName, String content)
	{
		super();
		this.staffName = staffName;
		this.managerName = managerName;
		this.content = content;
	}
	@Override
	public String toString()
	{
		return "instruction [id=" + id + ", staffName=" + staffName + ", managerName=" + managerName + ", content="
				+ content + "]";
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getStaffName()
	{
		return staffName;
	}
	public void setStaffName(String staffName)
	{
		this.staffName = staffName;
	}
	public String getManagerName()
	{
		return managerName;
	}
	public void setManagerName(String managerName)
	{
		this.managerName = managerName;
	}
	public String getContent()
	{
		return content;
	}
	public void setContent(String content)
	{
		this.content = content;
	}
}
