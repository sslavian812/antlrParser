# antlrParser
should translate my "goodLanguage" to C

Task:
Invent a "good" imperative programming language and translate it to C language.



Language: goodLang

fratures:
 - arithmetic expressions
 - boolean expressions
 - semicolon is optional
 - only integer variables
```
val x
val y=1
val z,t
```
 - default initialization with zero
```
val x; is equivalent to val x=0;
```
 - multi-assignment
```
x,y=1; is equivalent to val x=1; val y=1;
```
 - built in swap
```
swap a,b
```
 - function calls
```
fun function_name(arg1, arg2) {
  arg1 = arg1 + arg2
  ret arg1;
}
```
 - simple input-output:
```
<< "here is my output"
val n;
>> n
<< "variable n is now ", n;
```
 - classic while loop
```
val x=0;
while(x<10) {
  <<x
  x=x+1
}
```
 - for loop with range
```
for(i 0..10) {
  val k = i*i;
  <<k
}
// gives 0 1 4 9 16 25 36 49 64 81
// note, that the right end of the range is not included!!!
```
