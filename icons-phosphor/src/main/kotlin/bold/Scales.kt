package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Scales: ImageVector
    get() {
        if (_scales != null) return _scales!!
        _scales = phosphorBoldIcon(
            name = "Scales",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 243.140 131.540 L 211.140 51.540 L 211.140 51.540 C 208.954 46.089 203.144 43.021 197.410 44.290 L 140.000 57.000 L 140.000 40.000 C 140.000 33.373 134.627 28.000 128.000 28.000 C 121.373 28.000 116.000 33.373 116.000 40.000 L 116.000 62.370 L 53.400 76.290 C 49.531 77.148 46.335 79.861 44.860 83.540 L 44.860 83.540 L 44.860 83.540 L 44.860 83.540 L 12.860 163.460 C 12.282 164.903 11.990 166.445 12.000 168.000 C 12.000 180.130 18.200 190.430 29.450 197.000 C 37.566 201.540 46.701 203.949 56.000 204.000 C 65.299 203.949 74.434 201.540 82.550 197.000 C 93.800 190.430 100.000 180.130 100.000 168.000 C 100.000 166.472 99.708 164.958 99.140 163.540 L 72.380 96.650 L 116.000 87.000 L 116.000 204.000 L 104.000 204.000 C 97.373 204.000 92.000 209.373 92.000 216.000 C 92.000 222.627 97.373 228.000 104.000 228.000 L 152.000 228.000 C 158.627 228.000 164.000 222.627 164.000 216.000 C 164.000 209.373 158.627 204.000 152.000 204.000 L 140.000 204.000 L 140.000 81.630 L 180.420 72.630 L 156.860 131.530 C 156.291 132.951 155.999 134.469 156.000 136.000 C 156.000 148.130 162.200 158.430 173.450 165.000 C 189.916 174.347 210.084 174.347 226.550 165.000 C 237.800 158.430 244.000 148.130 244.000 136.000 C 244.000 134.472 243.708 132.958 243.140 131.540 ZM 56.000 180.000 C 52.290 180.000 38.000 178.130 36.190 169.820 L 56.000 120.310 L 75.810 169.820 C 74.000 178.130 59.710 180.000 56.000 180.000 ZM 200.000 148.000 C 196.290 148.000 182.000 146.130 180.190 137.820 L 200.000 88.310 L 219.810 137.820 C 218.000 146.130 203.710 148.000 200.000 148.000 Z"),
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
        return _scales!!
    }

private var _scales: ImageVector? = null
