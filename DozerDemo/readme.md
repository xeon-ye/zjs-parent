1 项目中使用junit 测试 Dozer

2 Spring boot 集成 junit 保证首先有启动类，测试目录要和开发目录一直，这样测试用例才能运行

3 Dozer 复制对象有三种方式  普通映射只能保证 相同属性的复制，xml方式映射可以配置不同属性的名字之间的映射
  但是需要增加配置文件，resources目录先增加映射文件，注解方式直接在需要映射类中增加@mapping注解

4 自从 6.2.0 版本之后，Dozer 提供了 dozer-spring-boot-starter 用于 Spring Boot 的集成，如果使用 Maven 构建的项目，只需要在 pom.xml 

     <dependency>
       <groupId>com.github.dozermapper</groupId>
       <artifactId>dozer-spring-boot-starter</artifactId>
       <version>{dozer-version}</version>
     </dependency>
5 对于实际应用程序，建议不要在每次映射对象时创建一个新的 Mapper 实例，而是重新使用上次创建的 Mapper 实例，可以把 Mapper 封装成单例模式使用。
 
6 用枚举实现单例MappingSingleton

  
