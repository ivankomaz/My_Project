package ru.cft.myProject;

public class Triangle extends GeometricFigure {
    public double lengthA;
    public double lengthB;
    public double lengthC;

    public Triangle() {
        this.name = "Треугольник";
    }

    @Override
    protected double getPerimeter() {
        return lengthA + lengthB + lengthC;
    }

    @Override
    protected double getSquare() {
        double p = this.getPerimeter() / 2;

        return Math.sqrt(p * (p - this.lengthA) * (p - this.lengthB) * (this.lengthC));
    }

    @Override
    public void applyParameters(String parameters) {
        String[] sidesLength = parameters.split(" ");
        try {
            this.lengthA = Double.parseDouble(sidesLength[0]);
            this.lengthB = Double.parseDouble(sidesLength[1]);
            this.lengthC = Double.parseDouble(sidesLength[2]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getSpecificDescription() {
        StringBuilder figureDescription = new StringBuilder();

        figureDescription.append("Сторона А: ");
        figureDescription.append(this.lengthA);
        figureDescription.append("\n");

        figureDescription.append("Сторона Б: ");
        figureDescription.append(this.lengthB);
        figureDescription.append("\n");

        figureDescription.append("Сторона С: ");
        figureDescription.append(this.lengthC);
        figureDescription.append("\n");

        return figureDescription.toString();
    }
}
