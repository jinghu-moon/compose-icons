package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DiceTwo: ImageVector
    get() {
        if (_diceTwo != null) return _diceTwo!!
        _diceTwo = phosphorThinIcon(
            name = "DiceTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 36.000 L 64.000 36.000 C 48.536 36.000 36.000 48.536 36.000 64.000 L 36.000 192.000 C 36.000 207.464 48.536 220.000 64.000 220.000 L 192.000 220.000 C 207.464 220.000 220.000 207.464 220.000 192.000 L 220.000 64.000 C 220.000 48.536 207.464 36.000 192.000 36.000 ZM 212.000 192.000 C 212.000 203.046 203.046 212.000 192.000 212.000 L 64.000 212.000 C 52.954 212.000 44.000 203.046 44.000 192.000 L 44.000 64.000 C 44.000 52.954 52.954 44.000 64.000 44.000 L 192.000 44.000 C 203.046 44.000 212.000 52.954 212.000 64.000 ZM 116.000 108.000 C 116.000 112.418 112.418 116.000 108.000 116.000 C 103.582 116.000 100.000 112.418 100.000 108.000 C 100.000 103.582 103.582 100.000 108.000 100.000 C 112.418 100.000 116.000 103.582 116.000 108.000 ZM 156.000 148.000 C 156.000 152.418 152.418 156.000 148.000 156.000 C 143.582 156.000 140.000 152.418 140.000 148.000 C 140.000 143.582 143.582 140.000 148.000 140.000 C 152.418 140.000 156.000 143.582 156.000 148.000 Z"),
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
