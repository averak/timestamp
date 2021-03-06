package dev.abelab.timestamp.model;

import lombok.*;

/**
 * スタンプ添付ファイルモデル
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StampAttachmentModel {

    /**
     * 添付ファイルID
     */
    Integer id;

    /**
     * UUID
     */
    String uuid;

    /**
     * ファイル名
     */
    String name;

}
