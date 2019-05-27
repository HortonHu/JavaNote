Stream
```
    // sum
    int[] nums = {1, 2, 3, 4, 5};   
    // 15
    
    // map
    List<Integer> number = Arrays.asList(2, 3, 4, 5);
    List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
    // [4, 9, 16, 25]
    
    // filter
    List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
    List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
    // [Stream]
    
    // sorted
    List<String> orderName = names.stream().sorted().collect(Collectors.toList());
    // [Collection, Reflection, Stream]
    
    // collect: to set
    List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);
    Set<Integer> squareSet = numbers.stream().map(x -> x * x).collect(Collectors.toSet());
    // [16, 4, 9, 25]
    
    // forEach
    number.stream().map(x -> x * x).forEach(y -> System.out.println(y));
    // 4 9 16 25
    
    // reduce
    int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
    // 6
```