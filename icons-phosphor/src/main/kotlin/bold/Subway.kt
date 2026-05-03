package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Subway: ImageVector
    get() {
        if (_subway != null) return _subway!!
        _subway = phosphorBoldIcon(
            name = "Subway",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 96.000 L 228.000 208.000 C 228.000 214.627 222.627 220.000 216.000 220.000 C 209.373 220.000 204.000 214.627 204.000 208.000 L 204.000 96.000 C 203.967 67.295 180.705 44.033 152.000 44.000 L 104.000 44.000 C 75.295 44.033 52.033 67.295 52.000 96.000 L 52.000 208.000 C 52.000 214.627 46.627 220.000 40.000 220.000 C 33.373 220.000 28.000 214.627 28.000 208.000 L 28.000 96.000 C 28.044 54.045 62.045 20.044 104.000 20.000 L 152.000 20.000 C 193.955 20.044 227.956 54.045 228.000 96.000 ZM 188.000 96.000 L 188.000 168.000 C 187.997 179.950 180.410 190.582 169.110 194.470 L 171.110 199.540 C 173.573 205.692 170.582 212.677 164.430 215.140 C 163.022 215.708 161.518 215.999 160.000 216.000 C 155.095 216.000 150.683 213.014 148.860 208.460 L 143.860 196.000 L 112.120 196.000 L 107.120 208.460 C 105.300 213.007 100.898 215.992 96.000 216.000 C 94.472 216.003 92.957 215.711 91.540 215.140 C 85.388 212.677 82.397 205.692 84.860 199.540 L 86.860 194.470 C 75.572 190.572 67.998 179.943 68.000 168.000 L 68.000 96.000 C 68.000 80.536 80.536 68.000 96.000 68.000 L 160.000 68.000 C 175.464 68.000 188.000 80.536 188.000 96.000 ZM 92.000 96.000 L 92.000 132.000 L 164.000 132.000 L 164.000 96.000 C 164.000 93.791 162.209 92.000 160.000 92.000 L 96.000 92.000 C 93.791 92.000 92.000 93.791 92.000 96.000 ZM 164.000 168.000 L 164.000 156.000 L 140.000 156.000 L 140.000 172.000 L 160.000 172.000 C 162.209 172.000 164.000 170.209 164.000 168.000 ZM 116.000 172.000 L 116.000 156.000 L 92.000 156.000 L 92.000 168.000 C 92.000 170.209 93.791 172.000 96.000 172.000 Z"),
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
        return _subway!!
    }

private var _subway: ImageVector? = null
