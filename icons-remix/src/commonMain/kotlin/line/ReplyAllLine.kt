package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ReplyAllLine: ImageVector
    get() {
        if (_replyAllLine != null) return _replyAllLine!!
        _replyAllLine = remixIcon(
            name = "ReplyAllLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 4.500 L 14.000 9.000 C 19.523 9.000 24.000 13.477 24.000 19.000 C 24.000 19.273 23.989 19.543 23.968 19.810 C 22.506 17.036 19.638 15.119 16.313 15.005 L 16.000 15.000 L 14.000 15.000 L 14.000 19.500 L 6.000 12.000 L 14.000 4.500 ZM 8.000 4.500 L 8.000 7.237 L 2.920 12.000 L 7.999 16.761 L 8.000 19.500 L 0.000 12.000 L 8.000 4.500 ZM 12.000 9.116 L 8.924 12.000 L 12.000 14.883 L 12.000 13.000 L 16.034 13.000 L 16.381 13.007 C 17.666 13.050 18.905 13.316 20.057 13.773 C 18.590 12.075 16.420 11.000 14.000 11.000 L 12.000 11.000 L 12.000 9.116 Z"),
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
        return _replyAllLine!!
    }

private var _replyAllLine: ImageVector? = null
