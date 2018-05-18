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
 * 单元格美化器
 *
 * @author JamesZBL
 * @email 1146556298@qq.com
 * @date 2018-05-17
 */
public class CellFormatter implements Formatter<String> {

  /**
   * 最大长度
   */
  private final int maxLength;

  public CellFormatter(int maxLength) {
    this.maxLength = maxLength;
  }

  @Override
  public String format(String raw) throws CellLengthOutofRangeException {

    //    转换为字符数组
    char[] chars = raw.toCharArray();
    //    字符串总长度
    int length = chars.length;

    if (maxLength < length)
      throw new CellLengthOutofRangeException("字符串长度超出预定值了！");

    // 判断是否为汉字
    for (char c : chars) {
      if (c > Byte.MAX_VALUE)
        length++;
    }

    //    计算空格数量
    int space = maxLength - length;

    StringBuilder builder = new StringBuilder();
    builder.append(raw);

    while (space-- > 0) {
      builder.append(" ");
    }

    return builder.toString();
  }

}
