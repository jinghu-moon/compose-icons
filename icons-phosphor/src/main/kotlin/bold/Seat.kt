package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Seat: ImageVector
    get() {
        if (_seat != null) return _seat!!
        _seat = phosphorBoldIcon(
            name = "Seat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 232.000 C 228.000 238.627 222.627 244.000 216.000 244.000 L 112.000 244.000 C 105.373 244.000 100.000 238.627 100.000 232.000 C 100.000 225.373 105.373 220.000 112.000 220.000 L 216.000 220.000 C 222.627 220.000 228.000 225.373 228.000 232.000 ZM 228.000 160.000 L 228.000 188.000 C 228.000 199.046 219.046 208.000 208.000 208.000 L 112.100 208.000 C 104.516 208.023 97.579 203.734 94.210 196.940 L 38.100 85.000 C 35.300 79.362 35.300 72.738 38.100 67.100 L 60.220 23.000 C 65.138 13.164 77.074 9.144 86.940 14.000 L 116.750 28.270 L 116.930 28.360 C 126.810 33.298 130.817 45.310 125.880 55.190 L 125.710 55.520 L 112.500 80.080 L 142.250 140.000 L 208.000 140.000 C 219.046 140.000 228.000 148.954 228.000 160.000 ZM 204.000 164.000 L 139.770 164.000 C 132.186 164.023 125.249 159.734 121.880 152.940 L 90.090 88.940 C 87.295 83.315 87.295 76.705 90.090 71.080 C 90.150 70.970 90.210 70.860 90.260 70.750 L 102.460 48.130 L 79.910 37.300 L 60.470 76.000 L 114.570 184.000 L 204.000 184.000 Z"),
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
        return _seat!!
    }

private var _seat: ImageVector? = null
