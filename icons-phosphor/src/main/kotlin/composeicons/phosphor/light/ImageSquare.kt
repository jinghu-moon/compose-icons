package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ImageSquare: ImageVector
    get() {
        if (_imageSquare != null) return _imageSquare!!
        _imageSquare = phosphorLightIcon(
            name = "ImageSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 34h-160C40.268 34 34 40.268 34 48v160c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM46 208v-160c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2v82.2L181.9 102.1C179.274 99.474 175.713 97.999 172 97.999c-3.713 0-7.274 1.475-9.9 4.101L54.2 210h-6.2c-1.105 0-2-.895-2-2ZM208 210h-136.83l99.41-99.41c.375-.376 .884-.587 1.415-.587 .531 0 1.04 .211 1.415 .587L210 147.17v60.83c0 1.105-.895 2-2 2ZM96 118c12.15 0 22-9.85 22-22C118 83.85 108.15 74 96 74 83.85 74 74 83.85 74 96c0 12.15 9.85 22 22 22ZM96 86c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C90.477 106 86 101.523 86 96 86 90.477 90.477 86 96 86Z"),
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
        return _imageSquare!!
    }

private var _imageSquare: ImageVector? = null
