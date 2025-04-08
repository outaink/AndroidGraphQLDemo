package com.plcoding.graphqlcountriesapp.domain

import com.apollographql.apollo.ApolloClient
import com.plcoding.CountriesQuery

class ApolloCountryClient(
    private val apolloClient: ApolloClient
) : CountryClient {

    override suspend fun getCountries(): List<SimpleCountry> {
        return apolloClient
            .query(CountriesQuery())
            .execute()
            .data?.countries?.map 
    }

    override suspend fun getCountry(code: String): DetailedCountry {

    }
}