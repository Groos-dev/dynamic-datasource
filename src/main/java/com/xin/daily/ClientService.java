package com.xin.daily;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zengxin
 */
@Service
public class ClientService {

    @Autowired
    private ClientDao clientDao;

    // standard constructors

    public String getClientName(ClientDatabase clientDb) {
        ClientDatabaseContextHolder.set(clientDb);
        String clientName = this.clientDao.getClientName();
        ClientDatabaseContextHolder.clear();
        return clientName;
    }
}