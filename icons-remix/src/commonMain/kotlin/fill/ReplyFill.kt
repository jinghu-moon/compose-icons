package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ReplyFill: ImageVector
    get() {
        if (_replyFill != null) return _replyFill!!
        _replyFill = remixIcon(
            name = "ReplyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 20.000 L 1.000 12.000 L 11.000 4.000 L 11.000 9.000 C 16.523 9.000 21.000 13.477 21.000 19.000 C 21.000 19.273 20.989 19.543 20.968 19.811 C 19.461 16.950 16.458 15.000 13.000 15.000 L 11.000 15.000 L 11.000 20.000 Z"),
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
        return _replyFill!!
    }

private var _replyFill: ImageVector? = null
