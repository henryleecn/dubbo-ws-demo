Dubbo WebService Demo
========================

Run Provider
---------------------

```bash
mvn jetty:run
```

Run Consumer
----------------------

```bash
mvn exec:java -Dexec.mainClass=com.dubbo.demo.consumer.ConsumerMain
```

Related Documents
----------------------------

- [Dubbo WebService Protocol](http://code.alibabatech.com/wiki/display/dubbo/User+Guide-zh#UserGuide-zh-webservice%253A%252F%252F)
- [Spring中的ContextLoaderListener使用](http://wangpj.iteye.com/blog/882939)
