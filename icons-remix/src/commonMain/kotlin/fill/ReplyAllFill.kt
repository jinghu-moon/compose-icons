package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ReplyAllFill: ImageVector
    get() {
        if (_replyAllFill != null) return _replyAllFill!!
        _replyAllFill = remixIcon(
            name = "ReplyAllFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 4.500 L 14.000 9.000 C 19.523 9.000 24.000 13.477 24.000 19.000 C 24.000 19.273 23.989 19.543 23.968 19.810 C 22.506 17.036 19.638 15.119 16.313 15.005 L 16.000 15.000 L 14.000 15.000 L 14.000 19.500 L 6.000 12.000 L 14.000 4.500 ZM 8.000 4.500 L 8.000 7.237 L 2.920 12.000 L 7.999 16.761 L 8.000 19.500 L 0.000 12.000 L 8.000 4.500 Z"),
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
        return _replyAllFill!!
    }

private var _replyAllFill: ImageVector? = null
