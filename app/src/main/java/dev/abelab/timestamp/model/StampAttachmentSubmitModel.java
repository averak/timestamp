package dev.abelab.timestamp.model;

import javax.validation.constraints.NotNull;

import lombok.*;

/**
 * スタンプの添付ファイルの提出モデル
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StampAttachmentSubmitModel {

    /**
     * ファイル名
     */
    @NotNull
    String name;

    /**
     * ファイル内容 (Base64)
     */
    @NotNull
    String content;

}
