package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonSimpleSki: ImageVector
    get() {
        if (_personSimpleSki != null) return _personSimpleSki!!
        _personSimpleSki = phosphorLightIcon(
            name = "PersonSimpleSki",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 86c14.359 0 26-11.641 26-26C198 45.641 186.359 34 172 34c-14.359 0-26 11.641-26 26 0 14.359 11.641 26 26 26ZM172 46c7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14ZM38.32 85.76l111.47 32.51 6 6c1.122 1.107 2.634 1.729 4.21 1.73h40c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-37.51L132.24 83.75c-2.343-2.34-6.137-2.34-8.48 0L112.59 94.92 41.68 74.24c-3.181-.928-6.512 .899-7.44 4.08-.928 3.181 .899 6.512 4.08 7.44ZM128 96.48l4.14 4.14-6.41-1.87ZM235.33 202.58c-16.683 11.144-37.445 14.326-56.7 8.69L22.32 165.75c-3.181-.928-5.008-4.259-4.08-7.44 .928-3.181 4.259-5.008 7.44-4.08l77.13 22.46L132.55 147 86.35 133.8c-3.187-.911-5.031-4.233-4.12-7.42 .911-3.187 4.233-5.031 7.42-4.12l56 16c2.039 .587 3.616 2.207 4.148 4.261 .532 2.054-.06 4.236-1.558 5.739L116 180.52l66 19.23c15.851 4.644 32.946 2.026 46.68-7.15 2.761-1.839 6.491-1.091 8.33 1.67 1.839 2.761 1.091 6.491-1.67 8.33Z"),
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
        return _personSimpleSki!!
    }

private var _personSimpleSki: ImageVector? = null
