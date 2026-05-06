package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Bread: ImageVector
    get() {
        if (_bread != null) return _bread!!
        _bread = phosphorRegularIcon(
            name = "Bread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 80C240 57.909 222.091 40 200 40h-152C29.068 40.011 12.737 53.294 8.868 71.827 5 90.359 14.654 109.066 32 116.65v83.35c0 8.837 7.163 16 16 16h152c8.837 0 16-7.163 16-16v-83.35C230.563 110.277 239.98 95.896 240 80ZM48 120c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8C34.745 104 24 93.255 24 80 24 66.745 34.745 56 48 56h96c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8v80h-96ZM200 104c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8v80h-40v-83.35c11.202-4.891 19.553-14.636 22.671-26.455C185.789 78.376 183.332 65.78 176 56h24c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24Z"),
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
        return _bread!!
    }

private var _bread: ImageVector? = null
