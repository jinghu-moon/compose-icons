package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Shrimp: ImageVector
    get() {
        if (_shrimp != null) return _shrimp!!
        _shrimp = phosphorBoldIcon(
            name = "Shrimp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.000 60.000 C 244.000 42.327 229.673 28.000 212.000 28.000 L 128.000 28.000 C 125.791 28.000 124.000 26.209 124.000 24.000 C 124.000 17.373 118.627 12.000 112.000 12.000 C 105.373 12.000 100.000 17.373 100.000 24.000 C 100.000 39.464 112.536 52.000 128.000 52.000 L 212.000 52.000 C 216.418 52.000 220.000 55.582 220.000 60.000 C 220.000 64.418 216.418 68.000 212.000 68.000 L 96.900 68.000 C 50.430 68.000 12.340 105.400 12.000 151.370 C 11.832 173.757 20.608 195.285 36.379 211.175 C 52.150 227.064 73.612 236.001 96.000 236.000 L 152.000 236.000 C 158.627 236.000 164.000 230.627 164.000 224.000 C 164.000 217.373 158.627 212.000 152.000 212.000 L 124.000 212.000 L 124.000 196.000 L 168.000 196.000 C 174.627 196.000 180.000 190.627 180.000 184.000 C 180.000 177.373 174.627 172.000 168.000 172.000 L 112.000 172.000 C 107.582 172.000 104.000 168.418 104.000 164.000 C 104.000 159.582 107.582 156.000 112.000 156.000 L 152.000 156.000 C 190.884 155.951 223.477 126.597 227.580 87.930 C 237.710 82.283 243.992 71.598 244.000 60.000 ZM 96.900 92.000 L 100.000 92.000 L 100.000 134.340 C 95.084 136.340 90.738 139.525 87.350 143.610 L 43.350 123.610 C 54.117 104.113 74.627 92.006 96.900 92.000 ZM 36.000 151.540 C 36.000 149.930 36.110 148.330 36.250 146.750 L 80.120 166.690 C 80.237 168.134 80.457 169.568 80.780 170.980 L 51.310 192.000 C 41.314 180.910 35.850 166.469 36.000 151.540 ZM 96.000 212.000 C 87.657 212.012 79.403 210.278 71.770 206.910 L 94.430 190.730 C 96.187 191.885 98.053 192.866 100.000 193.660 L 100.000 212.000 ZM 152.000 132.000 L 124.000 132.000 L 124.000 92.000 L 202.600 92.000 C 197.013 115.430 176.087 131.972 152.000 132.000 Z"),
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
        return _shrimp!!
    }

private var _shrimp: ImageVector? = null
