package fr.fms.entities;

import fr.fms.job.IJobImpl;

public abstract class Entities {
	public static Circle c1 = new Circle(20, 30, 50);
	public static Point p = new Point(100, 150);
	public static Circle c2 = new Circle(15, p);
	public static Square s1 = new Square(50, 200, 200);
	public static Square s2 = new Square(65, 200, 50);
	public static Circle c3 = new Circle(30, 300, 300);
	public static IJobImpl job = new IJobImpl();

	public static void init() {
		Entities.job.addShape(0, Entities.c1);
		Entities.job.addShape(1, Entities.c2);
		Entities.job.addShape(2, Entities.c3);
		Entities.job.addShape(3, Entities.s1);
		Entities.job.addShape(4, Entities.s2);
	}
}
