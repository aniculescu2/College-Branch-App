package com.collegebranch.app.mentee;

import com.codename1.ui.events.ActionEvent;

public class MenteeCollegeHelpLayout extends com.codename1.ui.Form {
    public MenteeCollegeHelpLayout() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }
    
    public MenteeCollegeHelpLayout(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

    public void onpersonalMatchingActionEvent(ActionEvent ev) {
    }

    public void oncommunityChatActionEvent(ActionEvent ev) {
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    protected com.codename1.ui.Button gui_communityChat = new com.codename1.ui.Button();
    protected com.codename1.ui.Button gui_personalMatching = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void guiBuilderBindComponentListeners() {
        EventCallbackClass callback = new EventCallbackClass();
        gui_communityChat.addActionListener(callback);
        gui_personalMatching.addActionListener(callback);
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

            if(sourceComponent == gui_communityChat) {
                oncommunityChatActionEvent(ev);
            }
            if(sourceComponent == gui_personalMatching) {
                onpersonalMatchingActionEvent(ev);
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
        setTitle("MenteeCollegeHelpLayout");
        setName("MenteeCollegeHelpLayout");
        gui_communityChat.setText("Community Chat");
                gui_communityChat.setInlineStylesTheme(resourceObjectInstance);
        gui_communityChat.setName("communityChat");
        gui_personalMatching.setText("Personalized Matching");
                gui_personalMatching.setInlineStylesTheme(resourceObjectInstance);
        gui_personalMatching.setName("personalMatching");
        addComponent(gui_communityChat);
        addComponent(gui_personalMatching);
        ((com.codename1.ui.layouts.LayeredLayout)gui_communityChat.getParent().getLayout()).setInsets(gui_communityChat, "9.593023% auto auto 9.207161%").setReferenceComponents(gui_communityChat, "-1 -1 -1 -1").setReferencePositions(gui_communityChat, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_personalMatching.getParent().getLayout()).setInsets(gui_personalMatching, "18.75% auto auto 0.0mm").setReferenceComponents(gui_personalMatching, "-1 -1 -1 0 ").setReferencePositions(gui_personalMatching, "0.0 0.0 0.0 0.0");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}
