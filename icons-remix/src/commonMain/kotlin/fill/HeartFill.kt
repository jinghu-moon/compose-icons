package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HeartFill: ImageVector
    get() {
        if (_heartFill != null) return _heartFill!!
        _heartFill = remixIcon(
            name = "HeartFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.001 4.529 C 14.350 2.420 17.980 2.490 20.243 4.757 C 22.505 7.025 22.583 10.637 20.479 12.993 L 12.000 21.485 L 3.521 12.993 C 1.417 10.637 1.496 7.019 3.757 4.757 C 6.022 2.493 9.645 2.417 12.001 4.529 Z"),
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
        return _heartFill!!
    }

private var _heartFill: ImageVector? = null
