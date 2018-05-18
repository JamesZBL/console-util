# console-util

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
[Apache 2.0](LICENSE)