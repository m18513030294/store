package com.e3.service;

import java.util.List;

import com.e3.common.pojo.EasyUITreeNode;

public interface ItemCatService {
	List<EasyUITreeNode> getCatList(long parentId);
}
