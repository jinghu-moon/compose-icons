package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextHFour: ImageVector
    get() {
        if (_textHFour != null) return _textHFour!!
        _textHFour = phosphorFillIcon(
            name = "TextHFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164.46 144 184 119.13v24.87ZM224 48v160c0 8.837-7.163 16-16 16h-160c-8.837 0-16-7.163-16-16v-160C32 39.163 39.163 32 48 32h160c8.837 0 16 7.163 16 16ZM128 80c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v32h-40v-32c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v80c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-32h40v32c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8ZM212 152c0-4.418-3.582-8-8-8h-4v-48c-.001-3.41-2.164-6.444-5.386-7.558-3.223-1.114-6.797-.063-8.904 2.618l-44 56c-1.891 2.408-2.241 5.684-.902 8.437 1.338 2.753 4.131 4.502 7.192 4.503h36v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h4c4.418 0 8-3.582 8-8Z"),
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
        return _textHFour!!
    }

private var _textHFour: ImageVector? = null
