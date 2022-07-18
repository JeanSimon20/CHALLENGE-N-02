package com.jeansimon.mscertificate.application;

import com.jeansimon.mscertificate.domain.Payment;
import com.jeansimon.mscertificate.domain.PaymentRepository;

public class PaymentService {
    PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment savePayment(Payment payment){
        return paymentRepository.save(payment);
    }
}
