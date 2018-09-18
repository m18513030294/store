package com.e3.content.service;

import java.util.List;

import com.e3.pojo.TbContent;

public interface ContentService {
	List<TbContent> getContentListByCid(long cid);
}
