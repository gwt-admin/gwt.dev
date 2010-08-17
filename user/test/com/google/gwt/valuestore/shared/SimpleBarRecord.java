/*
 * Copyright 2010 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.valuestore.shared;

import com.google.gwt.requestfactory.shared.DataTransferObject;
import com.google.gwt.valuestore.server.SimpleBar;

/**
 * A simple entity used for testing. Has an int field and date field. Add other data types as their
 * support gets built in.
 */
@DataTransferObject(SimpleBar.class)
public interface SimpleBarRecord extends Record {

  Property<String> userName = new Property<String>("userName", "User Name",
      String.class);

  String getUserName();

}