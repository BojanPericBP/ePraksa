package org.unibl.etf.epraksa.model.entities.json;

import lombok.Data;

@Data
public class OneInputForQuestionnaireJSON {
    private Long id;
    private String pitanje;
    private AnswerToTheQuestionnaireENUM odgovor;
}
