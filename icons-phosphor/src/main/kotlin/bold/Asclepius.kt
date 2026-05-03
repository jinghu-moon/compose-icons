package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Asclepius: ImageVector
    get() {
        if (_asclepius != null) return _asclepius!!
        _asclepius = phosphorBoldIcon(
            name = "Asclepius",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 91.820 60.000 L 92.000 60.000 C 98.627 60.000 104.000 54.627 104.000 48.000 C 104.000 41.373 98.627 36.000 92.000 36.000 L 60.000 36.000 C 35.711 36.028 16.028 55.711 16.000 80.000 L 16.000 88.000 C 16.000 94.627 21.373 100.000 28.000 100.000 L 48.000 100.000 C 70.740 99.973 89.725 82.644 91.820 60.000 ZM 48.000 76.000 L 40.400 76.000 C 42.301 66.687 50.495 59.998 60.000 60.000 L 67.600 60.000 C 65.699 69.313 57.505 76.002 48.000 76.000 ZM 224.000 79.000 L 224.000 80.000 C 223.972 104.289 204.289 123.972 180.000 124.000 L 140.000 124.000 L 140.000 196.000 L 148.000 196.000 C 154.627 196.000 160.000 190.627 160.000 184.000 C 160.018 180.580 158.561 177.318 156.000 175.050 C 152.690 172.223 151.171 167.825 152.030 163.557 C 152.889 159.290 155.992 155.822 160.138 154.496 C 164.285 153.170 168.824 154.193 172.000 157.170 C 183.123 167.121 186.953 182.904 181.627 196.846 C 176.301 210.788 162.925 219.999 148.000 220.000 L 140.000 220.000 L 140.000 232.000 C 140.000 238.627 134.627 244.000 128.000 244.000 C 121.373 244.000 116.000 238.627 116.000 232.000 L 116.000 220.000 L 92.000 220.000 C 85.373 220.000 80.000 214.627 80.000 208.000 C 80.000 201.373 85.373 196.000 92.000 196.000 L 116.000 196.000 L 116.000 124.000 L 100.000 124.000 C 94.149 123.991 89.144 128.204 88.155 133.971 C 87.166 139.738 90.480 145.378 96.000 147.320 C 102.263 149.529 105.549 156.397 103.340 162.660 C 101.131 168.923 94.263 172.209 88.000 170.000 C 71.378 164.216 61.375 147.263 64.349 129.917 C 67.322 112.571 82.401 99.917 100.000 100.000 L 116.000 100.000 L 116.000 24.000 C 116.000 17.373 121.373 12.000 128.000 12.000 C 134.627 12.000 140.000 17.373 140.000 24.000 L 140.000 100.000 L 180.000 100.000 C 191.046 100.000 200.000 91.046 200.000 80.000 L 200.000 79.000 C 199.973 68.518 191.482 60.027 181.000 60.000 L 164.000 60.000 C 157.373 60.000 152.000 54.627 152.000 48.000 C 152.000 41.373 157.373 36.000 164.000 36.000 L 181.000 36.000 C 204.737 36.028 223.972 55.263 224.000 79.000 Z"),
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
        return _asclepius!!
    }

private var _asclepius: ImageVector? = null
