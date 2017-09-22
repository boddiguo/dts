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
package io.dts.common.protocol.header;

import io.dts.common.protocol.RequestHeaderMessage;
import io.dts.remoting.exception.RemotingCommandException;

/**
 * @author liushiming
 * @version BranchCommitMessage.java, v 0.0.1 2017年9月1日 下午5:46:22 liushiming
 */
public class BranchCommitMessage implements RequestHeaderMessage {

  private String serverAddr;

  private Long tranId;

  private Long branchId;

  private String clientIp;

  private String appName;

  private String dbName;

  private String retrySql;

  private byte commitMode;

  private String udata;

  public String getServerAddr() {
    return serverAddr;
  }

  public void setServerAddr(String serverAddr) {
    this.serverAddr = serverAddr;
  }

  public Long getTranId() {
    return tranId;
  }

  public void setTranId(Long tranId) {
    this.tranId = tranId;
  }

  public Long getBranchId() {
    return branchId;
  }

  public void setBranchId(Long branchId) {
    this.branchId = branchId;
  }

  public String getClientIp() {
    return clientIp;
  }

  public void setClientIp(String clientIp) {
    this.clientIp = clientIp;
  }

  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public String getDbName() {
    return dbName;
  }

  public void setDbName(String dbName) {
    this.dbName = dbName;
  }

  public String getRetrySql() {
    return retrySql;
  }

  public void setRetrySql(String retrySql) {
    this.retrySql = retrySql;
  }

  public byte getCommitMode() {
    return commitMode;
  }

  public void setCommitMode(byte commitMode) {
    this.commitMode = commitMode;
  }

  public String getUdata() {
    return udata;
  }

  public void setUdata(String udata) {
    this.udata = udata;
  }

  @Override
  public short getTypeCode() {
    return TYPE_BRANCH_COMMIT;
  }

  @Override
  public void checkFields() throws RemotingCommandException {

  }


}
