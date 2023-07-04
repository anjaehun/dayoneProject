package com.dayone.scrapper;

import com.dayone.model.Company;
import com.dayone.model.ScrappedResult;

public interface Scrapper {
    Company scrapCompanyByTicker(String ticker);
    ScrappedResult scrap(Company company);
}
