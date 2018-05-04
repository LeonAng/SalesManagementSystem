package leon.sms.mapper;

import java.util.List;
import leon.sms.pojo.Goods;

/** 
* @author Leon
* @date 创建时间：2018年4月7日 下午2:04:25
* @version 1.0
* 类说明 :
* 
*/
public interface GoodsMapper
{
	public void add(Goods goods);

	public void delete(String name);

	public Goods get(String name);

	public void updateNum(Goods goods);
	
	public void update(Goods goods);

	public List<Goods> list();

	public int count();
}
