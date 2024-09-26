/**
 * Programme permettant l'affichage de plusieurs formes géométriques
 * 
 * @author El babili - 2023
 * 
 */
package fr.fms.graphic;

import fr.fms.entities.*;
import fr.fms.job.*;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;

public class Graphic extends JFrame {
	private static final long serialVersionUID = 1L;
	public static Circle c1 = new Circle(20, 30, 50);
	public static Point p = new Point(100, 150);
	public static Circle c2 = new Circle(15, p);
	public static Square s1 = new Square(50, 200, 200);
	public static Square s2 = new Square(65, 200, 50);
	public static Circle c3 = new Circle(30, 300, 300);
	public static IJobImpl job = new IJobImpl();

	public Graphic() {
		super("Voici nos formes géométriques !");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	@Override // le repère commence en haut à gauche (0,0)
	public void paint(Graphics g) {
		super.paint(g);
		
		job.addShape(0, c1);
		job.addShape(1, c2);
		job.addShape(2, c3);
		job.addShape(3, s1);
		job.addShape(4, s2);
		
		job.drawShapes(g);
		System.out.println("okay");
	}
}
