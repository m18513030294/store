package com.e3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.e3.common.pojo.EasyUIDataGridResult;
import com.e3.common.utils.E3Result;
import com.e3.pojo.TbItem;
import com.e3.service.ItemService;


@Controller
public class ItemController {
	@Autowired
	private ItemService itemService;

	@RequestMapping("/item/{itemId}")
	@ResponseBody
	private TbItem getItemById(@PathVariable Long itemId) {
		TbItem tbItem = itemService.getItemById(itemId);
		return tbItem;
	}
	
	@RequestMapping("/item/list")
	@ResponseBody
	public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
		EasyUIDataGridResult result = itemService.getItemList(page, rows);
		return result;
	}
	@RequestMapping("/item/save")
	@ResponseBody
	public E3Result saveItem(TbItem item, String desc) {
		E3Result result = itemService.addItem(item, desc);
		return result;
	}


}
