package com.jeansimon.mscertificate.domain;

import lombok.Data;

@Data
public class Certificate {
    private String id;
    private String persona;
    private String tipo;
    private String fecha;
}
