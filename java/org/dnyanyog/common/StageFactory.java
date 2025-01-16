
package org.dnyanyog.common;

import javafx.stage.Stage;

public class StageFactory {

    private static Stage stage;

    public static Stage getStage() {
        if (stage == null) {
            System.out.println("!!!!! Stage not created, application closing.");
            System.exit(0);
        }
        return stage;
    }

    public static void setStage(Stage tempStage) {
        stage = tempStage;
    }
}
