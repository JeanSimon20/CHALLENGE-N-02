package com.jeansimon.mscertificate.rest;

import com.jeansimon.mscertificate.application.PaymentService;
import com.jeansimon.mscertificate.domain.Payment;
import com.jeansimon.mscertificate.domain.PaymentRepository;
import com.jeansimon.mscertificate.infraestructure.PaymentDB;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    PaymentRepository paymentRepository = new PaymentDB();

    PaymentService paymentService = new PaymentService(paymentRepository);

    @PostMapping
    public Payment savePayment(@RequestBody Payment payment){
        //Payment payment = new Payment();
        return paymentService.savePayment(payment);
    }
}
