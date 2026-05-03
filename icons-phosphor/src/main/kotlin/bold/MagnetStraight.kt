package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MagnetStraight: ImageVector
    get() {
        if (_magnetStraight != null) return _magnetStraight!!
        _magnetStraight = phosphorBoldIcon(
            name = "MagnetStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 36.000 L 160.000 36.000 C 148.954 36.000 140.000 44.954 140.000 56.000 L 140.000 144.000 C 140.000 150.627 134.627 156.000 128.000 156.000 C 121.373 156.000 116.000 150.627 116.000 144.000 L 116.000 56.000 C 116.000 44.954 107.046 36.000 96.000 36.000 L 56.000 36.000 C 44.954 36.000 36.000 44.954 36.000 56.000 L 36.000 144.000 C 36.000 194.810 77.190 236.000 128.000 236.000 L 128.710 236.000 C 179.050 235.620 220.010 193.900 220.010 143.000 L 220.010 56.000 C 220.010 50.694 217.901 45.605 214.149 41.854 C 210.396 38.103 205.306 35.997 200.000 36.000 ZM 196.000 60.000 L 196.000 84.000 L 164.000 84.000 L 164.000 60.000 ZM 92.000 60.000 L 92.000 84.000 L 60.000 84.000 L 60.000 60.000 ZM 128.520 212.000 L 128.000 212.000 C 90.445 212.000 60.000 181.555 60.000 144.000 L 60.000 108.000 L 92.000 108.000 L 92.000 144.000 C 92.000 163.882 108.118 180.000 128.000 180.000 C 147.882 180.000 164.000 163.882 164.000 144.000 L 164.000 108.000 L 196.000 108.000 L 196.000 143.000 C 196.000 180.770 165.730 211.720 128.520 212.000 Z"),
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
        return _magnetStraight!!
    }

private var _magnetStraight: ImageVector? = null
