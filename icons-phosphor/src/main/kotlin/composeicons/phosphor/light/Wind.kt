package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Wind: ImageVector
    get() {
        if (_wind != null) return _wind!!
        _wind = phosphorLightIcon(
            name = "Wind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M182 184c0 16.569-13.431 30-30 30-12.9 0-25.36-8.38-29.63-19.92-1.149-3.109 .441-6.561 3.55-7.71 3.109-1.149 6.561 .441 7.71 3.55C136.13 196.69 144.2 202 152 202c9.941 0 18-8.059 18-18 0-9.941-8.059-18-18-18h-112c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h112c16.569 0 30 13.431 30 30ZM150 72C150 55.431 136.569 42 120 42 107.1 42 94.64 50.38 90.37 61.92c-1.149 3.109 .441 6.561 3.55 7.71 3.109 1.149 6.561-.441 7.71-3.55C104.13 59.31 112.2 54 120 54c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18h-96c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h96c16.569 0 30-13.431 30-30ZM208 74c-12.9 0-25.36 8.38-29.63 19.92-1.149 3.109 .441 6.561 3.55 7.71 3.109 1.149 6.561-.441 7.71-3.55C192.13 91.31 200.2 86 208 86c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18h-176c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h176c16.569 0 30-13.431 30-30C238 87.431 224.569 74 208 74Z"),
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
        return _wind!!
    }

private var _wind: ImageVector? = null
