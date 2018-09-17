## 2.1 用引用操作对象 
## 2.2 必须由你创建所有对象
### 2.2.1 存储到什么地方
* 1. 寄存器：最快的存储区
* 2. 堆栈：位于通用RAM（随机访问存储器）中。通过指针向上或向下分配或释放内存。java程序必须知道存储在该区的所有项的生命周期，以便移动指针。对象引用存储在该区。
* 3. 堆：一种通用内存池（也位于RAM区），用于存放所有java对象。
* 4. 常量存储：直接存储在代码中
* 5. 非RAM存储：不受程序控制，程序没运行时也可以存在
     * 流对象：对象转为字节流发往其他机器
     * 持久化对象：把对象转化为可以存储到其他媒介上的事物。如将数据存储到数据库

### 2.2.2 特例：基本类型
|基本类型|大小|最小值|最大值|包装器类型|
|--------|----|------|------|----------|
|boolean|-|-|-|Boolean|
|char|16-bit|Unicode 0|Unicode 2<sup>16</sup>-1|Character|
|byte|8 bits|-128|+127|Byte|
|short|16 bits|-2<sup>15</sup>|+2<sup>15</sup>+1|Short|
|int|32 bits|-2<sup>31</sup>|+2<sup>31</sup>-1|Integer|
|long|64 bits|-2<sup>63</sup>|+2<sup>63</sup>-1|Long|
|float|32 bits|IEEE754|IEEE754|Float|
|double|64 bits|IEEE754|IEEE754|Double|
|void|-|-|-|Void|

> IEEE二进制浮点数算术标准（IEEE 754）是20世纪80年代以来最广泛使用的浮点数运算标准，为许多CPU与浮点运算器所采用。这个标准定义了表示浮点数的格式（包括负零-0）与反常值（denormal number）），一些特殊数值（无穷（Inf）与非数值（NaN）），以及这些数值的“浮点数运算符”；它也指明了四种数值舍入规则和五种例外状况（包括例外发生的时机与处理方式）。
> IEEE 754规定了四种表示浮点数值的方式：单精确度（32位）、双精确度（64位）、延伸单精确度（43比特以上，很少使用）与延伸双精确度（79比特以上，通常以80位实现）。

高精度数字：以速度换精度
* BigInteger：支持任意精度的整数
* BigDecimal：支持任何精度的定点数

## 2.3 永远不需要销毁对象
对象的作用域由花括号决定
垃圾回收器
## 2.4 创建新的数据类型：类
基本成员默认值：当变量作为类的成员使用时java才确保给其默认值。如果为局部变量，比如方法中的变量是不会默认初始化的。
|基本类型|默认值|
|-|-|
|boolean|false|
|char|'\u0000'(null)|
|byte|(byte)0|
|short|(short)0|
|int|0|
|long|0L|
|float|0.0f|
|double|0.0d|

## 2.5 方法、参数和返回值
调用方法的行为通常被称为发送消息给对象
参数列表：参数传递的是引用。（基本类型除外）
return作用：
* 离开此方法
* 如方法定义了返回值，则返回值，否则只是退出方法。

## 2.6 构建java程序
包名为反转域名，以.分割，均为小写
用import引入其他包
static关键字：
* 静态方法
* 静态变量
静态方法和方法和类的实例没有关系，只有一份，可以通过类名.调用。

## 2.7 第一个java程序
javadoc用法：
命令：
```
javadoc -d ../javadoc -encoding UTF-8 -charset UTF-8 -author -version *.java
```
-d 指定位置 -encoding -charset设置编码格式，否则中文会乱码，-author指定显示用户 -version指定显示版本

java类：

```
package frog;

/**
 * 测试注释<br>
 * 测试Sytems
 * @author bannieblue
 * @version 1.0.0
 */
public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}
```
详细学习见：
[Javadoc学习](https://blog.csdn.net/hsdzucc/article/details/4085391)
