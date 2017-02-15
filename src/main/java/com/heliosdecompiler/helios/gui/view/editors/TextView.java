/*
 * Copyright 2017 Sam Sun <github-contact@samczsun.com>
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

package com.heliosdecompiler.helios.gui.view.editors;

import com.heliosdecompiler.helios.controller.files.OpenedFile;
import javafx.scene.Node;
import javafx.scene.control.TextArea;

import java.nio.charset.StandardCharsets;

public class TextView extends EditorView {
    @Override
    public Node createView(OpenedFile file, String path) {
        TextArea textArea = new TextArea();
        textArea.setText(new String(file.getContent(path), StandardCharsets.UTF_8));
        textArea.setWrapText(true);
        return textArea;
    }

    @Override
    public String getDisplayName() {
        return "Text";
    }
}
