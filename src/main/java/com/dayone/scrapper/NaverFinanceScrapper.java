package com.dayone.scrapper;

import com.dayone.model.Company;
import com.dayone.model.ScrappedResult;

// 다른 사이트 긁어오기 예시
public class NaverFinanceScrapper implements Scrapper{
    @Override
    public Company scrapCompanyByTicker(String ticker){
        return null ;
    }

    @Override
    public ScrappedResult scrap(Company company) {
        return null;
    }
}
