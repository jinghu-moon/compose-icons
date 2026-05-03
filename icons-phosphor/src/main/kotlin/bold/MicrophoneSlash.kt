package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) return _microphoneSlash!!
        _microphoneSlash = phosphorBoldIcon(
            name = "MicrophoneSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 56.880 39.930 C 54.012 36.697 49.628 35.256 45.401 36.157 C 41.175 37.058 37.759 40.162 36.459 44.284 C 35.159 48.405 36.175 52.907 39.120 56.070 L 76.000 96.640 L 76.000 128.000 C 75.985 145.416 84.689 161.683 99.186 171.333 C 113.684 180.983 132.049 182.735 148.110 176.000 L 159.370 188.390 C 149.685 193.432 138.919 196.044 128.000 196.000 C 90.461 195.961 60.039 165.539 60.000 128.000 C 60.000 121.373 54.627 116.000 48.000 116.000 C 41.373 116.000 36.000 121.373 36.000 128.000 C 36.058 174.151 70.251 213.139 116.000 219.220 L 116.000 240.000 C 116.000 246.627 121.373 252.000 128.000 252.000 C 134.627 252.000 140.000 246.627 140.000 240.000 L 140.000 219.230 C 152.738 217.603 164.983 213.280 175.920 206.550 L 199.120 232.070 C 203.598 236.880 211.111 237.194 215.974 232.774 C 220.837 228.355 221.241 220.846 216.880 215.930 ZM 128.000 156.000 C 112.536 156.000 100.000 143.464 100.000 128.000 L 100.000 123.000 L 129.900 155.890 C 129.270 156.000 128.640 156.000 128.000 156.000 ZM 191.000 153.580 C 194.309 145.458 196.008 136.770 196.000 128.000 C 196.000 121.373 201.373 116.000 208.000 116.000 C 214.627 116.000 220.000 121.373 220.000 128.000 C 220.019 139.865 217.730 151.620 213.260 162.610 C 210.615 168.493 203.791 171.232 197.812 168.811 C 191.833 166.391 188.838 159.676 191.030 153.610 ZM 85.700 33.750 C 98.846 15.364 122.362 7.576 143.884 14.479 C 165.405 21.383 180.003 41.398 180.000 64.000 L 180.000 120.540 C 180.000 127.167 174.627 132.540 168.000 132.540 C 161.373 132.540 156.000 127.167 156.000 120.540 L 156.000 64.000 C 156.006 51.824 148.142 41.040 136.547 37.323 C 124.952 33.607 112.284 37.810 105.210 47.720 C 101.344 53.108 93.843 54.341 88.455 50.475 C 83.067 46.609 81.834 39.108 85.700 33.720 Z"),
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
        return _microphoneSlash!!
    }

private var _microphoneSlash: ImageVector? = null
