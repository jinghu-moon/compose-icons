package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Star: ImageVector
    get() {
        if (_star != null) return _star!!
        _star = phosphorThinIcon(
            name = "Star",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.36 98.49C233.848 93.721 229.58 90.356 224.59 90L163.12 85 139.44 27.67C137.533 23.033 133.014 20.006 128 20.006c-5.014 0-9.533 3.027-11.44 7.664L92.88 85 31.41 90c-4.995 .424-9.248 3.802-10.791 8.571-1.544 4.769-.077 9.998 3.721 13.269l46.85 40.41L56.87 212.64c-1.227 4.884 .634 10.024 4.704 12.99 4.07 2.966 9.532 3.164 13.806 .5L128 193.77l52.62 32.36c4.231 2.673 9.67 2.47 13.69-.51 4.133-2.925 6.047-8.087 4.82-13L184.81 152.2l46.85-40.41c3.842-3.256 5.308-8.527 3.7-13.3ZM226.43 105.75l-48.68 42c-1.13 .975-1.624 2.498-1.28 3.95l14.87 62.79c.447 1.757-.238 3.607-1.72 4.65-1.411 1.052-3.325 1.124-4.81 .18L130.1 185.67c-1.287-.794-2.913-.794-4.2 0L71.19 219.32c-1.485 .944-3.399 .872-4.81-.18-1.482-1.043-2.166-2.893-1.72-4.65L79.53 151.7c.344-1.452-.15-2.975-1.28-3.95l-48.68-42C28.194 104.59 27.67 102.704 28.25 101c.534-1.687 2.045-2.877 3.81-3L96 92.79c1.5-.119 2.806-1.07 3.38-2.46L124 30.73c.66-1.653 2.26-2.737 4.04-2.737 1.78 0 3.38 1.084 4.04 2.737l24.62 59.6c.561 1.366 1.83 2.312 3.3 2.46l63.9 5.15c1.765 .123 3.276 1.313 3.81 3 .617 1.713 .107 3.63-1.28 4.81Z"),
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
        return _star!!
    }

private var _star: ImageVector? = null
