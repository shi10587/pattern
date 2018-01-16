package com.shi.construction.proxy.staticProxy;

/**
 * 房东
 *
 * @author shichao
 * @date 2018/1/10 下午5:06
 */
public class DealLord implements Deal {

    @Override
    public void talk() {
        System.out.println("跟房东谈话");
    }

    @Override
    public void investigate() {
        System.out.println("跟房东去看房");
    }

    @Override
    public void houseCertify() {
        System.out.println("房东房屋证明");
    }

    @Override
    public void signContact() {
        System.out.println("跟房东签订合同");
    }
}
