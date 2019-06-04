sum/ave/max/min
```
    int[] nums = {1, 2, 3, 4, 5};   
    System.out.println(Arrays.stream(nums).sum());      // 15
    System.out.println(Arrays.stream(nums).average());  // 3
    System.out.println(Arrays.stream(nums).max());      // 5
    System.out.println(Arrays.stream(nums).min());      // 1
```

map
```
    List<Integer> number = Arrays.asList(2, 3, 4, 5);
    List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
    // [4, 9, 16, 25]
```
filter
```
    List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
    List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
    // [Stream]
    
    
    import java.util.stream.Collectors;

    List<String> filtered = strList.stream().filter(x -> x.length()> 2).collect(Collectors.toList());
    System.out.printf("Original List : %s, filtered list : %s %n", strList, filtered);
    // Original List : [abc, , bcd, , defg, jk], filtered list : [abc, bcd, defg]
```
sorted
```
    List<String> orderName = names.stream().sorted().collect(Collectors.toList());
    // [Collection, Reflection, Stream]
```
collect: to set
```
    List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);
    Set<Integer> squareSet = numbers.stream().map(x -> x * x).collect(Collectors.toSet());
    // [16, 4, 9, 25]
```
forEach
```
    number.stream().map(x -> x * x).forEach(y -> System.out.println(y));
    // 4 9 16 25
```
reduce
```
    int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
    // 6
    
    List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
    double bill = costBeforeTax.stream()
            .map((cost) -> (cost + 0.12 * cost))
            .reduce((sum, cost) -> sum + cost).get();
    System.out.println("Total : " + bill);
    // 1680.0
```