package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ShareFat: ImageVector
    get() {
        if (_shareFat != null) return _shareFat!!
        _shareFat = phosphorRegularIcon(
            name = "ShareFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 237.660 106.350 L 157.660 26.350 C 155.373 24.061 151.932 23.374 148.942 24.611 C 145.952 25.848 144.001 28.764 144.000 32.000 L 144.000 72.350 C 118.060 74.570 89.410 87.270 65.840 107.260 C 37.460 131.340 19.790 162.370 16.080 194.630 C 15.485 199.774 18.258 204.720 22.957 206.896 C 27.655 209.073 33.220 207.990 36.760 204.210 L 36.760 204.210 C 47.760 192.500 86.900 155.470 144.000 152.210 L 144.000 192.000 C 144.001 195.236 145.952 198.152 148.942 199.389 C 151.932 200.626 155.373 199.939 157.660 197.650 L 237.660 117.650 C 240.775 114.527 240.775 109.473 237.660 106.350 ZM 160.000 172.690 L 160.000 144.000 C 160.000 139.582 156.418 136.000 152.000 136.000 C 123.920 136.000 96.570 143.330 70.710 157.800 C 57.539 165.202 45.268 174.101 34.140 184.320 C 39.940 160.480 54.560 137.810 76.190 119.460 C 99.410 99.770 127.750 88.000 152.000 88.000 C 156.418 88.000 160.000 84.418 160.000 80.000 L 160.000 51.320 L 220.690 112.000 Z"),
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
        return _shareFat!!
    }

private var _shareFat: ImageVector? = null
