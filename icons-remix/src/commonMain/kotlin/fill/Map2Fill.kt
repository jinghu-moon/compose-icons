package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Map2Fill: ImageVector
    get() {
        if (_map2Fill != null) return _map2Fill!!
        _map2Fill = remixIcon(
            name = "Map2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 5.000 L 9.000 2.000 L 15.000 5.000 L 21.303 2.299 C 21.557 2.190 21.851 2.307 21.960 2.561 C 21.986 2.624 22.000 2.691 22.000 2.758 L 22.000 19.000 L 15.000 22.000 L 9.000 19.000 L 2.697 21.701 C 2.443 21.810 2.149 21.692 2.040 21.439 C 2.014 21.376 2.000 21.309 2.000 21.242 L 2.000 5.000 ZM 15.000 19.764 L 15.000 7.176 L 14.935 7.204 L 9.000 4.236 L 9.000 16.824 L 9.065 16.796 L 15.000 19.764 Z"),
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
        return _map2Fill!!
    }

private var _map2Fill: ImageVector? = null
