package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SunDim: ImageVector
    get() {
        if (_sunDim != null) return _sunDim!!
        _sunDim = phosphorThinIcon(
            name = "SunDim",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M124 40v-8c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v8c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4ZM188 128c0 33.137-26.863 60-60 60C94.863 188 68 161.137 68 128 68 94.863 94.863 68 128 68c33.121 .039 59.961 26.879 60 60ZM180 128C180 99.281 156.719 76 128 76 99.281 76 76 99.281 76 128c0 28.719 23.281 52 52 52 28.705-.033 51.967-23.295 52-52ZM61.17 66.83c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66l-8-8c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66ZM61.17 189.17l-8 8c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0l8-8c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0ZM197.17 53.17l-8 8c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0l8-8c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0ZM194.83 189.17c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66l8 8c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66ZM40 124h-8c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h8c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM128 212c-2.209 0-4 1.791-4 4v8c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-8c0-2.209-1.791-4-4-4ZM224 124h-8c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h8c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _sunDim!!
    }

private var _sunDim: ImageVector? = null
