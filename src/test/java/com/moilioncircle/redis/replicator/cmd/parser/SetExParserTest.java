/*
 * Copyright 2016-2017 Leon Chen
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

package com.moilioncircle.redis.replicator.cmd.parser;

import com.moilioncircle.redis.replicator.cmd.impl.SetExCommand;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Leon Chen
 * @since 2.1.0
 */
public class SetExParserTest extends AbstractParserTest {
    @Test
    public void parse() throws Exception {
        SetExParser parser = new SetExParser();
        SetExCommand cmd = parser.parse(toObjectArray("setex key 100 value".split(" ")));
        assertEquals("key", cmd.getKey());
        assertEquals(100, cmd.getEx());
        assertEquals("value", cmd.getValue());
        System.out.println(cmd);
    }

}