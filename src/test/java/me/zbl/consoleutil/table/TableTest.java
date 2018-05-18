/*
 * Copyright 2018 JamesZBL
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package me.zbl.consoleutil.table;

import org.junit.Test;

/**
 * @author JamesZBL
 * @email 1146556298@qq.com
 * @date 2018-05-18
 */
public class TableTest {

  /**
   *
   */
  @Test
  public void testTable() {
    Table table = new Table.Builder().
            columns(new String[]{"班级名称", "学籍号", "学生姓名", "学生性别"}).
            cells(new String[][]{
                    {"软件1班", "123", "李明", "女"},
                    {"软件2", "13533", "王3名", "男"},
                    {"软件3", "212", "刘文翰", "女"},
                    {"软件3", "212", "刘文翰", "女"},
                    {"软件3", "212", "刘文翰", "女"},
                    {"软件3", "212", "刘文翰", "女"},
                    {"软件3", "212", "刘文翰", "女"},
                    {"软件3", "212", "刘文翰", "女"},
                    {"软件3", "212", "刘文翰", "女"},
                    {"软件3", "212", "刘文翰", "女"},
                    {"软件3", "212", "刘文翰", "女"},
                    {"软件3", "212", "刘文翰", "女"},
                    {"软件3", "212", "刘文翰", "女"},
                    {"软件3", "212", "刘文翰", "女"},
                    {"软件3", "212", "刘文翰", "女"},
                    {"软件3", "212", "刘文翰", "女"},
                    {"软件3", "212", "刘文翰", "女"},
                    {"软件3", "212", "刘文翰", "女"},
                    {"软件3", "212", "刘文翰", "女"},
                    {"软件3", "212", "刘文翰", "女"},
                    {"软件3", "212", "刘文翰", "女"},
                    {"软件3", "212", "刘文翰", "女"},
                    {"软件3", "212", "刘文翰", "女"},
                    {"软件3", "212", "刘文翰", "女"},
                    {"软件3", "212", "刘文翰", "女"}
            }).columnLength(10).build();
    System.out.println(table);
  }
}
