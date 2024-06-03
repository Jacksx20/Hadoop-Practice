为了编写一个能够与HBase交互的Java应用程序，需要在这个界面中加载该Java工程所需要用到的JAR包，这些JAR包中包含了可以访问HBase的Java  API。这些JAR包都位于Linux系统的HBase安装目录的lib目录下

(1)"/hbase/lib”目录下的所有JAR包（注意，不要选中client-facing-thirdparty、jdk11、ruby、shaded-clients、trace和zkcli这六个目录）

(2)在“/hbase/lib/client-facing-thirdparty”目录下所有jar文件。
