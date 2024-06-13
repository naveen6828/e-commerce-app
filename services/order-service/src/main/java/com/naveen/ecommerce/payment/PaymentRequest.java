package com.naveen.ecommerce.payment;

import com.naveen.ecommerce.customer.CustomerResponse;
import com.naveen.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
