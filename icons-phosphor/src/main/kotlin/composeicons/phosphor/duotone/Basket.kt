package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Basket: ImageVector
    get() {
        if (_basket != null) return _basket!!
        _basket = phosphorDuotoneIcon(
            name = "Basket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 88 216.93 201.06c-.531 3.973-3.921 6.94-7.93 6.94h-162c-4.009 0-7.399-2.967-7.93-6.94L24 88Z"),
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
                pathData = parseSvgPathData("M136 120v56c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-56c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM172.84 119.2l-5.6 56c-.224 2.118 .406 4.237 1.75 5.889 1.344 1.652 3.291 2.7 5.41 2.911 .27 .015 .54 .015 .81 0 4.105-.005 7.54-3.116 7.95-7.2l5.6-56c.442-4.396-2.764-8.318-7.16-8.76-4.396-.442-8.318 2.764-8.76 7.16ZM83.16 119.2c-.442-4.396-4.364-7.602-8.76-7.16-4.396 .442-7.602 4.364-7.16 8.76l5.6 56c.412 4.103 3.876 7.221 8 7.2 .27 .015 .54 .015 .81 0 2.111-.212 4.052-1.254 5.394-2.897 1.343-1.643 1.978-3.752 1.766-5.863ZM239.93 89.06 224.86 202.12C223.773 210.054 217.008 215.974 209 216h-162c-8.008-.026-14.773-5.946-15.86-13.88L16.07 89.06c-.306-2.286 .39-4.593 1.91-6.329C19.499 80.995 21.693 80 24 80h44.37L122 18.73c1.519-1.722 3.704-2.708 6-2.708 2.296 0 4.481 .986 6 2.708L187.63 80h44.37c2.307-0 4.501 .995 6.02 2.731 1.519 1.736 2.215 4.043 1.91 6.329ZM89.63 80h76.74L128 36.15ZM222.86 96h-189.72L47 200h162Z"),
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
        return _basket!!
    }

private var _basket: ImageVector? = null
