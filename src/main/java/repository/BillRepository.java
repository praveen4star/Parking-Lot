package repository;

import exceptions.BillNotFound;
import models.Bill;

import java.util.HashMap;
import java.util.Map;

public class BillRepository {
    private Map<Integer, Bill> billMap;
    private static BillRepository instance;
    private BillRepository(){
        billMap = new HashMap<>();
    }
    public Bill getBill(int billId) throws BillNotFound{
        if(!billMap.containsKey(billId)){
            throw new BillNotFound("Bill not found : "+billId);
        }
        return billMap.get(billId);
    }
    public void put(Bill bill){
        billMap.put(bill.getId(), bill);
    }
    public static BillRepository getInstance(){
        if(instance == null){
            instance = new BillRepository();
        }
        return instance;
    }

}
