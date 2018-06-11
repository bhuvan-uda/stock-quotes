package com.bhuvan.stocks.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bhuvan.stocks.entity.StockInfo;

public interface StockInfoRepository extends CrudRepository<StockInfo, String>{
	
	List<StockInfo> findByStockSymbol(String stockSymbol);

}
