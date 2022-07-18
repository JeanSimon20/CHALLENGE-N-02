package com.jeansimon.mscertificate.infraestructure;


import com.jeansimon.mscertificate.domain.Certificate;
import com.jeansimon.mscertificate.domain.CertificateRepository;

public class CertificateDB implements CertificateRepository {


    @Override
    public Certificate save(Certificate certificate) {
        Certificate certificateResult = new Certificate();
        certificateResult.setId("1");
        certificateResult.setPersona(certificate.getPersona());
        certificateResult.setTipo(certificate.getTipo());
        certificateResult.setFecha(certificate.getFecha());
        return certificateResult;
    }
}
