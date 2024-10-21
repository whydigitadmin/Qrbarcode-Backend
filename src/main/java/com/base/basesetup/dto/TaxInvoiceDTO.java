package com.base.basesetup.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaxInvoiceDTO {

	private Long id;
	private String companyAddress;
	private String invoiceNo;
	private String invoiceDate;
	private String term;
	private String dueDate;
	private String serviceMonth;
	private int tax;
	private String billToAddress;
	private String shipToAddress;
	private String gstType;
	private Integer sgst;
	private Integer cgst;
	private Integer igst;
	private Long total;
	private Long subTotal;
	private String termsAndConditions;
	private String bankName;
	private String accountName;
	private String accountNo;
	private String Ifsc;
	private String notes;
	private String createdBy;
	private String modifiedBy;
	private Long orgId;
	private byte[] taxInvoiceimage;


	private List<TaxInvoiceProductLineDTO> productLines;

}

