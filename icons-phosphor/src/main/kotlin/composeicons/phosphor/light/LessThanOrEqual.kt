package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LessThanOrEqual: ImageVector
    get() {
        if (_lessThanOrEqual != null) return _lessThanOrEqual!!
        _lessThanOrEqual = phosphorLightIcon(
            name = "LessThanOrEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M42 104c.001-2.515 1.57-4.762 3.93-5.63L197.93 42.37c3.109-1.146 6.559 .446 7.705 3.555 1.146 3.109-.446 6.559-3.555 7.705L65.36 104l136.71 50.37c2.727 1.005 4.342 3.82 3.833 6.681-.509 2.861-2.996 4.946-5.903 4.949-.71-.001-1.414-.126-2.08-.37l-152-56C43.564 108.759 41.999 106.512 42 104ZM200 194h-152c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h152c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6Z"),
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
        return _lessThanOrEqual!!
    }

private var _lessThanOrEqual: ImageVector? = null
