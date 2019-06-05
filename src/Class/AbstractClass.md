- 只将它作为派生其他类的基类，而不作为想使用的特定的实例类 {Student, Employee} -> Person
```
    public abstract class Person {
        private String name;
        public Person(String name) {
            this.name = name;
        }
        
        public abstract String getDescription();
        
        public String getName() {
            return name;
        }
    }
```
- 抽象方法充当着占位的角色，它们的具体实现在子类中
- 类即使不含抽象方法，也可以将类声明为抽象类
- 抽象类不能被实例化。