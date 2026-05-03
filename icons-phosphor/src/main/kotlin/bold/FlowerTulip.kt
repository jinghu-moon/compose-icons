package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FlowerTulip: ImageVector
    get() {
        if (_flowerTulip != null) return _flowerTulip!!
        _flowerTulip = phosphorBoldIcon(
            name = "FlowerTulip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 44.000 C 196.439 43.989 184.980 46.167 174.230 50.420 C 158.430 26.020 134.510 13.840 133.370 13.270 C 129.990 11.579 126.010 11.579 122.630 13.270 C 121.490 13.840 97.570 26.020 81.770 50.420 C 71.020 46.167 59.561 43.989 48.000 44.000 C 41.373 44.000 36.000 49.373 36.000 56.000 L 36.000 96.000 C 36.058 142.151 70.251 181.139 116.000 187.220 L 116.000 212.580 L 85.370 197.270 C 79.462 194.420 72.360 196.841 69.424 202.707 C 66.489 208.573 68.807 215.710 74.630 218.730 L 122.630 242.730 C 126.010 244.421 129.990 244.421 133.370 242.730 L 181.370 218.730 C 185.269 216.849 187.852 213.014 188.131 208.695 C 188.409 204.375 186.340 200.240 182.715 197.874 C 179.090 195.508 174.472 195.277 170.630 197.270 L 140.000 212.580 L 140.000 187.220 C 185.749 181.139 219.942 142.151 220.000 96.000 L 220.000 56.000 C 220.000 49.373 214.627 44.000 208.000 44.000 ZM 128.000 37.940 C 134.370 42.100 145.130 50.250 153.210 62.140 C 142.928 69.784 134.344 79.479 128.000 90.610 C 121.653 79.481 113.069 69.787 102.790 62.140 C 110.870 50.250 121.630 42.100 128.000 37.940 ZM 60.000 96.000 L 60.000 69.060 C 92.389 74.912 115.959 103.087 116.000 136.000 L 116.000 162.940 C 83.614 157.084 60.045 128.911 60.000 96.000 ZM 196.000 96.000 C 195.955 128.911 172.386 157.084 140.000 162.940 L 140.000 136.000 C 140.041 103.087 163.611 74.912 196.000 69.060 Z"),
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
        return _flowerTulip!!
    }

private var _flowerTulip: ImageVector? = null
