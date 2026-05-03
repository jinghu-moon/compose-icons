package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TrainRegional: ImageVector
    get() {
        if (_trainRegional != null) return _trainRegional!!
        _trainRegional = phosphorBoldIcon(
            name = "TrainRegional",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 227.580 116.840 L 205.180 34.740 C 202.808 26.040 194.908 20.003 185.890 20.000 L 70.110 20.000 C 61.092 20.003 53.192 26.040 50.820 34.740 L 28.420 116.840 C 27.860 118.909 27.860 121.091 28.420 123.160 L 50.820 205.260 C 53.192 213.960 61.092 219.997 70.110 220.000 L 72.000 220.000 L 62.400 232.800 C 58.424 238.102 59.498 245.624 64.800 249.600 C 70.102 253.576 77.624 252.502 81.600 247.200 L 102.000 220.000 L 154.000 220.000 L 174.400 247.200 C 178.376 252.502 185.898 253.576 191.200 249.600 C 196.502 245.624 197.576 238.102 193.600 232.800 L 184.000 220.000 L 185.890 220.000 C 194.908 219.997 202.808 213.960 205.180 205.260 L 227.580 123.160 C 228.140 121.091 228.140 118.909 227.580 116.840 ZM 73.170 44.000 L 182.830 44.000 L 201.000 110.530 L 128.000 123.800 L 55.000 110.530 ZM 56.590 135.210 L 116.000 146.000 L 116.000 196.000 L 73.170 196.000 ZM 182.830 196.000 L 140.000 196.000 L 140.000 146.000 L 199.410 135.200 ZM 84.000 88.000 C 84.000 81.373 89.373 76.000 96.000 76.000 L 160.000 76.000 C 166.627 76.000 172.000 81.373 172.000 88.000 C 172.000 94.627 166.627 100.000 160.000 100.000 L 96.000 100.000 C 89.373 100.000 84.000 94.627 84.000 88.000 Z"),
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
        return _trainRegional!!
    }

private var _trainRegional: ImageVector? = null
