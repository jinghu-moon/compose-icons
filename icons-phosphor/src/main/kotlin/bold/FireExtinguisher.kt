package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) return _fireExtinguisher!!
        _fireExtinguisher = phosphorBoldIcon(
            name = "FireExtinguisher",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 219.450 44.510 L 170.070 29.700 L 185.000 22.930 C 191.034 20.169 193.686 13.039 190.925 7.005 C 188.164 0.971 181.034 -1.681 175.000 1.080 L 133.220 20.080 C 87.969 21.625 52.065 58.722 52.000 104.000 L 52.000 208.000 C 52.000 214.627 57.373 220.000 64.000 220.000 C 70.627 220.000 76.000 214.627 76.000 208.000 L 76.000 180.000 L 92.000 180.000 L 92.000 232.000 C 92.000 243.046 100.954 252.000 112.000 252.000 L 160.000 252.000 C 171.046 252.000 180.000 243.046 180.000 232.000 L 180.000 104.000 C 179.968 84.335 166.913 67.069 148.000 61.680 L 148.000 48.130 L 212.550 67.500 C 213.669 67.836 214.832 68.005 216.000 68.000 C 221.950 67.994 226.997 63.630 227.861 57.744 C 228.726 51.857 225.147 46.226 219.450 44.510 ZM 76.000 156.000 L 76.000 104.000 C 76.038 75.501 96.085 50.948 124.000 45.210 L 124.000 61.680 C 105.083 67.063 92.026 84.332 92.000 104.000 L 92.000 156.000 ZM 116.000 228.000 L 116.000 180.000 L 156.000 180.000 L 156.000 228.000 ZM 156.000 104.000 L 156.000 156.000 L 116.000 156.000 L 116.000 104.000 C 116.000 92.954 124.954 84.000 136.000 84.000 C 147.046 84.000 156.000 92.954 156.000 104.000 Z"),
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
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null
