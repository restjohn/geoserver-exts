package org.opengeo.gsr.core.geometry;

/**
 * 
 * @author Juan Marin - OpenGeo
 * 
 */
public class GeometryArray {

    private GeometryType geometryType;

    private Geometry[] geometries;

    private SpatialReference spatialReference;

    public GeometryType getGeometryType() {
        return geometryType;
    }

    public void setGeometryType(GeometryType geometryType) {
        this.geometryType = geometryType;
    }

    public Geometry[] getGeometries() {
        return geometries;
    }

    public void setGeometries(Geometry[] geometries) {
        this.geometries = geometries;
    }

    public SpatialReference getSpatialReference() {
        return spatialReference;
    }

    public void setSpatialReference(SpatialReference spatialReference) {
        this.spatialReference = spatialReference;
    }

    public GeometryArray(GeometryType geometryType, Geometry[] geometries,
            SpatialReference spatialReference) {
        this.geometryType = geometryType;
        this.geometries = geometries;
        this.spatialReference = spatialReference;
    }

    public boolean isValidGeometryTypes() {
        if (this.geometries.length > 0) {
            GeometryType geomType = this.geometries[0].getGeometryType();
            for (int i = 1; i < this.geometries.length; i++) {
                if (!this.geometries[i].getGeometryType().equals(geomType)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}