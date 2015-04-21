package org.owntracks.android.db;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import org.owntracks.android.db.ContactLink;
import org.owntracks.android.db.Waypoint;

import org.owntracks.android.db.ContactLinkDao;
import org.owntracks.android.db.WaypointDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig contactLinkDaoConfig;
    private final DaoConfig waypointDaoConfig;

    private final ContactLinkDao contactLinkDao;
    private final WaypointDao waypointDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        contactLinkDaoConfig = daoConfigMap.get(ContactLinkDao.class).clone();
        contactLinkDaoConfig.initIdentityScope(type);

        waypointDaoConfig = daoConfigMap.get(WaypointDao.class).clone();
        waypointDaoConfig.initIdentityScope(type);

        contactLinkDao = new ContactLinkDao(contactLinkDaoConfig, this);
        waypointDao = new WaypointDao(waypointDaoConfig, this);

        registerDao(ContactLink.class, contactLinkDao);
        registerDao(Waypoint.class, waypointDao);
    }
    
    public void clear() {
        contactLinkDaoConfig.getIdentityScope().clear();
        waypointDaoConfig.getIdentityScope().clear();
    }

    public ContactLinkDao getContactLinkDao() {
        return contactLinkDao;
    }

    public WaypointDao getWaypointDao() {
        return waypointDao;
    }

}
