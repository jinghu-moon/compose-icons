package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MicrophoneStage: ImageVector
    get() {
        if (_microphoneStage != null) return _microphoneStage!!
        _microphoneStage = phosphorThinIcon(
            name = "MicrophoneStage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 168.000 20.000 C 130.463 20.044 100.044 50.463 100.000 88.000 C 99.999 91.513 100.273 95.020 100.820 98.490 L 30.340 194.590 C 26.814 199.360 27.325 205.996 31.540 210.170 L 45.830 224.470 C 50.009 228.677 56.641 229.184 61.410 225.660 L 157.520 155.180 C 182.775 159.138 208.116 148.598 223.114 127.897 C 238.113 107.196 240.234 79.832 228.605 57.067 C 216.977 34.302 193.563 19.982 168.000 20.000 ZM 228.000 88.000 C 228.011 102.528 222.724 116.561 213.130 127.470 L 128.540 42.870 C 146.241 27.348 171.389 23.625 192.827 33.353 C 214.266 43.080 228.025 64.458 228.000 88.000 ZM 56.680 219.210 C 55.086 220.380 52.876 220.210 51.480 218.810 L 37.190 204.520 C 35.790 203.124 35.620 200.914 36.790 199.320 L 103.250 108.700 C 109.994 129.614 126.386 146.006 147.300 152.750 ZM 108.000 88.000 C 107.996 73.473 113.282 59.443 122.870 48.530 L 207.470 133.130 C 189.754 148.604 164.630 152.298 143.210 142.579 C 121.789 132.861 108.023 111.522 108.000 88.000 ZM 106.830 149.170 C 108.388 150.731 108.388 153.259 106.830 154.820 L 98.830 162.820 C 97.839 163.914 96.326 164.373 94.894 164.014 C 93.462 163.656 92.344 162.538 91.986 161.106 C 91.627 159.674 92.086 158.161 93.180 157.170 L 101.180 149.170 C 101.929 148.418 102.946 147.994 104.008 147.992 C 105.070 147.990 106.088 148.410 106.840 149.160 Z"),
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
        return _microphoneStage!!
    }

private var _microphoneStage: ImageVector? = null
