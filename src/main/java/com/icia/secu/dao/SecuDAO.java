package com.icia.secu.dao;

import com.icia.secu.dto.SecuDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SecuDAO {

    int secuJoin(SecuDTO secu);
    // void는 return값이 없음
    // int secuJoin(SecuDTO secu);
    // service로 int타입의 값변환

    SecuDTO secuLogin(SecuDTO secu);


}
