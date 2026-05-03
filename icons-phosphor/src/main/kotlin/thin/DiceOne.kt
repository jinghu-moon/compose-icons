package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DiceOne: ImageVector
    get() {
        if (_diceOne != null) return _diceOne!!
        _diceOne = phosphorThinIcon(
            name = "DiceOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 36.000 L 64.000 36.000 C 48.536 36.000 36.000 48.536 36.000 64.000 L 36.000 192.000 C 36.000 207.464 48.536 220.000 64.000 220.000 L 192.000 220.000 C 207.464 220.000 220.000 207.464 220.000 192.000 L 220.000 64.000 C 220.000 48.536 207.464 36.000 192.000 36.000 ZM 212.000 192.000 C 212.000 203.046 203.046 212.000 192.000 212.000 L 64.000 212.000 C 52.954 212.000 44.000 203.046 44.000 192.000 L 44.000 64.000 C 44.000 52.954 52.954 44.000 64.000 44.000 L 192.000 44.000 C 203.046 44.000 212.000 52.954 212.000 64.000 ZM 136.000 128.000 C 136.000 132.418 132.418 136.000 128.000 136.000 C 123.582 136.000 120.000 132.418 120.000 128.000 C 120.000 123.582 123.582 120.000 128.000 120.000 C 132.418 120.000 136.000 123.582 136.000 128.000 Z"),
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
        return _diceOne!!
    }

private var _diceOne: ImageVector? = null
