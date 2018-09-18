package com.e3.content.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e3.content.service.ContentService;
import com.e3.mapper.TbContentMapper;
import com.e3.pojo.TbContent;
import com.e3.pojo.TbContentExample;
import com.e3.pojo.TbContentExample.Criteria;
@Service
public class ContentServiceImpl implements ContentService{
	@Autowired
	private TbContentMapper contentMapper;
	@Override
	public List<TbContent> getContentListByCid(long cid) {
		// TODO Auto-generated method stub
		TbContentExample example = new TbContentExample();
		Criteria criteria = example.createCriteria();
		//设置查询条件
		criteria.andCategoryIdEqualTo(cid);
		//执行查询
		List<TbContent> list = contentMapper.selectByExampleWithBLOBs(example);
		return list;
	}
   
}
