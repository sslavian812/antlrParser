# GoodLang


Task:

<b>Invent a "good" imperative programming language and translate it to C language.</b>

<i>ARTLR used as automatic parser generator:</i>
<a href="http://www.antlr.org/" >http://www.antlr.org/</a>




Language: goodLang<br>
files: code.gl<br>

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


see more code examples in ./examples/

./tmp folder contains generated C files


<a href="https://github.com/sslavian812/goodLang/blob/c75e4e85351aebe1df54846d79ca60988aca1a43/src/ru/ifmo/ctddev/shalamov/goodLang/GoodLang.g4">file with grammar</a>
