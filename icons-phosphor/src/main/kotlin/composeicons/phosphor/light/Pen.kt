package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pen: ImageVector
    get() {
        if (_pen != null) return _pen!!
        _pen = phosphorLightIcon(
            name = "Pen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.91 74.79 181.22 30.1c-2.626-2.626-6.187-4.101-9.9-4.101-3.713 0-7.274 1.475-9.9 4.101L38.1 153.41c-2.631 2.622-4.107 6.186-4.1 9.9v44.69c0 7.732 6.268 14 14 14h44.69c3.714 .007 7.278-1.469 9.9-4.1l86.16-86.16 4.61 18.42-37.6 37.6c-1.535 1.512-2.142 3.732-1.588 5.815 .553 2.083 2.181 3.709 4.265 4.26 2.084 .551 4.303-.058 5.813-1.595l40-40c1.492-1.49 2.092-3.654 1.58-5.7l-7.18-28.7L225.91 94.59c2.626-2.626 4.101-6.187 4.101-9.9 0-3.713-1.475-7.274-4.101-9.9ZM46 208v-33.51L81.52 210h-33.52c-1.105 0-2-.895-2-2ZM96 207.51 48.48 160 136 72.49 183.52 120ZM217.42 86.1 192 111.52 144.49 64 169.9 38.59c.375-.376 .884-.587 1.415-.587 .531 0 1.04 .211 1.415 .587l44.69 44.68c.376 .375 .587 .884 .587 1.415 0 .531-.211 1.04-.587 1.415Z"),
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
        return _pen!!
    }

private var _pen: ImageVector? = null
