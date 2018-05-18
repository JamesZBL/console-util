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
 * @author JamesZBL
 * @email 1146556298@qq.com
 * @date 2018-05-17
 */
public interface Formatter<T> {

  /**
   * 对内容进行格式化
   *
   * @param raw 原始对象
   *
   * @return 格式化后对象
   */
  T format(T raw) throws CellLengthOutofRangeException;
}
