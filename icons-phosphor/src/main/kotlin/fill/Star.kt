package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Star: ImageVector
    get() {
        if (_star != null) return _star!!
        _star = phosphorFillIcon(
            name = "Star",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 234.290 114.850 L 189.290 153.680 L 203.000 211.750 C 204.547 218.196 202.061 224.940 196.699 228.840 C 191.338 232.739 184.156 233.027 178.500 229.570 L 128.000 198.490 L 77.470 229.570 C 71.815 233.007 64.648 232.708 59.298 228.813 C 53.948 224.917 51.464 218.187 53.000 211.750 L 66.760 153.680 L 21.760 114.850 C 16.757 110.526 14.828 103.629 16.860 97.337 C 18.893 91.045 24.493 86.580 31.080 86.000 L 90.080 81.240 L 112.840 26.160 C 115.360 20.020 121.339 16.011 127.975 16.011 C 134.611 16.011 140.590 20.020 143.110 26.160 L 165.860 81.240 L 224.860 86.000 C 231.460 86.558 237.083 91.018 239.128 97.319 C 241.174 103.619 239.244 110.531 234.230 114.860 Z"),
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
        return _star!!
    }

private var _star: ImageVector? = null
