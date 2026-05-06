package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChatSettingsLine: ImageVector
    get() {
        if (_chatSettingsLine != null) return _chatSettingsLine!!
        _chatSettingsLine = remixIcon(
            name = "ChatSettingsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 12h-2v-7h-16v13.385L5.763 17h6.237v2h-5.545L2 22.5v-18.5C2 3.448 2.448 3 3 3h18c.552 0 1 .448 1 1v8ZM14.145 19.071C14.05 18.73 14 18.371 14 18c0-.371 .05-.73 .145-1.071l-.975-.563 1-1.732 .976 .564c.502-.511 1.139-.887 1.854-1.071v-1.126h2v1.126c.715 .184 1.353 .561 1.854 1.071l.976-.564 1 1.732-.975 .563c.094 .341 .145 .7 .145 1.071 0 .371-.051 .73-.145 1.071l.975 .563-1 1.732-.976-.563c-.502 .511-1.139 .888-1.854 1.072v1.126h-2v-1.126c-.715-.184-1.352-.561-1.854-1.072l-.976 .563-1-1.732 .975-.563ZM18 20c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2Z"),
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
        return _chatSettingsLine!!
    }

private var _chatSettingsLine: ImageVector? = null
