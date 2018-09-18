package com.e3.service;

import com.e3.common.pojo.EasyUIDataGridResult;
import com.e3.common.utils.E3Result;
import com.e3.pojo.TbItem;
import com.e3.pojo.TbItemDesc;

public interface ItemService {
	TbItem getItemById(long itemId);

	EasyUIDataGridResult getItemList(int page, int rows);
	
	E3Result addItem(TbItem item, String desc);
	TbItemDesc getItemDescById(long itemId);
}
