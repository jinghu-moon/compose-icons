package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextHFour: ImageVector
    get() {
        if (_textHFour != null) return _textHFour!!
        _textHFour = phosphorRegularIcon(
            name = "TextHFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 56v120c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-52h-88v52c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-120c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v52h88v-52c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM256 184c0 4.418-3.582 8-8 8h-8v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-48c-3.054-.002-5.84-1.743-7.181-4.487-1.341-2.744-1.003-6.012 .871-8.423l56-72c2.099-2.693 5.676-3.757 8.906-2.649 3.23 1.108 5.4 4.144 5.404 7.559v64h8c4.418 0 8 3.582 8 8ZM224 135.32 192.36 176h31.64Z"),
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
