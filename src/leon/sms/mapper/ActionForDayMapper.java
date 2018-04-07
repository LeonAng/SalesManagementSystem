package leon.sms.mapper;

import java.sql.Date;
import java.util.List;

import leon.sms.pojo.ActionForDay;

/** 
* @author Leon
* @date 创建时间：2018年4月7日 下午2:02:21
* @version 1.0
* 类说明 :
* 
*/
public interface ActionForDayMapper
{
	public void add(ActionForDay actionForDay);

	public void delete(Date date);

	public ActionForDay get(Date date);

	public void update(Date date);

	public List<ActionForDay> list();

	public int count();
}
