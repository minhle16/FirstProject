package buyer.web.service;

import java.util.List;

import buyer.web.entitiesvo.TitleVo;




public interface TitleService {
	//CRUD  1.Create, 2 Read, 3 Update
	
	//2.read => R
	//List<TitleVo> getTitle();  
	TitleVo getTitle();
	
/*	//1.create => C
	boolean createTitle(TitleVo titleVo);
	
	//3.Update => U
	boolean updateTitle(TitleVo titleVo);
	
	//2.Read By ID
	//ProductVo getProductById(Integer id);
	
	boolean deleteTitle(Integer id);*/
}
