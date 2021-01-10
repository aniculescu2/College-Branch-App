package com.collegebranch.app.mentee;

import com.codename1.ui.Command;

public class MenteePortal {
    public void start(){
        MenteePortalLayout Layout = new MenteePortalLayout();
        Command back = new Command("Back");
        Layout.setBackCommand(back);
        Layout.show();
    }
}
