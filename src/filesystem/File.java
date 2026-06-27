package filesystem;

import visitor.FileSystemVisitor;

public class File implements FileSystemEntry {
	
	private String name;
	private int size;

	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void display(int indent) {
		System.out.println("	".repeat(indent) + name + " (" + size + "KB)");
	}

	@Override
	public void accept(FileSystemVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitFile(this);
		
	}
	
	@Override
	public String toString() {
		return "File: " + name;
	}

}
