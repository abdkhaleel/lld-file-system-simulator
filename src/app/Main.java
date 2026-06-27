package app;

import java.util.List;

import filesystem.*;
import filter.*;
import visitor.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File("image.jpeg", 500);
		File file2 = new File("lion.jpeg", 1024);
		
		File file3 = new File("cse.pdf", 10000);
		
		Directory images = new Directory("Images");
		Directory documents = new Directory("Documents");
		Directory home = new Directory("home");
		Directory user1 = new Directory("user1");
		Directory user = new Directory("user");
		Directory bin = new Directory("bin");
		Directory root = new Directory("root");
		
		images.add(file1);
		images.add(file2);
		documents.add(file3);
		
		home.add(images);
		home.add(documents);
		
		user1.add(home);
		user.add(user1);
		
		root.add(user);
		File binFile = new File("micro.bin", 100000030);
		bin.add(binFile);
		root.add(bin);
		
		root.display(0);
//		user.display(0);
		SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
		
		images.accept(sizeVisitor);
		bin.accept(sizeVisitor);
		System.out.println("Visited the images and bin\n" + sizeVisitor.getTotalSize() + "KB total size");
		
		SearchVisitor searchVisitor = new SearchVisitor("c");
		root.accept(searchVisitor);
		
		System.out.println("Matches found: " + searchVisitor.getMatches());
		
		
		FileFilterChain filter = new FileFilterChain(2000, "jpeg", false);
		
		CollectEntriesVisitor visitor = new CollectEntriesVisitor();
		
		root.accept(visitor);
		
		List<FileSystemEntry> entries = visitor.getEntries();
		
		List<FileSystemEntry> res = filter.applyFilters(entries);
		
		System.out.println("Found matches: " + res);
	}

}
