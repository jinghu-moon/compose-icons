package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Plus: ImageVector
    get() {
        if (_plus != null) return _plus!!
        _plus = phosphorLightIcon(
            name = "Plus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 128c0 3.314-2.686 6-6 6h-82v82c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-82h-82c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h82v-82c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v82h82c3.314 0 6 2.686 6 6Z"),
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
        return _plus!!
    }

private var _plus: ImageVector? = null
