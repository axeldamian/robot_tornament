package com.torneo.robotounament.databasedtos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "robotsetup")
public class DocumentMongo {

    @Id
    private String id;

    private String name;

        public String getId() {
            return this.id;
        }
    
        public void setId(String id) {
            this.id = id;
        }
    
        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }
    
}
