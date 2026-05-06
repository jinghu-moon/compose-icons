package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Van: ImageVector
    get() {
        if (_van != null) return _van!!
        _van = phosphorLightIcon(
            name = "Van",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252.55 108.09 207 55c-2.664-3.174-6.596-5.005-10.74-5h-164.26C24.268 50 18 56.268 18 64v112c0 7.732 6.268 14 14 14h18.6c2.839 13.982 15.133 24.03 29.4 24.03 14.267 0 26.561-10.048 29.4-24.03h53.2c2.839 13.982 15.133 24.03 29.4 24.03 14.267 0 26.561-10.048 29.4-24.03h18.6c7.732 0 14-6.268 14-14v-64c-0-1.435-.515-2.822-1.45-3.91ZM197.85 62.77 234.94 106h-60.94v-44h22.26c.621-.004 1.208 .28 1.59 .77ZM102 106v-44h60v44ZM32 62h58v44h-60v-42c0-1.105 .895-2 2-2ZM80 202c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18ZM192 202c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18ZM240 178h-18.6C218.561 164.018 206.267 153.97 192 153.97c-14.267 0-26.561 10.048-29.4 24.03h-53.2C106.561 164.018 94.267 153.97 80 153.97c-14.267 0-26.561 10.048-29.4 24.03h-18.6c-1.105 0-2-.895-2-2v-58h212v58c0 1.105-.895 2-2 2Z"),
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
        return _van!!
    }

private var _van: ImageVector? = null
