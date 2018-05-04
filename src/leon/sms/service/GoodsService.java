package leon.sms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import leon.sms.mapper.GoodsMapper;
import leon.sms.pojo.Goods;

/** 
* @author Leon
* @date 创建时间：2018年5月4日 上午10:28:31
* @version 1.0
* 类说明 :
* 
*/
@Service
public class GoodsService
{
	@Autowired
	GoodsMapper goodsMapper;
	
	public void addGoods(String goodsName, String goodsNumber, String unitPrice)
	{
		Goods goods = new Goods(goodsName, Integer.parseInt(goodsNumber), Float.parseFloat(unitPrice));
		if (goodsMapper.get(goodsName) != null)
		{
			goodsMapper.update(goods);
		}
		else
		{
			goodsMapper.add(goods);
		}
	}
	
}
