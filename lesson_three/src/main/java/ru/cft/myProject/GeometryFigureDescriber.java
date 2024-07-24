package ru.cft.myProject;

import java.io.BufferedWriter;
import java.io.IOException;

public class GeometryFigureDescriber {

    public String[][] figureParameters;

    public void describe(BufferedWriter writer) throws IOException {
        for (int i = 0; i < figureParameters.length; i++) {
            String figureType = figureParameters[i][0];
            String figureParams = figureParameters[i][1];

            if(figureType == null || figureParams  == null){
                continue;
            }

            SelfDescribable figure = null;
            switch (figureType) {
                case "CIRCLE":
                    figure = new Circle();
                    break;
                case "TRIANGLE":
                    figure = new Triangle();
                    break;
            }
            if(figure != null) {
                figure.applyParameters(figureParams);
                writer.write(figure.getFigureDescription());
            }
        }
        writer.flush();
    }

    public void GeometryFigureDescriptor() {
    }


    public void GeometryFigureDescriptor(String[][] figureParameters) {
        this.figureParameters = figureParameters;
    }
}
