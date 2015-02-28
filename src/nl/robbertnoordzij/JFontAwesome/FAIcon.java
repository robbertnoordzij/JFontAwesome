package nl.robbertnoordzij.JFontAwesome;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.Icon;

public class FAIcon implements Icon {

	private String icon;
	
	private Font font = FA.TTF.deriveFont(14f);
	
	private FontMetrics fontMetrics;

	public FAIcon(String icon) {
		this.icon = icon;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Font reset = g.getFont();
		
		g.setFont(font);
		g.drawString(icon, x, y + getFontMetrics().getHeight());
		
		g.setFont(reset);
	}

	@Override
	public int getIconWidth() {
		return getFontMetrics().stringWidth(icon);
	}

	@Override
	public int getIconHeight() {
		return getFontMetrics().getHeight() + 4;
	}
	
	/**
	 * Get the font metrics of the current font
	 * @return singleton of font metrics
	 */
	private FontMetrics getFontMetrics() {
		if (fontMetrics == null) {
			Canvas canvas = new Canvas();
			fontMetrics = canvas.getFontMetrics(font);
		}
		
		return fontMetrics;
	}

}
