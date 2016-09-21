/* Copyright 2016 Google Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.api.codegen.discovery.transformer;

import com.google.api.codegen.util.Name;
import com.google.api.codegen.util.NameFormatter;
import com.google.api.codegen.util.NameFormatterDelegator;

/**
 * Provides language-specific names for variables and classes.
 */
public class SampleNamer extends NameFormatterDelegator {

  public SampleNamer(NameFormatter nameFormatter) {
    super(nameFormatter);
  }

  /**
   * Returns the class name of the sample.
   */
  public String getSampleClassName(String apiTypeName) {
    return className(Name.upperCamel(apiTypeName, "Example"));
  }

  /**
   * Returns the variable name of the service.
   */
  public String getServiceVarName() {
    return varName(Name.lowerCamel("service"));
  }

  /**
   * Returns the variable name for a field.
   */
  public String getFieldVarName(String fieldName) {
    return varName(Name.lowerCamel(fieldName));
  }

  /**
   * Returns the resource getter method name for a resource field.
   */
  public String getResourceGetterName(String fieldName) {
    return methodName(Name.lowerCamel("get", fieldName));
  }

  /**
   * Returns the variable name of the request.
   */
  public String getRequestVarName() {
    return varName(Name.lowerCamel("request"));
  }

  /**
   * Returns the variable name of the request body.
   */
  public String getRequestBodyVarName() {
    return varName(Name.lowerCamel("requestBody"));
  }

  /**
   * Returns the variable name of the response.
   */
  public String getResponseVarName() {
    return varName(Name.lowerCamel("response"));
  }
}