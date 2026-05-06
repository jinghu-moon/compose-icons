package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextHThree: ImageVector
    get() {
        if (_textHThree != null) return _textHThree!!
        _textHThree = phosphorThinIcon(
            name = "TextHThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 180c.003 13.004-7.864 24.717-19.904 29.633-12.039 4.916-25.857 2.057-34.956-7.233-1.546-1.58-1.52-4.114 .06-5.66 1.58-1.546 4.114-1.52 5.66 .06 7.625 7.779 19.531 9.447 29 4.064 9.469-5.383 14.126-16.468 11.342-26.998C232.418 163.336 222.892 156 212 156c-1.491 0-2.858-.829-3.547-2.151-.689-1.322-.586-2.917 .267-4.139L232.32 116h-40.32c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h48c1.491-0 2.858 .829 3.547 2.151 .689 1.322 .586 2.917-.267 4.139l-24.16 34.51c14.544 3.342 24.859 16.277 24.88 31.2ZM144 52c-2.209 0-4 1.791-4 4v56h-96v-56c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v120c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-56h96v56c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-120c0-2.209-1.791-4-4-4Z"),
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
        return _textHThree!!
    }

private var _textHThree: ImageVector? = null
