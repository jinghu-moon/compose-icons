package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Fire: ImageVector
    get() {
        if (_fire != null) return _fire!!
        _fire = phosphorFillIcon(
            name = "Fire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M143.38 17.85c-2.001-1.664-4.687-2.25-7.2-1.572-2.513 .678-4.538 2.537-5.43 4.982l-22 60.41L84.59 58.26C82.949 56.668 80.705 55.855 78.425 56.025c-2.28 .17-4.378 1.308-5.765 3.125C51 87.53 40 116.08 40 144c0 48.601 39.399 88 88 88 48.601 0 88-39.399 88-88C216 84.55 165.21 36 143.38 17.85ZM183.89 153.34c-4.249 23.732-22.827 42.306-46.56 46.55-.439 .075-.884 .112-1.33 .11-4.161-.001-7.626-3.191-7.97-7.338-.344-4.146 2.547-7.865 6.65-8.552 16.57-2.79 30.63-16.85 33.44-33.45 .74-4.358 4.872-7.29 9.23-6.55 4.358 .74 7.29 4.872 6.55 9.23Z"),
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
        return _fire!!
    }

private var _fire: ImageVector? = null
