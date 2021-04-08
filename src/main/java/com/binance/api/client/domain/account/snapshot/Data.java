package com.binance.api.client.domain.account.snapshot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Data {

    @JsonProperty("balances")
    private List<Balance> balances = null;
    @JsonProperty("totalAssetOfBtc")
    private Double totalAssetOfBtc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("balances")
    public List<Balance> getBalances() {
        return balances;
    }

    @JsonProperty("balances")
    public void setBalances(List<Balance> balances) {
        this.balances = balances;
    }

    @JsonProperty("totalAssetOfBtc")
    public Double getTotalAssetOfBtc() {
        return totalAssetOfBtc;
    }

    @JsonProperty("totalAssetOfBtc")
    public void setTotalAssetOfBtc(Double totalAssetOfBtc) {
        this.totalAssetOfBtc = totalAssetOfBtc;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
