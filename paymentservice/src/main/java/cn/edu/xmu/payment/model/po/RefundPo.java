package cn.edu.xmu.payment.model.po;

import java.time.LocalDateTime;

public class RefundPo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column refund.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column refund.payment_id
     *
     * @mbg.generated
     */
    private Long paymentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column refund.amout
     *
     * @mbg.generated
     */
    private Long amout;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column refund.pay_sn
     *
     * @mbg.generated
     */
    private String paySn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column refund.bill_id
     *
     * @mbg.generated
     */
    private Long billId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column refund.state
     *
     * @mbg.generated
     */
    private Byte state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column refund.gmt_create
     *
     * @mbg.generated
     */
    private LocalDateTime gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column refund.gmt_modified
     *
     * @mbg.generated
     */
    private LocalDateTime gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column refund.id
     *
     * @return the value of refund.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column refund.id
     *
     * @param id the value for refund.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column refund.payment_id
     *
     * @return the value of refund.payment_id
     *
     * @mbg.generated
     */
    public Long getPaymentId() {
        return paymentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column refund.payment_id
     *
     * @param paymentId the value for refund.payment_id
     *
     * @mbg.generated
     */
    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column refund.amout
     *
     * @return the value of refund.amout
     *
     * @mbg.generated
     */
    public Long getAmout() {
        return amout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column refund.amout
     *
     * @param amout the value for refund.amout
     *
     * @mbg.generated
     */
    public void setAmout(Long amout) {
        this.amout = amout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column refund.pay_sn
     *
     * @return the value of refund.pay_sn
     *
     * @mbg.generated
     */
    public String getPaySn() {
        return paySn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column refund.pay_sn
     *
     * @param paySn the value for refund.pay_sn
     *
     * @mbg.generated
     */
    public void setPaySn(String paySn) {
        this.paySn = paySn == null ? null : paySn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column refund.bill_id
     *
     * @return the value of refund.bill_id
     *
     * @mbg.generated
     */
    public Long getBillId() {
        return billId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column refund.bill_id
     *
     * @param billId the value for refund.bill_id
     *
     * @mbg.generated
     */
    public void setBillId(Long billId) {
        this.billId = billId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column refund.state
     *
     * @return the value of refund.state
     *
     * @mbg.generated
     */
    public Byte getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column refund.state
     *
     * @param state the value for refund.state
     *
     * @mbg.generated
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column refund.gmt_create
     *
     * @return the value of refund.gmt_create
     *
     * @mbg.generated
     */
    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column refund.gmt_create
     *
     * @param gmtCreate the value for refund.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column refund.gmt_modified
     *
     * @return the value of refund.gmt_modified
     *
     * @mbg.generated
     */
    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column refund.gmt_modified
     *
     * @param gmtModified the value for refund.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }
}