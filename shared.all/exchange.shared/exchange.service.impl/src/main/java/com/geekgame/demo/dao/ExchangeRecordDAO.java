package com.geekgame.demo.dao;

import com.geekgame.demo.dataobject.ExchangeRecordDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExchangeRecordDAO {
    int add(ExchangeRecordDO recordDO);
    int update(ExchangeRecordDO recordDO);

}
