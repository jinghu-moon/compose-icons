package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextHOne: ImageVector
    get() {
        if (_textHOne != null) return _textHOne!!
        _textHOne = phosphorDuotoneIcon(
            name = "TextHOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 72v136h-168c-8.837 0-16-7.163-16-16v-136h168c8.837 0 16 7.163 16 16Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M152 56v120c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-52h-88v52c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-120c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v52h88v-52c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM227.77 105c-2.599-1.393-5.754-1.243-8.21 .39l-24 16c-3.678 2.452-4.672 7.422-2.22 11.1 2.452 3.678 7.422 4.672 11.1 2.22L216 127v81c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-96c-.021-2.932-1.644-5.618-4.23-7Z"),
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
        return _textHOne!!
    }

private var _textHOne: ImageVector? = null
