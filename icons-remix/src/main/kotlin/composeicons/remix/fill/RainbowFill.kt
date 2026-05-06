package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RainbowFill: ImageVector
    get() {
        if (_rainbowFill != null) return _rainbowFill!!
        _rainbowFill = remixIcon(
            name = "RainbowFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 4c6.075 0 11 4.925 11 11v5h-3v-5C20 10.665 16.552 7.135 12.249 7.004L12 7C7.665 7 4.135 10.448 4.004 14.751L4 15v5h-3v-5C1 8.925 5.925 4 12 4ZM12 8c3.866 0 7 3.134 7 7v5h-3v-5c0-2.142-1.684-3.891-3.8-3.995L12 11C9.858 11 8.109 12.684 8.005 14.8L8 15v5h-3v-5C5 11.134 8.134 8 12 8ZM12 12c1.657 0 3 1.343 3 3v5h-6v-5c0-1.657 1.343-3 3-3Z"),
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
        return _rainbowFill!!
    }

private var _rainbowFill: ImageVector? = null
