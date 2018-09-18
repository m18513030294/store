package com.e3.search.mapper;

import java.util.List;

import com.e3.common.pojo.SearchItem;

public interface ItemMapper {

	List<SearchItem> getItemList();
	SearchItem getItemById(long itemId);
}
