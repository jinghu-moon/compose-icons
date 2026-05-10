package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CourtBasketball: ImageVector
    get() {
        if (_courtBasketball != null) return _courtBasketball!!
        _courtBasketball = phosphorFillIcon(
            name = "CourtBasketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 92.23v71.54c.006 1.136-.471 2.221-1.313 2.984-.841 .763-1.967 1.133-3.097 1.016-20.276-2.231-35.625-19.362-35.625-39.76 0-20.398 15.349-37.529 35.625-39.76 1.126-.116 2.249 .251 3.09 1.009 .841 .759 1.32 1.838 1.32 2.971ZM20.41 167.76C40.686 165.529 56.035 148.398 56.035 128 56.035 107.602 40.686 90.471 20.41 88.24c-1.13-.116-2.256 .253-3.097 1.016-.841 .763-1.319 1.848-1.313 2.984v71.54c-0 1.132 .479 2.212 1.32 2.971 .841 .759 1.964 1.126 3.09 1.009ZM116 48h-84C23.163 48 16 55.163 16 64v4.13c-.003 2.133 1.669 3.893 3.8 4C49.179 74.135 71.986 98.552 71.986 128c0 29.448-22.807 53.865-52.186 55.87-2.131 .107-3.803 1.867-3.8 4v4.13c0 8.837 7.163 16 16 16h84c2.209 0 4-1.791 4-4v-152c0-2.209-1.791-4-4-4ZM224 48h-84c-2.209 0-4 1.791-4 4v152c0 2.209 1.791 4 4 4h84c8.837 0 16-7.163 16-16v-4.13c.003-2.133-1.669-3.893-3.8-4C206.821 181.865 184.014 157.448 184.014 128c0-29.448 22.807-53.865 52.186-55.87 2.131-.107 3.803-1.867 3.8-4v-4.13c0-8.837-7.163-16-16-16Z"),
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
        return _courtBasketball!!
    }

private var _courtBasketball: ImageVector? = null
