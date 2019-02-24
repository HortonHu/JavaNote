# Data Structure Conversion
- Array to List
- List to Array

## Array to List
### Primitive Type
```
    Integer[] arr = {1, 2, 3};
    List<Integer> list = Arrays.asList(arr);
```
or
```
    List<Integer> list = Arrays.asList(1, 2, 3);
```

### Reference Type
```
    String[] arr = {"a", "b", "c"};
    List<String> list = Arrays.asList(arr);
```


## List to Array
### Primitive Type and Reference Type
```
    list.toArray(new Integer[0]);
    list.toArray(new String[0]);
```