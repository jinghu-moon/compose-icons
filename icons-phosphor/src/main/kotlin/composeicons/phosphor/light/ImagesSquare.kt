package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ImagesSquare: ImageVector
    get() {
        if (_imagesSquare != null) return _imagesSquare!!
        _imagesSquare = phosphorLightIcon(
            name = "ImagesSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 34h-128C72.268 34 66 40.268 66 48v18h-18C40.268 66 34 72.268 34 80v128c0 7.732 6.268 14 14 14h128c7.732 0 14-6.268 14-14v-18h18c7.732 0 14-6.268 14-14v-128c0-7.732-6.268-14-14-14ZM78 48c0-1.105 .895-2 2-2h128c1.105 0 2 .895 2 2v74.2L189.9 102.1C187.274 99.474 183.713 97.999 180 97.999c-3.713 0-7.274 1.475-9.9 4.101L94.2 178h-14.2c-1.105 0-2-.895-2-2ZM178 208c0 1.105-.895 2-2 2h-128c-1.105 0-2-.895-2-2v-128c0-1.105 .895-2 2-2h18v98c0 7.732 6.268 14 14 14h98ZM208 178h-96.83l67.41-67.41c.375-.376 .884-.587 1.415-.587 .531 0 1.04 .211 1.415 .587L210 139.17v36.83c0 1.105-.895 2-2 2ZM120 110c12.15 0 22-9.85 22-22C142 75.85 132.15 66 120 66 107.85 66 98 75.85 98 88c0 12.15 9.85 22 22 22ZM120 78c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10Z"),
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
        return _imagesSquare!!
    }

private var _imagesSquare: ImageVector? = null
