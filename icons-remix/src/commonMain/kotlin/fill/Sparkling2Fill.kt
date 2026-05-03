package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Sparkling2Fill: ImageVector
    get() {
        if (_sparkling2Fill != null) return _sparkling2Fill!!
        _sparkling2Fill = remixIcon(
            name = "Sparkling2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.001 1.208 L 18.319 3.681 L 20.792 5.000 L 18.319 6.319 L 17.001 8.792 L 15.682 6.319 L 13.209 5.000 L 15.682 3.681 L 17.001 1.208 ZM 8.001 4.333 L 10.667 9.333 L 15.667 12.000 L 10.667 14.667 L 8.001 19.667 L 5.334 14.667 L 0.334 12.000 L 5.334 9.333 L 8.001 4.333 ZM 19.667 16.333 L 18.001 13.208 L 16.334 16.333 L 13.209 18.000 L 16.334 19.667 L 18.001 22.792 L 19.667 19.667 L 22.792 18.000 L 19.667 16.333 Z"),
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
        return _sparkling2Fill!!
    }

private var _sparkling2Fill: ImageVector? = null
