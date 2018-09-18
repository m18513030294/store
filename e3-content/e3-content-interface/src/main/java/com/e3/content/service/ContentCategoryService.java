package com.e3.content.service;

import java.util.List;

import com.e3.common.pojo.EasyUITreeNode;
import com.e3.common.utils.E3Result;

public interface ContentCategoryService {
	List<EasyUITreeNode> getContentCategoryList(long parentId);
	E3Result addContentCategory(long parentId, String name);
}
