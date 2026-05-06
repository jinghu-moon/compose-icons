package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Function: ImageVector
    get() {
        if (_function != null) return _function!!
        _function = phosphorLightIcon(
            name = "Function",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M206 40c0 3.314-2.686 6-6 6h-29.29c-12.566 0-23.333 8.987-25.58 21.35L135.19 122h48.81c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-51l-10.33 56.8C119.384 208.865 103.651 221.997 85.29 222h-29.29c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h29.29c12.566-0 23.333-8.987 25.58-21.35L120.81 134h-48.81c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h51L133.33 65.2C136.616 47.135 152.349 34.003 170.71 34h29.29c3.314 0 6 2.686 6 6Z"),
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
        return _function!!
    }

private var _function: ImageVector? = null
