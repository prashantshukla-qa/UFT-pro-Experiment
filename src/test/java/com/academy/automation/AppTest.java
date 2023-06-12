package com.academy.automation;

import java.io.IOException;
import java.net.URI;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.hp.lft.sdk.Aut;
import com.hp.lft.sdk.Description;
import com.hp.lft.sdk.Desktop;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.ModifiableSDKConfiguration;
import com.hp.lft.sdk.SDK;
import com.hp.lft.sdk.TestObject;
import com.hp.lft.sdk.stdwin.Window;
import com.hp.lft.sdk.stdwin.Dialog;
import com.hp.lft.sdk.stdwin.DialogDescription;
import com.hp.lft.sdk.stdwin.UiObject;
import com.hp.lft.sdk.stdwin.UiObjectDescription;
import com.hp.lft.sdk.stdwin.WindowDescription;

import javassist.bytecode.Descriptor;

public class AppTest {

    @Before
    public void setup() throws Exception {
        ModifiableSDKConfiguration config = new ModifiableSDKConfiguration();
        config.setServerAddress(new URI("ws://localhost:5095"));
        SDK.init(config);
    }

    @Test
    public void shouldAnswerWithTrue() throws GeneralLeanFtException, InterruptedException, IOException {

        Desktop.launchAut("notepad.exe");

        Window notepadWindow = Desktop.describe(Window.class,
                new WindowDescription.Builder()
                        .windowClassRegExp("Notepad")
                        .windowTitleRegExp(" Notepad")
                        .build());
        UiObject richEditD2DPTUiObject = notepadWindow.describe(UiObject.class,
                new UiObjectDescription.Builder()
                        .windowClassRegExp("RichEditD2DPT")
                        .build());

        richEditD2DPTUiObject.click();

        richEditD2DPTUiObject.sendKeys("Test the notepad");

        Thread.sleep(2000);

        String windowTitle = notepadWindow.getWindowTitleRegExp();

        System.out.println(windowTitle);

        notepadWindow.activate();

        notepadWindow.close();

        Dialog savedialog = notepadWindow.describe(Dialog.class,
                new DialogDescription.Builder().windowClassRegExp("Dialog").build());

        System.out.println(savedialog.getVisibleText());

    }
}
