package org.math.editor;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MainFrame {

    // JFrame用来做主页面框架也可以用来做顶级窗体，要想把控件放在该界面中，必须把控件放在JPanel中，然后再把JPanel放在JFrame中，JPanel作为一个容器使用。

    // Jpanel是一个静态控制组件，可以用来显示一行静态信息，不能接受用户的输入。它必须放在象JFrame这样的顶级窗口上才能输出。

    // JFrame是最底层，JPanel是置于其面上，同一个界面只有一个JFrame，一个JFrame可以放多个JPanel。如果你直接在JFrame上放也可以，但是首先不规范，然后要是过于复杂的界面你准备如何处理这么多控件呢？你可以写个复杂的界面，应该就可以感受到这种区别了，JPanel只是普通页面

    // JPanel可以放在JFrame中，反之不行

    public static final String root_path = "E:\\重新梳理-矩阵\\3 矩阵乘法\\re-sort";

    JFrame mainFrame = new JFrame("main");

    JTable jTable = new JTable(1, 1);

    int totalWidth = 1400;
    int totalHeight = 800;

    public void createAndShowMainPanel() {


        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(new Dimension(totalWidth, totalHeight));
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.setLayout(new FlowLayout(FlowLayout.LEFT));

        mainFrame.add(treePanel(totalWidth / 3, totalHeight - 60));

        mainFrame.add(listPanel(totalWidth * 2 / 3, totalHeight - 60));
    }

    public JPanel listPanel(int width, int height) {
        jTable.setVisible(true);
        jTable.setSize(new Dimension(width, height));
        jTable.setShowVerticalLines(false);
        jTable.setTableHeader(null);

        JScrollPane jScrollPane = new JScrollPane(jTable);
        jScrollPane.setSize(new Dimension(width, height));

        JPanel fileBrowserPanel = new JPanel();
        fileBrowserPanel.setName("fileBrowserFrame");
        fileBrowserPanel.setSize(new Dimension(width, height));
        fileBrowserPanel.add(jScrollPane);
        fileBrowserPanel.setVisible(true);

        return fileBrowserPanel;
    }

    public JPanel treePanel(int width, int height) {
        DefaultMutableTreeNode rootNode = buildFileTree(new File(root_path));
        DefaultTreeModel treeModel = new DefaultTreeModel(rootNode);

        JTree fileBrowserTree = new JTree();
        fileBrowserTree.setEditable(true);
        fileBrowserTree.setModel(treeModel);
        fileBrowserTree.setSize(new Dimension(width, height));
        fileBrowserTree.setVisible(true);
        fileBrowserTree.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int eButton = e.getButton();

                int row = fileBrowserTree.getRowForLocation(e.getX(), e.getY());
                System.out.println(row);

                switch (eButton) {
                    case 1:
                        if (row != -1) {
                            TreePath path = fileBrowserTree.getPathForRow(row);
                            Object[] filePaths = path.getPath();
                            StringBuffer buffer = new StringBuffer(root_path);
                            for (int i=1; i<filePaths.length; i++) {
                                buffer.append(File.separator).append(filePaths[i]);
                            }
                            System.out.println(buffer);

                            File[] files = new File(buffer.toString()).listFiles();

                            Vector<Vector<String>> data = new Vector<>();

                            if (files != null && files.length != 0) {
                                Arrays.sort(files, new FileNameComparator());

                                for (File file : files) {
                                    Vector<String> item = new Vector<>();
                                    item.add(file.getName());
                                    data.add(item);
                                }
                                System.out.println(data);
                            }


                            Vector<String> cname = new Vector<>();
                            cname.add("");

                            DefaultTableModel model = new DefaultTableModel(data, cname);

                            jTable.setModel(model);
                            jTable.repaint();
                            jTable.updateUI();
                        }
                        break;

                    case 3:
                        JPopupMenu jPopupMenu = new JPopupMenu();
                        JMenuItem addMenu = new JMenuItem("add");
                        addMenu.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mousePressed(MouseEvent e) {
                                String str03 = JOptionPane.showInputDialog(null, "请输入所需内容", "这是输入对话框", JOptionPane.QUESTION_MESSAGE);

                                if (!str03.endsWith(".md"))
                                    str03 = str03+".md";
                                
                                System.out.println(str03);

                                if (row == -1) {
                                    return;
                                }

                                TreePath path = fileBrowserTree.getPathForRow(row);
                                Object[] filePaths = path.getPath();
                                StringBuffer buffer = new StringBuffer(root_path);
                                for (int i=1; i<filePaths.length; i++) {
                                    buffer.append(File.separator).append(filePaths[i]);
                                }
                                File[] files = new File(buffer.toString()).getParentFile().listFiles();
                                if (files == null || files.length == 0) {
                                    File newFile = new File(str03, new File(buffer.toString()).getParent());
                                    try {
                                        newFile.createNewFile();
                                    } catch (IOException ex) {
                                        ex.printStackTrace();
                                    }
                                    return;
                                }

                                int input_num = Integer.valueOf(str03.substring(0, str03.indexOf(" ")));
                                for (File file : files) {
                                    try {
                                        Integer i1 = Integer.valueOf(file.getName().substring(0, file.getName().indexOf(" ")));
                                        if (i1 >= input_num) {
                                            String newFileName = file.getParentFile().getCanonicalPath() + File.separator + (i1 + 1) + " " + file.getName().substring(file.getName().indexOf(" ") + 1);
                                            Files.move(Paths.get(file.getCanonicalPath()), Paths.get(newFileName));
                                        }
                                    } catch (Exception e1) {
                                    }
                                }

                                File newF = new File(new File(buffer.toString()).getParent(), str03);
                                try {
                                    newF.createNewFile();
                                } catch (IOException ex) {
                                    ex.printStackTrace();
                                }

                                DefaultMutableTreeNode rootNode = buildFileTree(new File(root_path));
                                DefaultTreeModel treeModel = new DefaultTreeModel(rootNode);
                                fileBrowserTree.setModel(treeModel);
                                fileBrowserTree.repaint();
                                fileBrowserTree.updateUI();
                                
                                jTable.repaint();
                                jTable.updateUI();
                            }
                        });
                        jPopupMenu.add(addMenu);
                        jPopupMenu.add(new JMenuItem("rename"));

                        fileBrowserTree.setComponentPopupMenu(jPopupMenu);
                }
            }
        });

        JScrollPane jScrollPane = new JScrollPane(fileBrowserTree);
        jScrollPane.setPreferredSize(new Dimension(width, height));

        JPanel fileBrowserPanel = new JPanel();
        fileBrowserPanel.setSize(new Dimension(width, height));
        fileBrowserPanel.setName("fileBrowserFrame");
        fileBrowserPanel.add(jScrollPane);
        fileBrowserPanel.setVisible(true);

        return fileBrowserPanel;
    }

    public DefaultMutableTreeNode buildFileTree(File rootFile) {
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode(rootFile.getName());

        if (rootFile.isFile()) {
            return rootNode;
        }

        File[] subFiles = rootFile.listFiles();
        Arrays.sort(subFiles, new FileNameComparator());

        if (subFiles == null || subFiles.length == 0) {
            return rootNode;
        }

        for (File subFile : subFiles) {
            if (subFile.isFile()) {
                DefaultMutableTreeNode subNode = new DefaultMutableTreeNode(subFile.getName());
                rootNode.add(subNode);
            }

            if (subFile.isDirectory()) {
                DefaultMutableTreeNode subNode = buildFileTree(subFile);
                rootNode.add(subNode);
            }
        }

        return rootNode;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame();
            mainFrame.createAndShowMainPanel();
        });
    }

    class FileNameComparator implements Comparator<File> {

        @Override
        public int compare(File f1, File f2) {
            int i1, i2;
            try {
                i1 = Integer.valueOf(f1.getName().substring(0, f1.getName().indexOf(" ")));
            } catch (Exception e) {
                e.printStackTrace();
                i1 = 999999;
            }

            try {
                i2 = Integer.valueOf(f2.getName().substring(0, f2.getName().indexOf(" ")));
            } catch (Exception e) {
                e.printStackTrace();
                i2 = 999998;
            }

            return i1 - i2;
        }
    }
}
