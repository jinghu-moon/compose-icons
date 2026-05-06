package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Jeep: ImageVector
    get() {
        if (_jeep != null) return _jeep!!
        _jeep = phosphorLightIcon(
            name = "Jeep",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 90h-11.15L219.22 45.07C217.818 38.626 212.125 34.023 205.53 34h-155.06c-6.595 .023-12.288 4.626-13.69 11.07L27.15 90h-11.15c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h10v98c0 7.732 6.268 14 14 14h24c7.732 0 14-6.268 14-14v-26h100v26c0 7.732 6.268 14 14 14h24c7.732 0 14-6.268 14-14v-98h10c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM48.51 47.58c.201-.938 1.041-1.601 2-1.58h155.02c.959-.021 1.799 .642 2 1.58L216.58 90h-177.16ZM66 200c0 1.105-.895 2-2 2h-24c-1.105 0-2-.895-2-2v-26h28ZM216 202h-24c-1.105 0-2-.895-2-2v-26h28v26c0 1.105-.895 2-2 2ZM218 162h-68v-34c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v34h-20v-34c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v34h-68v-60h180ZM58 132c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10ZM178 132c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10Z"),
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
        return _jeep!!
    }

private var _jeep: ImageVector? = null
