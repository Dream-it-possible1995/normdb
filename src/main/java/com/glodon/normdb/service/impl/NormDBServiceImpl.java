package com.glodon.normdb.service.impl;

import com.glodon.normdb.dao.NormDBMapper;
import com.glodon.normdb.entity.NormDB;
import com.glodon.normdb.service.NormDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NormDBServiceImpl implements NormDBService {

    @Autowired
    private NormDBMapper normDBMapper;

    @Override
    public List<NormDB> getNormDBList() {
        return normDBMapper.getNormDBList();
    }
}
