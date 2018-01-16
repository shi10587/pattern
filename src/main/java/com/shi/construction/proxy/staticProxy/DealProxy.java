package com.shi.construction.proxy.staticProxy;

/**
 * 代理，中介
 *
 * @author shichao
 * @date 2018/1/10 下午5:02
 */
public class DealProxy implements Deal {

    private DealLord dealLord;

    public DealProxy(DealLord dealLord) {
        this.dealLord = dealLord;
    }

    @Override
    public void talk() {
        System.out.println("跟中介者谈话");
    }

    @Override
    public void investigate() {
        System.out.println("跟中介去看房");
    }

    @Override
    public void houseCertify() {
        System.out.println("houseCertify前，商量价钱");
        dealLord.houseCertify();
        System.out.println("houseCertify后，调整合同项目");
    }

    @Override
    public void signContact() {
        System.out.println("跟中介签订合同");
    }
}
