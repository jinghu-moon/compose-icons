package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DribbbleLogo: ImageVector
    get() {
        if (_dribbbleLogo != null) return _dribbbleLogo!!
        _dribbbleLogo = phosphorRegularIcon(
            name = "DribbbleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 215.650 120.180 Q 211.830 120.000 208.000 120.000 C 193.160 120.004 178.386 121.968 164.060 125.840 C 160.567 115.476 156.062 105.481 150.610 96.000 C 164.830 87.425 177.703 76.793 188.810 64.450 C 204.222 79.155 213.762 98.962 215.650 120.180 ZM 176.280 54.460 C 166.287 65.440 154.738 74.894 142.000 82.520 C 131.332 67.504 118.283 54.331 103.370 43.520 C 128.131 36.292 154.816 40.291 176.370 54.460 ZM 85.650 50.880 C 101.996 61.174 116.247 74.468 127.650 90.060 C 107.692 99.258 85.976 104.015 64.000 104.000 C 57.218 103.997 50.443 103.546 43.720 102.650 C 50.410 80.585 65.456 62.007 85.650 50.880 ZM 40.000 128.000 C 40.000 124.779 40.177 121.561 40.530 118.360 C 48.306 119.452 56.148 120.000 64.000 120.000 C 89.095 120.024 113.877 114.420 136.520 103.600 C 141.509 112.215 145.632 121.303 148.830 130.730 C 140.332 133.922 132.108 137.802 124.240 142.330 C 102.291 155.010 83.471 172.460 69.170 193.390 C 50.597 176.728 39.990 152.951 40.000 128.000 ZM 82.000 203.000 C 94.984 183.797 112.163 167.797 132.240 156.210 C 138.952 152.336 145.957 148.993 153.190 146.210 C 155.665 157.195 156.916 168.420 156.920 179.680 C 156.925 190.627 155.755 201.543 153.430 212.240 C 129.393 219.502 103.398 216.139 82.000 203.000 ZM 171.060 204.730 C 172.294 196.454 172.916 188.098 172.920 179.730 C 172.918 166.778 171.425 153.870 168.470 141.260 C 181.359 137.782 194.650 136.013 208.000 136.000 Q 211.800 136.000 215.610 136.190 C 212.892 164.955 196.246 190.561 171.060 204.720 Z"),
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
        return _dribbbleLogo!!
    }

private var _dribbbleLogo: ImageVector? = null
