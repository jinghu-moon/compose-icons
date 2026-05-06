package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.IceCream: ImageVector
    get() {
        if (_iceCream != null) return _iceCream!!
        _iceCream = phosphorLightIcon(
            name = "IceCream",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M206 98.83v-2.83C206 52.922 171.078 18 128 18 84.922 18 50 52.922 50 96v2.83c-10.571 2.989-17.317 13.318-15.805 24.199C35.708 133.909 45.015 142.007 56 142h4.45l55.39 97c2.491 4.367 7.133 7.062 12.16 7.062 5.027 0 9.669-2.696 12.16-7.062l55.39-97h4.45c10.985 .007 20.292-8.091 21.805-18.971C223.317 112.148 216.571 101.819 206 98.83ZM129.74 233c-.355 .627-1.02 1.014-1.74 1.014-.72 0-1.385-.387-1.74-1.014l-52-91h24L140 215.06ZM136 142l22.89 40.06-12 20.91-34.84-61ZM165.8 170l-16-28h32ZM200 130h-144c-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 3.314 0 6-2.686 6-6v-8C62 59.549 91.549 30 128 30c36.451 0 66 29.549 66 66v8c0 3.314 2.686 6 6 6 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10Z"),
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
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null
