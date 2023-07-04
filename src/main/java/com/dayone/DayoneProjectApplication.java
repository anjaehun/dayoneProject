package com.dayone;

import com.dayone.scrapper.YahooFinanceScrapper;
import org.apache.commons.collections4.Trie;
import org.apache.commons.collections4.trie.PatriciaTrie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableCaching
public class DayoneProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DayoneProjectApplication.class, args);

//		Trie trie = new PatriciaTrie();
//		AutoComplete autoComplete = new AutoComplete(trie);
//		AutoComplete autoComplete1 = new AutoComplete(trie) ;
//
//		autoComplete.add("hello");
//		autoComplete1.add("hello");
//
//		System.out.println(autoComplete.get("hello"));
//		System.out.println(autoComplete1.get("hello"));


//		YahooFinanceScrapper scrapper = new YahooFinanceScrapper();
////		var result = scrapper.scrap(Company.builder().ticker("O").build());
//
//		var result = scrapper.scrapCompanyByTicker("coke");
//		System.out.println(result);

	}

}
