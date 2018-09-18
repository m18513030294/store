package com.e3.search.service;

import com.e3.common.pojo.SearchResult;

public interface SearchService {
	SearchResult search(String keyword, int page, int rows)  throws Exception;
}
