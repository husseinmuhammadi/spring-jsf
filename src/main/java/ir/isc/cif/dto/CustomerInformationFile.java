package ir.isc.cif.dto;

import java.util.Date;

public class CustomerInformationFile {

    private final String cifNo;
    private final Long credit;
    private final String customerName;
    private final String customerId;
    private final Date insertDate;

    private CustomerInformationFile(CustomerInformationFileBuilder builder) {
        this.cifNo = builder.cifNo;
        this.credit = builder.credit;
        this.customerName = builder.customerName;
        this.customerId = builder.customerId;
        this.insertDate = builder.insertDate;
    }

    public String getCifNo() {
        return cifNo;
    }

    public Long getCredit() {
        return credit;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public static CustomerInformationFileBuilder builder(){
        return new CustomerInformationFileBuilder();
    }

    public static class CustomerInformationFileBuilder {
        private String cifNo;
        private Long credit;
        private String customerName;
        private String customerId;
        private Date insertDate;

        public CustomerInformationFileBuilder cifNo(String cifNo) {
            this.cifNo = cifNo;
            return this;
        }

        public CustomerInformationFileBuilder credit(Long credit) {
            this.credit = credit;
            return this;
        }

        public CustomerInformationFileBuilder customerName(String customerName) {
            this.customerId = customerName;
            return this;
        }

        public CustomerInformationFileBuilder customerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public CustomerInformationFileBuilder insertDate(Date insertDate) {
            this.insertDate = insertDate;
            return this;
        }

        public CustomerInformationFile build() {
            CustomerInformationFile customerInformationFile = new CustomerInformationFile(this);
            validateCustomerInformationFileObject(customerInformationFile);
            return customerInformationFile;
        }

        private void validateCustomerInformationFileObject(CustomerInformationFile customerInformationFile) {

        }
    }
}
