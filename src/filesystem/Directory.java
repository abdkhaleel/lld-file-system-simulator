package filesystem;

import iterator.*;
import visitor.FileSystemVisitor;

public class Directory implements FileSystemEntry {
	private String name;
	private IterableCollection<FileSystemEntry> children;
	
	
	public Directory(String name) {
		this.name = name;
		children = new FileSystemCollection();
	}
	
	public void add(FileSystemEntry fileSystemEntry) {
		children.add(fileSystemEntry);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getSize() {
		int totalSize = 0;
		Iterator<FileSystemEntry> fs = children.careateIterator();
		while(fs.hasNext()) {
			totalSize += fs.next().getSize();
		}
		return totalSize;
	}

	@Override
	public void display(int indent) {
		// TODO Auto-generated method stub
		System.out.println("	".repeat(indent) + name + "/");
		Iterator<FileSystemEntry> fs = children.careateIterator();
		while(fs.hasNext()) {
			fs.next().display(indent + 1);
		}
	}

	@Override
	public void accept(FileSystemVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitDirectory(this);
		Iterator<FileSystemEntry> it = children.careateIterator();
	    while (it.hasNext()) {
	        it.next().accept(visitor);
	    }
		
	}
	
	@Override
	public String toString() {
		return "Directory: " + name;
	}

}
