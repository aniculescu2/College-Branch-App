package com.collegebranch.app.mentee;


import com.codename1.ui.events.ActionEvent;

public class MenteeHomeLayout extends com.codename1.ui.Form {
    public MenteeHomeLayout() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }
    
    public MenteeHomeLayout(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

    public void onSettingsActionEvent(ActionEvent ev) {
        MenteeSettings settings = new MenteeSettings();
        settings.start();
    }

    public void onPortalActionEvent(ActionEvent ev) {

        MenteePortal portal = new MenteePortal();
        portal.start();
    }

    public void onCollegeHelpActionEvent(ActionEvent ev) {
        MenteeCollegeHelp collegeHelp = new MenteeCollegeHelp();
        collegeHelp.start();
    }

    public void onEssayHelpActionEvent(ActionEvent ev) {
        MenteeEssayHelp essayHelp = new MenteeEssayHelp();
        essayHelp.start();
    }

    public void onMentorMatchingActionEvent(ActionEvent ev) {
        MentorMatching matching = new MentorMatching();
        matching.start();
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    protected com.codename1.ui.Button gui_MentorMatching = new com.codename1.ui.Button();
    protected com.codename1.ui.Button gui_Portal = new com.codename1.ui.Button();
    protected com.codename1.ui.Button gui_EssayHelp = new com.codename1.ui.Button();
    protected com.codename1.ui.Button gui_CollegeHelp = new com.codename1.ui.Button();
    protected com.codename1.ui.Button gui_Settings = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void guiBuilderBindComponentListeners() {
        EventCallbackClass callback = new EventCallbackClass();
        gui_MentorMatching.addActionListener(callback);
        gui_Portal.addActionListener(callback);
        gui_EssayHelp.addActionListener(callback);
        gui_CollegeHelp.addActionListener(callback);
        gui_Settings.addActionListener(callback);
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

            if(sourceComponent == gui_MentorMatching) {
                onMentorMatchingActionEvent(ev);
            }
            if(sourceComponent == gui_Portal) {
                onPortalActionEvent(ev);
            }
            if(sourceComponent == gui_EssayHelp) {
                onEssayHelpActionEvent(ev);
            }
            if(sourceComponent == gui_CollegeHelp) {
                onCollegeHelpActionEvent(ev);
            }
            if(sourceComponent == gui_Settings) {
                onSettingsActionEvent(ev);
            }
        }

        public void dataChanged(int type, int index) {
        }
    }
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        guiBuilderBindComponentListeners();
        setLayout(new com.codename1.ui.layouts.LayeredLayout());
        setInlineStylesTheme(resourceObjectInstance);
        setScrollableY(true);
                setInlineStylesTheme(resourceObjectInstance);
        setTitle("MenteeHomeLayout");
        setName("MenteeHomeLayout");
        gui_MentorMatching.setText("Mentor Matching");
                gui_MentorMatching.setInlineStylesTheme(resourceObjectInstance);
        gui_MentorMatching.setName("MentorMatching");
        gui_Portal.setText("My Portal");
                gui_Portal.setInlineStylesTheme(resourceObjectInstance);
        gui_Portal.setName("Portal");
        gui_EssayHelp.setText("Essay Help");
                gui_EssayHelp.setInlineStylesTheme(resourceObjectInstance);
        gui_EssayHelp.setName("EssayHelp");
        gui_CollegeHelp.setText("College Selection Help");
                gui_CollegeHelp.setInlineStylesTheme(resourceObjectInstance);
        gui_CollegeHelp.setName("CollegeHelp");
        gui_Settings.setText("Settings");
                gui_Settings.setInlineStylesTheme(resourceObjectInstance);
        gui_Settings.setName("Settings");
        addComponent(gui_MentorMatching);
        addComponent(gui_Portal);
        addComponent(gui_EssayHelp);
        addComponent(gui_CollegeHelp);
        addComponent(gui_Settings);
        ((com.codename1.ui.layouts.LayeredLayout)gui_MentorMatching.getParent().getLayout()).setInsets(gui_MentorMatching, "10.610465% auto auto 6.393862%").setReferenceComponents(gui_MentorMatching, "-1 -1 -1 -1").setReferencePositions(gui_MentorMatching, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Portal.getParent().getLayout()).setInsets(gui_Portal, "53.968254mm auto auto 12.698413mm").setReferenceComponents(gui_Portal, "-1 -1 -1 -1").setReferencePositions(gui_Portal, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_EssayHelp.getParent().getLayout()).setInsets(gui_EssayHelp, "17.151163% auto 142.32805mm 3.1746035mm").setReferenceComponents(gui_EssayHelp, "-1 -1 -1 0 ").setReferencePositions(gui_EssayHelp, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_CollegeHelp.getParent().getLayout()).setInsets(gui_CollegeHelp, "42.59259mm auto auto 12.1693125mm").setReferenceComponents(gui_CollegeHelp, "-1 -1 -1 -1").setReferencePositions(gui_CollegeHelp, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Settings.getParent().getLayout()).setInsets(gui_Settings, "34.738373% auto auto 6.01023%").setReferenceComponents(gui_Settings, "-1 -1 -1 -1").setReferencePositions(gui_Settings, "0.0 0.0 0.0 0.0");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}
