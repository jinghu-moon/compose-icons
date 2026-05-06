package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) return _flagCheckered!!
        _flagCheckered = phosphorLightIcon(
            name = "FlagCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M226.49 50.5c-2.136-.976-4.644-.616-6.42 .92-29 25.11-53.28 13.08-81.41-.84C110.74 36.76 79.09 21.09 44.07 51.42 42.743 52.57 41.987 54.244 42 56v168c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-45.22c28.08-22.79 51.88-11 79.34 2.59 27.92 13.82 59.58 29.48 94.59-.85 1.311-1.136 2.066-2.785 2.07-4.52v-120c.016-2.365-1.358-4.519-3.51-5.5ZM218 68v45.2c-15.53 12.6-29.75 14.65-44 11.65v-47.97c14 2.45 28.64 .9 44-8.88ZM162 73.87v47.4c-7.6-2.85-15.31-6.66-23.34-10.64C129.5 106.1 119.95 101.37 110 98.13v-47.42c7.953 3.15 15.743 6.698 23.34 10.63 9.16 4.53 18.71 9.25 28.66 12.49ZM98 47.13v47.87C84 92.55 69.36 94.11 54 103.93v-45.18C69.53 46.15 83.75 44.13 98 47.13ZM86.63 154C76.13 154 65.24 156.79 54 164v-45.21C69.53 106.18 83.75 104.14 98 107.14v47.93C94.248 154.387 90.444 154.029 86.63 154ZM110 158.11v-47.39c7.6 2.84 15.31 6.66 23.34 10.63 9.16 4.53 18.71 9.26 28.66 12.5v47.39c-7.6-2.85-15.31-6.66-23.34-10.63C129.5 166.07 120 161.35 110 158.11ZM174 184.81v-47.92c3.754 .659 7.558 .994 11.37 1 10.5 0 21.39-2.78 32.63-10v45.24c-15.53 12.66-29.75 14.68-44 11.68Z"),
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
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
