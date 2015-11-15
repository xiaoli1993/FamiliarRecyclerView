package cn.iwgang.familiarrecyclerviewdemo;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import cn.iwgang.familiarrecyclerview.FamiliarRecyclerView;

public class HeaderAndFooterViewUtil {

    public static View getHeadView(Context context, boolean isVertical, int bgColor, String text) {
        FrameLayout headview = new FrameLayout(context);
        if (isVertical) {
            headview.setLayoutParams(new FamiliarRecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 350)); // vertical
        } else {
            headview.setLayoutParams(new FamiliarRecyclerView.LayoutParams(350, ViewGroup.LayoutParams.MATCH_PARENT)); // horizontal
        }
        headview.setBackgroundColor(bgColor);
        TextView headviewContent = new TextView(context);
        FrameLayout.LayoutParams headviewContentParams = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        headviewContentParams.gravity = Gravity.CENTER;
        headviewContent.setLayoutParams(headviewContentParams);
        headviewContent.setText(text);
        headview.addView(headviewContent);

        return headview;
    }

    public static View getFooterView(Context context, boolean isVertical, int bgColor, String text) {
        FrameLayout footer1 = new FrameLayout(context);
        if (isVertical) {
            footer1.setLayoutParams(new FamiliarRecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 350)); // vertical
        } else {
            footer1.setLayoutParams(new FamiliarRecyclerView.LayoutParams(350, ViewGroup.LayoutParams.MATCH_PARENT));  // horizontal
        }
        footer1.setBackgroundColor(bgColor);
        TextView footerviewContent1 = new TextView(context);
        FrameLayout.LayoutParams footerviewContent1Params = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        footerviewContent1Params.gravity = Gravity.CENTER;
        footerviewContent1.setLayoutParams(footerviewContent1Params);
        footerviewContent1.setText(text);
        footer1.addView(footerviewContent1);

        return footer1;
    }

}
