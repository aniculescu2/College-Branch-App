package com.collegebranch.app.mentee;

import com.codename1.ui.events.ActionEvent;

public class MenteeEssayLayout extends com.codename1.ui.Form {
    public MenteeEssayLayout() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }
    
    public MenteeEssayLayout(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

    public void onhomeActionEvent(ActionEvent ev) {
        MenteeHome home = new MenteeHome();
        home.start();
    }

    public void ontipsAndTricksActionEvent(ActionEvent ev) {
    }

    public void onessayCommunityChatActionEvent(ActionEvent ev) {
    }

    public void onappointmentCreateActionEvent(ActionEvent ev) {
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    protected com.codename1.ui.Button gui_appointmentCreate = new com.codename1.ui.Button();
    protected com.codename1.ui.Button gui_essayCommunityChat = new com.codename1.ui.Button();
    protected com.codename1.ui.Button gui_tipsAndTricks = new com.codename1.ui.Button();
    protected com.codename1.ui.Button gui_home = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void guiBuilderBindComponentListeners() {
        EventCallbackClass callback = new EventCallbackClass();
        gui_appointmentCreate.addActionListener(callback);
        gui_essayCommunityChat.addActionListener(callback);
        gui_tipsAndTricks.addActionListener(callback);
        gui_home.addActionListener(callback);
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

            if(sourceComponent == gui_appointmentCreate) {
                onappointmentCreateActionEvent(ev);
            }
            if(sourceComponent == gui_essayCommunityChat) {
                onessayCommunityChatActionEvent(ev);
            }
            if(sourceComponent == gui_tipsAndTricks) {
                ontipsAndTricksActionEvent(ev);
            }
            if(sourceComponent == gui_home) {
                onhomeActionEvent(ev);
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
        setTitle("MenteeEssayLayout");
        setName("MenteeEssayLayout");
        gui_appointmentCreate.setText("Set Up An Appointment");
                gui_appointmentCreate.setInlineStylesTheme(resourceObjectInstance);
        gui_appointmentCreate.setName("appointmentCreate");
        gui_essayCommunityChat.setText("Essay Community Chat");
                gui_essayCommunityChat.setInlineStylesTheme(resourceObjectInstance);
        gui_essayCommunityChat.setName("essayCommunityChat");
        gui_tipsAndTricks.setText("General Tips and Tricks");
                gui_tipsAndTricks.setInlineStylesTheme(resourceObjectInstance);
        gui_tipsAndTricks.setName("tipsAndTricks");
        gui_home.setText("Home");
                gui_home.setInlineStylesTheme(resourceObjectInstance);
        gui_home.setName("home");
        addComponent(gui_appointmentCreate);
        addComponent(gui_essayCommunityChat);
        addComponent(gui_tipsAndTricks);
        addComponent(gui_home);
        ((com.codename1.ui.layouts.LayeredLayout)gui_appointmentCreate.getParent().getLayout()).setInsets(gui_appointmentCreate, "15.116279% 0.0mm auto 0.0mm").setReferenceComponents(gui_appointmentCreate, "-1 1 -1 1 ").setReferencePositions(gui_appointmentCreate, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_essayCommunityChat.getParent().getLayout()).setInsets(gui_essayCommunityChat, "24.709303% auto auto -0.7936508mm").setReferenceComponents(gui_essayCommunityChat, "-1 -1 -1 2 ").setReferencePositions(gui_essayCommunityChat, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_tipsAndTricks.getParent().getLayout()).setInsets(gui_tipsAndTricks, "35.174416% 1.5873088mm auto 20.325203%").setReferenceComponents(gui_tipsAndTricks, "-1 3 -1 -1").setReferencePositions(gui_tipsAndTricks, "0.0 1.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_home.getParent().getLayout()).setInsets(gui_home, "7.1428566mm auto auto 30.562658%").setReferenceComponents(gui_home, "-1 -1 -1 -1").setReferencePositions(gui_home, "0.0 0.0 0.0 0.0");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}
