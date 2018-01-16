package com.shi.construction.proxy.staticProxy;

/**
 * 租赁者
 *
 * @author shichao
 * @date 2018/1/10 下午3:29
 */
public class Renter {

    public static void main(String[] args) {
        Deal deal = new DealProxy(new DealLord());
        deal.talk();
        deal.investigate();
        deal.houseCertify();
        deal.signContact();
    }

}
