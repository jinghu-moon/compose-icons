package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Pepper: ImageVector
    get() {
        if (_pepper != null) return _pepper!!
        _pepper = phosphorFillIcon(
            name = "Pepper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 167.270 40.420 C 163.616 21.613 147.158 8.026 128.000 8.000 C 123.582 8.000 120.000 11.582 120.000 16.000 C 120.000 20.418 123.582 24.000 128.000 24.000 C 138.427 24.000 147.661 30.733 150.850 40.660 C 119.384 45.240 96.036 72.202 96.000 104.000 C 96.000 150.750 70.250 182.000 19.470 197.000 C 12.317 199.085 7.550 205.831 7.973 213.269 C 8.396 220.707 13.897 226.869 21.240 228.130 C 36.270 230.728 51.497 232.023 66.750 232.000 C 107.530 232.000 152.910 222.850 184.280 196.540 C 210.640 174.440 224.000 143.300 224.000 104.000 L 224.000 104.000 C 223.965 71.481 199.575 44.145 167.270 40.420 ZM 192.000 95.000 L 163.580 80.830 C 161.327 79.702 158.673 79.702 156.420 80.830 L 128.000 95.000 L 114.630 88.320 C 121.313 68.972 139.530 55.990 160.000 55.990 C 180.470 55.990 198.687 68.972 205.370 88.320 Z"),
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
        return _pepper!!
    }

private var _pepper: ImageVector? = null
