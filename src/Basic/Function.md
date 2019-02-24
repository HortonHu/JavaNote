变参方法
```
private int max(int... args) {
    int max = Integer.MIN_VALUE;
    for (int x : args) {
        max = Math.max(max, x); 
    }
    return max;
}
```