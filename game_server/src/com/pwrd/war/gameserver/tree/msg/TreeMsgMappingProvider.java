package com.pwrd.war.gameserver.tree.msg;

import java.util.HashMap;
import java.util.Map;

import com.pwrd.war.core.msg.MessageType;
import com.pwrd.war.common.MessageMappingProvider;

/**
 *  Generated by MessageCodeGenerator,don't modify please.
 *  Need to register in<code>GameMessageRecognizer#init</code>
 */
public class TreeMsgMappingProvider implements MessageMappingProvider {

	@Override
	public Map<Short, Class<?>> getMessageMapping() {
		Map<Short, Class<?>> map = new HashMap<Short, Class<?>>();
		map.put(MessageType.CG_TREE_INFO, CGTreeInfo.class);
		map.put(MessageType.CG_TREE_SHAKE, CGTreeShake.class);
		map.put(MessageType.CG_TREE_SHAKE_BATCH, CGTreeShakeBatch.class);
		map.put(MessageType.CG_WATER_INFO, CGWaterInfo.class);
		map.put(MessageType.CG_WATER_MYSELF, CGWaterMyself.class);
		map.put(MessageType.CG_WATER_FRIEND, CGWaterFriend.class);
		map.put(MessageType.CG_GET_FRUIT, CGGetFruit.class);
		map.put(MessageType.CG_GET_WATER_RECORD, CGGetWaterRecord.class);
		map.put(MessageType.CG_WATER_FRIEND_BATCH, CGWaterFriendBatch.class);
		map.put(MessageType.CG_FRIEND_WATER_INFO, CGFriendWaterInfo.class);
		map.put(MessageType.CG_GET_FRIEND_WATER_RECORD, CGGetFriendWaterRecord.class);
		return map;
	}

}
