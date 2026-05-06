package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Moon: ImageVector
    get() {
        if (_moon != null) return _moon!!
        _moon = phosphorThinIcon(
            name = "Moon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.72 145.06c-1.046-1.048-2.584-1.432-4-1-32.492 9.821-67.753 .969-91.753-23.035C110.966 97.022 102.117 61.761 111.94 29.27c.436-1.416 .053-2.958-.994-4.006-1.048-1.048-2.589-1.431-4.006-.994C86.662 30.492 68.863 42.953 56.08 59.88 26.221 99.692 30.18 155.401 65.369 190.591c35.189 35.189 90.899 39.148 130.711 9.289 16.921-12.789 29.375-30.591 35.59-50.87 .425-1.391 .062-2.904-.95-3.95ZM191.3 193.53c-36.628 27.565-87.96 23.959-120.374-8.456C38.511 152.66 34.905 101.328 62.47 64.7 72.736 51.125 86.53 40.627 102.35 34.35c-7.359 33.363 2.808 68.175 26.966 92.334 24.158 24.158 58.971 34.325 92.334 26.966-6.277 15.82-16.775 29.614-30.35 39.88Z"),
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
        return _moon!!
    }

private var _moon: ImageVector? = null
