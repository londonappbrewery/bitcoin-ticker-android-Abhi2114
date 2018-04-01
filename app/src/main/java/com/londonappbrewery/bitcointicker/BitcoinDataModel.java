package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;


class BitcoinDataModel {

    private String price;

    private BitcoinDataModel(String price){
        this.price = price;
    }

    static BitcoinDataModel fromJson(JSONObject jsonObject){

        String price = "";
        // extract price from jsonObject

        try{
            price = jsonObject.getString("last");
        }
        catch (JSONException e){

            e.printStackTrace();
        }
        return new BitcoinDataModel(price);
    }

    String getPrice(){

        return price;
    }
}
