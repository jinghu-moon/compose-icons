package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextHTwo: ImageVector
    get() {
        if (_textHTwo != null) return _textHTwo!!
        _textHTwo = phosphorRegularIcon(
            name = "TextHTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 56v120c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-52h-88v52c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-120c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v52h88v-52c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM240 200h-32l33.55-44.74c7.579-10.069 8.542-23.648 2.461-34.685-6.081-11.038-18.074-17.479-30.634-16.452-12.56 1.026-23.348 9.329-27.557 21.208-1.013 2.708-.485 5.752 1.38 7.962 1.865 2.21 4.777 3.241 7.617 2.697 2.84-.543 5.166-2.577 6.083-5.319 .553-1.542 1.335-2.992 2.32-4.3 3.398-4.687 9.063-7.174 14.813-6.501 5.75 .672 10.689 4.398 12.913 9.743 2.225 5.345 1.389 11.474-2.186 16.028l-43.16 57.56c-1.818 2.424-2.111 5.667-.755 8.378 1.355 2.71 4.125 4.422 7.155 4.422h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
