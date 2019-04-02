package com.test.changelogs

import com.github.mongobee.changeset.ChangeLog
import com.github.mongobee.changeset.ChangeSet
import com.mongodb.BasicDBObject
import com.mongodb.DB
import com.mongodb.DBCollection

@ChangeLog
class DbChangeLog {

    @ChangeSet(order = "001", id = "appId", author = "testAuthor")
    fun addCity(db: DB) {
        val applicationEvent: DBCollection = db.getCollection("application_event")
        val dbObject = BasicDBObject().append("city", "mumbai")
        applicationEvent.insert(dbObject)
    }
}