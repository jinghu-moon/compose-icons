package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Heartbeat: ImageVector
    get() {
        if (_heartbeat != null) return _heartbeat!!
        _heartbeat = phosphorRegularIcon(
            name = "Heartbeat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 72.000 144.000 L 32.000 144.000 C 27.582 144.000 24.000 140.418 24.000 136.000 C 24.000 131.582 27.582 128.000 32.000 128.000 L 67.720 128.000 L 81.340 107.560 C 82.823 105.331 85.323 103.992 88.000 103.992 C 90.677 103.992 93.177 105.331 94.660 107.560 L 120.000 145.560 L 129.340 131.560 C 130.825 129.334 133.324 127.998 136.000 128.000 L 160.000 128.000 C 164.418 128.000 168.000 131.582 168.000 136.000 C 168.000 140.418 164.418 144.000 160.000 144.000 L 140.280 144.000 L 126.660 164.440 C 125.177 166.669 122.677 168.008 120.000 168.008 C 117.323 168.008 114.823 166.669 113.340 164.440 L 88.000 126.420 L 78.660 140.420 C 77.180 142.653 74.679 143.997 72.000 144.000 ZM 178.000 40.000 C 157.350 40.000 139.270 48.880 128.000 63.890 C 116.730 48.880 98.650 40.000 78.000 40.000 C 43.774 40.039 16.039 67.774 16.000 102.000 C 16.000 102.750 16.000 103.500 16.000 104.250 C 16.138 108.668 19.832 112.138 24.250 112.000 C 28.668 111.862 32.138 108.168 32.000 103.750 C 32.000 103.170 32.000 102.580 32.000 102.000 C 32.033 76.609 52.609 56.033 78.000 56.000 C 97.450 56.000 113.780 66.360 120.600 83.000 C 121.833 86.001 124.756 87.960 128.000 87.960 C 131.244 87.960 134.167 86.001 135.400 83.000 C 142.220 66.330 158.550 56.000 178.000 56.000 C 203.391 56.033 223.967 76.609 224.000 102.000 C 224.000 155.610 146.240 204.150 128.000 214.800 C 117.170 208.490 85.370 188.800 61.320 162.590 C 58.332 159.332 53.268 159.112 50.010 162.100 C 46.752 165.088 46.532 170.152 49.520 173.410 C 80.690 207.410 122.450 230.090 124.210 231.040 C 126.576 232.313 129.424 232.313 131.790 231.040 C 136.210 228.660 240.000 172.000 240.000 102.000 C 239.961 67.774 212.226 40.039 178.000 40.000 Z"),
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
        return _heartbeat!!
    }

private var _heartbeat: ImageVector? = null
