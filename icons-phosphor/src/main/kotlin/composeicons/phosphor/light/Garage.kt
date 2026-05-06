package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Garage: ImageVector
    get() {
        if (_garage != null) return _garage!!
        _garage = phosphorLightIcon(
            name = "Garage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 194h-10v-95.33c.008-4.688-2.331-9.068-6.23-11.67l-88-58.66c-4.705-3.139-10.835-3.139-15.54 0L32.23 87C28.331 89.602 25.992 93.982 26 98.67v95.33h-10c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h224c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM38 98.67c-.002-.671 .332-1.298 .89-1.67l88-58.67c.672-.448 1.548-.448 2.22 0l88 58.67c.555 .37 .889 .993 .89 1.66v95.34h-28v-58c0-3.314-2.686-6-6-6h-112c-3.314 0-6 2.686-6 6v58h-28ZM178 142v20h-44v-20ZM122 162h-44v-20h44ZM78 174h44v20h-44ZM134 174h44v20h-44Z"),
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
        return _garage!!
    }

private var _garage: ImageVector? = null
