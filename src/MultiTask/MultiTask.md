- 多线程竞争race condition，非同步的操作可能会出问题。比如执行`acount[to] += amount`，这个操作是非原子的，分三步：
```
    1) load acount[to]到register
    2) 增加amount
    3) 写回到acount[to]
```
假如thread1 load到register1计算完，然后要存回去的时候，可能被thread2打断，然后先存了thread2的值，接着又存下thread1的值，导致thread2的操作没有生效，数据发生错乱。
