import { UserModel } from 'src/app/model/user-model';

// スタンプモデル
export interface StampModel {
  id: number;
  title: string;
  description: string;
  userId: number;
  createdAt: Date;
  attachments: StampAttachmentModel[];
}

// スタンプ(+ユーザ)モデル
export interface StampWithUserModel extends StampModel {
  user: UserModel;
}

// スタンプ一覧モデル
export interface StampsModel {
  stamps: StampModel[];
}

// 添付ファイルモデル
export interface StampAttachmentModel {
  id: number;
	stampId: number;
  name: string;
  uuid: string;
}
