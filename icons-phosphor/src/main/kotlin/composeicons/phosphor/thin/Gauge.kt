package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Gauge: ImageVector
    get() {
        if (_gauge != null) return _gauge!!
        _gauge = phosphorThinIcon(
            name = "Gauge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204.23 75.5C183.935 55.176 156.342 43.83 127.62 44 68.28 44.21 20 93.16 20 153.13v22.87c0 6.627 5.373 12 12 12h192c6.627 0 12-5.373 12-12v-24c.082-28.726-11.362-56.284-31.77-76.5ZM228 176c0 2.209-1.791 4-4 4h-112.15L171.23 98.35c.932-1.149 1.155-2.718 .578-4.081-.577-1.362-1.859-2.295-3.333-2.425-1.474-.13-2.899 .565-3.705 1.805L102 180h-70c-2.209 0-4-1.791-4-4v-22.87c.001-4.39 .282-8.776 .84-13.13h27.16c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-25.79C39.59 87.66 77.84 53.93 124 52.09v27.91c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-27.92c45.981 1.86 84.768 34.837 94 79.92h-26c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h27.29c.473 3.982 .71 7.989 .71 12Z"),
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
        return _gauge!!
    }

private var _gauge: ImageVector? = null
