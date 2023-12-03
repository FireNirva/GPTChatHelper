package com.gptchathelper;

import com.gptchathelper.service.ChathistoryImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GptChatHelperApplicationTests {

	@Autowired
    ChathistoryImpl chathistoryService;

	@Test
	void contextLoads() {
		chathistoryService.insertChathistory("1", "2", "3", "4");
	}

    @Test
    void deletehistoryById() {
		chathistoryService.deleteChathistoryByID("1");
	}

	@Test
	void deleteAllChathistory() {
		chathistoryService.deleteAllChathistory();
	}

	@Test
	void findLatestMessage() {
		System.out.println(chathistoryService.getLatestMessageContent());
	}

}
