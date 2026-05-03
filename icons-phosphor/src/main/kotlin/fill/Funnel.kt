package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Funnel: ImageVector
    get() {
        if (_funnel != null) return _funnel!!
        _funnel = phosphorFillIcon(
            name = "Funnel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 227.810 66.760 L 227.730 66.850 L 160.000 139.170 L 160.000 194.660 C 160.008 200.020 157.331 205.028 152.870 208.000 L 120.870 229.340 C 115.956 232.613 109.640 232.914 104.437 230.123 C 99.234 227.333 95.991 221.904 96.000 216.000 L 96.000 139.170 L 28.270 66.850 L 28.190 66.760 C 23.935 62.078 22.839 55.328 25.394 49.540 C 27.948 43.752 33.673 40.012 40.000 40.000 L 216.000 40.000 C 222.332 40.001 228.068 43.736 230.630 49.526 C 233.192 55.317 232.098 62.074 227.840 66.760 Z"),
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
        return _funnel!!
    }

private var _funnel: ImageVector? = null
