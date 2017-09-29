package io.dts.parser.util;

import com.google.common.base.CharMatcher;

/**
 * Created by guoyubo on 2017/9/29.
 */
public class SQLUtil {
  /**
   * 去掉SQL表达式的特殊字符.
   *
   * @param value SQL表达式
   * @return 去掉SQL特殊字符的表达式
   */
  public static String getExactlyValue(final String value) {
    return null == value ? null : CharMatcher.anyOf("[]`'\"").removeFrom(value);
  }
}
