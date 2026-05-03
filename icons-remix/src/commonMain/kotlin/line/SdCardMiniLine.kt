package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SdCardMiniLine: ImageVector
    get() {
        if (_sdCardMiniLine != null) return _sdCardMiniLine!!
        _sdCardMiniLine = remixIcon(
            name = "SdCardMiniLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 4.000 L 8.000 9.793 C 8.000 10.455 7.738 11.090 7.271 11.558 L 6.000 12.833 L 6.000 20.000 L 18.000 20.000 L 18.000 4.000 L 8.000 4.000 ZM 7.000 2.000 L 19.000 2.000 C 19.552 2.000 20.000 2.448 20.000 3.000 L 20.000 21.000 C 20.000 21.552 19.552 22.000 19.000 22.000 L 5.000 22.000 C 4.448 22.000 4.000 21.552 4.000 21.000 L 4.000 12.420 C 4.000 12.155 4.105 11.901 4.292 11.714 L 5.854 10.146 C 5.948 10.053 6.000 9.926 6.000 9.793 L 6.000 3.000 C 6.000 2.448 6.448 2.000 7.000 2.000 ZM 15.000 5.000 L 17.000 5.000 L 17.000 9.000 L 15.000 9.000 L 15.000 5.000 ZM 12.000 5.000 L 14.000 5.000 L 14.000 9.000 L 12.000 9.000 L 12.000 5.000 ZM 9.000 5.000 L 11.000 5.000 L 11.000 9.000 L 9.000 9.000 L 9.000 5.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _sdCardMiniLine!!
    }

private var _sdCardMiniLine: ImageVector? = null
