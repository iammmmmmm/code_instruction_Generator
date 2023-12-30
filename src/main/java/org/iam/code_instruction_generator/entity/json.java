package org.iam.code_instruction_generator.entity;

import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

import java.util.List;


/**
 * json 模板 entity
 *
 * @author Iammm
 * @Time 2023/12/30 16:26
 */
public class json {
    List<TreeItem<Object>> parameters;

    public List<?> getParameters() {
        return parameters;
    }

}
