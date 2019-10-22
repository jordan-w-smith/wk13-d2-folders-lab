package com.example.filesAndFoldersService;

import com.example.filesAndFoldersService.models.File;
import com.example.filesAndFoldersService.models.Folder;
import com.example.filesAndFoldersService.models.User;
import com.example.filesAndFoldersService.repositories.FileRepository;
import com.example.filesAndFoldersService.repositories.FolderRepository;
import com.example.filesAndFoldersService.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class FilesAndFoldersServiceApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void addFile() {
		File file = new File("File1", "txt", 50);
		fileRepository.save(file);
	}

	@Test
	public void addFolder() {
		Folder folder = new Folder("Folder1");
		folderRepository.save(folder);
	}

	@Test
	public void addFileToFolder() {

		File file = new File("File1", "txt", 50);
		fileRepository.save(file);
		Folder folder = new Folder("Folder1");
		folderRepository.save(folder);
		folder.addFileToFolder(file);
		folderRepository.save(folder);
	}

	@Test
	public void addUser() {
		User user = new User("steve");
		userRepository.save(user);
	}
}
