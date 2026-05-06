package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Church: ImageVector
    get() {
        if (_church != null) return _church!!
        _church = phosphorLightIcon(
            name = "Church",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.09 146.86 190 124.6v-20.6c.005-2.149-1.139-4.136-3-5.21L134 68.52v-22.52h18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-18v-18c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v18h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v22.52L69 98.79c-1.861 1.074-3.005 3.061-3 5.21v20.6L28.91 146.86C27.105 147.944 26.001 149.895 26 152v64c0 3.314 2.686 6 6 6h80c3.314 0 6-2.686 6-6v-48c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10v48c0 3.314 2.686 6 6 6h80c3.314 0 6-2.686 6-6v-64c-.001-2.105-1.105-4.056-2.91-5.14ZM38 155.4 66 138.6v71.4h-28ZM128 146c-12.15 0-22 9.85-22 22v42h-28v-102.52L128 78.91l50 28.57v102.52h-28v-42c0-12.15-9.85-22-22-22ZM218 210h-28v-71.4l28 16.8Z"),
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
        return _church!!
    }

private var _church: ImageVector? = null
