package it.balsick.swing.material.dark;

import it.balsick.swing.material.dark.components.filechooser.DarkMaterialFileChooserUI;
import it.balsick.swing.material.dark.utils.DarkMaterialImages;
import mdlaf.MaterialLookAndFeel;
import mdlaf.utils.MaterialBorders;
import mdlaf.utils.MaterialColors;
import mdlaf.utils.MaterialFonts;

import javax.swing.*;
import java.awt.*;

public class DarkMaterialLookAndFeel extends MaterialLookAndFeel {
    private static final String fileChooserUI = DarkMaterialFileChooserUI.class.getCanonicalName();

    @Override
    public String getName() {
        return "Dark Material Look and Feel";
    }

    @Override
    public String getID() {
        return "DarkMaterialLookAndFeel";
    }

    @Override
    public String getDescription() {
        return "A modern dark themed Material Design UI for Java Swing";
    }

    @Override
    protected void initClassDefaults(UIDefaults table) {
        super.initClassDefaults(table);
        table.put("FileChooserUI", fileChooserUI);
    }

    @Override
    protected void initComponentDefaults(UIDefaults table) {
        super.initComponentDefaults(table);

        table.put("Button.highlight", MaterialColors.GRAY_700);
        table.put("Button.opaque", true);
        table.put("Button.border", BorderFactory.createEmptyBorder(7, 17, 7, 17));
        table.put("Button.background", MaterialColors.GRAY_800);
        table.put("Button.foreground", MaterialColors.WHITE);
        table.put("Button.font", MaterialFonts.MEDIUM);
        table.put("Button.mouseHoverColor", MaterialColors.GRAY_400);
        table.put("Button.mouseHoverEnable", true);

        table.put("CheckBox.font", MaterialFonts.REGULAR);
        table.put("CheckBox.background", MaterialColors.GRAY_800);
        table.put("CheckBox.foreground", MaterialColors.WHITE);
        table.put("CheckBox.icon", new ImageIcon(DarkMaterialImages.UNCHECKED_BOX));
        table.put("CheckBox.selectedIcon", new ImageIcon(DarkMaterialImages.CHECKED_BOX));
        table.put("ComboBox.font", MaterialFonts.REGULAR);
        table.put("ComboBox.background", Color.WHITE);
        table.put("ComboBox.foreground", MaterialColors.WHITE);
        table.put("ComboBox.border", BorderFactory
                .createCompoundBorder(DarkMaterialBorders.DARK_LINE_BORDER, BorderFactory.createEmptyBorder(0, 5, 0, 0)));
        table.put("ComboBox.buttonBackground", MaterialColors.GRAY_600);
        table.put("ComboBox.selectionBackground", MaterialColors.GRAY_600);
        table.put("ComboBox.selectionForeground", MaterialColors.BLACK);
        table.put("ComboBox.selectedInDropDownBackground", MaterialColors.GRAY_700);
        table.put("ComboBox.mouseHoverColor", MaterialColors.GRAY_400);
        table.put("ComboBox.mouseHoverEnabled", true);

        table.put("Label.font", MaterialFonts.REGULAR);
        table.put("Label.background", MaterialColors.GRAY_800);
        table.put("Label.foreground", MaterialColors.WHITE);
        table.put("Label.border", BorderFactory.createEmptyBorder());

        table.put("Menu.font", MaterialFonts.BOLD);
        table.put("Menu.border", BorderFactory.createEmptyBorder(5, 5, 5, 5));
        table.put("Menu.background", MaterialColors.GRAY_800);
        table.put("Menu.foreground", MaterialColors.WHITE);
        table.put("Menu.opaque", true);
        table.put("Menu.selectionBackground", MaterialColors.GRAY_700);
        table.put("Menu.selectionForeground", MaterialColors.WHITE);
        table.put("Menu.disabledForeground", new Color(0, 0, 0, 100));
        table.put("Menu.menuPopupOffsetY", 3);
        table.put("Menu[MouseOver].enable", true); //TODO testing
        //TODO refactoinh and using the convensioni Component[Action].ohYeah

        table.put("MenuBar.font", MaterialFonts.BOLD);
        table.put("MenuBar.background", MaterialColors.GRAY_800);
        table.put("MenuBar.border", MaterialBorders.LIGHT_SHADOW_BORDER);
        table.put("MenuBar.foreground", MaterialColors.WHITE);

        table.put("MenuItem.disabledForeground", new Color(0, 0, 0, 100));
        table.put("MenuItem.selectionBackground", MaterialColors.GRAY_700);
        table.put("MenuItem.selectionForeground", MaterialColors.WHITE);
        table.put("MenuItem.font", MaterialFonts.MEDIUM);
        table.put("MenuItem.background", MaterialColors.GRAY_800);
        table.put("MenuItem.foreground", MaterialColors.WHITE);
        table.put("MenuItem.border", BorderFactory.createEmptyBorder(5, 0, 5, 0));

        table.put("OptionPane.background", MaterialColors.GRAY_800);
        table.put("OptionPane.foreground", MaterialColors.WHITE);
        table.put("OptionPane.messageForeground", MaterialColors.WHITE);
        table.put("OptionPane.border", MaterialBorders.DEFAULT_SHADOW_BORDER);
        table.put("OptionPane.font", MaterialFonts.REGULAR);

        table.put("Panel.font", MaterialFonts.REGULAR);
        table.put("Panel.background", MaterialColors.GRAY_850);
        table.put("Panel.border", BorderFactory.createEmptyBorder());

        table.put("PopupMenu.border", DarkMaterialBorders.DARK_LINE_BORDER);
        table.put("PopupMenu.background", MaterialColors.GRAY_800);
        table.put("PopupMenu.foreground", MaterialColors.WHITE);

        table.put("RadioButton.font", MaterialFonts.REGULAR);
        table.put("RadioButton.background", MaterialColors.GRAY_800);
        table.put("RadioButton.foreground", MaterialColors.WHITE);
        table.put("RadioButton.icon", new ImageIcon(DarkMaterialImages.RADIO_BUTTON_OFF));
        table.put("RadioButton.selectedIcon", new ImageIcon(DarkMaterialImages.RADIO_BUTTON_ON));

        table.put("Spinner.font", MaterialFonts.REGULAR);
        table.put("Spinner.background", MaterialColors.GRAY_800);
        table.put("Spinner.foreground", MaterialColors.WHITE);
        table.put("Spinner.border", DarkMaterialBorders.DARK_LINE_BORDER);
        table.put("Spinner.arrowButtonBackground", MaterialColors.GRAY_700);
        table.put("Spinner.arrowButtonBorder", BorderFactory.createEmptyBorder());
        table.put("Spinner.mouseHoverEnabled", true);
        table.put("Spinner.mouseHoverColor", MaterialColors.GRAY_400);

        table.put("ScrollBar.font", MaterialFonts.REGULAR);
        table.put("ScrollBar.track", MaterialColors.GRAY_700);
        table.put("ScrollBar.thumb", MaterialColors.GRAY_600);
        table.put("ScrollBar.thumbDarkShadow", MaterialColors.GRAY_600);
        table.put("ScrollBar.thumbHighlight", MaterialColors.GRAY_600);
        table.put("ScrollBar.thumbShadow", MaterialColors.GRAY_600);
        table.put("ScrollBar.arrowButtonBackground", MaterialColors.GRAY_600);
        table.put("ScrollBar.arrowButtonBorder", DarkMaterialBorders.DARK_LINE_BORDER);
        table.put("ScrollBar[MouseHover].enable", true);
        table.put("ScrollBar[MouseHover].color", MaterialColors.GRAY_400);

        table.put("ScrollPane.background", MaterialColors.GRAY_800);
        table.put("ScrollPane.border", BorderFactory.createEmptyBorder());
        table.put("ScrollPane.font", MaterialFonts.REGULAR);

        table.put("Slider.font", MaterialFonts.REGULAR);
        table.put("Slider.background", MaterialColors.GRAY_800);
        table.put("Slider.foreground", MaterialColors.LIGHT_BLUE_600);
        table.put("Slider.trackColor", Color.BLACK);
        table.put("Slider.border", BorderFactory
                .createCompoundBorder(DarkMaterialBorders.DARK_LINE_BORDER, BorderFactory.createEmptyBorder(20, 20, 20, 20)));

        table.put("SplitPane.border", BorderFactory.createEmptyBorder());
        table.put("SplitPane.background", MaterialColors.GRAY_800);
        table.put("SplitPane.dividerSize", 5);
        table.put("SplitPaneDivider.border", BorderFactory.createEmptyBorder());

        table.put("TabbedPane.font", MaterialFonts.REGULAR);
        table.put("TabbedPane.background", MaterialColors.GRAY_800);
        table.put("TabbedPane.foreground", MaterialColors.WHITE);
        table.put("TabbedPane.border", BorderFactory.createEmptyBorder());
        table.put("TabbedPane.shadow", null);
        table.put("TabbedPane.darkShadow", null);
        table.put("TabbedPane.highlight", MaterialColors.GRAY_700);
        table.put("TabbedPane.borderHighlightColor", MaterialColors.GRAY_600);

        table.put("Table.selectionBackground", MaterialColors.GRAY_700);
        table.put("Table.selectionForeground", MaterialColors.WHITE);
        table.put("Table.background", MaterialColors.GRAY_800);
        table.put("Table.foreground", MaterialColors.WHITE);
        table.put("Table.font", MaterialFonts.REGULAR);
        table.put("Table.border", DarkMaterialBorders.DARK_LINE_BORDER);
        table.put("Table.gridColor", new Color(0, 0, 0, 0));
        table.put("Table.showVerticalLines", Boolean.FALSE);

        table.put("TableHeader.background", MaterialColors.GRAY_850);
        table.put("TableHeader.foreground", MaterialColors.WHITE);
        table.put("TableHeader.font", MaterialFonts.BOLD);
        table.put("TableHeader.cellBorder", BorderFactory
                .createCompoundBorder(DarkMaterialBorders.DARK_LINE_BORDER, BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        table.put("TextArea.background", MaterialColors.GRAY_700);
        table.put("TextArea.border", BorderFactory.createEmptyBorder());
        table.put("TextArea.foreground", MaterialColors.WHITE);

        table.put("TextField.inactiveForeground", MaterialColors.GRAY_800);
        table.put("TextField.inactiveBackground", MaterialColors.GRAY_700);
        table.put("TextField.selectionBackground", MaterialColors.LIGHT_BLUE_600);
        table.put("TextField.selectionForeground", MaterialColors.WHITE);
        table.put("TextField.border", BorderFactory.createEmptyBorder(3, 5, 2, 5));

        table.put("ToggleButton.border", BorderFactory.createEmptyBorder());
        table.put("ToggleButton.font", MaterialFonts.REGULAR);
        table.put("ToggleButton.background", MaterialColors.GRAY_800);
        table.put("ToggleButton.foreground", MaterialColors.WHITE);
        table.put("ToggleButton.icon", new ImageIcon(DarkMaterialImages.TOGGLE_BUTTON_OFF));
        table.put("ToggleButton.selectedIcon", new ImageIcon(DarkMaterialImages.TOGGLE_BUTTON_ON));

        table.put("ToolBar.font", MaterialFonts.REGULAR);
        table.put("ToolBar.background", MaterialColors.GRAY_800);
        table.put("ToolBar.foreground", MaterialColors.WHITE);
        table.put("ToolBar.border", MaterialBorders.LIGHT_SHADOW_BORDER);
        table.put("ToolBar.dockingBackground", MaterialColors.LIGHT_GREEN_A100);
        table.put("ToolBar.floatingBackground", MaterialColors.GRAY_700);

        table.put("Tree.font", MaterialFonts.REGULAR);
        table.put("Tree.selectionForeground", MaterialColors.WHITE);
        table.put("Tree.foreground", MaterialColors.WHITE);
        table.put("Tree.selectionBackground", MaterialColors.GRAY_700);
        table.put("Tree.background", MaterialColors.GRAY_800);
        table.put("Tree.closedIcon", new ImageIcon(DarkMaterialImages.RIGHT_ARROW));
        table.put("Tree.openIcon", new ImageIcon(DarkMaterialImages.DOWN_ARROW));
        table.put("Tree.selectionBorderColor", null);

        table.put("RadioButtonMenuItem.foreground", MaterialColors.WHITE);
        table.put("RadioButtonMenuItem.selectionForeground", MaterialColors.WHITE);
        //If it changes the background of the menuitem it must change this too, irrespective of its setting
        table.put("RadioButtonMenuItem.background", UIManager.getColor("MenuItem.background"));
        table.put("RadioButtonMenuItem.selectionBackground", MaterialColors.GRAY_700);
        table.put("RadioButtonMenuItem.border", BorderFactory.createEmptyBorder(5, 5, 5, 5));
        table.put("RadioButtonMenuItem.checkIcon", new ImageIcon(DarkMaterialImages.RADIO_BUTTON_OFF));
        table.put("RadioButtonMenuItem.selectedCheckIcon", new ImageIcon(DarkMaterialImages.RADIO_BUTTON_ON));

        //If it changes the background of the menuitem it must change this too, irrespective of its setting
        table.put("CheckBoxMenuItem.background", UIManager.getColor("MenuItem.background"));
        table.put("CheckBoxMenuItem.selectionBackground", MaterialColors.GRAY_700);
        table.put("CheckBoxMenuItem.foreground", MaterialColors.WHITE);
        table.put("CheckBoxMenuItem.selectionForeground", MaterialColors.WHITE);
        table.put("CheckBoxMenuItem.border", BorderFactory.createEmptyBorder(5, 5, 5, 5));
        table.put("CheckBoxMenuItem.checkIcon", new ImageIcon(DarkMaterialImages.UNCHECKED_BOX));
        table.put("CheckBoxMenuItem.selectedCheckIcon", new ImageIcon(DarkMaterialImages.CHECKED_BOX));

        table.put("TextPane.border", DarkMaterialBorders.DARK_LINE_BORDER);
        table.put("TextPane.background", MaterialColors.GRAY_50);
        table.put("TextPane.selectionBackground", MaterialColors.LIGHT_BLUE_200);
        table.put("TextPane.inactiveForeground", MaterialColors.GRAY_500);
        table.put("TextPane.font", MaterialFonts.REGULAR);

        table.put("EditorPane.border", DarkMaterialBorders.DARK_LINE_BORDER);
        table.put("EditorPane.background", MaterialColors.GRAY_50);
        table.put("EditorPane.selectionBackground", MaterialColors.LIGHT_BLUE_200);
        table.put("EditorPane.inactiveForeground", MaterialColors.GRAY_500);
        table.put("EditorPane.font", MaterialFonts.REGULAR);

        table.put("Separator.background", MaterialColors.GRAY_600);
        table.put("Separator.foreground", MaterialColors.GRAY_600);

        table.put("ToolTip.background", MaterialColors.GRAY_500);
        table.put("ToolTip.foreground", MaterialColors.GRAY_50);
        table.put("ToolTip.border", BorderFactory.createEmptyBorder(5, 5, 5, 5));

        table.put("ColorChooser.background ", MaterialColors.WHITE);
        table.put("ColorChooser.foreground ", MaterialColors.BLACK);

        table.put("TitledBorder.font", MaterialFonts.REGULAR);

        table.put("TaskPane.font", MaterialFonts.MEDIUM);
        table.put("TaskPane.titleBackgroundGradientStart", MaterialColors.GRAY_600);
        table.put("TaskPane.titleBackgroundGradientEnd", MaterialColors.GRAY_500);
        table.put("TaskPane.titleOver", MaterialColors.LIGHT_BLUE_500);
        table.put("TaskPane.specialTitleOver", MaterialColors.LIGHT_BLUE_500);
        table.put("TaskPane.background", MaterialColors.LIGHT_BLUE_500);
        table.put("TaskPane.foreground", MaterialColors.BLACK);
        table.put("TaskPane.borderColor", MaterialColors.LIGHT_BLUE_500);
        table.put("TaskPane.border", MaterialBorders.DEFAULT_SHADOW_BORDER);
        table.put("TaskPane.contentBackground", MaterialColors.GRAY_50);
        table.put("TaskPane.yesCollassed", new ImageIcon(DarkMaterialImages.YES_COLLAPSED));
        table.put("TaskPane.noCollassed", new ImageIcon(DarkMaterialImages.NO_COLLAPSED));

        table.put("OptionPaneUI.warningIcon", new ImageIcon(DarkMaterialImages.WARNING));
        table.put("OptionPaneUI.errorIcon", new ImageIcon(DarkMaterialImages.ERROR));
        table.put("OptionPaneUI.questionIcon", new ImageIcon(DarkMaterialImages.QUESTION));
        table.put("OptionPaneUI.informationIcon", new ImageIcon(DarkMaterialImages.INFORMATION));

        table.put("FormattedTextField.inactiveForeground", MaterialColors.GRAY_800);
        table.put("FormattedTextField.inactiveBackground", MaterialColors.GRAY_700);
        table.put("FormattedTextField.selectionBackground", MaterialColors.LIGHT_BLUE_600);
        table.put("FormattedTextField.selectionForeground", MaterialColors.WHITE);
        table.put("FormattedTextField.border", BorderFactory.createEmptyBorder(3, 5, 2, 5));

        table.put("Viewport.background", MaterialColors.GRAY_800);

        initCustomComponentsDefaults(table);
    }
}
