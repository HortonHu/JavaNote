## 自定义的class做hash的key的时候，要Override equals和hashCode这两个函数
- 如果有多个int属性 hashCode可以用 `para0 + para1 * 31 + para2 * 31^2 + ...`的形式
```java
    public static class Person {
        private String id;

        public Person(String id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object that) {
            return that instanceof Person
                    && ((Person)that).id == this.id;
        }

        @Override
        public int hashCode() {
            return id != null ? id.hashCode() : 0;
        }
    }
```
