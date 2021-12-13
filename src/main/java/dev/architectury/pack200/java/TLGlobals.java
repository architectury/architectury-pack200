/*
 * Copyright (c) 2010, 2012, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package dev.architectury.pack200.java;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

/*
 * @author ksrini
 */

/*
 * This class provides a container to hold the global variables, for packer
 * and unpacker instances. This is typically stashed away in a ThreadLocal,
 * and the storage is destroyed upon completion. Therefore any local
 * references to these members must be eliminated appropriately to prevent a
 * memory leak.
 */
class TLGlobals {
    // Global environment
    final PropMap props;

    // Needed by ConstantPool.java
    private final Map<String, ConstantPool.Utf8Entry> utf8Entries;
    private final Map<String, ConstantPool.ClassEntry> classEntries;
    private final Map<Object, ConstantPool.LiteralEntry> literalEntries;
    private final Map<String, ConstantPool.SignatureEntry> signatureEntries;
    private final Map<String, ConstantPool.DescriptorEntry> descriptorEntries;
    private final Map<String, ConstantPool.MemberEntry> memberEntries;
    private final Map<String, ConstantPool.MethodHandleEntry> methodHandleEntries;
    private final Map<String, ConstantPool.MethodTypeEntry> methodTypeEntries;
    private final Map<String, ConstantPool.InvokeDynamicEntry> invokeDynamicEntries;
    private final Map<String, ConstantPool.BootstrapMethodEntry> bootstrapMethodEntries;

    TLGlobals() {
        utf8Entries = new HashMap<>();
        classEntries = new HashMap<>();
        literalEntries = new HashMap<>();
        signatureEntries = new HashMap<>();
        descriptorEntries = new HashMap<>();
        memberEntries = new HashMap<>();
        methodHandleEntries = new HashMap<>();
        methodTypeEntries = new HashMap<>();
        invokeDynamicEntries = new HashMap<>();
        bootstrapMethodEntries = new HashMap<>();
        props = new PropMap();
    }

    SortedMap<String, String> getPropMap() {
        return props;
    }

    Map<String, ConstantPool.Utf8Entry> getUtf8Entries() {
        return utf8Entries;
    }

    Map<String, ConstantPool.ClassEntry> getClassEntries() {
        return classEntries;
    }

    Map<Object, ConstantPool.LiteralEntry> getLiteralEntries() {
        return literalEntries;
    }

    Map<String, ConstantPool.DescriptorEntry> getDescriptorEntries() {
         return descriptorEntries;
    }

    Map<String, ConstantPool.SignatureEntry> getSignatureEntries() {
        return signatureEntries;
    }

    Map<String, ConstantPool.MemberEntry> getMemberEntries() {
        return memberEntries;
    }

    Map<String, ConstantPool.MethodHandleEntry> getMethodHandleEntries() {
        return methodHandleEntries;
    }

    Map<String, ConstantPool.MethodTypeEntry> getMethodTypeEntries() {
        return methodTypeEntries;
    }

    Map<String, ConstantPool.InvokeDynamicEntry> getInvokeDynamicEntries() {
        return invokeDynamicEntries;
    }

    Map<String, ConstantPool.BootstrapMethodEntry> getBootstrapMethodEntries() {
        return bootstrapMethodEntries;
    }
}
