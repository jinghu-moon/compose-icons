package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SkypeLogo: ImageVector
    get() {
        if (_skypeLogo != null) return _skypeLogo!!
        _skypeLogo = phosphorFillIcon(
            name = "SkypeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.530 144.830 C 227.995 113.940 218.037 82.327 195.855 60.145 C 173.673 37.963 142.060 28.005 111.170 33.470 C 101.964 27.260 91.104 23.960 80.000 24.000 C 49.086 24.033 24.033 49.086 24.000 80.000 C 23.960 91.104 27.260 101.964 33.470 111.170 C 28.005 142.060 37.963 173.673 60.145 195.855 C 82.327 218.037 113.940 227.995 144.830 222.530 C 154.036 228.740 164.896 232.040 176.000 232.000 C 206.914 231.967 231.967 206.914 232.000 176.000 C 232.040 164.896 228.740 154.036 222.530 144.830 ZM 128.000 184.000 C 105.940 184.000 88.000 169.640 88.000 152.000 C 88.000 147.582 91.582 144.000 96.000 144.000 C 100.418 144.000 104.000 147.582 104.000 152.000 C 104.000 160.670 115.000 168.000 128.000 168.000 C 141.000 168.000 152.000 160.670 152.000 152.000 C 152.000 142.520 143.390 139.000 125.120 133.740 C 109.370 129.200 89.780 123.550 89.780 104.000 C 89.780 85.760 106.210 72.000 128.000 72.000 C 143.720 72.000 157.180 79.300 163.120 91.000 C 164.515 93.561 164.407 96.678 162.836 99.136 C 161.266 101.593 158.483 103.001 155.573 102.811 C 152.662 102.620 150.087 100.861 148.850 98.220 C 145.640 91.940 137.650 88.000 128.000 88.000 C 115.330 88.000 105.780 94.880 105.780 104.000 C 105.780 111.000 114.780 114.100 129.550 118.360 C 145.780 123.000 168.000 129.450 168.000 152.000 C 168.000 169.640 150.060 184.000 128.000 184.000 Z"),
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
        return _skypeLogo!!
    }

private var _skypeLogo: ImageVector? = null
