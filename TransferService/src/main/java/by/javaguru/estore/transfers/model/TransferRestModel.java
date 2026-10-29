package by.javaguru.estore.transfers.model;

import java.math.BigDecimal;

/**
 * Сущность, содержащая информацию кому отправляем перевод и сколько отправляем
 */
public class TransferRestModel {
    private String senderId;
    private String recepientId;
    private BigDecimal amount;

    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public String getSenderId() {
        return senderId;
    }
    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }
    public String getRecepientId() {
        return recepientId;
    }
    public void setRecepientId(String recepientId) {
        this.recepientId = recepientId;
    }

    
}
