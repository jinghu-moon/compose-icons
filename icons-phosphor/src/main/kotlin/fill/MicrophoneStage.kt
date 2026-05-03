package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MicrophoneStage: ImageVector
    get() {
        if (_microphoneStage != null) return _microphoneStage!!
        _microphoneStage = phosphorFillIcon(
            name = "MicrophoneStage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 115.060 46.360 C 114.223 45.523 113.058 45.099 111.879 45.203 C 110.700 45.308 109.627 45.929 108.950 46.900 C 100.512 58.943 95.990 73.295 96.000 88.000 C 96.007 91.150 96.218 94.297 96.630 97.420 L 27.120 192.220 C 22.417 198.581 23.094 207.429 28.710 213.000 L 43.000 227.290 C 48.571 232.906 57.419 233.583 63.780 228.880 L 158.590 159.350 C 161.709 159.768 164.853 159.986 168.000 160.000 C 182.700 160.014 197.047 155.499 209.090 147.070 C 210.061 146.393 210.682 145.320 210.787 144.141 C 210.891 142.962 210.467 141.797 209.630 140.960 ZM 117.670 149.640 L 101.670 165.640 C 99.668 167.747 96.680 168.603 93.866 167.875 C 91.051 167.146 88.854 164.949 88.125 162.134 C 87.397 159.320 88.253 156.332 90.360 154.330 L 106.360 138.330 C 109.505 135.342 114.459 135.405 117.527 138.473 C 120.595 141.541 120.658 146.495 117.670 149.640 ZM 227.070 129.080 C 226.393 130.055 225.318 130.678 224.136 130.783 C 222.954 130.887 221.787 130.461 220.950 129.620 L 126.380 35.050 C 125.539 34.213 125.113 33.046 125.217 31.864 C 125.322 30.682 125.945 29.607 126.920 28.930 C 155.511 8.980 194.292 12.405 218.943 37.057 C 243.595 61.708 247.020 100.489 227.070 129.080 Z"),
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
        return _microphoneStage!!
    }

private var _microphoneStage: ImageVector? = null
