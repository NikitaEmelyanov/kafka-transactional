package by.javaguru.estore.transfers.service;

import by.javaguru.estore.transfers.model.TransferRestModel;

/**
 * Сервис для работы с переводами
 */
public interface TransferService {

    /**
     * Метод, позволяющий отправлять в withdraw-money-topic информацию, сколько денег снять,
     * далее что-то производим на некотором удаленном сервисе после чего отправляем
     * информацию на deposit-money-topic сколько денег нужно положить
     */
    public boolean transfer(TransferRestModel productPaymentRestModel);
}
