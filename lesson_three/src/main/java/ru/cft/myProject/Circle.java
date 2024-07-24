package ru.cft.myProject;

import java.util.function.DoubleUnaryOperator;

public class Circle extends GeometricFigure {

     public double radius;

    public Circle() {
        this.name = "Круг";
    }

    @Override
    protected double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    protected double getSquare() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public void applyParameters(String parameters) {
        try{
            this.radius = Double.parseDouble(parameters);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    protected String getSpecificDescription() {
        StringBuilder figureDescription = new StringBuilder();

        figureDescription.append("Радиус: ");
        figureDescription.append(this.radius);
        figureDescription.append("\n");

        figureDescription.append("Диаметр: ");
        figureDescription.append(this.radius * 2);
        figureDescription.append("\n");

        return figureDescription.toString();
    }
}
