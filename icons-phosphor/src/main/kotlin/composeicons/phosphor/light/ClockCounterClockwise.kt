package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ClockCounterClockwise: ImageVector
    get() {
        if (_clockCounterClockwise != null) return _clockCounterClockwise!!
        _clockCounterClockwise = phosphorLightIcon(
            name = "ClockCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M134 80v44.6l37.09 22.25c2.844 1.707 3.767 5.396 2.06 8.24-1.707 2.844-5.396 3.767-8.24 2.06l-40-24C123.102 132.064 121.998 130.109 122 128v-48c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM128 34C103.045 33.935 79.102 43.86 61.51 61.56 52.93 70.24 45.51 78.56 38 87.36v-23.36c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v40c0 3.314 2.686 6 6 6h40c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-27.27C52.86 88.29 60.79 79.35 70 70c31.805-31.804 83.294-32.051 115.403-.554 32.109 31.497 32.853 82.981 1.668 115.392-31.186 32.412-82.66 33.653-115.371 2.781-1.548-1.526-3.8-2.095-5.888-1.488-2.087 .607-3.683 2.296-4.171 4.414-.488 2.118 .208 4.335 1.819 5.794 30.689 28.984 76.936 33.955 113.085 12.156 36.148-21.799 53.332-65.022 42.018-105.69C207.249 62.138 170.213 33.999 128 34Z"),
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
        return _clockCounterClockwise!!
    }

private var _clockCounterClockwise: ImageVector? = null
