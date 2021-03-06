package com.ice.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.ice.greendao.PersonInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "PERSON_INFO".
*/
public class PersonInfoDao extends AbstractDao<PersonInfo, Long> {

    public static final String TABLENAME = "PERSON_INFO";

    /**
     * Properties of entity PersonInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property QuestionId = new Property(2, String.class, "questionId", false, "QUESTION_ID");
        public final static Property Sex = new Property(3, String.class, "sex", false, "SEX");
        public final static Property Birthday = new Property(4, String.class, "birthday", false, "BIRTHDAY");
        public final static Property Height = new Property(5, String.class, "height", false, "HEIGHT");
        public final static Property Weight = new Property(6, String.class, "weight", false, "WEIGHT");
        public final static Property Provider = new Property(7, String.class, "provider", false, "PROVIDER");
        public final static Property Relation = new Property(8, String.class, "relation", false, "RELATION");
        public final static Property Age = new Property(9, String.class, "age", false, "AGE");
        public final static Property Religion = new Property(10, String.class, "religion", false, "RELIGION");
        public final static Property PersonId = new Property(11, String.class, "personId", false, "PERSON_ID");
        public final static Property Education = new Property(12, String.class, "education", false, "EDUCATION");
        public final static Property Occupation = new Property(13, String.class, "occupation", false, "OCCUPATION");
        public final static Property Marriage = new Property(14, String.class, "marriage", false, "MARRIAGE");
        public final static Property Payment = new Property(15, String.class, "payment", false, "PAYMENT");
        public final static Property Home = new Property(16, String.class, "home", false, "HOME");
        public final static Property Economy = new Property(17, String.class, "economy", false, "ECONOMY");
        public final static Property Oldhelp = new Property(18, String.class, "oldhelp", false, "OLDHELP");
        public final static Property Accident = new Property(19, String.class, "accident", false, "ACCIDENT");
        public final static Property Wish1 = new Property(20, String.class, "wish1", false, "WISH1");
        public final static Property Wish2 = new Property(21, String.class, "wish2", false, "WISH2");
    };


    public PersonInfoDao(DaoConfig config) {
        super(config);
    }
    
    public PersonInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"PERSON_INFO\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"NAME\" TEXT NOT NULL ," + // 1: name
                "\"QUESTION_ID\" TEXT," + // 2: questionId
                "\"SEX\" TEXT," + // 3: sex
                "\"BIRTHDAY\" TEXT," + // 4: birthday
                "\"HEIGHT\" TEXT," + // 5: height
                "\"WEIGHT\" TEXT," + // 6: weight
                "\"PROVIDER\" TEXT," + // 7: provider
                "\"RELATION\" TEXT," + // 8: relation
                "\"AGE\" TEXT," + // 9: age
                "\"RELIGION\" TEXT," + // 10: religion
                "\"PERSON_ID\" TEXT NOT NULL UNIQUE ," + // 11: personId
                "\"EDUCATION\" TEXT," + // 12: education
                "\"OCCUPATION\" TEXT," + // 13: occupation
                "\"MARRIAGE\" TEXT," + // 14: marriage
                "\"PAYMENT\" TEXT," + // 15: payment
                "\"HOME\" TEXT," + // 16: home
                "\"ECONOMY\" TEXT," + // 17: economy
                "\"OLDHELP\" TEXT," + // 18: oldhelp
                "\"ACCIDENT\" TEXT," + // 19: accident
                "\"WISH1\" TEXT," + // 20: wish1
                "\"WISH2\" TEXT);"); // 21: wish2
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"PERSON_INFO\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, PersonInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getName());
 
        String questionId = entity.getQuestionId();
        if (questionId != null) {
            stmt.bindString(3, questionId);
        }
 
        String sex = entity.getSex();
        if (sex != null) {
            stmt.bindString(4, sex);
        }
 
        String birthday = entity.getBirthday();
        if (birthday != null) {
            stmt.bindString(5, birthday);
        }
 
        String height = entity.getHeight();
        if (height != null) {
            stmt.bindString(6, height);
        }
 
        String weight = entity.getWeight();
        if (weight != null) {
            stmt.bindString(7, weight);
        }
 
        String provider = entity.getProvider();
        if (provider != null) {
            stmt.bindString(8, provider);
        }
 
        String relation = entity.getRelation();
        if (relation != null) {
            stmt.bindString(9, relation);
        }
 
        String age = entity.getAge();
        if (age != null) {
            stmt.bindString(10, age);
        }
 
        String religion = entity.getReligion();
        if (religion != null) {
            stmt.bindString(11, religion);
        }
        stmt.bindString(12, entity.getPersonId());
 
        String education = entity.getEducation();
        if (education != null) {
            stmt.bindString(13, education);
        }
 
        String occupation = entity.getOccupation();
        if (occupation != null) {
            stmt.bindString(14, occupation);
        }
 
        String marriage = entity.getMarriage();
        if (marriage != null) {
            stmt.bindString(15, marriage);
        }
 
        String payment = entity.getPayment();
        if (payment != null) {
            stmt.bindString(16, payment);
        }
 
        String home = entity.getHome();
        if (home != null) {
            stmt.bindString(17, home);
        }
 
        String economy = entity.getEconomy();
        if (economy != null) {
            stmt.bindString(18, economy);
        }
 
        String oldhelp = entity.getOldhelp();
        if (oldhelp != null) {
            stmt.bindString(19, oldhelp);
        }
 
        String accident = entity.getAccident();
        if (accident != null) {
            stmt.bindString(20, accident);
        }
 
        String wish1 = entity.getWish1();
        if (wish1 != null) {
            stmt.bindString(21, wish1);
        }
 
        String wish2 = entity.getWish2();
        if (wish2 != null) {
            stmt.bindString(22, wish2);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public PersonInfo readEntity(Cursor cursor, int offset) {
        PersonInfo entity = new PersonInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // questionId
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // sex
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // birthday
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // height
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // weight
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // provider
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // relation
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // age
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // religion
            cursor.getString(offset + 11), // personId
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // education
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // occupation
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // marriage
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // payment
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // home
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // economy
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // oldhelp
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // accident
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // wish1
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21) // wish2
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, PersonInfo entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.getString(offset + 1));
        entity.setQuestionId(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setSex(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setBirthday(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setHeight(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setWeight(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setProvider(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setRelation(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setAge(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setReligion(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setPersonId(cursor.getString(offset + 11));
        entity.setEducation(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setOccupation(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setMarriage(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setPayment(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setHome(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setEconomy(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setOldhelp(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setAccident(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setWish1(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setWish2(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(PersonInfo entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(PersonInfo entity) {
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
