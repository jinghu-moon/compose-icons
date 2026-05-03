package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.StandardDefinition: ImageVector
    get() {
        if (_standardDefinition != null) return _standardDefinition!!
        _standardDefinition = phosphorBoldIcon(
            name = "StandardDefinition",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 172.000 68.000 L 148.000 68.000 C 141.373 68.000 136.000 73.373 136.000 80.000 L 136.000 176.000 C 136.000 182.627 141.373 188.000 148.000 188.000 L 172.000 188.000 C 205.137 188.000 232.000 161.137 232.000 128.000 C 232.000 94.863 205.137 68.000 172.000 68.000 ZM 172.000 164.000 L 160.000 164.000 L 160.000 92.000 L 172.000 92.000 C 191.882 92.000 208.000 108.118 208.000 128.000 C 208.000 147.882 191.882 164.000 172.000 164.000 ZM 20.000 44.000 C 20.000 37.373 25.373 32.000 32.000 32.000 L 224.000 32.000 C 230.627 32.000 236.000 37.373 236.000 44.000 C 236.000 50.627 230.627 56.000 224.000 56.000 L 32.000 56.000 C 25.373 56.000 20.000 50.627 20.000 44.000 ZM 236.000 212.000 C 236.000 218.627 230.627 224.000 224.000 224.000 L 32.000 224.000 C 25.373 224.000 20.000 218.627 20.000 212.000 C 20.000 205.373 25.373 200.000 32.000 200.000 L 224.000 200.000 C 230.627 200.000 236.000 205.373 236.000 212.000 ZM 96.000 152.000 C 96.000 145.630 89.710 142.680 72.000 137.580 C 55.860 132.930 33.770 126.580 33.770 104.000 C 33.770 83.480 51.920 68.000 75.990 68.000 C 93.230 68.000 108.050 76.140 114.680 89.240 C 116.686 93.073 116.475 97.689 114.126 101.321 C 111.777 104.954 107.654 107.041 103.336 106.784 C 99.017 106.527 95.171 103.966 93.270 100.080 C 90.800 95.170 84.000 92.000 76.000 92.000 C 65.780 92.000 57.780 97.270 57.780 104.000 C 57.780 105.090 57.780 106.210 61.060 108.170 C 65.240 110.650 72.060 112.620 78.660 114.520 C 87.410 117.040 96.460 119.650 104.040 124.380 C 117.230 132.610 120.040 143.940 120.040 152.000 C 120.040 172.190 100.710 188.000 76.040 188.000 C 51.370 188.000 32.040 172.190 32.040 152.000 C 32.040 145.373 37.413 140.000 44.040 140.000 C 50.667 140.000 56.040 145.373 56.040 152.000 C 56.040 158.870 66.600 164.000 76.040 164.000 C 85.480 164.000 96.000 158.870 96.000 152.000 Z"),
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
        return _standardDefinition!!
    }

private var _standardDefinition: ImageVector? = null
