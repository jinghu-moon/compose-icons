package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MagicWand: ImageVector
    get() {
        if (_magicWand != null) return _magicWand!!
        _magicWand = phosphorLightIcon(
            name = "MagicWand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246 152c0 3.314-2.686 6-6 6h-18v18c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-18c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h18v-18c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v18h18c3.314 0 6 2.686 6 6ZM56 70h18v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-18v-18c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v18h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM184 194h-10v-10c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v10h-10c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h10v10c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-10h10c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM217.9 78.59 78.58 217.9c-2.626 2.626-6.187 4.101-9.9 4.101-3.713 0-7.274-1.475-9.9-4.101L38.09 197.21c-2.626-2.626-4.101-6.187-4.101-9.9 0-3.713 1.475-7.274 4.101-9.9L177.41 38.1c2.626-2.626 6.187-4.101 9.9-4.101 3.713 0 7.274 1.475 9.9 4.101l20.69 20.69c2.626 2.626 4.101 6.187 4.101 9.9 0 3.713-1.475 7.274-4.101 9.9ZM167.51 112 144 88.49 46.58 185.9c-.376 .375-.587 .884-.587 1.415 0 .531 .211 1.04 .587 1.415l20.69 20.68c.78 .775 2.04 .775 2.82 0h0ZM209.41 67.27 188.73 46.59c-.375-.376-.884-.587-1.415-.587-.531 0-1.04 .211-1.415 .587L152.48 80 176 103.52 209.41 70.1c.376-.375 .587-.884 .587-1.415 0-.531-.211-1.04-.587-1.415Z"),
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
        return _magicWand!!
    }

private var _magicWand: ImageVector? = null
