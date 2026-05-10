package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChatSettingsFill: ImageVector
    get() {
        if (_chatSettingsFill != null) return _chatSettingsFill!!
        _chatSettingsFill = remixIcon(
            name = "ChatSettingsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.455 19 2 22.5v-18.5C2 3.448 2.448 3 3 3h18c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-14.545ZM8.145 12.071l-.975 .563 1 1.732 .976-.564c.502 .511 1.139 .887 1.854 1.071v1.126h2v-1.126c.715-.184 1.352-.561 1.854-1.071l.976 .564 1-1.732-.975-.563C15.95 11.73 16 11.371 16 11c0-.371-.05-.73-.145-1.071l.975-.563L15.83 7.634l-.976 .564C14.352 7.687 13.715 7.31 13 7.126v-1.126h-2v1.126c-.715 .184-1.353 .561-1.854 1.071L8.17 7.634 7.17 9.366l.975 .563C8.05 10.27 8 10.629 8 11c0 .371 .05 .73 .145 1.071ZM12 13c-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _chatSettingsFill!!
    }

private var _chatSettingsFill: ImageVector? = null
