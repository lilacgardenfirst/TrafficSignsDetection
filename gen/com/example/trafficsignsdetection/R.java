/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.example.trafficsignsdetection;

public final class R {
    public static final class attr {
        /** <p>May be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
<p>May be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>any</code></td><td>-1</td><td></td></tr>
<tr><td><code>back</code></td><td>99</td><td></td></tr>
<tr><td><code>front</code></td><td>98</td><td></td></tr>
</table>
         */
        public static final int camera_id=0x7f010001;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int show_fps=0x7f010000;
    }
    public static final class dimen {
        /**  Default screen margins, per the Android Design guidelines. 

         Customize dimensions originally defined in res/values/dimens.xml (such as
         screen margins) for sw720dp devices (e.g. 10" tablets) in landscape here.
    
         */
        public static final int activity_horizontal_margin=0x7f060000;
        public static final int activity_vertical_margin=0x7f060001;
        public static final int overlay_height=0x7f060005;
        public static final int overlay_margin=0x7f060004;
        public static final int overlay_width=0x7f060006;
        public static final int panel_height=0x7f060003;
        public static final int panel_margin=0x7f060002;
    }
    public static final class drawable {
        public static final int add_icon=0x7f020000;
        public static final int camera_icon=0x7f020001;
        public static final int ic_launcher=0x7f020002;
        public static final int search_icon=0x7f020003;
    }
    public static final class id {
        public static final int LinearLayout1=0x7f050011;
        public static final int LinearLayout2=0x7f050003;
        public static final int action_settings=0x7f050017;
        public static final int any=0x7f050000;
        public static final int back=0x7f050001;
        public static final int btCapture=0x7f050013;
        public static final int btDetect=0x7f050014;
        public static final int btPick=0x7f050012;
        public static final int btPickPhoto=0x7f050005;
        public static final int btRuntime=0x7f050004;
        public static final int btTakePhoto=0x7f050006;
        public static final int front=0x7f050002;
        public static final int imageView1=0x7f05000c;
        public static final int ivDisplay=0x7f050015;
        public static final int layoutResult=0x7f050016;
        public static final int listView1=0x7f050009;
        public static final int listViewLayout=0x7f050008;
        public static final int list_image=0x7f05000b;
        public static final int list_item_subtitle=0x7f05000f;
        public static final int list_item_title=0x7f05000d;
        public static final int lstDetectedSigns=0x7f050010;
        public static final int mCameraView=0x7f050007;
        public static final int thumbnail=0x7f05000a;
        public static final int thumbnail123=0x7f05000e;
    }
    public static final class layout {
        public static final int activity_main=0x7f030000;
        public static final int camera_preview=0x7f030001;
        public static final int list_item=0x7f030002;
        public static final int list_row=0x7f030003;
        public static final int photo_layout=0x7f030004;
    }
    public static final class menu {
        public static final int main=0x7f090000;
    }
    public static final class raw {
        public static final int bienbaocam=0x7f040000;
        public static final int biennguyhiem=0x7f040001;
        public static final int cascade=0x7f040002;
        public static final int haarcascade_eye=0x7f040003;
        public static final int lbpcascade_frontalface=0x7f040004;
    }
    public static final class string {
        public static final int action_settings=0x7f070001;
        public static final int app_name=0x7f070000;
        public static final int hello_world=0x7f070002;
    }
    public static final class style {
        /** 
        Base application theme, dependent on API level. This theme is replaced
        by AppBaseTheme from res/values-vXX/styles.xml on newer devices.
    

            Theme customizations available in newer API levels can go in
            res/values-vXX/styles.xml, while customizations related to
            backward-compatibility can go here.
        

        Base application theme for API 11+. This theme completely replaces
        AppBaseTheme from res/values/styles.xml on API 11+ devices.
    
 API 11 theme customizations can go here. 

        Base application theme for API 14+. This theme completely replaces
        AppBaseTheme from BOTH res/values/styles.xml and
        res/values-v11/styles.xml on API 14+ devices.
    
 API 14 theme customizations can go here. 
         */
        public static final int AppBaseTheme=0x7f080000;
        /**  Application theme. 
 All customizations that are NOT specific to a particular API-level can go here. 
         */
        public static final int AppTheme=0x7f080001;
    }
    public static final class styleable {
        /** Attributes that can be used with a CameraBridgeViewBase.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #CameraBridgeViewBase_camera_id com.example.trafficsignsdetection:camera_id}</code></td><td></td></tr>
           <tr><td><code>{@link #CameraBridgeViewBase_show_fps com.example.trafficsignsdetection:show_fps}</code></td><td></td></tr>
           </table>
           @see #CameraBridgeViewBase_camera_id
           @see #CameraBridgeViewBase_show_fps
         */
        public static final int[] CameraBridgeViewBase = {
            0x7f010000, 0x7f010001
        };
        /**
          <p>This symbol is the offset where the {@link com.example.trafficsignsdetection.R.attr#camera_id}
          attribute's value can be found in the {@link #CameraBridgeViewBase} array.


          <p>May be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
<p>May be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>any</code></td><td>-1</td><td></td></tr>
<tr><td><code>back</code></td><td>99</td><td></td></tr>
<tr><td><code>front</code></td><td>98</td><td></td></tr>
</table>
          @attr name com.example.trafficsignsdetection:camera_id
        */
        public static final int CameraBridgeViewBase_camera_id = 1;
        /**
          <p>This symbol is the offset where the {@link com.example.trafficsignsdetection.R.attr#show_fps}
          attribute's value can be found in the {@link #CameraBridgeViewBase} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.example.trafficsignsdetection:show_fps
        */
        public static final int CameraBridgeViewBase_show_fps = 0;
    };
}
