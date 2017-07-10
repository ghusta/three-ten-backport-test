# Test Project Threeten : Backport of JSR-310

## Overview

Same classes as in Java 8 Date and Time API, but packages have been renamed from `java.time` to `org.threeten.bp`.  
Project ThreeTen :
 - [home page](http://www.threeten.org/)
 - [source code](https://github.com/ThreeTen/threeten.github.io)

See also [JSR-310](https://jcp.org/en/jsr/detail?id=310) (Date and Time API).

## Maven

```xml
<dependency>
    <groupId>org.threeten</groupId>
    <artifactId>threetenbp</artifactId>
    <version>1.3.1</version>
</dependency>
```

## Target JDK

JDK 6 or 7.

## Other alternatives

- [Joda Time](http://www.joda.org/joda-time/)

## Integration with Hibernate/JPA

    To store JSR-310 classes in a database, you may need to use bindings for Hibernate or JPA. 
    Have a look at the user type, threeten-jpa or jpaattributeconverters projects for more info.

Source : http://www.threeten.org/
