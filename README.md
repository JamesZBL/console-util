# Console Util For Better Printing
[![Build Status](https://travis-ci.org/JamesZBL/console-util.svg?branch=master)](https://travis-ci.org/JamesZBL/console-util)
[![LICENSE](https://img.shields.io/badge/license-Apache%202-brightgreen.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)
[![Maven central](https://maven-badges.herokuapp.com/maven-central/com.github.jameszbl/console-util/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.jameszbl/console-util)
![GitHub release](https://img.shields.io/github/release/jameszbl/console-util.svg)



## 表格

```
Table table = new Table.Builder().
            // 列名
            columns(new String[]{"班级", "学号", "姓名", "性别"}).
            // 单元格
            cells(new String[][]{
                    {"软件1班", "123", "李明", "女"},
                    {"软件2", "13533", "王3名", "男"},
                    {"软件3", "21212333", "刘文", "女"},
                    {"软件3", "212", "刘翰", "女"}}).
            // 列宽
            columnLength(10).
            build();
    System.out.println(table);
```

# LICENSE 
[Apache License 2.0](LICENSE)