package leon.sms.mapper;

import java.util.List;
import leon.sms.pojo.Instruction;

/** 
* @author Leon
* @date 创建时间：2018年4月7日 下午2:05:50
* @version 1.0
* 类说明 :
* 
*/
public interface InstructionMapper
{
	public void add(Instruction instruction);

	public void delete(int id);

	public Instruction get(int id);

	public void update(int id);

	public List<Instruction> list();

	public int count();
}
