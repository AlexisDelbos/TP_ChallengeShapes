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
		Entities.job.drawShapes(g);
		System.out.println("okay");
	}
}
