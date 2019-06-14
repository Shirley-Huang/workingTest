package com.dandan.ClassOverride;

import com.dandan.common.utils.DateTimeUtility;
import com.dandan.common.utils.TimeRange;
import org.junit.Test;

import java.util.Date;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/1/16
 * @Desciption :
 */
public class TimeRangeTest {

    @Test
    public void toTimeRange() throws Exception{
        Date finalAgreeTimeStart = new Date("2019/01/16 00:00:00");
        Date finalAgreeTimeEnd = new Date("2019/01/16 23:59:59");
        TimeRange timeRange = TimeRange.toTimeRange(DateTimeUtility.formatYYYYMMDD(finalAgreeTimeStart),
                DateTimeUtility.formatYYYYMMDD(finalAgreeTimeEnd));
        System.out.println(timeRange.getFrom());
        System.out.println(timeRange.getTo());
    }


}
