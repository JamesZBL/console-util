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
 * 单元格长度超出预定值异常
 *
 * @author JamesZBL
 * @email 1146556298@qq.com
 * @date 2018-05-17
 */
public class CellLengthOutofRangeException extends Exception {

  public CellLengthOutofRangeException() {
  }

  public CellLengthOutofRangeException(String message) {
    super(message);
  }

  public CellLengthOutofRangeException(String message, Throwable cause) {
    super(message, cause);
  }

  public CellLengthOutofRangeException(Throwable cause) {
    super(cause);
  }

  public CellLengthOutofRangeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
