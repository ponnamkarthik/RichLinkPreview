package io.github.ponnamkarthik.richlinkpreview;

import android.text.TextPaint;
import android.text.style.URLSpan;

/**
 * Created by ponna on 20-01-2018.
 */

public class URLSpanNoUnderline extends URLSpan {
    public URLSpanNoUnderline(String p_Url) {
        super(p_Url);
    }

    public void updateDrawState(TextPaint p_DrawState) {
        super.updateDrawState(p_DrawState);
        p_DrawState.setUnderlineText(false);
    }
}
