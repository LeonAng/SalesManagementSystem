package leon.sms.mapper;

import java.util.List;
import leon.sms.pojo.Goods;

/** 
* @author Leon
* @date ����ʱ�䣺2018��4��7�� ����2:04:25
* @version 1.0
* ��˵�� :
* 
*/
public interface GoodsMapper
{
	public void add(Goods goods);

	public void delete(String name);

	public Goods get(String name);

	public void update(String name);

	public List<Goods> list();

	public int count();
}