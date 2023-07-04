package com.dayone.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class ScrappedResult {

    private Company company;

    private List<Dividend> dividends;

    public ScrappedResult(){this.dividends = new ArrayList<>();}


}
