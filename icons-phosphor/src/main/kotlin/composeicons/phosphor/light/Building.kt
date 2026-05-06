package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Building: ImageVector
    get() {
        if (_building != null) return _building!!
        _building = phosphorLightIcon(
            name = "Building",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 226h-26v-196h10c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-176c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h10v196h-26c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h208c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM62 30h132v196h-36v-42c0-3.314-2.686-6-6-6h-48c-3.314 0-6 2.686-6 6v42h-36ZM146 226h-36v-36h36ZM90 64c0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-16c-3.314 0-6-2.686-6-6ZM138 64c0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-16c-3.314 0-6-2.686-6-6ZM90 104c0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-16c-3.314 0-6-2.686-6-6ZM138 104c0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-16c-3.314 0-6-2.686-6-6ZM96 150c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6ZM138 144c0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-16c-3.314 0-6-2.686-6-6Z"),
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
        return _building!!
    }

private var _building: ImageVector? = null
