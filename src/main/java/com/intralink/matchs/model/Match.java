package com.intralink.matchs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "intraLink",
        name = "matching")
public class Match {

    @Id
    @Column("id_usr")
    private long idUsr;

    @Column("id_mail")
    private String idMail;

    private String likes;

    private String dislikes;

}
