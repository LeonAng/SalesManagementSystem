package leon.sms.mapper;

import java.util.List;
import leon.sms.pojo.Project;

/** 
* @author Leon
* @date 创建时间：2018年4月7日 下午2:06:10
* @version 1.0
* 类说明 :
* 
*/
public interface ProjectMapper
{
	public void add(Project project);

	public void delete(int id);

	public Project get(int id);

	public void update(int id);

	public List<Project> list();

	public int count();
}
