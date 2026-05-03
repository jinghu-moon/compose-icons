package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MicrophoneStage: ImageVector
    get() {
        if (_microphoneStage != null) return _microphoneStage!!
        _microphoneStage = phosphorDuotoneIcon(
            name = "MicrophoneStage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 156.500 151.000 L 59.000 222.450 C 55.818 224.782 51.412 224.446 48.620 221.660 L 34.320 207.360 C 31.551 204.566 31.225 200.173 33.550 197.000 L 105.000 99.500 L 105.000 99.500 C 109.770 125.707 130.275 146.220 156.480 151.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 168.000 16.000 C 128.251 16.039 96.039 48.251 96.000 88.000 C 96.007 91.150 96.218 94.297 96.630 97.420 L 27.120 192.220 C 22.417 198.581 23.094 207.429 28.710 213.000 L 43.000 227.290 C 48.571 232.906 57.419 233.583 63.780 228.880 L 158.590 159.350 C 161.709 159.768 164.853 159.986 168.000 160.000 C 207.764 160.000 240.000 127.765 240.000 88.000 C 240.000 48.235 207.764 16.000 168.000 16.000 ZM 224.000 88.000 C 224.014 100.088 220.097 111.853 212.840 121.520 L 134.490 43.160 C 151.464 30.482 174.140 28.469 193.082 37.958 C 212.024 47.448 223.990 66.814 224.000 88.000 ZM 54.320 216.000 L 40.000 201.680 L 102.140 117.000 C 109.421 133.439 122.561 146.579 139.000 153.860 ZM 112.000 88.000 C 111.984 75.915 115.901 64.153 123.160 54.490 L 201.500 132.830 C 184.527 145.501 161.858 147.511 142.920 138.025 C 123.982 128.539 112.017 109.181 112.000 88.000 ZM 109.650 146.340 C 112.772 149.464 112.772 154.526 109.650 157.650 L 101.650 165.650 C 99.648 167.757 96.660 168.613 93.846 167.885 C 91.031 167.156 88.834 164.959 88.105 162.144 C 87.377 159.330 88.233 156.342 90.340 154.340 L 98.340 146.340 C 99.840 144.833 101.877 143.986 104.003 143.984 C 106.129 143.982 108.168 144.826 109.670 146.330 Z"),
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
