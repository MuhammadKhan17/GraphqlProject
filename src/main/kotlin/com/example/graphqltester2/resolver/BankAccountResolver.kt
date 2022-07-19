package com.example.graphqltester2.resolver

import com.example.graphqltester2.AccountDetails.BankAccount
import com.example.graphqltester2.AccountDetails.Currency
import graphql.kickstart.tools.GraphQLQueryResolver


import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Component
import java.util.UUID

@Slf4j
@Component
class BankAccountResolver: GraphQLQueryResolver {
    fun bankAccount(id:UUID): BankAccount {
        return BankAccount(id,"bob jones",Currency.USD,100.30)
    }
}