package com.naveen.ecommerce.kafka;

import com.naveen.ecommerce.customer.CustomerResponse;
import com.naveen.ecommerce.order.PaymentMethod;
import com.naveen.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
