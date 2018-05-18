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

/**
 * 实现固定列宽的控制台表格
 *
 * @author JamesZBL
 * @email 1146556298@qq.com
 * @date 2018-05-17
 */
public class Table {

  /**
   * 换行符
   */
  private static final String NEWLINE = "\n";

  /**
   * 列名（表头）
   */
  private Object[] columns;

  /**
   * 数据单元格
   */
  private Object[][] cells;

  /**
   * 最大列宽
   */
  private int maxColumnLength;

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    Formatter<String> formatter = new CellFormatter(getMaxColumnLength());
    for (Object name : columns) {
      try {
        builder.append(formatter.format(String.valueOf(name)));
      } catch (CellLengthOutofRangeException e) {
        e.printStackTrace();
      }
    }
    builder.append(NEWLINE);
    for (Object[] row : cells) {
      for (Object cell : row) {
        try {
          builder.append(formatter.format(String.valueOf(cell)));
        } catch (CellLengthOutofRangeException e) {
          e.printStackTrace();
        }
      }
      builder.append(NEWLINE);
    }
    return builder.toString();
  }

  private Table(Object[] columns, Object[][] cells, int maxColumnLength) {
    this.columns = columns;
    this.cells = cells;
    this.maxColumnLength = maxColumnLength;
  }

  public Object[] getColumns() {
    return columns;
  }

  public void setColumns(Object[] columns) {
    this.columns = columns;
  }

  public Object[][] getCells() {
    return cells;
  }

  public void setCells(Object[][] cells) {
    this.cells = cells;
  }

  public int getMaxColumnLength() {
    return maxColumnLength;
  }

  public void setMaxColumnLength(int maxColumnLength) {
    this.maxColumnLength = maxColumnLength;
  }

  public static class Builder {

    /**
     * 列名（表头）
     */
    private Object[] columns;
    /**
     * 数据单元格
     */
    private Object[][] cells;
    /**
     * 最大列宽
     */
    private int maxColumnLength;

    public Builder columns(Object[] columns) {
      setColumns(columns);
      return this;
    }

    public Builder cells(Object[][] cells) {
      setCells(cells);
      return this;
    }

    public Builder columnLength(int maxColumnLength) {
      setMaxColumnLength(maxColumnLength);
      return this;
    }

    public Table build() {
      for (Object[] row : getCells()) {
        if (row.length != getColumns().length)
          throw new IllegalArgumentException("列数和数据列不匹配");
      }
      return new Table(getColumns(), getCells(), getMaxColumnLength());
    }

    Object[] getColumns() {
      return columns;
    }

    void setColumns(Object[] columns) {
      this.columns = columns;
    }

    Object[][] getCells() {
      return cells;
    }

    void setCells(Object[][] cells) {
      this.cells = cells;
    }

    public int getMaxColumnLength() {
      return maxColumnLength;
    }

    public void setMaxColumnLength(int maxColumnLength) {
      this.maxColumnLength = maxColumnLength;
    }
  }
}
