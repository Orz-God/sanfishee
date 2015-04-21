package org.owntracks.android.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import org.owntracks.android.db.Waypoint;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table WAYPOINT.
*/
public class WaypointDao extends AbstractDao<Waypoint, Long> {

    public static final String TABLENAME = "WAYPOINT";

    /**
     * Properties of entity Waypoint.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "ID");
        public final static Property Description = new Property(1, String.class, "description", false, "DESCRIPTION");
        public final static Property Latitude = new Property(2, Double.class, "latitude", false, "LATITUDE");
        public final static Property Longitude = new Property(3, Double.class, "longitude", false, "LONGITUDE");
        public final static Property Geocoder = new Property(4, String.class, "geocoder", false, "GEOCODER");
        public final static Property Shared = new Property(5, Boolean.class, "shared", false, "SHARED");
        public final static Property Date = new Property(6, java.util.Date.class, "date", false, "DATE");
        public final static Property Radius = new Property(7, Integer.class, "radius", false, "RADIUS");
        public final static Property TransitionType = new Property(8, Integer.class, "transitionType", false, "TRANSITION_TYPE");
        public final static Property GeofenceId = new Property(9, String.class, "geofenceId", false, "GEOFENCE_ID");
    };


    public WaypointDao(DaoConfig config) {
        super(config);
    }
    
    public WaypointDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'WAYPOINT' (" + //
                "'ID' INTEGER PRIMARY KEY ," + // 0: id
                "'DESCRIPTION' TEXT," + // 1: description
                "'LATITUDE' REAL," + // 2: latitude
                "'LONGITUDE' REAL," + // 3: longitude
                "'GEOCODER' TEXT," + // 4: geocoder
                "'SHARED' INTEGER," + // 5: shared
                "'DATE' INTEGER," + // 6: date
                "'RADIUS' INTEGER," + // 7: radius
                "'TRANSITION_TYPE' INTEGER," + // 8: transitionType
                "'GEOFENCE_ID' TEXT);"); // 9: geofenceId
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'WAYPOINT'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Waypoint entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String description = entity.getDescription();
        if (description != null) {
            stmt.bindString(2, description);
        }
 
        Double latitude = entity.getLatitude();
        if (latitude != null) {
            stmt.bindDouble(3, latitude);
        }
 
        Double longitude = entity.getLongitude();
        if (longitude != null) {
            stmt.bindDouble(4, longitude);
        }
 
        String geocoder = entity.getGeocoder();
        if (geocoder != null) {
            stmt.bindString(5, geocoder);
        }
 
        Boolean shared = entity.getShared();
        if (shared != null) {
            stmt.bindLong(6, shared ? 1l: 0l);
        }
 
        java.util.Date date = entity.getDate();
        if (date != null) {
            stmt.bindLong(7, date.getTime());
        }
 
        Integer radius = entity.getRadius();
        if (radius != null) {
            stmt.bindLong(8, radius);
        }
 
        Integer transitionType = entity.getTransitionType();
        if (transitionType != null) {
            stmt.bindLong(9, transitionType);
        }
 
        String geofenceId = entity.getGeofenceId();
        if (geofenceId != null) {
            stmt.bindString(10, geofenceId);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Waypoint readEntity(Cursor cursor, int offset) {
        Waypoint entity = new Waypoint( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // description
            cursor.isNull(offset + 2) ? null : cursor.getDouble(offset + 2), // latitude
            cursor.isNull(offset + 3) ? null : cursor.getDouble(offset + 3), // longitude
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // geocoder
            cursor.isNull(offset + 5) ? null : cursor.getShort(offset + 5) != 0, // shared
            cursor.isNull(offset + 6) ? null : new java.util.Date(cursor.getLong(offset + 6)), // date
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // radius
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // transitionType
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9) // geofenceId
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Waypoint entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setDescription(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setLatitude(cursor.isNull(offset + 2) ? null : cursor.getDouble(offset + 2));
        entity.setLongitude(cursor.isNull(offset + 3) ? null : cursor.getDouble(offset + 3));
        entity.setGeocoder(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setShared(cursor.isNull(offset + 5) ? null : cursor.getShort(offset + 5) != 0);
        entity.setDate(cursor.isNull(offset + 6) ? null : new java.util.Date(cursor.getLong(offset + 6)));
        entity.setRadius(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setTransitionType(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setGeofenceId(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Waypoint entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Waypoint entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
