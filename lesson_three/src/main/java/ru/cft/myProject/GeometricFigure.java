package ru.cft.myProject;

public abstract class GeometricFigure implements SelfDescribable {
    protected static String name;

    protected abstract double getPerimeter();

    protected abstract double getSquare();

    protected abstract String getSpecificDescription();

    public void applyParameters(String parameters){

    };

    public String getFigureDescription() {
        StringBuilder figureDescription = new StringBuilder(GeometricFigure.name);
        figureDescription.append("\n");

        figureDescription.append(this.getSpecificDescription());

        figureDescription.append("Периметр: ");
        figureDescription.append(this.getPerimeter());
        figureDescription.append("\n");

        figureDescription.append("Площадь: ");
        figureDescription.append(this.getSquare());
        figureDescription.append("\n");
        figureDescription.append("\n");
        figureDescription.append("\n");

        return figureDescription.toString();
    }

    ;
}
