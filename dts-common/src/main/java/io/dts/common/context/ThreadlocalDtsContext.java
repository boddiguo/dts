package io.dts.common.context;

import com.google.common.collect.Maps;

import java.util.Map;

public class ThreadlocalDtsContext extends DtsContext {

	private static final ThreadLocal<Map<String, String>> LOCAL =
			new InheritableThreadLocal<Map<String, String>>() {

				@Override
				protected Map<String, String> initialValue() {
					return Maps.newHashMap();
				}
			};

	@Override
	public int priority() {
		return 0;
	}

	@Override
	public String getCurrentXid() {
		return LOCAL.get().get(TXC_XID_KEY);
	}

	@Override
	public void bind(String xid) {
		LOCAL.get().put(TXC_XID_KEY, xid);
	}

	@Override
	public void unbind() {
		LOCAL.remove();
	}

	@Override
	public boolean inTxcTransaction() {
		return getCurrentXid() != null;
	}
}
