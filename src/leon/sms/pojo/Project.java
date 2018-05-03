package leon.sms.pojo;

import java.sql.Date;

/** 
* @author Leon
* @date 创建时间：2018年4月7日 下午12:25:06
* @version 1.0
* 类说明 :
* 
*/
public class Project
{
	private int id;
	private String name;
	private String staffName;
	private String clientName;
	private String goodsName;
	private int goodsNumber;
	private String state;
	private Date startDate;
	private Date endDate;
	private String plan;
	
	public Project()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int id, String name, String staffName, String clientName, String goodsName, int goodsNumber,
			String state, String startDate, String endDate, String plan)
	{
		super();
		this.id = id;
		this.name = name;
		this.staffName = staffName;
		this.clientName = clientName;
		this.goodsName = goodsName;
		this.goodsNumber = goodsNumber;
		this.state = state;
		if (startDate != null && startDate != "")
		{
			this.startDate = java.sql.Date.valueOf(startDate);
		}
		else
		{
			this.startDate = null;
		}
		if (endDate != null && endDate != "")
		{
			this.endDate = java.sql.Date.valueOf(endDate);
		}
		else
		{
			this.endDate = null;
		}
		
		this.plan = plan;
	}


	public Project(String name, String staffName, String clientName, String goodsName, int goodsNumber, String state,
			String startDate, String endDate, String plan)
	{
		super();
		this.name = name;
		this.staffName = staffName;
		this.clientName = clientName;
		this.goodsName = goodsName;
		this.goodsNumber = goodsNumber;
		this.state = state;
		if (startDate != null && startDate != "")
		{
			this.startDate = java.sql.Date.valueOf(startDate);
		}
		else
		{
			this.startDate = null;
		}
		if (endDate != null && endDate != "")
		{
			this.endDate = java.sql.Date.valueOf(endDate);
		}
		else
		{
			this.endDate = null;
		}
		
		this.plan = plan;
	}

	@Override
	public String toString()
	{
		return "Project [id=" + id + ", name=" + name + ", staffName=" + staffName + ", clientName=" + clientName
				+ ", goodsName=" + goodsName + ", goodsNumber=" + goodsNumber + ", state=" + state + ", startDate="
				+ startDate + ", endDate=" + endDate + ", plan=" + plan + "]";
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getStaffName()
	{
		return staffName;
	}
	public void setStaffName(String staffName)
	{
		this.staffName = staffName;
	}
	public String getClientName()
	{
		return clientName;
	}
	public void setClientName(String clientName)
	{
		this.clientName = clientName;
	}
	public String getGoodsName()
	{
		return goodsName;
	}
	public void setGoodsName(String goodsName)
	{
		this.goodsName = goodsName;
	}
	public int getGoodsNumber()
	{
		return goodsNumber;
	}
	public void setGoodsNumber(int goodsNumber)
	{
		this.goodsNumber = goodsNumber;
	}
	public String getState()
	{
		return state;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	public Date getStartDate()
	{
		return startDate;
	}
	public void setStartDate(Date startDate)
	{
		this.startDate = startDate;
	}
	public Date getEndDate()
	{
		return endDate;
	}
	public void setEndDate(Date endDate)
	{
		this.endDate = endDate;
	}
	public String getPlan()
	{
		return plan;
	}
	public void setPlan(String plan)
	{
		this.plan = plan;
	}
}
