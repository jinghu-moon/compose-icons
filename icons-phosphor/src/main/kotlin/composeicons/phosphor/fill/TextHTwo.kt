package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextHTwo: ImageVector
    get() {
        if (_textHTwo != null) return _textHTwo!!
        _textHTwo = phosphorFillIcon(
            name = "TextHTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM128 160c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32h-40v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-80c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v32h40v-32c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM192 184h-40c-3.03 0-5.8-1.712-7.155-4.422-1.355-2.71-1.063-5.954 .755-8.378l36-48c2.676-3.415 3.301-8.008 1.633-12.014-1.667-4.005-5.367-6.799-9.676-7.306-4.309-.507-8.556 1.351-11.108 4.86-1.189 1.404-2.068 3.043-2.58 4.81-.544 2.825-2.563 5.141-5.288 6.064-2.725 .924-5.736 .313-7.885-1.599-2.15-1.912-3.107-4.831-2.507-7.645 2.304-11.321 11.287-20.087 22.66-22.115 11.373-2.028 22.832 3.094 28.906 12.921 6.074 9.827 5.533 22.366-1.366 31.633L168 168h24c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
        return _textHTwo!!
    }

private var _textHTwo: ImageVector? = null
