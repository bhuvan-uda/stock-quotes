package com.bhuvan.stocks.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
/**
 *  This class acts as the repository for all stock symbol.
 * @author bhuvan
 *
 */
@Data
@Entity
@Table(name = "stockinfo")
public class StockInfo {
	
	
	private String stockName;
	@Id
	@Column(name = "stocksymbol")
	private String stockSymbol;
	private String price;
	private String activeFlag;
	private String lowerOrUpper;

}
