package com.jeansimon.mscertificate.rest;

import com.jeansimon.mscertificate.application.CertificateService;
import com.jeansimon.mscertificate.domain.Certificate;
import com.jeansimon.mscertificate.domain.CertificateRepository;
import com.jeansimon.mscertificate.infraestructure.CertificateDB;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/certificate")
public class CertificateController {
    CertificateRepository certificateRepository = new CertificateDB();

    CertificateService certificateService = new CertificateService(certificateRepository);

    @PostMapping
    public Certificate saveCertificate(@RequestBody Certificate certificate){
        return certificateService.saveCertificate(certificate);
    }
}
