package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowURightUp: ImageVector
    get() {
        if (_arrowURightUp != null) return _arrowURightUp!!
        _arrowURightUp = phosphorLightIcon(
            name = "ArrowURightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220.24 84.24c-2.343 2.34-6.137 2.34-8.48 0L174 46.49v121.51c0 34.242-27.758 62-62 62C77.758 230 50 202.242 50 168v-88c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v88c0 27.614 22.386 50 50 50 27.614 0 50-22.386 50-50v-121.51L124.24 84.24c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L163.76 27.76c2.343-2.34 6.137-2.34 8.48 0l48 48c2.34 2.343 2.34 6.137 0 8.48Z"),
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
        return _arrowURightUp!!
    }

private var _arrowURightUp: ImageVector? = null
