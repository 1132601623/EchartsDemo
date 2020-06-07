package com.itwyf.service.impl;

import com.itwyf.dao.EchartsDao;
import com.itwyf.entity.Echarts;
import com.itwyf.service.EchartsService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: EchartsDemo
 * @description:
 * @author: 吴云飞
 * @create: 2020-06-07 13:17
 */
@Service
public class EchartsServiceImpl implements EchartsService {
    @Autowired
    private EchartsDao echartsDao;
    @Override
    public List<Echarts> findAll() {
        return echartsDao.findAll();

    }
}
