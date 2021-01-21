# 一、类加载器
## 1、类加载过程

- 类加载过程分为`Loading加载`、`Linking链接`和`Initialization初始化`；其中链接过程又可以细分为
`Verification验证、Preparation准备和Resolution解析`三个过程。

### 1.1 加载

- 通过类的全限定名称获取定义此类的二进制字节流，并将该字节流所代表的静态存储结构转化为运行时数据结构，并
在内存中生成一个代表此类的 `java.lang.Class对象`，该Class对象将成为访问该类在方法区中的数据的入口。
- class文件的来源可以是本地磁盘、网络和数据库等

### 1.2、链接
#### 1.2.1、验证

- 用于确保所加载的class文件的正确性——验证字节流包含的信息是否符合当前虚拟机的规范，并免对java虚拟机
造成伤害，主要有 `文件格式验证、元数据验证、字节码验证和符号引用验证`。HotSpot虚拟机的class文件都是
以 `CAFEBABE` 开头的，这个就是 Java class文件的标识符。

#### 1.2.2、准备

- 进行类成员变量的内存分配和赋予相应数据类型的默认初始值—— `零值`，此处所指的类成员变量不包括 `final`
修饰的 static 变量，因为这种类型的变量会在编译时就进行分配，而在此时的准备阶段是进行显式初始化；此外，
也不会对实例变量进行分配和初始化，因为类变量是分配到方法区中，而实例变量会随着对象一起分配到 Java 堆中。

#### 1.2.3、解析

- 将常量池中的符号引用转为直接引用的过程，通常在 JVM 执行完初始化之后进行。符号引用是一组用于描述所引用
的目标的符号；符号引用的字面量形式明确定义在《java虚拟机规范》的CLass文件格式中；直接引用就是直接指向
目标的指针、相对偏移量或定位目标的句柄。解析动作主要针对类或接口、字段、类方法、接口方法、方法类型等，对应
着常量池中的 CONSTANT_Class_info、CONSTANT_Fieldref_info、CONSTANT_Methodref_info等。

### 1.3、初始化

- 即执行类构造器 `<clinit>()` 方法的过程，该方法无需开发者手动定义，会由编译器根据自动收集类中的所有
类变量的赋值动作和静态代码块中的语句合并生成；该方法中的指令按语句在源文件中出现的顺序执行；该方法不同于类的
构造器——虚拟机视角下的 `<init>()构造器函数`；若当前类有父类，那么在执行当前类的 `<clinit>()`方法之前，
先执行完父类的；虚拟机必须保证一个类的 `<clinit>()` 方法在多线程下被同步加锁。

# 二、类加载器分类

- JVM 支持两种类型的类加载器，分别为引导类加载器（ `Bootstrap ClassLoader` ）和自定义类加载器（
`User-Defined ClassLoader` ）。自定义类加载器在概念上通常指开发人员自定义的一类加载器，但在java
虚拟机规范中将自定义类加载器表述为 `所有派生于抽象类ClassLoader的类加载器`.
## 1、JVM 自带的加载器
### 1.1、启动类加载器

- 又叫引导类加载器，Bootstrap ClassLoader；`该类加载器使用C/C++ 语言实现`，嵌套在 JVM 内部，用于加载
 Java 的核心库——JAVA_HOME/jre/lid/rt.jar、resources.jar —— 即 JVM 自身需要的类，该类加载器并非是
 java.lang.ClassLoader 的子类，自身就是顶级类加载器（没有父类加载器）；该类加载器完成的工作包括加载扩展类
 和应用程序类加载器并为它们指定父类加载器。
- 处于安全考虑，bootstrapClassLoader只加载包名为java、javax 等开头的类。

### 1.2、扩展类加载器

- 即 Extension ClassLoader，用 Java 语言开发，由 sun.misc.Launcher$ExtClassLoader 实现，派生自
ClassLoader，其父类加载器即为启动类加载器。
- 从 java.ext.dirs 系统属性所指定的目录中加载类库，或从 JDK 的安装目录的 jre/lib/ext 子目录下加载类库，
若用户创建的 JAR 放在此目录下，也会自动由扩展类加载。

### 1.3、应用程序类加载器

- 也叫系统类加载器，AppClassLoader；也是 java 语言开发，派生于 ClassLoader，父类加载器为扩展类加载器；
它负责加载环境变量classpath或系统属性属性 java.class.path 指定路径下的类库，是程序中默认的类加载器，通常
java应用的类都由其进行加载；通过ClassLoader#getSystemClassLoader() 方法可获取该类加载器。

## 2、用户自定义类加载器

- 虽然 java 语言提供的三种类加载器，以及可以解决大多数情况下的需求，但在必要时，开发者还可以自定义类加载器、来
定制类的加载方式。之所以提供自定义类加载器，是为了隔离加载类、修改类的加载方式、扩展加载源和防止源码泄露等。

### 2.1、实现步骤

- 以继承抽象类 java.lang.ClassLoader 类的方式，编写自定义类加载器；在 JDK1.2 之前，都会重写 ClassLoader
的 loadClass() 方法，但是在 JDK1.2 之后不再建议如此操作，而是建议创建一个findClass()方法，并在该方法中编辑
自己的类加载逻辑；因此，如果没有复杂的需求，建议直接继承 URLClassLoader 类，从而不用取新建编写findClass()方法
及其获取字节码流的方式，从而使自定义类加载器编写更加简洁。

## 3、关于 ClassLoader

- ClassLoader 是一个抽象类，其后所有的类加载器都继承于其，除了启动类加载器。

 | 方法名称 | 描述 |
 |:----|:----|
 | getParent() | 返回该类加载器的超类加载器 |
 | loadClass(String name) | 加载名称为 name 的类，返回结果为 java.lang.Class的实例 |
 | findClass(String name) | 查找名称为 name 的类，返回类型同上 |
 | findLoadedClass(String name) | 查找名称为 name 的已被加载过的类，返回类型同上 |
 | defineClass(String name,byte[] b,int off, int len | 把字节数组b中的内容转换为一个Java类，返回结果同上 |
 | resolveClass(Class<?> c) | 连接指定的一个 Java 类 |
 
- 获取 classLoader的几种途径：
   
   1）class.getClassLoader() 获取当前类的加载器；
   
   2）Thread.currentThread().getContextClassLoader() 获取当前线程上下文的加载器
   
   3）ClassLoader.getSystemClassLoader() 获取系统的类加载器
   
   4）DriverManager.getCallerClassLoader() 获取调用者的类加载器