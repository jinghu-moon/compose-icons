package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CloudArrowDown: ImageVector
    get() {
        if (_cloudArrowDown != null) return _cloudArrowDown!!
        _cloudArrowDown = phosphorLightIcon(
            name = "CloudArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246 128c.053 18.616-5.988 36.739-17.2 51.6-1.988 2.651-5.749 3.188-8.4 1.2-2.651-1.988-3.188-5.749-1.2-8.4 19.318-25.757 19.765-61.05 1.104-87.288C201.644 58.874 168.16 47.713 137.489 57.507 106.818 67.301 86 95.803 86 128c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6-.007-8.696 1.311-17.342 3.91-25.64C75.949 102.125 73.975 102.005 72 102c-27.614 0-50 22.386-50 50 0 27.614 22.386 50 50 50h24c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-24C48.602 213.992 27.201 200.812 16.664 179.921 6.127 159.03 8.248 133.986 22.15 115.165 36.051 96.344 59.364 86.952 82.43 90.88 99.77 54.658 139.87 35.258 179.033 44.146 218.195 53.033 245.994 87.841 246 128ZM179.76 171.76 158 193.51v-65.51c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v65.51L124.24 171.76c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333l32 32c2.343 2.34 6.137 2.34 8.48 0l32-32c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147Z"),
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
        return _cloudArrowDown!!
    }

private var _cloudArrowDown: ImageVector? = null
