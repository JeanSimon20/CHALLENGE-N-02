package com.jeansimon.mscertificate.application;

import com.jeansimon.mscertificate.domain.Certificate;
import com.jeansimon.mscertificate.domain.CertificateRepository;

public class CertificateService {
    CertificateRepository certificateRepository;

    public CertificateService(CertificateRepository certificateRepository) {
        this.certificateRepository = certificateRepository;
    }

    public Certificate saveCertificate(Certificate certificate){
        return certificateRepository.save(certificate);
    }
}
