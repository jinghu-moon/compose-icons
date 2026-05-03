package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DiceTwo: ImageVector
    get() {
        if (_diceTwo != null) return _diceTwo!!
        _diceTwo = phosphorBoldIcon(
            name = "DiceTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.000 28.000 L 64.000 28.000 C 44.118 28.000 28.000 44.118 28.000 64.000 L 28.000 192.000 C 28.000 211.882 44.118 228.000 64.000 228.000 L 192.000 228.000 C 211.882 228.000 228.000 211.882 228.000 192.000 L 228.000 64.000 C 228.000 44.118 211.882 28.000 192.000 28.000 ZM 204.000 192.000 C 204.000 198.627 198.627 204.000 192.000 204.000 L 64.000 204.000 C 57.373 204.000 52.000 198.627 52.000 192.000 L 52.000 64.000 C 52.000 57.373 57.373 52.000 64.000 52.000 L 192.000 52.000 C 198.627 52.000 204.000 57.373 204.000 64.000 ZM 120.000 104.000 C 120.000 112.837 112.837 120.000 104.000 120.000 C 95.163 120.000 88.000 112.837 88.000 104.000 C 88.000 95.163 95.163 88.000 104.000 88.000 C 112.837 88.000 120.000 95.163 120.000 104.000 ZM 168.000 152.000 C 168.000 160.837 160.837 168.000 152.000 168.000 C 143.163 168.000 136.000 160.837 136.000 152.000 C 136.000 143.163 143.163 136.000 152.000 136.000 C 160.837 136.000 168.000 143.163 168.000 152.000 Z"),
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
        return _diceTwo!!
    }

private var _diceTwo: ImageVector? = null
