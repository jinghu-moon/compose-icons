package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DiceTwo: ImageVector
    get() {
        if (_diceTwo != null) return _diceTwo!!
        _diceTwo = phosphorFillIcon(
            name = "DiceTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 32.000 L 64.000 32.000 C 46.327 32.000 32.000 46.327 32.000 64.000 L 32.000 192.000 C 32.000 209.673 46.327 224.000 64.000 224.000 L 192.000 224.000 C 209.673 224.000 224.000 209.673 224.000 192.000 L 224.000 64.000 C 224.000 46.327 209.673 32.000 192.000 32.000 ZM 108.000 120.000 C 101.373 120.000 96.000 114.627 96.000 108.000 C 96.000 101.373 101.373 96.000 108.000 96.000 C 114.627 96.000 120.000 101.373 120.000 108.000 C 120.000 114.627 114.627 120.000 108.000 120.000 ZM 148.000 160.000 C 141.373 160.000 136.000 154.627 136.000 148.000 C 136.000 141.373 141.373 136.000 148.000 136.000 C 154.627 136.000 160.000 141.373 160.000 148.000 C 160.000 154.627 154.627 160.000 148.000 160.000 Z"),
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
        return _diceTwo!!
    }

private var _diceTwo: ImageVector? = null
