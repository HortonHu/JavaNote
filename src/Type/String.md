API

|Method|Explanation|
|:----|:----|
|int length()||
|char charAt(int index)||
|int indexOf(string str)||
|int lastIndexOf(string str)||
|string substring(int start, int end)|start include<br>end exclude||
|boolean compareTo(string other)||
|boolean equals(Object other)|must not use ==, which compare location|
|boolean equalsIgnoreCase(String other)||
|boolean startsWith||
|boolean endsWith||
|String toLowerCase||
|String toUpperCase||
|String trim|delete start and end spaces|
|String join(CharSequence delimiter, CharSequence... elements )|use delimiter to join all elements|
|replace(char oldChar, char newChar)||
|replaceAll(String regex, String replacement)||
|split(String regex)||
|toCharArray()||
|contains(CharSequence s)||



Difference of null string and empty string:
- null string : null `str != null`
- empty string: "" `str.length() != 0`



StringBuilder

|Method|Explanation|
|:----|:----|
|string toString()||
|append()||
|insert()||
|delete(int start, int end)|delete from start to end - 1|
|reverse()||
|charAt(int index)||
|deleteCharAt(int index)||
|replace(int start, int end, String str)|Replaces the characters in a substring of this sequence with characters in the specified String.|
|setCharAt(int index, char ch)||
