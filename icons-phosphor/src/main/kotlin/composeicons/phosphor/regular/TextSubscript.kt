package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextSubscript: ImageVector
    get() {
        if (_textSubscript != null) return _textSubscript!!
        _textSubscript = phosphorRegularIcon(
            name = "TextSubscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 208c0 4.418-3.582 8-8 8h-48c-3.03 0-5.8-1.712-7.155-4.422-1.355-2.71-1.063-5.954 .755-8.378l43.17-57.56c3.776-5.032 4.253-11.81 1.218-17.321-3.035-5.511-9.017-8.732-15.289-8.231-6.271 .501-11.667 4.63-13.789 10.552-1.475 4.167-6.048 6.35-10.215 4.875-4.167-1.475-6.35-6.048-4.875-10.215 1.098-3.082 2.659-5.979 4.63-8.59 10.637-14.114 30.701-16.932 44.815-6.295 14.114 10.637 16.932 30.701 6.295 44.815L208 200h32c4.418 0 8 3.582 8 8ZM149.24 50c-1.604-1.391-3.695-2.087-5.813-1.935-2.118 .152-4.088 1.139-5.477 2.745L92 103.78l-45.95-53C43.078 47.827 38.331 47.667 35.167 50.413 32.003 53.16 31.494 57.882 34 61.24L81.41 116 34 170.76c-2.894 3.341-2.531 8.396 .81 11.29 3.341 2.894 8.396 2.531 11.29-.81l46-53 45.95 53c2.894 3.341 7.949 3.704 11.29 .81 3.341-2.894 3.704-7.949 .81-11.29L102.59 116 150.05 61.24c2.862-3.333 2.501-8.351-.81-11.24Z"),
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
        return _textSubscript!!
    }

private var _textSubscript: ImageVector? = null
