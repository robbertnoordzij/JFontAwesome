package nl.robbertnoordzij.JFontAwesome;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.Icon;

public class FAIcon implements Icon {

	private FA icon;
	
	private Font font = FA.TTF.deriveFont(14f);
	
	private Color color;
	
	private FontMetrics fontMetrics;

	public FAIcon(FA icon, Color color) {
		this.icon = icon;
		this.color = color;
	}
	
	public FAIcon(FA icon) {
		this(icon, null);
	}
	
	/**
	 * Give the icon a different color
	 * @param color of the icon
	 */
	public void setIconColor(Color color) {
		this.color = color;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Font resetFont = g.getFont();
		
		if (color != null) {
			// Color does not needed to be reset
			g.setColor(color);
		}
		
		g.setFont(font);
		g.drawString(icon.toString(), x, y + getFontMetrics().getHeight());
		
		g.setFont(resetFont);
	}

	@Override
	public int getIconWidth() {
		return getFontMetrics().stringWidth(icon.toString());
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