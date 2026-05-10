package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UmbrellaSimple: ImageVector
    get() {
        if (_umbrellaSimple != null) return _umbrellaSimple!!
        _umbrellaSimple = phosphorFillIcon(
            name = "UmbrellaSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.76 138.83c-3.026 3.29-7.29 5.165-11.76 5.17h-88v56c0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 17.673-14.327 32-32 32-17.673 0-32-14.327-32-32v-56h-88c-4.492 .016-8.784-1.856-11.827-5.16C17.13 135.536 15.615 131.105 16 126.63 19.741 83.929 47.435 47.069 87.407 31.59c39.972-15.479 85.269-6.885 116.793 22.16 20.664 18.934 33.445 44.952 35.8 72.88 .351 4.48-1.186 8.903-4.24 12.2Z"),
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
        return _umbrellaSimple!!
    }

private var _umbrellaSimple: ImageVector? = null
