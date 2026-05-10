package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bread: ImageVector
    get() {
        if (_bread != null) return _bread!!
        _bread = phosphorFillIcon(
            name = "Bread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 40h-152C29.068 40.011 12.737 53.294 8.868 71.827 5 90.359 14.654 109.066 32 116.65v83.35c0 8.837 7.163 16 16 16h152c8.837 0 16-7.163 16-16v-83.35c17.346-7.584 27-26.291 23.132-44.823C235.263 53.294 218.932 40.011 200 40ZM144 104c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8v80h-96v-80c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8C34.745 104 24 93.255 24 80 24 66.745 34.745 56 48 56h96c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24Z"),
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
