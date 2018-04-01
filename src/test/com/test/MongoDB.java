package com.test;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.junit.Test;

public class MongoDB {

    @Test
    public void test(){
        MongoClient mongoClient=new MongoClient("127.0.0.1",27017);
        System.out.println("连接成功");

        //连接数据库
        MongoDatabase mongoDatabase=mongoClient.getDatabase("user");

        //查看集合（表）
        MongoCollection<Document> tb_user = mongoDatabase.getCollection("tb_user");

        //添加数据
//        Document document=new Document().append("_id",4).append("name","000").append("age","000");
//        tb_user.insertOne(document);

        //修改
//        Document document=new Document("$set",new Document().append("age","20"));
////        tb_user.updateOne(Filters.eq("_id",4),document);

        //删除
        tb_user.deleteOne(Filters.eq("_id",3));

        FindIterable<Document> documents=tb_user.find();
        for (Document document1 : documents) {
            System.out.println(document1);
        }

    }
}
