package com.picPay.picPay.dto;

import java.math.BigDecimal;

public record TransactionDTO(BigDecimal value, Long sendId, Long receiverId) {
}
