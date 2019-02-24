`class X implements Comparable`


```
    public interface Comparable<T>
    {
    int compareTo(T other) ; // parameter has type T
    }
```


X.compareTo(y)
1. x < y, return negative(-1)
2. x = y, return 0
3. x > y, return positive(1)