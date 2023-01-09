package com.koali.service.Impl;

import com.koali.dao.getJsonDao;
import com.koali.model.case10.CountData;
import com.koali.service.getDataJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class getDataJsonImpl implements getDataJson {

    @Autowired
    private getJsonDao getJsonDao;
    public CountData getCountData() {
        return getJsonDao.getCountData();
    }
}
