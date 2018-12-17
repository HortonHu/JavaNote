package BasicType;

import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Basic {
    public static void TestBasicDataType(){
        //  原始数据类型
        byte x_8;    //  8位整形
        short x_16;   //  16位整形
        int x_32 = 100;      //  32位整形
        long x_64;    //  64位整形
        boolean z1 = true;
        boolean z2 = false;
        System.out.printf("%d\n", x_32);
        System.out.printf("%s\n", Integer.toString(x_32)); //  int转string

        float y_32;   //  32位单精度浮点数
        double y_64 = 100.0;   //  64位双精度浮点数

        //  &&和||支持短路操作，&和|不支持，用前者可以节省判断次数
        System.out.println(z2 && z1);
        System.out.println(z2 & z1);
        System.out.println(z1 || z2);
        System.out.println(z1 | z2);

        // 类型转换
        System.out.println(1 + 1.1);    // 隐式（自动）类型转换
        System.out.println((int)1.1);   // 显示（强制）类型转换
        System.out.println(Integer.parseInt("123"));        // string to integer
        System.out.println(Integer.toString(123));          // integer to string
        System.out.println(Double.parseDouble("123.0"));    // string to double
        System.out.println(Double.toString(123.0));         // double to string

        // 格式化  %[int1].[int2][char] [char]代表转换代码 [int1]是值的宽度 正左加空格 [int2]是小数点位数或截取string长度
        System.out.printf("%d\n", 100);       // 十进制整数
        System.out.printf("%8d\n", 100);      // 左加5个空格
        System.out.printf("%-8d\n", 100);     // 右加5个空格
        System.out.printf("%8.2f\n", 100.0);  // 小数点后两位
        System.out.printf("%o\n", 100);       // 八进制整数
        System.out.printf("%x\n", 100);       // 十六进制整数
        System.out.printf("%e\n", 2e2);       // 科学计数法
        System.out.printf("%s\n", "100");     // 字符串
        System.out.printf("%b\n", 3 > 5);     // 布尔类型

        String s_format = String.format("%8d\n", 100);  // 用String.format获取格式化的字符串
        System.out.println(s_format);


    }

    public static void TestChar(){
        char c; //  16位字符
        System.out.println("123\t123");
        System.out.println('\u1234');

        String s = "100";   // 字符串s
        System.out.printf("%s\n", Integer.parseInt(s)); //  string转int

    }

    public static void TestSrting(){
        // 字符串
        String s2 = "te st";
        char a_1[] = {'g', 'o', 'o', 'd'};
        String s3 = new String(a_1, 1, 3);  // s3 = "ood"
        System.out.println(s2 + s3);
        System.out.println(s2.length());
        System.out.println(s2.indexOf('t'));    // 第一次出现该字符的位置
        System.out.println(s2.lastIndexOf('t'));    // 最后一次出现该字符的位置
        System.out.println(s2.charAt(1));    // 指定索引位置的字符
        System.out.println((" " + s2 + " ").trim());    // 去除前后的空格
        System.out.println((" " + s2 + " ").replaceAll(" ", ""));    // 去除所有的空格
        System.out.println((" " + s2 + " ").replace(" ", ""));    // 去除所有的空格
        System.out.println((" " + s2 + " ").replaceFirst(" ", ""));    // 去除第一个空格
        System.out.println(s2 == "te st");  // 判断字符串的内存位置是否相等
        System.out.println(s2.equals("test"));  // 判断字符串是否相等
        System.out.println(s2.equalsIgnoreCase("Te st"));  // 判断字符串是否相等, 忽略大小写
        System.out.println(s2.startsWith("te"));
        System.out.println(s2.endsWith("e"));
        System.out.println(s2.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s2.concat("abc"));     // 在末尾添加字符串
        System.out.println(s2.substring(1, 3));     // 从第1到第二个 左闭右开的子字符串
        System.out.println("d".compareTo("a"));     // 比较字符串 从左往右比较 如果是0则比较下一位 如果非0 返回差值
        System.out.println("b".compareTo("a"));     // 比较字符串
        System.out.println("b3".compareTo("a1"));     // 比较字符串
        System.out.println("a".compareTo("ac"));     // 比较字符串   长度不同时 且相同长度部分字符串相同时 返回长度差
        System.out.println("b".compareTo("ac"));     // 比较字符串   长度不同时 且相同长度部分字符串不同时 返回第一个不一样的字符值差
        String s5[] = s2.split(" ");    // 字符串的分割， 返回字符串数组
        String s6[] = " 1 2 3 ".split(" ", 3);    // 按照空格分割为3份
        String s7[] = " 1, 2, 4, ".split(" |,");    // 定义多个分隔符


        // 字符串生成器 更快速的处理字符串
        String s8 = "test";
        StringBuilder builder = new StringBuilder();
        // 追加字符串
        builder.append(s8);
        System.out.println(builder);
        builder.append(s8);
        System.out.println(builder);
        builder.append(123);
        System.out.println(builder);
        // 先缓存再追加
        StringBuffer buffer = new StringBuffer("111");
        builder.append(buffer);
        System.out.println(builder);
        // 插入到指定位置
        builder.insert(1, "qqq");
        System.out.println(builder);
        // 删除子串 从start到end 不包括end  start=end时不删除
        builder.delete(1, 4);
        System.out.println(builder);
        // 字符串生成器转换为字符串
        System.out.println(builder.toString());


    }

    public static void TestOperator(){
        // 位运算符
        byte x_1 = 7;
        byte x_2 = 10;
        byte x_3 = -10;
        int x_4 = 0x80000001;
        System.out.println(~x_1);   // 0000 0111变成 1111 1000 先取反再加一得到-8
        System.out.println(x_1 & x_2);   // 0000 0111 & 0000 1010 得到 0000 0010
        System.out.println(x_1 | x_2);   // 0000 0111 | 0000 1010 得到 0000 1111
        System.out.println(x_1 ^ x_2);   // 0000 0111 | 0000 1010 得到 0000 1101
        System.out.println(x_1 << 2);   // 0000 0111 << 2 得到 0001 1100
        System.out.println(x_3 >> 1);   // 1000 1010 >> 1 得到 1000 0101
        System.out.println(x_4 >>> 30);   // >>>是无符号右移 移空的高位永远填入0 ****针对32位或者64位****

        // 三目运算符    表达式？A:B 表达式为true 返回A 否则返回B
        System.out.println(1 > 2 ? 100 :200);   // >>>是无符号右移 移空的高位永远填入0

        // 运算符优先级
        // 括号 > 正负号 > 一元运算符 > 乘除 > 加减 > 移位 > 比较大小 > 比较等价 > & > ^ > | > && > || > 三元 > 赋值

    }

    public static void TestMathFunction(){
        //  数学函数
        int x_32 = 1000;
        System.out.println();
        System.out.printf("%f\n", Math.sqrt(x_32));
        System.out.printf("%f\n", Math.exp(x_32));
        System.out.printf("%f\n", Math.log(x_32));
        System.out.printf("%f\n", Math.pow(x_32, 2));
        System.out.printf("%f\n", Math.random());
        System.out.printf("%f\n", Math.E);
        System.out.printf("%f\n", Math.PI);

    }

    public static void TestControlStatement(){
        //  switch语句
        int week = 1;
        switch (week){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            // 相同情况的switch可以放在一起
            case 4:
            case 5:
            case 6:
                System.out.println("WOW");
                break;
        }

        // foreach  用来遍历数组
        int weeks [] = {1, 2, 3, 4};
        for (int weekday: weeks){
            System.out.println(weekday);
        }

    }

    public static void TestArray(){
        //  定义长度为N的一维数组
        int N = 10;
        double [] a1 = new double[N];
        System.out.println();
        System.out.printf("The length is :%d\n", a1.length);

        // 填充数据
        Arrays.fill(a1, 100.0);    // 给数组所有元素填充数据100.0
        Arrays.fill(a1, 0, 2, 1.0);    // 给数组第0到2位元素填充数据1.0

        // 排序
        Arrays.sort(a1);    // 将a1升序排序 顺序是1Aa

        // 复制数组
        int arr_1[] = new int[] {0, 1, 2, 3, 4};
        int newarr_1[] = Arrays.copyOf(arr_1, 2);    // 复制前两位
        int newarr_2[] = Arrays.copyOf(arr_1, 10);    // 复制全部剩下的填充0
        int newarr_3[] = Arrays.copyOfRange(arr_1, 1, 3);    // 复制第1~3位

    }

    public static void TestDate(){
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

    }

    public static void TestRegular(){

        // 正则
        // .    任意字符
        // \d   0~9
        // \D   非数字
        // \s   空白字符 \t \n等
        // \S   非空白字符
        // \w   标识符 不包括$
        // \W   不可用于标识符
        // \p{Lower}    a-z
        // \p{Upper}    A-Z
        // \p{ASCII}    ASCII
        // \p{Alpha}    a-zA-Z
        // \p{Digit}    0-9
        // \p{Alnum}    0-9a-zA-Z
        // \p{Punct}    标点符号
        // \p{Graph}    可见字符 Alnum+Punct
        // \p{Print}    可打印字符 [\p{Graph}\x20]
        // \p{Blank}    空格和\t
        // \p{Cntrl}    控制字符 \x00 - \x1F\x7F
        // [ab]         a或b
        // [^ab]        除了a和b之外的任何字符
        // [a-z]        a-z
        // [a-d[o-q]]   a-d或o-q
        // [a-z&&[^m-p]]    a-z之间除了m-p
        // ?        0或1次
        // *        0或多次
        // +        0或多次
        // {n}      n次
        // {n,}     至少n次
        // {n,m}    n~m次
        System.out.println("ABC-123".matches("\\p{Alpha}{3}-\\d{3}"));

    }

    public static void TestAuthority(){
        // 权限修饰符  private     protected     public
        // 本类        可见         可见          可见
        // 同包类      不可见       可见          可见
        // 其他包类    不可见       不可见        可见
        // 声明类的时候如果不设置权限修饰符，默认同包可以可见

    }

    public static void TestIO(){
        // 获得输入的方法
//        Scanner scan = new Scanner(System.in);
//        s = scan.next();
//        System.out.print(s);

    }

    public static void main(String[] args){
        System.out.println("Java basic knowledge.");
        TestSrting();
    }

}
