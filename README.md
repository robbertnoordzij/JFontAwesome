# JFontAwesome
Simple implementation of FontAwsome for Java AWT and Swing

## FontAwesome
More information about FontAwsome can be found on http://fortawesome.github.io/Font-Awesome/

## Usage

```java
    import javax.swing.JLabel;

    import nl.robbertnoordzij.JFontAwesome.FA;
    
    JLabel label = new JLabel(FA.ANCHOR);
    label.setFont(FA.TTF.deriveFont(28f));
```

Or as Icon for Swing buttons

```java
    import javax.swing.JLabel;

    import nl.robbertnoordzij.JFontAwesome.FA;
    import nl.robbertnoordzij.JFontAwesome.FAIcon;

    JButton button = new JButton("Button with an icon", new FAIcon(FA.ANCHOR));
```
