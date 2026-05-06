package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowArcRight: ImageVector
    get() {
        if (_arrowArcRight != null) return _arrowArcRight!!
        _arrowArcRight = phosphorLightIcon(
            name = "ArrowArcRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238 88v64c0 3.314-2.686 6-6 6h-64c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h49.45L191.65 120.37C165.912 94.624 127.199 86.919 93.565 100.847 59.931 114.776 38 147.596 38 184c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6 .004-41.252 24.855-78.441 62.968-94.226 38.112-15.786 81.981-7.061 111.152 22.106L226 137.58v-49.58c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6Z"),
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
        return _arrowArcRight!!
    }

private var _arrowArcRight: ImageVector? = null
