package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CraneTower: ImageVector
    get() {
        if (_craneTower != null) return _craneTower!!
        _craneTower = phosphorLightIcon(
            name = "CraneTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 82h-132.29L85.37 37.32C84.354 35.285 82.275 33.999 80 34h-32c-3.314 0-6 2.686-6 6v42h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v116h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h104c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-18v-116h100v90c0 1.105-.895 2-2 2h-16c-1.105 0-2-.895-2-2v-8c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v8c0 7.732 6.268 14 14 14h16c7.732 0 14-6.268 14-14v-90h18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM54 46h22.29l18 36h-40.29ZM54 210v-52h44v52ZM98 146h-44v-52h44Z"),
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
        return _craneTower!!
    }

private var _craneTower: ImageVector? = null
