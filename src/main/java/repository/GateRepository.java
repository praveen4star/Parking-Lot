package repository;

import exceptions.GateNotFound;
import models.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    private Map<Integer, Gate> gateMap;
    public GateRepository(){
        gateMap = new HashMap<>();
    }
    public Gate getGate(int gateId) throws GateNotFound {
        if(!gateMap.containsKey(gateId)){
            throw new GateNotFound("Gate not found for gateId : "+gateId);
        }
        return gateMap.get(gateId);
    }
    public  void putGate(Gate gate){
        gateMap.put(gate.getId(), gate);
    }
}
