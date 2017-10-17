/*
 * Copyright 2014-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package io.dts.resourcemanager.struct;

/**
 * @author liushiming
 * @version TxcBranchStatus.java, v 0.0.1 2017年10月17日 下午3:27:06 liushiming
 */
public enum TxcBranchStatus {
  COMMITING(1), ROLLBACKING(2);

  private TxcBranchStatus(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  private int value;
}
