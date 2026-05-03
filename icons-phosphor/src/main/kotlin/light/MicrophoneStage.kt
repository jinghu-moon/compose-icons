package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MicrophoneStage: ImageVector
    get() {
        if (_microphoneStage != null) return _microphoneStage!!
        _microphoneStage = phosphorLightIcon(
            name = "MicrophoneStage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 168.000 18.000 C 147.687 17.986 128.371 26.805 115.076 42.162 C 101.780 57.519 95.818 77.898 98.740 98.000 L 28.740 193.460 C 24.624 199.021 25.216 206.760 30.130 211.630 L 44.430 225.930 C 49.302 230.840 57.038 231.432 62.600 227.320 L 158.060 157.320 C 183.956 160.955 209.719 149.853 224.861 128.534 C 240.003 107.214 242.000 79.232 230.038 55.979 C 218.076 32.725 194.150 18.078 168.000 18.000 ZM 226.000 88.000 C 226.012 101.309 221.419 114.212 213.000 124.520 L 131.490 43.000 C 148.844 28.889 172.768 26.025 192.963 35.640 C 213.157 45.255 226.015 65.634 226.000 88.000 ZM 55.500 217.590 C 54.703 218.175 53.598 218.090 52.900 217.390 L 38.610 203.100 C 37.910 202.402 37.825 201.297 38.410 200.500 L 102.630 112.940 C 109.774 131.537 124.472 146.230 143.070 153.370 ZM 110.000 88.000 C 109.995 74.692 114.587 61.791 123.000 51.480 L 204.530 133.000 C 187.166 147.080 163.255 149.927 143.070 140.318 C 122.885 130.710 110.020 110.355 110.000 88.000 ZM 108.250 147.750 C 109.377 148.875 110.010 150.403 110.010 151.995 C 110.010 153.587 109.377 155.115 108.250 156.240 L 100.250 164.240 C 97.906 166.584 94.104 166.584 91.760 164.240 C 89.416 161.896 89.416 158.094 91.760 155.750 L 99.760 147.750 C 100.884 146.619 102.413 145.982 104.008 145.980 C 105.603 145.978 107.133 146.612 108.260 147.740 Z"),
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
