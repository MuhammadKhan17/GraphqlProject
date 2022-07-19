package com.example.graphqltester2.AccountDetails

enum class Currency {
    USD{
        val country="United States"
        val conversionRate=1.0
       },CAD{
        val country="Canada"
        val conversionRate=1.29
            },PKR{
        val country="Pakistan"
        val conversionRate=225.0
    }
    ,GPY{
        val country="Japan"
        val conversionRate=1321312
    },SAR{
        val country="Saudi Arabia"
        val conversionRate=5.0
    }
}