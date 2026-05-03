package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Play: ImageVector
    get() {
        if (_play != null) return _play!!
        _play = phosphorThinIcon(
            name = "Play",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.320 117.900 L 86.240 29.790 C 82.532 27.490 77.862 27.401 74.070 29.560 C 70.305 31.629 67.975 35.594 68.000 39.890 L 68.000 216.110 C 67.975 220.406 70.305 224.371 74.070 226.440 C 77.862 228.599 82.532 228.510 86.240 226.210 L 230.320 138.100 C 233.847 135.956 236.000 132.127 236.000 128.000 C 236.000 123.873 233.847 120.044 230.320 117.900 ZM 226.140 131.270 L 82.060 219.390 C 80.818 220.154 79.258 220.180 77.990 219.460 C 76.752 218.802 75.982 217.512 75.990 216.110 L 75.990 39.890 C 75.982 38.488 76.752 37.198 77.990 36.540 C 79.258 35.820 80.818 35.846 82.060 36.610 L 226.140 124.730 C 227.296 125.414 228.004 126.657 228.004 128.000 C 228.004 129.343 227.296 130.586 226.140 131.270 Z"),
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
        return _play!!
    }

private var _play: ImageVector? = null
