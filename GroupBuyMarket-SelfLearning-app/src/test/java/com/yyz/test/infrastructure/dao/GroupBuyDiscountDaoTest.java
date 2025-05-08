package com.yyz.test.infrastructure.dao;

import com.alibaba.fastjson.JSON;
import com.yyz.infrastructure.dao.GroupBuyDiscountMapper;
import com.yyz.infrastructure.dao.po.GroupBuyDiscount;
import com.yyz.infrastructure.dao.po.GroupBuyDiscountExample;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class GroupBuyDiscountDaoTest {

    @Resource
    private GroupBuyDiscountMapper groupBuyDiscountMapper;

    @Test
    public void test_queryGroupBuyDiscountList(){
        GroupBuyDiscountExample groupBuyDiscountExample = new GroupBuyDiscountExample();
        groupBuyDiscountExample.createCriteria()
                .andDiscountIdEqualTo("25120207");

        List<GroupBuyDiscount> groupBuyDiscounts = groupBuyDiscountMapper.selectByExample(groupBuyDiscountExample);
        log.info("测试结果:{}", JSON.toJSONString(groupBuyDiscounts));
    }

}
