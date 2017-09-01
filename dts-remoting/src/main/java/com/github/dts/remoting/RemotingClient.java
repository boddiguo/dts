/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.dts.remoting;

import java.util.List;
import java.util.concurrent.ExecutorService;

import com.github.dts.remoting.exception.RemotingConnectException;
import com.github.dts.remoting.exception.RemotingSendRequestException;
import com.github.dts.remoting.exception.RemotingTimeoutException;
import com.github.dts.remoting.exception.RemotingTooMuchRequestException;
import com.github.dts.remoting.netty.NettyRequestProcessor;
import com.github.dts.remoting.protocol.RemotingCommand;

public interface RemotingClient extends RemotingService {

    public void updateNameServerAddressList(final List<String> addrs);

    public List<String> getNameServerAddressList();

    public RemotingCommand invokeSync(final String addr, final RemotingCommand request,
        final long timeoutMillis) throws InterruptedException, RemotingConnectException,
        RemotingSendRequestException, RemotingTimeoutException;

    public void invokeAsync(final String addr, final RemotingCommand request, final long timeoutMillis,
        final InvokeCallback invokeCallback) throws InterruptedException, RemotingConnectException,
        RemotingTooMuchRequestException, RemotingTimeoutException, RemotingSendRequestException;

    public void invokeOneway(final String addr, final RemotingCommand request, final long timeoutMillis)
        throws InterruptedException, RemotingConnectException, RemotingTooMuchRequestException,
        RemotingTimeoutException, RemotingSendRequestException;

    public void registerProcessor(final int requestCode, final NettyRequestProcessor processor,
        final ExecutorService executor);

    public boolean isChannelWriteable(final String addr);
}
