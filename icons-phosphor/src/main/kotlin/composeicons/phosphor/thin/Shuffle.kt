package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Shuffle: ImageVector
    get() {
        if (_shuffle != null) return _shuffle!!
        _shuffle = phosphorThinIcon(
            name = "Shuffle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.83 181.17c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83l-24 24c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L222.34 188h-21.4c-21.958-.024-42.559-10.626-55.34-28.48L103.89 101.13C92.615 85.373 74.436 76.017 55.06 76h-23.06c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h23.06c21.958 .024 42.559 10.626 55.34 28.48l41.71 58.39c11.275 15.757 29.454 25.113 48.83 25.13h21.4L205.17 162.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0ZM145.34 103.73c.863 .617 1.936 .865 2.983 .691 1.046-.174 1.981-.757 2.597-1.621l1.19-1.67C163.385 85.373 181.564 76.017 200.94 76h21.4L205.17 93.17c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0l24-24c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83l-24-24c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66L222.34 68h-21.4c-21.958 .024-42.559 10.626-55.34 28.48l-1.19 1.67c-.617 .863-.865 1.936-.691 2.983 .174 1.046 .757 1.981 1.621 2.597ZM110.66 152.27c-.863-.617-1.936-.865-2.983-.691-1.046 .174-1.981 .757-2.597 1.621l-1.19 1.67C92.615 170.627 74.436 179.983 55.06 180h-23.06c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h23.06c21.958-.024 42.559-10.626 55.34-28.48l1.19-1.67c.617-.863 .865-1.936 .691-2.983-.174-1.046-.757-1.981-1.621-2.597Z"),
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
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
