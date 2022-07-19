package com.example.graphqltester2.AccountDetails

import lombok.Builder
import lombok.Value
import java.util.UUID


@Value
data class BankAccount(val id:UUID, val name: String, val currency: Currency, val amount: Double) {
}