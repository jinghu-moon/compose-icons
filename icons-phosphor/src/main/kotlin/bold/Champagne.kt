package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Champagne: ImageVector
    get() {
        if (_champagne != null) return _champagne!!
        _champagne = phosphorBoldIcon(
            name = "Champagne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 153.700 12.290 C 152.093 7.347 147.487 4.001 142.290 4.000 L 97.690 4.000 C 92.493 4.001 87.887 7.347 86.280 12.290 C 80.125 32.036 75.327 52.180 71.920 72.580 C 64.480 117.920 67.640 150.440 81.290 169.240 C 87.699 178.197 97.227 184.432 108.000 186.720 L 108.000 228.000 L 96.000 228.000 C 89.373 228.000 84.000 233.373 84.000 240.000 C 84.000 246.627 89.373 252.000 96.000 252.000 L 144.000 252.000 C 150.627 252.000 156.000 246.627 156.000 240.000 C 156.000 233.373 150.627 228.000 144.000 228.000 L 132.000 228.000 L 132.000 186.720 C 142.770 184.430 152.294 178.195 158.700 169.240 C 172.360 150.440 175.510 117.920 168.070 72.580 C 164.659 52.179 159.858 32.036 153.700 12.290 ZM 133.360 28.000 C 135.440 35.250 138.500 46.700 141.280 60.000 L 98.700 60.000 C 101.480 46.700 104.540 35.250 106.620 28.000 ZM 139.270 155.140 C 134.870 161.140 128.750 164.000 119.990 164.000 C 111.230 164.000 105.110 161.180 100.710 155.140 C 91.880 143.000 89.710 117.880 94.460 84.000 L 145.520 84.000 C 150.270 117.880 148.100 143.000 139.270 155.140 ZM 240.000 56.000 C 240.000 64.837 232.837 72.000 224.000 72.000 C 215.163 72.000 208.000 64.837 208.000 56.000 C 208.000 47.163 215.163 40.000 224.000 40.000 C 232.837 40.000 240.000 47.163 240.000 56.000 ZM 180.000 20.000 C 180.000 11.163 187.163 4.000 196.000 4.000 C 204.837 4.000 212.000 11.163 212.000 20.000 C 212.000 28.837 204.837 36.000 196.000 36.000 C 187.163 36.000 180.000 28.837 180.000 20.000 ZM 216.000 104.000 C 216.000 112.837 208.837 120.000 200.000 120.000 C 191.163 120.000 184.000 112.837 184.000 104.000 C 184.000 95.163 191.163 88.000 200.000 88.000 C 208.837 88.000 216.000 95.163 216.000 104.000 Z"),
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
        return _champagne!!
    }

private var _champagne: ImageVector? = null
