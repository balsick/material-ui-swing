package it.balsick.swing.material.dark.components.filechooser;

import it.balsick.swing.material.dark.utils.DarkMaterialImages;
import mdlaf.components.filechooser.MaterialFileChooserUI;

import javax.swing.*;

public class DarkMaterialFileChooserUI extends MaterialFileChooserUI {
    public DarkMaterialFileChooserUI(JFileChooser fileChooser) {
        super(fileChooser);
    }

    @Override
    protected ImageIcon getUpFolderIcon() {
        return new ImageIcon(DarkMaterialImages.BACK_ARROW);
    }

    @Override
    protected ImageIcon getNewFolderIcon() {
        return new ImageIcon(DarkMaterialImages.NEW_FOLDER);
    }

    @Override
    protected ImageIcon getDetailsViewIcon() {
        return new ImageIcon(DarkMaterialImages.DETAILS);
    }

    @Override
    protected ImageIcon getListViewIcon() {
        return new ImageIcon(DarkMaterialImages.LIST);
    }

    @Override
    protected ImageIcon getHomeFolderIcon() {
        return new ImageIcon(DarkMaterialImages.HOME);
    }

    @Override
    protected ImageIcon getHardDriveIcon() {
        return new ImageIcon(DarkMaterialImages.HARD_DRIVE);
    }

    @Override
    protected ImageIcon getFloppyDriveIcon() {
        return new ImageIcon(DarkMaterialImages.FLOPPY_DRIVE);
    }

    @Override
    protected ImageIcon getFileIcon() {
        return new ImageIcon(DarkMaterialImages.FILE);
    }

    @Override
    protected ImageIcon getDirectoryIcon() {
        return new ImageIcon(DarkMaterialImages.FOLDER);
    }

    @Override
    protected ImageIcon getComputerIcon() {
        return new ImageIcon(DarkMaterialImages.COMPUTER);
    }
}
