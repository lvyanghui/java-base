package com.lyh.fund.mapper;

import com.lyh.fund.domain.FundDetailInfo;
import com.lyh.fund.domain.FundDetailInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FundDetailInfoMapper {
    long countByExample(FundDetailInfoExample example);

    int deleteByExample(FundDetailInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FundDetailInfo record);

    int insertSelective(FundDetailInfo record);

    List<FundDetailInfo> selectByExample(FundDetailInfoExample example);

    FundDetailInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FundDetailInfo record, @Param("example") FundDetailInfoExample example);

    int updateByExample(@Param("record") FundDetailInfo record, @Param("example") FundDetailInfoExample example);

    int updateByPrimaryKeySelective(FundDetailInfo record);

    int updateByPrimaryKey(FundDetailInfo record);
}