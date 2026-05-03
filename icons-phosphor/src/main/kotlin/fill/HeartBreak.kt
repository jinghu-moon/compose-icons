package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HeartBreak: ImageVector
    get() {
        if (_heartBreak != null) return _heartBreak!!
        _heartBreak = phosphorFillIcon(
            name = "HeartBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 239.810 107.500 C 234.620 174.920 136.110 228.730 131.810 231.040 C 129.444 232.313 126.596 232.313 124.230 231.040 C 119.800 228.670 16.000 172.000 16.000 102.000 C 15.994 79.115 28.596 58.088 48.780 47.302 C 68.964 36.517 93.448 37.727 112.470 50.450 C 113.472 51.114 114.122 52.194 114.240 53.390 C 114.358 54.586 113.932 55.772 113.080 56.620 L 99.720 70.000 C 96.598 73.124 96.598 78.186 99.720 81.310 L 132.250 113.840 L 111.000 135.000 C 108.893 137.002 108.037 139.990 108.765 142.804 C 109.494 145.619 111.691 147.816 114.506 148.545 C 117.320 149.273 120.308 148.417 122.310 146.310 L 149.190 119.440 C 152.312 116.316 152.312 111.254 149.190 108.130 L 116.700 75.630 L 134.170 58.160 L 134.170 58.160 C 145.871 46.399 161.820 39.852 178.410 40.000 C 214.730 40.230 242.590 71.290 239.810 107.500 Z"),
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
        return _heartBreak!!
    }

private var _heartBreak: ImageVector? = null
