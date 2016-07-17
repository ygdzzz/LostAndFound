package com.example.ygd.lostandfound.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "comments".
*/
public class CommentsDao extends AbstractDao<Comments, Long> {

    public static final String TABLENAME = "comments";

    /**
     * Properties of entity Comments.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property S_id = new Property(1, String.class, "s_id", false, "S_ID");
        public final static Property CDate = new Property(2, String.class, "cDate", false, "C_DATE");
        public final static Property CContent = new Property(3, String.class, "cContent", false, "C_CONTENT");
        public final static Property N_id = new Property(4, String.class, "n_id", false, "N_ID");
        public final static Property CAgree = new Property(5, Integer.class, "cAgree", false, "C_AGREE");
    };


    public CommentsDao(DaoConfig config) {
        super(config);
    }
    
    public CommentsDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"comments\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"S_ID\" TEXT," + // 1: s_id
                "\"C_DATE\" TEXT," + // 2: cDate
                "\"C_CONTENT\" TEXT," + // 3: cContent
                "\"N_ID\" TEXT," + // 4: n_id
                "\"C_AGREE\" INTEGER);"); // 5: cAgree
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"comments\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Comments entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String s_id = entity.getS_id();
        if (s_id != null) {
            stmt.bindString(2, s_id);
        }
 
        String cDate = entity.getCDate();
        if (cDate != null) {
            stmt.bindString(3, cDate);
        }
 
        String cContent = entity.getCContent();
        if (cContent != null) {
            stmt.bindString(4, cContent);
        }
 
        String n_id = entity.getN_id();
        if (n_id != null) {
            stmt.bindString(5, n_id);
        }
 
        Integer cAgree = entity.getCAgree();
        if (cAgree != null) {
            stmt.bindLong(6, cAgree);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Comments readEntity(Cursor cursor, int offset) {
        Comments entity = new Comments( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // s_id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // cDate
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // cContent
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // n_id
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5) // cAgree
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Comments entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setS_id(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCDate(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setCContent(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setN_id(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setCAgree(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Comments entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Comments entity) {
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