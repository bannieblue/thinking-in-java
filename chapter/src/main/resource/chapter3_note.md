## 3.1 更简单的打印语句 
静态导入：
> import static静态导入是JDK1.5中的新特性。一般我们导入一个类都用 import com.....ClassName;而静态导入是这样：import static com.....ClassName.*;这里的多了个static，还有就是类名ClassName后面多了个 .* ，意思是导入这个类里的静态方法。当然，也可以只导入某个静态方法，只要把 .* 换成静态方法名就行了。然后在这个类中，就可以直接用方法名调用静态方法，而不必用ClassName.方法名 的方式来调用。

## 3.2 使用java操作符
```
+ - * / % 加 减 乘 除 取余  这些只能用于基本类型
= == != 等于 全等于 不等于 可以用于所有对象
String类支持+ 和 +=
```
## 3.3 优先级
先乘除后加减 ，其他不清楚用括号
## 3.4 赋值
赋值操作符 =
基本类型赋值操作是直接把实际数值赋值给变量
引用类型赋值是把引用赋值给变量
引用类型赋值会导致原对象被改变，这种现象称为别名现象。

```

static void f(Letter y){//此处的引用和x不一样，但是指向同一个对象，如果在此处将y赋值给新的对象，再修改c的值的话，将不影响下面x的值。因为不再指向同一个对象。
    y.c = 'z';
}

Letter x = new Letter();
x.c = '1';
print("1:x.c:"+x.c);//1:x.c:a
f(x);//在此处将x的引用复制了一份给方法f
print("2:x.c:"+x.c);//2:x.c:z
```

## 3.5 算数操作符
```
+ - * / % 
```
整数除法会直接去掉结尾的小数位，而不是四舍五入地整结果

## 3.6 自动递增和递减
```
++a --a 先执行运算，再生成值
a++ a-- 先生成值，再执行运算

int i=0;
println(++i);//1
println(i++)//1
println(i)//2
```
## 3.7 关系操作符
```
> < <= >= == !=
```
## 3.8 逻辑操作符
```
&& || ! 
```
## 3.9 直接常量
## 3.10 按位操作符
## 3.11 移位操作符
## 3.12 三元操作符 if-else
boolean-exp?value0:value1
## 3.13 字符串操作符+ +=
## 3.15 类型转换操作符
窄化转换：大类型转换为小类型，比如将long值转为int，需要显示转换。
```
long a = 100L;
int i =(int)a;
```
扩展转换：小类型转换为大类型，则不必显示转换
```
int i = 100;
long a = i;
```
截取和舍入：
将float和double转型为整型时，总对该数字执行结尾
```
double a = 0.7;
print((int)a);//0
```
如果要想得到舍入结果则需要用 java.lang.Math的round()方法

提升：
大类型和小类型运算的话，结果是大类型


