package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AirplaneLanding: ImageVector
    get() {
        if (_airplaneLanding != null) return _airplaneLanding!!
        _airplaneLanding = phosphorRegularIcon(
            name = "AirplaneLanding",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 256.000 216.000 C 256.000 220.418 252.418 224.000 248.000 224.000 L 104.000 224.000 C 99.582 224.000 96.000 220.418 96.000 216.000 C 96.000 211.582 99.582 208.000 104.000 208.000 L 248.000 208.000 C 252.418 208.000 256.000 211.582 256.000 216.000 ZM 229.840 191.700 L 53.210 142.240 C 35.962 137.366 24.039 121.643 24.000 103.720 L 24.000 48.000 C 24.000 42.857 26.472 38.027 30.644 35.019 C 34.817 32.012 40.181 31.193 45.060 32.820 L 50.530 34.640 C 52.854 35.412 54.697 37.207 55.530 39.510 L 66.130 68.880 L 96.000 77.390 L 96.000 48.000 C 96.000 42.857 98.472 38.027 102.644 35.019 C 106.817 32.012 112.181 31.193 117.060 32.820 L 122.530 34.640 C 124.720 35.370 126.488 37.010 127.380 39.140 L 149.880 92.770 L 210.720 109.770 C 228.004 114.624 239.962 130.367 240.000 148.320 L 240.000 184.000 C 239.999 186.503 238.827 188.861 236.832 190.373 C 234.837 191.885 232.250 192.376 229.840 191.700 ZM 224.000 148.320 C 223.971 137.546 216.793 128.101 206.420 125.190 L 141.850 107.190 C 139.494 106.534 137.567 104.835 136.620 102.580 L 114.000 48.670 L 112.000 48.000 L 112.000 88.000 C 112.002 90.510 110.825 92.875 108.823 94.388 C 106.821 95.901 104.224 96.387 101.810 95.700 L 57.810 83.160 C 55.331 82.450 53.347 80.588 52.480 78.160 L 41.790 48.590 L 40.000 48.000 L 40.000 103.720 C 40.027 114.476 47.180 123.911 57.530 126.840 L 224.000 173.450 Z"),
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
        return _airplaneLanding!!
    }

private var _airplaneLanding: ImageVector? = null
