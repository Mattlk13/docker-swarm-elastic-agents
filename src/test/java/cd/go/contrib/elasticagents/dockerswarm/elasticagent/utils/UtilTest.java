/*
 * Copyright 2016 ThoughtWorks, Inc.
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

package cd.go.contrib.elasticagents.dockerswarm.elasticagent.utils;


import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;

public class UtilTest {

    @Test
    public void shouldSplitIntoLinesAndTrimSpaces() {
        Collection<String> strings = Util.splitIntoLinesAndTrimSpaces("FOO=BAR\n" +
                "  X=Y\n" +
                "\n" +
                "  A=B\r\n" +
                "\n" +
                "W=1");

        assertThat(strings.size(), is(4));
        assertThat(strings, hasItems("FOO=BAR", "X=Y", "A=B", "W=1"));
    }
}
