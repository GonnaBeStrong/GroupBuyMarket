package com.yyz.test.infrastructure.dao;

import com.alibaba.fastjson.JSON;
import com.yyz.infrastructure.dao.GroupBuyActivityMapper;
import com.yyz.infrastructure.dao.po.GroupBuyActivity;
import com.yyz.infrastructure.dao.po.GroupBuyActivityExample;
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
public class GroupBuyActivityDaoTest {

    @Resource
    private GroupBuyActivityMapper groupBuyActivityDao;

    @Test
    public void test_queryGroupBuyActivityList() {
        GroupBuyActivityExample groupBuyActivityExample = new GroupBuyActivityExample();
        groupBuyActivityExample.createCriteria()
                .andChannelEqualTo("c01")
                .andSourceEqualTo("s01");


        List<GroupBuyActivity> groupBuyActivities = groupBuyActivityDao.selectByExample(groupBuyActivityExample);
        log.info("测试结果:{}", JSON.toJSONString(groupBuyActivities));
    }

}
