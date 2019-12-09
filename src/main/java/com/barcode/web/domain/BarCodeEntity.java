package com.barcode.web.domain;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BarCodeEntity {

	public String barCodeName;

	public String qrCodeName;

	public String code;

}
