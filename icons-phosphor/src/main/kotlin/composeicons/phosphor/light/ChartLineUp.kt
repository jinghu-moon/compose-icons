package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChartLineUp: ImageVector
    get() {
        if (_chartLineUp != null) return _chartLineUp!!
        _chartLineUp = phosphorLightIcon(
            name = "ChartLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 208c0 3.314-2.686 6-6 6h-192c-3.314 0-6-2.686-6-6v-160c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v113.52L91.76 107.76c2.343-2.34 6.137-2.34 8.48 0L128 135.51 185.52 78h-25.52c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h40c3.314 0 6 2.686 6 6v40c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-25.52l-61.76 61.76c-2.343 2.34-6.137 2.34-8.48 0L96 120.49 38 178.49v23.51h186c3.314 0 6 2.686 6 6Z"),
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
        return _chartLineUp!!
    }

private var _chartLineUp: ImageVector? = null
