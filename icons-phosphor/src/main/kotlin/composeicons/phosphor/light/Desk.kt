package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Desk: ImageVector
    get() {
        if (_desk != null) return _desk!!
        _desk = phosphorLightIcon(
            name = "Desk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 66h-240C4.686 66 2 68.686 2 72c0 3.314 2.686 6 6 6h10v114c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-50h196v50c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-114h10c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM30 78h92v52h-92ZM226 130h-92v-52h92ZM94 104c0 3.314-2.686 6-6 6h-24c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h24c3.314 0 6 2.686 6 6ZM162 104c0-3.314 2.686-6 6-6h24c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-24c-3.314 0-6-2.686-6-6Z"),
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
        return _desk!!
    }

private var _desk: ImageVector? = null
