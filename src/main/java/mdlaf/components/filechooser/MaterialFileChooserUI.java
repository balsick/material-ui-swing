package mdlaf.components.filechooser;

import mdlaf.utils.MaterialDrawingUtils;
import mdlaf.utils.MaterialImages;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.metal.MetalFileChooserUI;
import java.awt.*;

public class MaterialFileChooserUI extends MetalFileChooserUI {

    public MaterialFileChooserUI(JFileChooser fileChooser) {
        super(fileChooser);
    }

    public static ComponentUI createUI(JComponent c) {
        return new MaterialFileChooserUI((JFileChooser) c);
    }

    @Override
    public void installUI(JComponent c) {
        super.installUI(c);
        JFileChooser fileChooser = (JFileChooser) c;
        MaterialFileChooserUI ui = (MaterialFileChooserUI) fileChooser.getUI();

        ui.uninstallIcons(fileChooser);
        ui.uninstallComponents(fileChooser);
        ui.clearIconCache();

        ui.computerIcon = getComputerIcon();
        ui.directoryIcon = getDirectoryIcon();
        ui.fileIcon = getFileIcon();
        ui.floppyDriveIcon = getFloppyDriveIcon();
        ui.hardDriveIcon = getHardDriveIcon();

        ui.homeFolderIcon = getHomeFolderIcon();
        ui.listViewIcon = getListViewIcon();
        ui.detailsViewIcon = getDetailsViewIcon();
        ui.newFolderIcon = getNewFolderIcon();
        ui.upFolderIcon = getUpFolderIcon();

        ui.openButtonText = "OPEN";
        ui.cancelButtonText = "CANCEL";
        ui.helpButtonText = "HELP";
        ui.saveButtonText = "SAVE";
        ui.directoryOpenButtonText = "OPEN";
        ui.updateButtonText = "UPDATE";

        ui.installComponents(fileChooser);
    }

    protected ImageIcon getUpFolderIcon() {
        return new ImageIcon(MaterialImages.BACK_ARROW);
    }

    protected ImageIcon getNewFolderIcon() {
        return new ImageIcon(MaterialImages.NEW_FOLDER);
    }

    protected ImageIcon getDetailsViewIcon() {
        return new ImageIcon(MaterialImages.DETAILS);
    }

    protected ImageIcon getListViewIcon() {
        return new ImageIcon(MaterialImages.LIST);
    }

    protected ImageIcon getHomeFolderIcon() {
        return new ImageIcon(MaterialImages.HOME);
    }

    protected ImageIcon getHardDriveIcon() {
        return new ImageIcon(MaterialImages.HARD_DRIVE);
    }

    protected ImageIcon getFloppyDriveIcon() {
        return new ImageIcon(MaterialImages.FLOPPY_DRIVE);
    }

    protected ImageIcon getFileIcon() {
        return new ImageIcon(MaterialImages.FILE);
    }

    protected ImageIcon getDirectoryIcon() {
        return new ImageIcon(MaterialImages.FOLDER);
    }

    protected ImageIcon getComputerIcon() {
        return new ImageIcon(MaterialImages.COMPUTER);
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        super.paint(MaterialDrawingUtils.getAliasedGraphics(g), c);
    }
}
