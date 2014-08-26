Pyramid-List
开始时间：2014-08-26
项目说明：模仿GOOGLE的guava-*.jar对JAVA进行封装，并提供使用
制作方法：
    1、创建annotation
    2、创建class，并将annotation在class中进行声明
    3、如果使用MAVEN，在该项目的pom.xml目录下执行：mvn clean install -Dmaven.test.skip=true -X
    此时，已经在本地库中创建了相关包。在开发过程中直接引用即可。
    4、如果没有MAVEN，可使用eclipse的自动导出JAR包的方式。在开发过程中，需要在开发的项目的classpath里引入
    该JAR包。
    5、JOIN IT HAPPILLY~~~