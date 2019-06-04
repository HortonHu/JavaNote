Runnable
```
    new Thread(() -> System.out.println("Java8 Lambda expression!") ).start();
```


集合类forEach遍历
```
    List<String> list = Arrays.asList("aaa", "bbb", "ccc");
    list.forEach(n -> System.out.println(n));
    list.forEach(System.out::println);
```

Predicate
```
    import java.util.function.Predicate;

    List<String> list = Arrays.asList("Aaa", "bbb", "ccc");
    Predicate<String> startsWithA = (n) -> n.startsWith("A");
    list.stream().filter(startsWithA).forEach(System.out::println);
```
多个Predicate结合, and()、or()和xor()
```
    import java.util.function.Predicate;

    List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
    Predicate<String> startsWithJ = (n) -> n.startsWith("J");
    Predicate<String> fourLetterLong = (n) -> n.length() == 4;
    names.stream()
        .filter(startsWithJ.and(fourLetterLong))
        .forEach((n) -> System.out.print(
            "nName, which starts with 'J' and four letter long is : " + n)
        );
```