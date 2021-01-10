package com.collegebranch.app;

import com.codename1.ui.Component;
import com.codename1.ui.events.ActionEvent;

public class LoginLayout extends com.codename1.ui.Form {
    public LoginLayout() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }
    
    public LoginLayout(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

    public void onPasswordTextDataChangeEvent(Component cmp, int type, int index) {
        SignIn.checkData();
    }

    public void onUsernameTextDataChangeEvent(Component cmp, int type, int index) {
       SignIn.checkData();
    }

    public void onMenteeSelectActionEvent(ActionEvent ev) {
        SignIn.checkData();

    }

    public void onMentorSelectActionEvent(ActionEvent ev) {
        SignIn.checkData();

    }

    public void onLoginButtonActionEvent(ActionEvent ev) {
        SignIn.login();
    }


    ////-- DON'T EDIT BELOW THIS LINE!!!
    protected com.codename1.ui.Label gui_LoginLabel = new com.codename1.ui.Label();
    protected com.codename1.ui.Button gui_LoginButton = new com.codename1.ui.Button();
    protected com.codename1.ui.Container gui_Table_Layout = new com.codename1.ui.Container(new com.codename1.ui.table.TableLayout(3, 2));
    protected com.codename1.ui.Label gui_Username = new com.codename1.ui.Label();
    protected com.codename1.ui.TextField gui_UsernameText = new com.codename1.ui.TextField();
    protected com.codename1.ui.Label gui_Password = new com.codename1.ui.Label();
    protected com.codename1.ui.TextField gui_PasswordText = new com.codename1.ui.TextField();
    protected com.codename1.ui.Container gui_Box_Layout_X = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    protected com.codename1.ui.RadioButton gui_MentorSelect = new com.codename1.ui.RadioButton();
    protected com.codename1.ui.RadioButton gui_MenteeSelect = new com.codename1.ui.RadioButton();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void guiBuilderBindComponentListeners() {
        EventCallbackClass callback = new EventCallbackClass();
        gui_LoginButton.addActionListener(callback);
        gui_UsernameText.addDataChangedListener(new EventCallbackClass(gui_UsernameText));
        gui_PasswordText.addDataChangedListener(new EventCallbackClass(gui_PasswordText));
        gui_MentorSelect.addActionListener(callback);
        gui_MenteeSelect.addActionListener(callback);
    }

    class EventCallbackClass implements com.codename1.ui.events.ActionListener, com.codename1.ui.events.DataChangedListener {
        private com.codename1.ui.Component cmp;
        public EventCallbackClass(com.codename1.ui.Component cmp) {
            this.cmp = cmp;
        }

        public EventCallbackClass() {
        }

        public void actionPerformed(com.codename1.ui.events.ActionEvent ev) {
            com.codename1.ui.Component sourceComponent = ev.getComponent();

            if(sourceComponent.getParent().getLeadParent() != null && (sourceComponent.getParent().getLeadParent() instanceof com.codename1.components.MultiButton || sourceComponent.getParent().getLeadParent() instanceof com.codename1.components.SpanButton)) {
                sourceComponent = sourceComponent.getParent().getLeadParent();
            }

            if(sourceComponent == gui_LoginButton) {
                onLoginButtonActionEvent(ev);
            }
            if(sourceComponent == gui_MentorSelect) {
                onMentorSelectActionEvent(ev);
            }
            if(sourceComponent == gui_MenteeSelect) {
                onMenteeSelectActionEvent(ev);
            }
        }

        public void dataChanged(int type, int index) {
            onUsernameTextDataChangeEvent(cmp, type, index);
            onPasswordTextDataChangeEvent(cmp, type, index);
        }
    }
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        guiBuilderBindComponentListeners();
        setLayout(new com.codename1.ui.layouts.LayeredLayout());
        setInlineStylesTheme(resourceObjectInstance);
        setFocusable(false);
        setScrollableY(false);
                setInlineStylesTheme(resourceObjectInstance);
        setTitle("LoginLayout");
        setName("LoginLayout");
        gui_LoginLabel.setPreferredSizeStr("inherit 13.492063522338867mm");
        gui_LoginLabel.setText("Login");
                gui_LoginLabel.setInlineStylesTheme(resourceObjectInstance);
        gui_LoginLabel.setInlineAllStyles("font:12.0mm; fgColor:0;");
        gui_LoginLabel.setName("LoginLabel");
        gui_LoginButton.setPreferredSizeStr("35.449737548828125mm 13.4920635mm");
        gui_LoginButton.setEnabled(false);
        gui_LoginButton.setText("Login");
                gui_LoginButton.setInlineStylesTheme(resourceObjectInstance);
        gui_LoginButton.setInlineAllStyles("border:roundRect stroke(0.5mm 000000) +top-left +top-right +bottom-left +bottom-right 3.0mm; bgColor:6a0c6a; fgColor:ad16; transparency:124; alignment:center; margin:3.0mm 3.0mm 3.0mm 3.0mm; padding:3.0mm 3.0mm 3.0mm 3.0mm;");
        gui_LoginButton.setInlineDisabledStyles("bgColor:715cd; fgColor:dee400; opacity:229;");
        gui_LoginButton.setName("LoginButton");
        gui_LoginButton.setTextPosition(com.codename1.ui.Component.BOTTOM);
        gui_Table_Layout.setPreferredSizeStr("inherit 36.772488mm");
                gui_Table_Layout.setInlineStylesTheme(resourceObjectInstance);
        gui_Table_Layout.setInlineAllStyles("font:12.0mm;");
        gui_Table_Layout.setName("Table_Layout");
        addComponent(gui_LoginLabel);
        addComponent(gui_LoginButton);
        addComponent(gui_Table_Layout);
        gui_Username.setText("Username/Email");
                gui_Username.setInlineStylesTheme(resourceObjectInstance);
        gui_Username.setInlineAllStyles("font:3.0mm native:MainLight native:MainLight; margin:inherit 3.0mm inherit inherit;");
        gui_Username.setName("Username");
                gui_UsernameText.setInlineStylesTheme(resourceObjectInstance);
        gui_UsernameText.setName("UsernameText");
        gui_Password.setText("Password");
                gui_Password.setInlineStylesTheme(resourceObjectInstance);
        gui_Password.setInlineAllStyles("font:3.0mm native:MainLight native:MainLight; bgImage:null;");
        gui_Password.setName("Password");
                gui_PasswordText.setInlineStylesTheme(resourceObjectInstance);
        gui_PasswordText.setInlineAllStyles("alignment:left;");
        gui_PasswordText.setName("PasswordText");
        gui_Box_Layout_X.setPreferredSizeStr("inherit inherit");
                gui_Box_Layout_X.setInlineStylesTheme(resourceObjectInstance);
        gui_Box_Layout_X.setInlineAllStyles("border:1.0px solid 0; margin:3.0mm inherit inherit inherit;");
        gui_Box_Layout_X.setName("Box_Layout_X");
        com.codename1.ui.table.TableLayout.Constraint UsernameConstraint = ((com.codename1.ui.table.TableLayout)gui_Table_Layout.getLayout()).createConstraint(0, 0);
        UsernameConstraint.setWidthPercentage(10);
        gui_Table_Layout.addComponent(UsernameConstraint, gui_Username);
        com.codename1.ui.table.TableLayout.Constraint UsernameTextConstraint = ((com.codename1.ui.table.TableLayout)gui_Table_Layout.getLayout()).createConstraint(0, 1);
        gui_Table_Layout.addComponent(UsernameTextConstraint, gui_UsernameText);
        com.codename1.ui.table.TableLayout.Constraint PasswordConstraint = ((com.codename1.ui.table.TableLayout)gui_Table_Layout.getLayout()).createConstraint(1, -1);
        PasswordConstraint.setWidthPercentage(25);
        gui_Table_Layout.addComponent(PasswordConstraint, gui_Password);
        com.codename1.ui.table.TableLayout.Constraint PasswordTextConstraint = ((com.codename1.ui.table.TableLayout)gui_Table_Layout.getLayout()).createConstraint(1, 1);
        gui_Table_Layout.addComponent(PasswordTextConstraint, gui_PasswordText);
        com.codename1.ui.table.TableLayout.Constraint Box_Layout_XConstraint = ((com.codename1.ui.table.TableLayout)gui_Table_Layout.getLayout()).createConstraint(2, 1);
        gui_Table_Layout.addComponent(Box_Layout_XConstraint, gui_Box_Layout_X);
        gui_MentorSelect.setText("Mentor");
                gui_MentorSelect.setInlineStylesTheme(resourceObjectInstance);
        gui_MentorSelect.setInlineAllStyles("font:3.0mm;");
        gui_MentorSelect.setGroup("rg1");
        gui_MentorSelect.setName("MentorSelect");
        gui_MenteeSelect.setText("Mentee");
                gui_MenteeSelect.setInlineStylesTheme(resourceObjectInstance);
        gui_MenteeSelect.setInlineAllStyles("font:3.0mm; alignment:center;");
        gui_MenteeSelect.setGroup("rg1");
        gui_MenteeSelect.setName("MenteeSelect");
        gui_Box_Layout_X.addComponent(gui_MentorSelect);
        gui_Box_Layout_X.addComponent(gui_MenteeSelect);
        ((com.codename1.ui.layouts.LayeredLayout)gui_LoginLabel.getParent().getLayout()).setInsets(gui_LoginLabel, "3.9110303% 1.8518515mm auto 9.248555%").setReferenceComponents(gui_LoginLabel, "-1 2 -1 -1").setReferencePositions(gui_LoginLabel, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_LoginButton.getParent().getLayout()).setInsets(gui_LoginButton, "40.633213% 51.706825% 46.74345% 11.665941%").setReferenceComponents(gui_LoginButton, "-1 -1 -1 -1").setReferencePositions(gui_LoginButton, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Table_Layout.getParent().getLayout()).setInsets(gui_Table_Layout, "17.95977% 8.994709mm auto 2.9100523mm").setReferenceComponents(gui_Table_Layout, "-1 -1 -1 -1").setReferencePositions(gui_Table_Layout, "0.0 0.0 0.0 0.0");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}
