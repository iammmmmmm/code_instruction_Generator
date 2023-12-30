module org.iam.code_instruction_generator {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.iam.code_instruction_generator to javafx.fxml;
    exports org.iam.code_instruction_generator;
}