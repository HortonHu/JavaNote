- 加/删/修改 元素
- 找/删 最大值
- 找/删 最小值
- 找/删 比我大的一个元素
- 找/删 比我大的所有元素
- 找/删 比我小的一个元素
- 找/删 比我小的所有元素
- 找/删 指定区间的所有元素
	

|TreeMap API|Explain|
|:------:|:------:|
get(Object key)|key查value
put(K key, V value)|增key-value
remove(Object key)|删key的mapping
containsKey(Object key)|查key有无
containsValue(Object value)|查value有无
floorEntry(K key)|查小于等于的key的mapping
floorKey(K key)|查小于等于的key
lowerEntry(K key)|查小于的key的entry
lowerKey(K key)|查小于的key
higherEntry(K key)|查大于的key的entry
higherKey(K key)|查大于的key
ceilingEntry(K key)|查大于等于的key的mapping
ceilingKey(K key)|查大于等于的key
firstEntry()|查第一个entry
firstKey()|查第一个key
lastEntry()|查最后一个entry
lastKey()|查最后一个key
headMap(K toKey)|查小于key的所有mapping，带true则包含
subMap(K fromKey, K toKey)|从fromKey到toKey的所有mapping，左闭右开
tailMap(K fromKey)|查大于key的所有mapping，带true则包含
descendingKeySet()|降序的keyset
descendingMap()|降序的mapping
entrySet()|entry的集合
keySet()|key的集合
values()|value的集合
