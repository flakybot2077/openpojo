/*
 * Copyright (c) 2010-2016 Osman Shoukry
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.openpojo.reflection.impl.sample.classes;

/**
 * @author oshoukry
 */
public class AClassWithForSetGetSetterGetter {
  private int privateInt;
  private String privateString;

  /**
   * @return the privateInt
   */
  public int getPrivateInt() {
    return privateInt;
  }

  /**
   * @param privateInt
   *     the privateInt to set
   */
  public void setPrivateInt(final int privateInt) {
    this.privateInt = privateInt;
  }

  /**
   * @return the privateString
   */
  public String getPrivateString() {
    return privateString;
  }

  /**
   * @param privateString
   *     the privateString to set
   */
  public void setPrivateString(final String privateString) {
    this.privateString = privateString;
  }
}
