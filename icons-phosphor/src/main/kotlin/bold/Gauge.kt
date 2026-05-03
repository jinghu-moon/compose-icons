package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Gauge: ImageVector
    get() {
        if (_gauge != null) return _gauge!!
        _gauge = phosphorBoldIcon(
            name = "Gauge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 209.880 69.830 C 188.188 48.089 158.712 35.910 128.000 36.000 L 127.590 36.000 C 63.850 36.220 12.000 88.760 12.000 153.130 L 12.000 176.000 C 12.000 187.046 20.954 196.000 32.000 196.000 L 224.000 196.000 C 235.046 196.000 244.000 187.046 244.000 176.000 L 244.000 152.000 C 244.084 121.147 231.794 91.549 209.880 69.830 ZM 220.000 172.000 L 127.320 172.000 L 173.760 107.000 C 177.626 101.610 176.390 94.106 171.000 90.240 C 165.610 86.374 158.106 87.610 154.240 93.000 L 97.820 172.000 L 36.000 172.000 L 36.000 153.130 C 36.000 151.410 36.000 149.700 36.140 148.000 L 56.000 148.000 C 62.627 148.000 68.000 142.627 68.000 136.000 C 68.000 129.373 62.627 124.000 56.000 124.000 L 40.620 124.000 C 51.530 90.610 80.620 65.480 116.000 60.790 L 116.000 80.000 C 116.000 86.627 121.373 92.000 128.000 92.000 C 134.627 92.000 140.000 86.627 140.000 80.000 L 140.000 60.800 C 175.331 65.436 204.808 90.058 215.660 124.000 L 200.000 124.000 C 193.373 124.000 188.000 129.373 188.000 136.000 C 188.000 142.627 193.373 148.000 200.000 148.000 L 219.900 148.000 C 219.960 149.330 220.000 150.660 220.000 152.000 Z"),
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
        return _gauge!!
    }

private var _gauge: ImageVector? = null
