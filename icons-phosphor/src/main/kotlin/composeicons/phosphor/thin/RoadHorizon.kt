package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.RoadHorizon: ImageVector
    get() {
        if (_roadHorizon != null) return _roadHorizon!!
        _roadHorizon = phosphorThinIcon(
            name = "RoadHorizon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.49 190c.521 .925 .652 2.02 .365 3.042-.287 1.022-.969 1.889-1.895 2.408-.612 .339-1.301 .515-2 .51-1.438 .009-2.771-.754-3.49-2L157.66 68h-25.66v12c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-12h-25.66L27.49 194c-.719 1.246-2.052 2.009-3.49 2-.699 .005-1.388-.171-2-.51-.93-.526-1.611-1.403-1.891-2.434-.28-1.031-.135-2.132 .401-3.056L89.16 68h-65.16c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h208c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-65.16ZM128 116c-2.209 0-4 1.791-4 4v16c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-16c0-2.209-1.791-4-4-4ZM128 172c-2.209 0-4 1.791-4 4v16c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-16c0-2.209-1.791-4-4-4Z"),
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
        return _roadHorizon!!
    }

private var _roadHorizon: ImageVector? = null
