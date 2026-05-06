package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Warehouse: ImageVector
    get() {
        if (_warehouse != null) return _warehouse!!
        _warehouse = phosphorLightIcon(
            name = "Warehouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 186h-10v-129.72l11.26-2.41c3.242-.696 5.306-3.888 4.61-7.13-.696-3.242-3.888-5.306-7.13-4.61L14.74 90.13c-3.242 .696-5.306 3.888-4.61 7.13 .696 3.242 3.888 5.306 7.13 4.61L26 100v86h-10c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h224c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM38 97.42 218 58.85v127.15h-28v-58c0-3.314-2.686-6-6-6h-112c-3.314 0-6 2.686-6 6v58h-28ZM178 154h-100v-20h100ZM78 166h100v20h-100Z"),
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
        return _warehouse!!
    }

private var _warehouse: ImageVector? = null
