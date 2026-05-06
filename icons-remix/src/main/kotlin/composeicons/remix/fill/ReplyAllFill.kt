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
                pathData = parseSvgPathData("M14 4.5v4.5c5.523 0 10 4.477 10 10 0 .273-.011 .543-.032 .81C22.506 17.036 19.638 15.119 16.313 15.005L16 15h-2L14 19.5 6 12 14 4.5ZM8 4.5v2.737L2.92 12l5.079 4.761L8 19.5 0 12 8 4.5Z"),
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
