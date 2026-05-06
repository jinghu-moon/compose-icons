package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PencilLine: ImageVector
    get() {
        if (_pencilLine != null) return _pencilLine!!
        _pencilLine = phosphorLightIcon(
            name = "PencilLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.91 74.79 181.22 30.1c-2.626-2.626-6.187-4.101-9.9-4.101-3.713 0-7.274 1.475-9.9 4.101L38.1 153.41c-2.631 2.622-4.107 6.186-4.1 9.9v44.69c0 7.732 6.268 14 14 14h168c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-105.51L225.91 94.59c2.626-2.626 4.101-6.187 4.101-9.9 0-3.713-1.475-7.274-4.101-9.9ZM76.49 188 164 100.48 183.52 120 96 207.51ZM68 179.52 48.49 160 136 72.49 155.52 92ZM46 208v-33.52L81.52 210h-33.52c-1.105 0-2-.895-2-2ZM217.42 86.1 192 111.52 144.49 64 169.9 38.59c.375-.376 .884-.587 1.415-.587 .531 0 1.04 .211 1.415 .587l44.69 44.68c.376 .375 .587 .884 .587 1.415 0 .531-.211 1.04-.587 1.415Z"),
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
        return _pencilLine!!
    }

private var _pencilLine: ImageVector? = null
