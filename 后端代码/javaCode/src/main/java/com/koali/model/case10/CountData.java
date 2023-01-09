package com.koali.model.case10;

import java.math.BigDecimal;

public class CountData {
    Integer id;
    String listed_companies_total;
    String listed_securities_total;
    BigDecimal total_market_value;
    BigDecimal circulation_market_value;
    BigDecimal sh_pe_ratio;
    BigDecimal sz_pe_ratio;

    public CountData(Integer id, String listed_companies_total, String listed_securities_total, BigDecimal total_market_value, BigDecimal circulation_market_value, BigDecimal sh_pe_ratio, BigDecimal sz_pe_ratio) {
        this.id = id;
        this.listed_companies_total = listed_companies_total;
        this.listed_securities_total = listed_securities_total;
        this.total_market_value = total_market_value;
        this.circulation_market_value = circulation_market_value;
        this.sh_pe_ratio = sh_pe_ratio;
        this.sz_pe_ratio = sz_pe_ratio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getListed_companies_total() {
        return listed_companies_total;
    }

    public void setListed_companies_total(String listed_companies_total) {
        this.listed_companies_total = listed_companies_total;
    }

    public String getListed_securities_total() {
        return listed_securities_total;
    }

    public void setListed_securities_total(String listed_securities_total) {
        this.listed_securities_total = listed_securities_total;
    }

    public BigDecimal getTotal_market_value() {
        return total_market_value;
    }

    public void setTotal_market_value(BigDecimal total_market_value) {
        this.total_market_value = total_market_value;
    }

    public BigDecimal getCirculation_market_value() {
        return circulation_market_value;
    }

    public void setCirculation_market_value(BigDecimal circulation_market_value) {
        this.circulation_market_value = circulation_market_value;
    }

    public BigDecimal getSh_pe_ratio() {
        return sh_pe_ratio;
    }

    public void setSh_pe_ratio(BigDecimal sh_pe_ratio) {
        this.sh_pe_ratio = sh_pe_ratio;
    }

    public BigDecimal getSz_pe_ratio() {
        return sz_pe_ratio;
    }

    public void setSz_pe_ratio(BigDecimal sz_pe_ratio) {
        this.sz_pe_ratio = sz_pe_ratio;
    }

    @Override
    public String toString() {
        return "{" +
                "listed_companies_total='" + listed_companies_total + '\'' +
                ", listed_securities_total='" + listed_securities_total + '\'' +
                ", total_market_value=" + total_market_value +
                ", circulation_market_value=" + circulation_market_value +
                ", sh_pe_ratio=" + sh_pe_ratio +
                ", sz_pe_ratio=" + sz_pe_ratio +
                '}';
    }
}
