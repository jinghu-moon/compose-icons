package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PhoneDisconnect: ImageVector
    get() {
        if (_phoneDisconnect != null) return _phoneDisconnect!!
        _phoneDisconnect = phosphorBoldIcon(
            name = "PhoneDisconnect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 234.390 87.290 C 176.720 29.570 79.280 29.570 21.610 87.290 C 0.160 108.760 -1.910 140.420 16.610 164.290 C 22.020 171.220 31.320 173.805 39.530 170.660 L 88.400 153.290 L 88.850 153.130 C 95.116 150.608 99.685 145.095 101.000 138.470 L 106.440 111.230 C 120.360 106.901 135.262 106.869 149.200 111.140 L 155.000 138.620 C 156.365 145.178 160.922 150.618 167.140 153.110 L 167.590 153.280 L 216.530 170.650 C 224.737 173.790 234.032 171.206 239.440 164.280 C 257.910 140.420 255.840 108.760 234.390 87.290 ZM 222.160 147.190 L 178.000 131.500 L 172.240 104.000 C 170.805 97.127 165.871 91.509 159.240 89.200 C 138.834 82.210 116.675 82.260 96.300 89.340 C 89.681 91.696 84.785 97.352 83.400 104.240 L 78.000 131.530 L 33.840 147.190 C 24.680 133.340 26.430 116.420 38.570 104.270 C 62.810 80.000 95.410 67.880 128.000 67.880 C 160.590 67.880 193.190 80.000 217.430 104.270 C 229.570 116.420 231.320 133.350 222.160 147.190 ZM 228.000 200.000 C 228.000 206.627 222.627 212.000 216.000 212.000 L 40.000 212.000 C 33.373 212.000 28.000 206.627 28.000 200.000 C 28.000 193.373 33.373 188.000 40.000 188.000 L 216.000 188.000 C 222.627 188.000 228.000 193.373 228.000 200.000 Z"),
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
        return _phoneDisconnect!!
    }

private var _phoneDisconnect: ImageVector? = null
