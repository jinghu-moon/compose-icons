package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextHSix: ImageVector
    get() {
        if (_textHSix != null) return _textHSix!!
        _textHSix = phosphorRegularIcon(
            name = "TextHSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 56v120c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-52h-88v52c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-120c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v52h88v-52c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM248 180c.014 15.098-9.394 28.602-23.563 33.818-14.169 5.216-30.087 1.037-39.866-10.467-9.779-11.504-11.341-27.887-3.911-41.031 .07-.14 .14-.28 .22-.42l32.25-54c2.264-3.794 7.176-5.034 10.97-2.77 3.794 2.264 5.034 7.176 2.77 10.97l-16.69 28c.6 0 1.21-.05 1.82-.05 19.863-0 35.972 16.087 36 35.95ZM232 180c0-11.046-8.954-20-20-20-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20Z"),
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
        return _textHSix!!
    }

private var _textHSix: ImageVector? = null
