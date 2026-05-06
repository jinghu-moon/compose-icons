package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Basket: ImageVector
    get() {
        if (_basket != null) return _basket!!
        _basket = phosphorFillIcon(
            name = "Basket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238 82.73C236.485 81 234.299 80.005 232 80h-44.37L134 18.73c-1.519-1.722-3.704-2.708-6-2.708-2.296 0-4.481 .986-6 2.708L68.37 80h-44.37c-2.307-0-4.501 .995-6.02 2.731-1.519 1.736-2.215 4.043-1.91 6.329L31.14 202.12C32.227 210.054 38.992 215.974 47 216h162c8.008-.026 14.773-5.946 15.86-13.88L239.93 89.06c.3-2.29-.403-4.597-1.93-6.33ZM81.6 184c-.27 .015-.54 .015-.81 0-4.124 .021-7.588-3.097-8-7.2l-5.6-56c-.442-4.396 2.764-8.318 7.16-8.76 4.396-.442 8.318 2.764 8.76 7.16l5.6 56c.467 4.393-2.717 8.333-7.11 8.8ZM136 176c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-56c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM89.63 80 128 36.15 166.37 80ZM188.76 120.8l-5.6 56c-.41 4.084-3.845 7.195-7.95 7.2-.27 .015-.54 .015-.81 0-2.111-.212-4.052-1.254-5.394-2.897-1.343-1.643-1.978-3.752-1.766-5.863l5.6-56c.442-4.396 4.364-7.602 8.76-7.16 4.396 .442 7.602 4.364 7.16 8.76Z"),
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
