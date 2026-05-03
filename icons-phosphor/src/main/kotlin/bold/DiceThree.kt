package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DiceThree: ImageVector
    get() {
        if (_diceThree != null) return _diceThree!!
        _diceThree = phosphorBoldIcon(
            name = "DiceThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 28.000 L 64.000 28.000 C 44.118 28.000 28.000 44.118 28.000 64.000 L 28.000 192.000 C 28.000 211.882 44.118 228.000 64.000 228.000 L 192.000 228.000 C 211.882 228.000 228.000 211.882 228.000 192.000 L 228.000 64.000 C 228.000 44.118 211.882 28.000 192.000 28.000 ZM 204.000 192.000 C 204.000 198.627 198.627 204.000 192.000 204.000 L 64.000 204.000 C 57.373 204.000 52.000 198.627 52.000 192.000 L 52.000 64.000 C 52.000 57.373 57.373 52.000 64.000 52.000 L 192.000 52.000 C 198.627 52.000 204.000 57.373 204.000 64.000 ZM 104.000 88.000 C 104.000 96.837 96.837 104.000 88.000 104.000 C 79.163 104.000 72.000 96.837 72.000 88.000 C 72.000 79.163 79.163 72.000 88.000 72.000 C 96.837 72.000 104.000 79.163 104.000 88.000 ZM 144.000 128.000 C 144.000 136.837 136.837 144.000 128.000 144.000 C 119.163 144.000 112.000 136.837 112.000 128.000 C 112.000 119.163 119.163 112.000 128.000 112.000 C 136.837 112.000 144.000 119.163 144.000 128.000 ZM 184.000 168.000 C 184.000 176.837 176.837 184.000 168.000 184.000 C 159.163 184.000 152.000 176.837 152.000 168.000 C 152.000 159.163 159.163 152.000 168.000 152.000 C 176.837 152.000 184.000 159.163 184.000 168.000 Z"),
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
        return _diceThree!!
    }

private var _diceThree: ImageVector? = null
