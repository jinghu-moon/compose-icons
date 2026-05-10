package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SkipForwardFill: ImageVector
    get() {
        if (_skipForwardFill != null) return _skipForwardFill!!
        _skipForwardFill = remixIcon(
            name = "SkipForwardFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 12.667 5.777 19.482c-.23 .153-.54 .091-.693-.139C5.029 19.261 5 19.164 5 19.066v-14.131c0-.276 .224-.5 .5-.5 .099 0 .195 .029 .277 .084L16 11.333v-6.333c0-.552 .448-1 1-1 .552 0 1 .448 1 1v14c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-6.333Z"),
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
        return _skipForwardFill!!
    }

private var _skipForwardFill: ImageVector? = null
