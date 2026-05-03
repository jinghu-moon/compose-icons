package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Trophy: ImageVector
    get() {
        if (_trophy != null) return _trophy!!
        _trophy = phosphorBoldIcon(
            name = "Trophy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 60.000 L 212.000 60.000 L 212.000 48.000 C 212.000 41.373 206.627 36.000 200.000 36.000 L 56.000 36.000 C 49.373 36.000 44.000 41.373 44.000 48.000 L 44.000 60.000 L 24.000 60.000 C 12.954 60.000 4.000 68.954 4.000 80.000 L 4.000 96.000 C 4.028 120.289 23.711 139.972 48.000 140.000 L 48.770 140.000 C 59.215 169.431 85.095 190.660 116.000 195.150 L 116.000 212.000 L 96.000 212.000 C 89.373 212.000 84.000 217.373 84.000 224.000 C 84.000 230.627 89.373 236.000 96.000 236.000 L 160.000 236.000 C 166.627 236.000 172.000 230.627 172.000 224.000 C 172.000 217.373 166.627 212.000 160.000 212.000 L 140.000 212.000 L 140.000 195.110 C 170.940 190.600 196.530 168.910 207.000 140.000 L 208.000 140.000 C 232.289 139.972 251.972 120.289 252.000 96.000 L 252.000 80.000 C 252.000 68.954 243.046 60.000 232.000 60.000 ZM 28.000 96.000 L 28.000 84.000 L 44.000 84.000 L 44.000 112.000 C 44.000 113.210 44.000 114.410 44.090 115.610 C 34.737 113.746 28.002 105.537 28.000 96.000 ZM 188.000 111.100 C 188.000 144.430 161.290 171.750 128.460 172.000 C 112.467 172.123 97.088 165.855 85.736 154.590 C 74.384 143.324 68.000 127.993 68.000 112.000 L 68.000 60.000 L 188.000 60.000 ZM 228.000 96.000 C 228.000 105.550 221.248 113.767 211.880 115.620 C 211.960 114.120 212.000 112.620 212.000 111.100 L 212.000 84.000 L 228.000 84.000 Z"),
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
        return _trophy!!
    }

private var _trophy: ImageVector? = null
