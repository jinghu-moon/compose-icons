package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChatSmile3Fill: ImageVector
    get() {
        if (_chatSmile3Fill != null) return _chatSmile3Fill!!
        _chatSmile3Fill = remixIcon(
            name = "ChatSmile3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 L 2.000 22.000 L 4.929 19.071 C 3.119 17.261 2.000 14.761 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 16.000 13.000 L 8.000 13.000 C 8.000 15.209 9.791 17.000 12.000 17.000 C 14.209 17.000 16.000 15.209 16.000 13.000 Z"),
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
        return _chatSmile3Fill!!
    }

private var _chatSmile3Fill: ImageVector? = null
