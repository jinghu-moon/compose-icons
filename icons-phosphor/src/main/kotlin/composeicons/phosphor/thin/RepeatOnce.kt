package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.RepeatOnce: ImageVector
    get() {
        if (_repeatOnce != null) return _repeatOnce!!
        _repeatOnce = phosphorThinIcon(
            name = "RepeatOnce",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M28 128C28.039 90.461 58.461 60.039 96 60h118.34L197.17 42.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0l24 24c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83l-24 24c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L214.34 68h-118.34C62.879 68.039 36.039 94.879 36 128c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4ZM224 124c-2.209 0-4 1.791-4 4-.039 33.121-26.879 59.961-60 60h-118.34L58.83 170.83c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0l-24 24c-.751 .75-1.173 1.768-1.173 2.83 0 1.062 .422 2.08 1.173 2.83l24 24c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66L41.66 196h118.34c37.539-.039 67.961-30.461 68-68 0-2.209-1.791-4-4-4ZM136 156c2.209 0 4-1.791 4-4v-48c.001-1.387-.717-2.676-1.896-3.405-1.18-.729-2.653-.796-3.894-.175l-16 8c-1.977 .989-2.779 3.393-1.79 5.37 .989 1.977 3.393 2.779 5.37 1.79L132 110.48v41.52c0 2.209 1.791 4 4 4Z"),
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
        return _repeatOnce!!
    }

private var _repeatOnce: ImageVector? = null
