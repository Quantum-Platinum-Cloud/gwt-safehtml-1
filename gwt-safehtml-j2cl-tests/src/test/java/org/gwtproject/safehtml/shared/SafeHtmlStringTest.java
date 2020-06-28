/*
 * Copyright © 2019 The GWT Project Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gwtproject.safehtml.shared;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;

import com.google.j2cl.junit.apt.J2clTestInput;
import org.junit.Test;

/** Unit tests for SafeHtmlString. */
@J2clTestInput(SafeHtmlStringTest.class)
public class SafeHtmlStringTest {

  // Test SafeHtmlString.equals()
  @Test
  public void testEquals() {
    SafeHtmlString safe1 = new SafeHtmlString("stringsame");
    SafeHtmlString safe2 = new SafeHtmlString("stringsame");
    SafeHtmlString safe3 = new SafeHtmlString("stringdiff");
    assertEquals(safe1, safe2);
    assertFalse(safe1.equals(safe3));
  }

  // Test SafeHtmlString.hashCode()
  @Test
  public void testHashCode() {
    SafeHtmlString safe1 = new SafeHtmlString("stringsame");
    SafeHtmlString safe3 = new SafeHtmlString("stringdiff");
    SafeHtmlString safe2 = new SafeHtmlString("stringsame");
    assertEquals("stringsame".hashCode(), safe1.hashCode());
    assertEquals(safe1.hashCode(), safe2.hashCode());
    assertEquals("stringdiff".hashCode(), safe3.hashCode());
  }
}
