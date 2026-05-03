package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SkypeLogo: ImageVector
    get() {
        if (_skypeLogo != null) return _skypeLogo!!
        _skypeLogo = phosphorDuotoneIcon(
            name = "SkypeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 176.000 C 223.995 194.294 213.592 210.995 197.174 219.065 C 180.756 227.135 161.178 225.171 146.690 214.000 C 117.435 220.324 86.971 211.357 65.807 190.193 C 44.643 169.029 35.676 138.565 42.000 109.310 C 27.307 90.200 29.067 63.157 46.112 46.112 C 63.157 29.067 90.200 27.307 109.310 42.000 C 138.565 35.676 169.029 44.643 190.193 65.807 C 211.357 86.971 220.324 117.435 214.000 146.690 C 220.496 155.078 224.014 165.391 224.000 176.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 168.000 152.000 C 168.000 169.640 150.060 184.000 128.000 184.000 C 105.940 184.000 88.000 169.640 88.000 152.000 C 88.000 147.582 91.582 144.000 96.000 144.000 C 100.418 144.000 104.000 147.582 104.000 152.000 C 104.000 160.670 115.000 168.000 128.000 168.000 C 141.000 168.000 152.000 160.670 152.000 152.000 C 152.000 142.520 143.390 139.000 125.120 133.740 C 109.370 129.200 89.780 123.550 89.780 104.000 C 89.780 85.760 106.210 72.000 128.000 72.000 C 143.720 72.000 157.180 79.300 163.120 91.000 C 164.515 93.561 164.407 96.678 162.836 99.136 C 161.266 101.593 158.483 103.001 155.573 102.811 C 152.662 102.620 150.087 100.861 148.850 98.220 C 145.640 91.940 137.650 88.000 128.000 88.000 C 115.330 88.000 105.780 94.880 105.780 104.000 C 105.780 111.000 114.780 114.100 129.550 118.360 C 145.780 123.000 168.000 129.450 168.000 152.000 ZM 232.000 176.000 C 231.967 206.914 206.914 231.967 176.000 232.000 C 164.896 232.040 154.036 228.740 144.830 222.530 C 113.940 227.995 82.327 218.037 60.145 195.855 C 37.963 173.673 28.005 142.060 33.470 111.170 C 27.260 101.964 23.960 91.104 24.000 80.000 C 24.033 49.086 49.086 24.033 80.000 24.000 C 91.104 23.960 101.964 27.260 111.170 33.470 C 142.060 28.005 173.673 37.963 195.855 60.145 C 218.037 82.327 227.995 113.940 222.530 144.830 C 228.740 154.036 232.040 164.896 232.000 176.000 ZM 216.000 176.000 C 216.030 167.160 213.101 158.563 207.680 151.580 C 206.238 149.714 205.692 147.306 206.190 145.000 C 211.945 118.399 203.793 90.696 184.548 71.452 C 165.304 52.207 137.601 44.055 111.000 49.810 C 108.694 50.308 106.286 49.762 104.420 48.320 C 97.437 42.899 88.841 39.970 80.000 40.000 C 57.909 40.000 40.000 57.909 40.000 80.000 C 39.970 88.841 42.899 97.437 48.320 104.420 C 49.762 106.286 50.308 108.694 49.810 111.000 C 44.055 137.601 52.207 165.304 71.452 184.548 C 90.696 203.793 118.399 211.945 145.000 206.190 C 147.306 205.692 149.714 206.238 151.580 207.680 C 158.563 213.101 167.160 216.030 176.000 216.000 C 198.091 216.000 216.000 198.091 216.000 176.000 Z"),
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
        return _skypeLogo!!
    }

private var _skypeLogo: ImageVector? = null
