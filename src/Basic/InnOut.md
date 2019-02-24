# Input

Scanner:
```
        Scanner scan = new Scanner(System.in);
        s = scan.next();
        System.out.print(s);
```

In:




# Output


printf
```
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
```