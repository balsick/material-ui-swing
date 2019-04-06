package mdlaf.components.button;

import mdlaf.animation.MaterialUIMovement;
import mdlaf.utils.MaterialDrawingUtils;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;

/**
 * @contributor https://github.com/vincenzopalazzo
 */

public class MaterialButtonUI extends BasicButtonUI {

	public static ComponentUI createUI(final JComponent c) {
		return new MaterialButtonUI();
	}

	@Override
	public void installUI(JComponent c) {
		super.installUI(c);

		AbstractButton button = (AbstractButton) c;
		button.setOpaque(UIManager.getBoolean("Button.opaque"));
		button.setBorder(UIManager.getBorder("Button.border"));
		button.setBackground(UIManager.getColor("Button.background"));
		button.setForeground(UIManager.getColor("Button.foreground"));
		button.setFont(UIManager.getFont("Button.font"));
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.addMouseListener(MaterialUIMovement.getMovement(button, UIManager.getColor("Button.mouseHoverColor")));
	}

	@Override
	public void paint(Graphics g, JComponent c) {
		AbstractButton b = (AbstractButton) c;
		g = MaterialDrawingUtils.getAliasedGraphics(g);
		if (b.isContentAreaFilled()) {
			paintBackground(MaterialDrawingUtils.getAliasedGraphics(g), b);
		}
		super.paint(MaterialDrawingUtils.getAliasedGraphics(g), c);
	}
    //Fix to #73 border were pixeled, fixde by https://github.com/vincenzopalazzo
	private void paintBackground(Graphics g, JComponent c) {
		//g.setColor(c.getBackground());
		//g.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), 7, 7);
		Graphics2D graphics2D = (Graphics2D) g;
		graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g = graphics2D;
		g.setColor(c.getBackground());
		g.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), 7, 7);
	}

	@Override
	protected void paintButtonPressed(Graphics g, AbstractButton b) {
		super.paintButtonPressed(g, b);
	}

	@Override
	public void update(Graphics g, JComponent c) {
		super.update(g, c);
		c.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}


}