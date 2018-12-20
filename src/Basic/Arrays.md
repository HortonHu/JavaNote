Methods|Explanation
----|----
binarySearch|
copyOf|
copyOfRange|
equals|
fill|
sort|
parallelSort| sort in parallel way
toString|

- initialization: 
```
new int[]{0, 1, 2, 3};
```
- shallow copy
```
    int[] a = new int[]{1, 2, 3};
    int[] b = a;
```
- deep copy
```
    int[] a = new int[]{1, 2, 3};
    int[] b = Arrays.copyOf(a);
```