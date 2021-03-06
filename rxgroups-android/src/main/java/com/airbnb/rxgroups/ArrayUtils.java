/*
 * Copyright (C) 2016 Airbnb, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.airbnb.rxgroups;

/**
 * Methods below took from commons-lang ArrayUtils
 * https://github.com/apache/commons-lang/blob/master/src/main/java/org/apache/commons/lang3/ArrayUtils.java
 */
class ArrayUtils {
  static Integer[] toObject(final int[] array) {
    if (array == null) {
      return null;
    } else if (array.length == 0) {
      return new Integer[0];
    }
    final Integer[] result = new Integer[array.length];
    for (int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }
    return result;
  }

  static Character[] toObject(final char[] array) {
    if (array == null) {
      return null;
    } else if (array.length == 0) {
      return new Character[0];
    }
    final Character[] result = new Character[array.length];
    for (int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }
    return result;
  }

  static Long[] toObject(final long[] array) {
    if (array == null) {
      return null;
    } else if (array.length == 0) {
      return new Long[0];
    }
    final Long[] result = new Long[array.length];
    for (int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }
    return result;
  }

  static Short[] toObject(final short[] array) {
    if (array == null) {
      return null;
    } else if (array.length == 0) {
      return new Short[0];
    }
    final Short[] result = new Short[array.length];
    for (int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }
    return result;
  }

  static Byte[] toObject(final byte[] array) {
    if (array == null) {
      return null;
    } else if (array.length == 0) {
      return new Byte[0];
    }
    final Byte[] result = new Byte[array.length];
    for (int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }
    return result;
  }

  static Boolean[] toObject(final boolean[] array) {
    if (array == null) {
      return null;
    } else if (array.length == 0) {
      return new Boolean[0];
    }
    final Boolean[] result = new Boolean[array.length];
    for (int i = 0; i < array.length; i++) {
      result[i] = (array[i] ? Boolean.TRUE : Boolean.FALSE);
    }
    return result;
  }

  static Double[] toObject(final double[] array) {
    if (array == null) {
      return null;
    } else if (array.length == 0) {
      return new Double[0];
    }
    final Double[] result = new Double[array.length];
    for (int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }
    return result;
  }

  static Float[] toObject(final float[] array) {
    if (array == null) {
      return null;
    } else if (array.length == 0) {
      return new Float[0];
    }
    final Float[] result = new Float[array.length];
    for (int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }
    return result;
  }
}
