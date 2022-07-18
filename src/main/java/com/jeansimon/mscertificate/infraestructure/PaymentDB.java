package com.jeansimon.mscertificate.infraestructure;

import com.jeansimon.mscertificate.domain.Payment;
import com.jeansimon.mscertificate.domain.PaymentRepository;

public class PaymentDB implements PaymentRepository {
    @Override
    public Payment save(Payment payment) {
        Payment paymentResult = new Payment();
        paymentResult.setId("1");
        paymentResult.setTipo(payment.getTipo());
        paymentResult.setNumero(payment.getNumero());
        paymentResult.setVencimiento(payment.getVencimiento());
        paymentResult.setCvv(payment.getCvv());
        return paymentResult;
    }
}
