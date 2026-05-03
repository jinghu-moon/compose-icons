package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DiceTwo: ImageVector
    get() {
        if (_diceTwo != null) return _diceTwo!!
        _diceTwo = phosphorLightIcon(
            name = "DiceTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 34.000 L 64.000 34.000 C 47.431 34.000 34.000 47.431 34.000 64.000 L 34.000 192.000 C 34.000 208.569 47.431 222.000 64.000 222.000 L 192.000 222.000 C 208.569 222.000 222.000 208.569 222.000 192.000 L 222.000 64.000 C 222.000 47.431 208.569 34.000 192.000 34.000 ZM 210.000 192.000 C 210.000 201.941 201.941 210.000 192.000 210.000 L 64.000 210.000 C 54.059 210.000 46.000 201.941 46.000 192.000 L 46.000 64.000 C 46.000 54.059 54.059 46.000 64.000 46.000 L 192.000 46.000 C 201.941 46.000 210.000 54.059 210.000 64.000 ZM 118.000 108.000 C 118.000 113.523 113.523 118.000 108.000 118.000 C 102.477 118.000 98.000 113.523 98.000 108.000 C 98.000 102.477 102.477 98.000 108.000 98.000 C 113.523 98.000 118.000 102.477 118.000 108.000 ZM 158.000 148.000 C 158.000 153.523 153.523 158.000 148.000 158.000 C 142.477 158.000 138.000 153.523 138.000 148.000 C 138.000 142.477 142.477 138.000 148.000 138.000 C 153.523 138.000 158.000 142.477 158.000 148.000 Z"),
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
