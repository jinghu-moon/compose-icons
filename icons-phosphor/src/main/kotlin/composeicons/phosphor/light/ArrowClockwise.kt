package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowClockwise: ImageVector
    get() {
        if (_arrowClockwise != null) return _arrowClockwise!!
        _arrowClockwise = phosphorLightIcon(
            name = "ArrowClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238 56v48c0 3.314-2.686 6-6 6h-48c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h32.55L186.17 70.2c-.06-.06-.12-.13-.19-.19C154.17 38.219 102.689 37.981 70.587 69.477 38.484 100.973 37.741 152.449 68.92 184.859c31.179 32.41 82.645 33.66 115.36 2.801 2.411-2.275 6.21-2.166 8.485 .245 2.275 2.411 2.166 6.21-.245 8.485C175.099 212.893 151.997 222.063 128 222h-1.28C84.368 221.404 47.646 192.556 37.039 151.549 26.432 110.543 44.56 67.507 81.31 46.449 118.061 25.392 164.356 31.513 194.37 61.4L226 90.35v-34.35c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6Z"),
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
        return _arrowClockwise!!
    }

private var _arrowClockwise: ImageVector? = null
