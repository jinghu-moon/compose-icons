package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DiceTwo: ImageVector
    get() {
        if (_diceTwo != null) return _diceTwo!!
        _diceTwo = phosphorRegularIcon(
            name = "DiceTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 32h-128C46.327 32 32 46.327 32 64v128c0 17.673 14.327 32 32 32h128c17.673 0 32-14.327 32-32v-128C224 46.327 209.673 32 192 32ZM208 192c0 8.837-7.163 16-16 16h-128c-8.837 0-16-7.163-16-16v-128C48 55.163 55.163 48 64 48h128c8.837 0 16 7.163 16 16ZM120 108c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM160 148c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
