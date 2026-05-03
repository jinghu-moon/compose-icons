package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Building2Fill: ImageVector
    get() {
        if (_building2Fill != null) return _building2Fill!!
        _building2Fill = remixIcon(
            name = "Building2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 19.000 L 14.000 19.000 L 14.000 6.000 L 20.394 8.740 C 20.762 8.898 21.000 9.259 21.000 9.659 L 21.000 19.000 L 23.000 19.000 L 23.000 21.000 L 1.000 21.000 L 1.000 19.000 L 3.000 19.000 L 3.000 5.650 C 3.000 5.255 3.233 4.897 3.594 4.736 L 11.297 1.313 C 11.549 1.200 11.845 1.314 11.957 1.566 C 11.985 1.630 12.000 1.699 12.000 1.769 L 12.000 19.000 Z"),
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
        return _building2Fill!!
    }

private var _building2Fill: ImageVector? = null
