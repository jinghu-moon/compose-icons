package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CheckFat: ImageVector
    get() {
        if (_checkFat != null) return _checkFat!!
        _checkFat = phosphorBoldIcon(
            name = "CheckFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 246.150 65.460 L 246.080 65.380 L 222.150 41.850 C 214.360 34.062 201.738 34.039 193.920 41.800 L 103.920 130.630 L 70.060 97.780 C 62.236 90.041 49.630 90.077 41.850 97.860 L 17.850 121.860 C 10.056 129.668 10.056 142.312 17.850 150.120 L 89.470 222.120 C 93.221 225.872 98.309 227.981 103.615 227.981 C 108.921 227.981 114.009 225.872 117.760 222.120 L 246.150 93.740 C 253.958 85.930 253.958 73.270 246.150 65.460 ZM 103.610 202.330 L 37.640 136.000 L 56.000 117.610 L 95.650 156.000 C 100.335 160.538 107.788 160.503 112.430 155.920 L 208.000 61.610 L 226.320 79.610 Z"),
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
        return _checkFat!!
    }

private var _checkFat: ImageVector? = null
