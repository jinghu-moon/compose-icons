package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NuclearPlant: ImageVector
    get() {
        if (_nuclearPlant != null) return _nuclearPlant!!
        _nuclearPlant = phosphorBoldIcon(
            name = "NuclearPlant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 92.830 50.000 C 97.630 21.082 122.687 -0.092 152.000 0.000 C 158.627 0.000 164.000 5.373 164.000 12.000 C 164.000 18.627 158.627 24.000 152.000 24.000 C 134.409 23.936 119.370 36.645 116.500 54.000 C 115.525 59.769 110.531 63.994 104.680 64.000 C 104.010 64.003 103.340 63.946 102.680 63.830 C 99.539 63.304 96.736 61.550 94.889 58.956 C 93.041 56.362 92.301 53.140 92.830 50.000 ZM 148.000 40.000 C 141.373 40.000 136.000 45.373 136.000 52.000 C 136.000 58.627 141.373 64.000 148.000 64.000 L 152.000 64.000 C 180.705 63.967 203.967 40.705 204.000 12.000 C 204.000 5.373 198.627 -0.000 192.000 -0.000 C 185.373 -0.000 180.000 5.373 180.000 12.000 C 180.000 27.464 167.464 40.000 152.000 40.000 ZM 252.000 216.000 C 252.000 222.627 246.627 228.000 240.000 228.000 L 16.000 228.000 C 9.373 228.000 4.000 222.627 4.000 216.000 C 4.000 209.373 9.373 204.000 16.000 204.000 L 32.150 204.000 C 44.620 177.470 58.350 139.590 59.870 99.190 C 60.248 88.444 69.098 79.945 79.850 80.000 L 168.190 80.000 C 178.886 79.989 187.698 88.395 188.190 99.080 C 190.190 143.200 210.650 185.560 220.770 204.000 L 240.000 204.000 C 246.627 204.000 252.000 209.373 252.000 216.000 ZM 164.400 104.000 L 148.400 104.000 C 150.760 142.590 163.890 178.530 175.870 204.000 L 193.650 204.000 C 181.920 180.520 167.000 143.660 164.400 104.000 ZM 58.480 204.000 L 149.480 204.000 C 137.820 177.120 126.370 141.850 124.290 104.000 L 83.670 104.000 C 81.590 141.850 70.140 177.120 58.480 204.000 Z"),
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
        return _nuclearPlant!!
    }

private var _nuclearPlant: ImageVector? = null
