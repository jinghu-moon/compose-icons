package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Sparkle: ImageVector
    get() {
        if (_sparkle != null) return _sparkle!!
        _sparkle = phosphorRegularIcon(
            name = "Sparkle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M197.58 129.06 146 110 127 58.38C124.695 52.119 118.732 47.959 112.06 47.959c-6.672 0-12.635 4.16-14.94 10.421L78 110 26.38 129c-6.261 2.305-10.421 8.268-10.421 14.94 0 6.672 4.16 12.635 10.421 14.94L78 178l19 51.62c2.305 6.261 8.268 10.421 14.94 10.421 6.672 0 12.635-4.16 14.94-10.421L146 178l51.62-19c6.261-2.305 10.421-8.268 10.421-14.94 0-6.672-4.16-12.635-10.421-14.94ZM137 164.22c-2.198 .81-3.93 2.542-4.74 4.74L112 223.85 91.78 169c-.809-2.221-2.559-3.971-4.78-4.78L32.15 144 87 123.78c2.221-.809 3.971-2.559 4.78-4.78L112 64.15 132.22 119c.81 2.198 2.542 3.93 4.74 4.74L191.85 144ZM144 40c0-4.418 3.582-8 8-8h16v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v16h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-16c-4.418 0-8-3.582-8-8ZM248 88c0 4.418-3.582 8-8 8h-8v8c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-8h-8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h8v-8c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v8h8c4.418 0 8 3.582 8 8Z"),
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
        return _sparkle!!
    }

private var _sparkle: ImageVector? = null
