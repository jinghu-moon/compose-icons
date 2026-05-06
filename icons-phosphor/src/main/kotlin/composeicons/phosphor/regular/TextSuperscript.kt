package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextSuperscript: ImageVector
    get() {
        if (_textSuperscript != null) return _textSuperscript!!
        _textSuperscript = phosphorRegularIcon(
            name = "TextSuperscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 144c0 4.418-3.582 8-8 8h-48c-3.03 0-5.8-1.712-7.155-4.422-1.355-2.71-1.063-5.954 .755-8.378L228.77 81.65c3.776-5.032 4.253-11.81 1.218-17.321-3.035-5.511-9.017-8.732-15.289-8.231-6.271 .501-11.667 4.63-13.789 10.552-1.472 4.167-6.043 6.352-10.21 4.88-4.167-1.472-6.352-6.043-4.88-10.21 4.21-11.875 14.995-20.174 27.552-21.201 12.557-1.027 24.548 5.409 30.631 16.442 6.083 11.033 5.127 24.608-2.443 34.679L208 136h32c4.418 0 8 3.582 8 8ZM149.24 74c-1.603-1.392-3.693-2.09-5.811-1.94-2.118 .15-4.089 1.136-5.479 2.74L92 127.79l-45.95-53C43.075 71.863 38.35 71.714 35.197 74.448 32.044 77.182 31.523 81.881 34 85.24L81.41 140 34 194.76c-2.894 3.341-2.531 8.396 .81 11.29 3.341 2.894 8.396 2.531 11.29-.81l46-53 45.95 53c2.894 3.341 7.949 3.704 11.29 .81 3.341-2.894 3.704-7.949 .81-11.29L102.59 140 150.05 85.24c2.862-3.333 2.501-8.351-.81-11.24Z"),
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
        return _textSuperscript!!
    }

private var _textSuperscript: ImageVector? = null
