package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ReplyLine: ImageVector
    get() {
        if (_replyLine != null) return _replyLine!!
        _replyLine = remixIcon(
            name = "ReplyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 20.000 L 1.000 12.000 L 11.000 4.000 L 11.000 9.000 C 16.523 9.000 21.000 13.477 21.000 19.000 C 21.000 19.273 20.989 19.543 20.968 19.810 C 19.506 17.036 16.638 15.119 13.313 15.005 L 13.000 15.000 L 11.000 15.000 L 11.000 20.000 ZM 9.000 13.000 L 11.000 13.000 L 13.034 13.000 L 13.381 13.007 C 14.666 13.050 15.905 13.316 17.057 13.773 C 15.590 12.075 13.420 11.000 11.000 11.000 L 9.000 11.000 L 9.000 8.161 L 4.202 12.000 L 9.000 15.839 L 9.000 13.000 Z"),
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
        return _replyLine!!
    }

private var _replyLine: ImageVector? = null
