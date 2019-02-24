```
Date today = new Date();
System.out.println(String.format(Locale.US, "%tb", today));         //  月份英文缩写
System.out.println(String.format(Locale.US, "%tB", today)); //  月份英文全写
System.out.println(String.format("%ta", today));    // 星期简称
System.out.println(String.format("%tA", today));    // 星期全称
System.out.println(String.format("%tY", today));    // 年份4位
System.out.println(String.format("%ty", today));    // 年份2位
System.out.println(String.format("%tm", today));    // 月份2位
System.out.println(String.format("%td", today));    // 日期01~31
System.out.println(String.format("%te", today));    // 日期1~31

System.out.println(String.format("%tH", today));    // 小时00~23
System.out.println(String.format("%tI", today));    // 小时00~12
System.out.println(String.format("%tk", today));    // 小时0~23
System.out.println(String.format("%tl", today));    // 小时0~12
System.out.println(String.format("%tM", today));    // 分钟00~59
System.out.println(String.format("%tS", today));    // 秒数00~59
System.out.println(String.format("%tL", today));    // 毫秒数000~999
System.out.println(String.format("%tN", today));    // 微秒数000000000~999999999
System.out.println(String.format("%tz", today));    // 时区偏移量+0800
System.out.println(String.format("%tZ", today));    // 时区
System.out.println(String.format("%tp", today));    // 上下午am pm
System.out.println(String.format("%ts", today));    // 1970-01-01 00:00:00 到现在秒数
System.out.println(String.format("%tQ", today));    // 1970-01-01 00:00:00 到现在毫秒数

System.out.println(String.format("%tF", today));    // 年月日 XXXX-XX-XX
System.out.println(String.format("%tD", today));    // 年月日 XX/XX/XXXX
System.out.println(String.format("%tc", today));    // 星期X X月 XX XX:XX:XX CST XXXX
System.out.println(String.format("%tr", today));    // XX:XX:XX pm
System.out.println(String.format("%tT", today));    // XX:XX:XX
System.out.println(String.format("%tR", today));    // XX:XX

```