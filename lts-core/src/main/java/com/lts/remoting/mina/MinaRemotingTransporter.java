package com.lts.remoting.mina;

import com.lts.core.AppContext;
import com.lts.remoting.*;

/**
 * @author Robert HG (254963746@qq.com) on 11/6/15.
 */
public class MinaRemotingTransporter implements RemotingTransporter {
    @Override
    public RemotingServer getRemotingServer(AppContext appContext, RemotingServerConfig remotingServerConfig) {
        return new MinaRemotingServer(remotingServerConfig);
    }

    @Override
    public RemotingClient getRemotingClient(AppContext appContext, RemotingClientConfig remotingClientConfig) {
        return new MinaRemotingClient(remotingClientConfig);
    }
}
