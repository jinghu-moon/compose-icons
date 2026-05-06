package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextAa: ImageVector
    get() {
        if (_textAa != null) return _textAa!!
        _textAa = phosphorBoldIcon(
            name = "TextAa",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M90.86 50.89C88.882 46.682 84.65 43.995 80 43.995c-4.65 0-8.882 2.687-10.86 6.895l-64 136c-2.665 5.966-.067 12.968 5.846 15.751 5.912 2.783 12.964 .324 15.864-5.531L42.44 164h75.12l15.58 33.11c2.822 5.998 9.972 8.572 15.97 5.75 5.998-2.822 8.572-9.972 5.75-15.97ZM53.74 140 80 84.18 106.27 140ZM200 84c-13.85 0-24.77 3.86-32.45 11.48-3.29 2.964-4.68 7.498-3.617 11.797 1.063 4.298 4.407 7.662 8.699 8.751 4.292 1.088 8.835-.275 11.818-3.547 3-3 8.26-4.52 15.55-4.52 11 0 20 7.18 20 16v4.39c-6.269-2.893-13.096-4.378-20-4.35-24.26 0-44 17.94-44 40 0 22.06 19.74 40 44 40 7.661 .02 15.212-1.827 22-5.38 2.925 4.409 8.391 6.382 13.458 4.858 5.066-1.524 8.536-6.187 8.542-11.478v-68C244 101.94 224.26 84 200 84ZM200 180c-11 0-20-7.18-20-16 0-8.82 9-16 20-16 11 0 20 7.18 20 16 0 8.82-9 16-20 16Z"),
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
        return _textAa!!
    }

private var _textAa: ImageVector? = null
