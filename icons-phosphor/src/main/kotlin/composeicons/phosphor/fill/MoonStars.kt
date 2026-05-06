package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MoonStars: ImageVector
    get() {
        if (_moonStars != null) return _moonStars!!
        _moonStars = phosphorFillIcon(
            name = "MoonStars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 96c0 4.418-3.582 8-8 8h-16v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v16h16c4.418 0 8 3.582 8 8ZM144 56h8v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-8v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM209.14 150.33c-28.817 5.693-58.575-3.355-79.345-24.125C109.025 105.435 99.977 75.677 105.67 46.86c.559-2.835-.454-5.752-2.651-7.629-2.197-1.878-5.235-2.425-7.949-1.431C53.319 53.067 27.51 95.002 32.693 139.154c5.183 44.152 40.001 78.97 84.153 84.153 44.152 5.183 86.087-20.625 101.354-62.377 .994-2.714 .447-5.752-1.431-7.949-1.878-2.197-4.794-3.21-7.629-2.651Z"),
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
        return _moonStars!!
    }

private var _moonStars: ImageVector? = null
