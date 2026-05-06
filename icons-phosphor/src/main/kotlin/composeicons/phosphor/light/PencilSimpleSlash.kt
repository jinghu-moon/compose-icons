package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PencilSimpleSlash: ImageVector
    get() {
        if (_pencilSimpleSlash != null) return _pencilSimpleSlash!!
        _pencilSimpleSlash = phosphorLightIcon(
            name = "PencilSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52.44 36c-2.277-2.113-5.79-2.139-8.098-.06-2.308 2.079-2.647 5.576-.782 8.06L93.05 98.47 38.1 153.42c-2.632 2.617-4.109 6.178-4.1 9.89v44.69c0 7.732 6.268 14 14 14h44.69c3.714 .007 7.278-1.469 9.9-4.1L154.46 166l49.11 54c2.231 2.452 6.028 2.631 8.48 .4 2.452-2.231 2.631-6.028 .4-8.48ZM94.1 209.42c-.375 .372-.882 .58-1.41 .58h-44.69c-1.105 0-2-.895-2-2v-44.69c.002-.53 .214-1.037 .59-1.41l54.54-54.54 45.25 49.78ZM225.91 74.79 181.22 30.1c-2.626-2.626-6.187-4.101-9.9-4.101-3.713 0-7.274 1.475-9.9 4.101L119.75 71.77c-2.312 2.347-2.299 6.12 .029 8.451 2.328 2.331 6.101 2.349 8.451 .039L136 72.48 183.52 120l-10.44 10.44c-1.535 1.512-2.142 3.732-1.588 5.815 .553 2.083 2.181 3.709 4.265 4.26 2.084 .551 4.303-.058 5.813-1.595L225.91 94.59c2.626-2.626 4.101-6.187 4.101-9.9 0-3.713-1.475-7.274-4.101-9.9ZM217.42 86.1 192 111.52 144.49 64 169.91 38.59c.78-.775 2.04-.775 2.82 0l44.69 44.68c.376 .375 .587 .884 .587 1.415 0 .531-.211 1.04-.587 1.415Z"),
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
        return _pencilSimpleSlash!!
    }

private var _pencilSimpleSlash: ImageVector? = null
