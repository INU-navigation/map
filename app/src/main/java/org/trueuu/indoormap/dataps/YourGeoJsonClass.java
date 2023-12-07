package org.trueuu.indoormap.dataps;

import java.util.List;
import java.util.Map;

public class YourGeoJsonClass {

    private String type;
    private List<Feature> features;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public static class Feature {
        private String type;
        private Geometry geometry;
        private Properties properties;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Geometry getGeometry() {
            return geometry;
        }

        public void setGeometry(Geometry geometry) {
            this.geometry = geometry;
        }

        public Properties getProperties() {
            return properties;
        }

        public void setProperties(Properties properties) {
            this.properties = properties;
        }
    }

    public static class Properties {
        private String type;
        private String id;
        private Map<String, String> tags;
        private List<String> relations;
        private Meta meta;
        private Own own;
        private String access;
        private String amenity;
        private String area;
        private String atm;
        private String building;
        private String buildingLevels;
        private String door;
        private String entrance;
        private String height;
        private String highway;
        private String indoor;
        private String layer;
        private String leisure;
        private String level;
        private String name;
        private String nameEn;
        private String nameJa;
        private String room;
        private String wheelchair;
        private String width;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Map<String, String> getTags() {
            return tags;
        }

        public void setTags(Map<String, String> tags) {
            this.tags = tags;
        }

        public List<String> getRelations() {
            return relations;
        }

        public void setRelations(List<String> relations) {
            this.relations = relations;
        }

        public Meta getMeta() {
            return meta;
        }

        public void setMeta(Meta meta) {
            this.meta = meta;
        }

        public Own getOwn() {
            return own;
        }

        public void setOwn(Own own) {
            this.own = own;
        }

        public String getAccess() {
            return access;
        }

        public void setAccess(String access) {
            this.access = access;
        }

        public String getAmenity() {
            return amenity;
        }

        public void setAmenity(String amenity) {
            this.amenity = amenity;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getAtm() {
            return atm;
        }

        public void setAtm(String atm) {
            this.atm = atm;
        }

        public String getBuilding() {
            return building;
        }

        public void setBuilding(String building) {
            this.building = building;
        }

        public String getBuildingLevels() {
            return buildingLevels;
        }

        public void setBuildingLevels(String buildingLevels) {
            this.buildingLevels = buildingLevels;
        }

        public String getDoor() {
            return door;
        }

        public void setDoor(String door) {
            this.door = door;
        }

        public String getEntrance() {
            return entrance;
        }

        public void setEntrance(String entrance) {
            this.entrance = entrance;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getHighway() {
            return highway;
        }

        public void setHighway(String highway) {
            this.highway = highway;
        }

        public String getIndoor() {
            return indoor;
        }

        public void setIndoor(String indoor) {
            this.indoor = indoor;
        }

        public String getLayer() {
            return layer;
        }

        public void setLayer(String layer) {
            this.layer = layer;
        }

        public String getLeisure() {
            return leisure;
        }

        public void setLeisure(String leisure) {
            this.leisure = leisure;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNameEn() {
            return nameEn;
        }

        public void setNameEn(String nameEn) {
            this.nameEn = nameEn;
        }

        public String getNameJa() {
            return nameJa;
        }

        public void setNameJa(String nameJa) {
            this.nameJa = nameJa;
        }

        public String getRoom() {
            return room;
        }

        public void setRoom(String room) {
            this.room = room;
        }

        public String getWheelchair() {
            return wheelchair;
        }

        public void setWheelchair(String wheelchair) {
            this.wheelchair = wheelchair;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        // 생략된 부분...
    }

    public static class Geometry {
        private String type;
        private List<List<List<Double>>> coordinates;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<List<List<Double>>> getCoordinates() {
            return coordinates;
        }

        public void setCoordinates(List<List<List<Double>>> coordinates) {
            this.coordinates = coordinates;
        }
    }

    public static class Meta {
        private String timestamp;
        private String version;
        private String changeset;
        private String user;
        private String uid;

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getChangeset() {
            return changeset;
        }

        public void setChangeset(String changeset) {
            this.changeset = changeset;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        // 생략된 부분...
    }

    public static class Own {
        private List<Integer> levels;
        private List<String> nodes;

        public List<Integer> getLevels() {
            return levels;
        }

        public void setLevels(List<Integer> levels) {
            this.levels = levels;
        }

        public List<String> getNodes() {
            return nodes;
        }

        public void setNodes(List<String> nodes) {
            this.nodes = nodes;
        }
    }
}