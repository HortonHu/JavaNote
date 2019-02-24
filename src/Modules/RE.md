Rule
```
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

```