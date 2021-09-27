package br.com.pietroniro.injecting.interfaces;

public class OrderBOImpl implements OrderBO {

    private OrderDAO dao;

    @Override
    public void placeOrder() {
        System.out.println("Insider Order BO");
        dao.createOrder();
    }

    public OrderDAO getDao() {
        return dao;
    }

    public void setDao(OrderDAO dao) {
        this.dao = dao;
    }
}
