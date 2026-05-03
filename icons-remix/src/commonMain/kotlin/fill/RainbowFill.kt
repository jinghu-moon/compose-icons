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
                pathData = parseSvgPathData("M 12.000 4.000 C 18.075 4.000 23.000 8.925 23.000 15.000 L 23.000 20.000 L 20.000 20.000 L 20.000 15.000 C 20.000 10.665 16.552 7.135 12.249 7.004 L 12.000 7.000 C 7.665 7.000 4.135 10.448 4.004 14.751 L 4.000 15.000 L 4.000 20.000 L 1.000 20.000 L 1.000 15.000 C 1.000 8.925 5.925 4.000 12.000 4.000 ZM 12.000 8.000 C 15.866 8.000 19.000 11.134 19.000 15.000 L 19.000 20.000 L 16.000 20.000 L 16.000 15.000 C 16.000 12.858 14.316 11.109 12.200 11.005 L 12.000 11.000 C 9.858 11.000 8.109 12.684 8.005 14.800 L 8.000 15.000 L 8.000 20.000 L 5.000 20.000 L 5.000 15.000 C 5.000 11.134 8.134 8.000 12.000 8.000 ZM 12.000 12.000 C 13.657 12.000 15.000 13.343 15.000 15.000 L 15.000 20.000 L 9.000 20.000 L 9.000 15.000 C 9.000 13.343 10.343 12.000 12.000 12.000 Z"),
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
