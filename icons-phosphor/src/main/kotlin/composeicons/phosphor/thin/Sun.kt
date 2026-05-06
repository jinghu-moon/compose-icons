package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Sun: ImageVector
    get() {
        if (_sun != null) return _sun!!
        _sun = phosphorThinIcon(
            name = "Sun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M124 40v-24c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v24c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4ZM188 128c0 33.137-26.863 60-60 60C94.863 188 68 161.137 68 128 68 94.863 94.863 68 128 68c33.121 .039 59.961 26.879 60 60ZM180 128C180 99.281 156.719 76 128 76 99.281 76 76 99.281 76 128c0 28.719 23.281 52 52 52 28.705-.033 51.967-23.295 52-52ZM61.17 66.83c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66l-16-16c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66ZM61.17 189.17l-16 16c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0l16-16c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0ZM192 68c1.061 .001 2.079-.42 2.83-1.17l16-16c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0l-16 16c-1.145 1.144-1.488 2.866-.868 4.361 .62 1.496 2.08 2.47 3.698 2.469ZM194.83 189.17c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66l16 16c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66ZM40 124h-24c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h24c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM128 212c-2.209 0-4 1.791-4 4v24c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-24c0-2.209-1.791-4-4-4ZM240 124h-24c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h24c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _sun!!
    }

private var _sun: ImageVector? = null
