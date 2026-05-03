package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Eye: ImageVector
    get() {
        if (_eye != null) return _eye!!
        _eye = phosphorBoldIcon(
            name = "Eye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 251.000 123.130 C 250.630 122.320 241.870 102.870 222.520 83.520 C 196.630 57.670 164.000 44.000 128.000 44.000 C 92.000 44.000 59.370 57.670 33.510 83.520 C 14.160 102.870 5.400 122.320 5.000 123.130 C 3.630 126.236 3.630 129.774 5.000 132.880 C 5.370 133.700 14.130 153.140 33.490 172.490 C 59.370 198.340 92.000 212.000 128.000 212.000 C 164.000 212.000 196.630 198.340 222.480 172.490 C 241.840 153.140 250.600 133.700 250.970 132.880 C 252.349 129.779 252.360 126.240 251.000 123.130 ZM 204.940 156.130 C 183.470 177.270 157.590 188.000 128.000 188.000 C 98.410 188.000 72.530 177.270 51.090 156.120 C 42.653 147.772 35.396 138.312 29.520 128.000 C 35.398 117.693 42.655 108.235 51.090 99.890 C 72.540 78.730 98.410 68.000 128.000 68.000 C 157.590 68.000 183.460 78.730 204.910 99.890 C 213.346 108.235 220.603 117.692 226.480 128.000 C 220.603 138.311 213.346 147.772 204.910 156.120 ZM 128.000 84.000 C 103.699 84.000 84.000 103.699 84.000 128.000 C 84.000 152.301 103.699 172.000 128.000 172.000 C 152.301 172.000 172.000 152.301 172.000 128.000 C 171.972 103.711 152.289 84.028 128.000 84.000 ZM 128.000 148.000 C 116.954 148.000 108.000 139.046 108.000 128.000 C 108.000 116.954 116.954 108.000 128.000 108.000 C 139.046 108.000 148.000 116.954 148.000 128.000 C 148.000 139.046 139.046 148.000 128.000 148.000 Z"),
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
        return _eye!!
    }

private var _eye: ImageVector? = null
