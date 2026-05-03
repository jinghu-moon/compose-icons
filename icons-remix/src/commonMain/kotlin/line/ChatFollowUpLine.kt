package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChatFollowUpLine: ImageVector
    get() {
        if (_chatFollowUpLine != null) return _chatFollowUpLine!!
        _chatFollowUpLine = remixIcon(
            name = "ChatFollowUpLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 18.000 C 22.000 18.552 21.552 19.000 21.000 19.000 L 6.455 19.000 L 2.000 22.500 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 ZM 20.000 5.000 L 4.000 5.000 L 4.000 18.385 L 5.763 17.000 L 20.000 17.000 L 20.000 5.000 ZM 17.000 7.000 L 17.000 15.000 L 15.000 15.000 L 15.000 7.000 L 17.000 7.000 ZM 11.000 8.000 L 11.000 9.999 L 13.000 10.000 L 13.000 12.000 L 11.000 11.999 L 11.000 14.000 L 9.000 14.000 L 9.000 11.999 L 7.000 12.000 L 7.000 10.000 L 9.000 9.999 L 9.000 8.000 L 11.000 8.000 Z"),
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
        return _chatFollowUpLine!!
    }

private var _chatFollowUpLine: ImageVector? = null
