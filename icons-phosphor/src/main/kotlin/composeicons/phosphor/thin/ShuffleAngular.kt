package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShuffleAngular: ImageVector
    get() {
        if (_shuffleAngular != null) return _shuffleAngular!!
        _shuffleAngular = phosphorThinIcon(
            name = "ShuffleAngular",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.83 181.17c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83l-24 24c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L222.34 188h-54.34c-1.289-0-2.499-.622-3.25-1.67L85.94 76h-53.94c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h56c1.289 0 2.499 .622 3.25 1.67L170.06 180h52.28L205.17 162.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0ZM145.34 103.73c.863 .617 1.936 .865 2.983 .691 1.046-.174 1.981-.757 2.597-1.621L170.06 76h52.28L205.17 93.17c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0l24-24c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83l-24-24c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66L222.34 68h-54.34c-1.289 0-2.499 .622-3.25 1.67L144.41 98.15c-.617 .863-.865 1.936-.691 2.983 .174 1.046 .757 1.981 1.621 2.597ZM110.66 152.27c-.863-.617-1.936-.865-2.983-.691-1.046 .174-1.981 .757-2.597 1.621L85.94 180h-53.94c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h56c1.289-0 2.499-.622 3.25-1.67l20.34-28.48c.617-.863 .865-1.936 .691-2.983-.174-1.046-.757-1.981-1.621-2.597Z"),
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
        return _shuffleAngular!!
    }

private var _shuffleAngular: ImageVector? = null
