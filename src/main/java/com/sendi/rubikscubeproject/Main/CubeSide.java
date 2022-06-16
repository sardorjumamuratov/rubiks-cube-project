package com.sendi.rubikscubeproject.Main;

import java.util.Arrays;

public class CubeSide {
    private Enum[][] schema;
    private String nameOfTheColor;

    public CubeSide(Enum[][] schema, String nameOfTheColor) {
        this.schema = schema;
        this.nameOfTheColor = nameOfTheColor;
    }

    public String getNameOfTheColor() {
        return nameOfTheColor;
    }

    public void setNameOfTheColor(String nameOfTheColor) {
        this.nameOfTheColor = nameOfTheColor;
    }

    public Enum[][] getSchema() {
        return schema;
    }

    public void setSchema(Enum[][] schema) {
        this.schema = schema;
    }

    public void setSchemaRow(Enum[] schemaRow, int row) {
        schema[row] = schemaRow;
    }

    public void setSchemaColum(int column) {

    }

    public void rotateSchemaClockwise() {
        Enum temp = schema[0][0];
        schema[0][0] = schema[0][2];
        schema[0][2] = schema[2][2];
        schema[2][2] = schema[2][0];
        schema[2][0] = temp;

        temp = schema[0][1];
        schema[0][1] = schema[1][2];
        schema[1][2] = schema[2][1];
        schema[2][1] = schema[1][0];
        schema[1][0] = temp;
    }

    public void rotateSchemaCounterClockwise() {
        Enum temp = schema[0][0];
        schema[0][0] = schema[2][0];
        schema[2][0] = schema[2][2];
        schema[2][2] = schema[0][2];
        schema[0][2] = temp;

        temp = schema[0][1];
        schema[0][1] = schema[1][0];
        schema[1][0] = schema[2][1];
        schema[2][1] = schema[1][2];
        schema[1][2] = temp;
    }

    @Override
    public String toString() {
        return "CubeSide{" +
                "schema=" + Arrays.toString(schema) +
                ", nameOfTheColor='" + nameOfTheColor + '\'' +
                '}';
    }
}
