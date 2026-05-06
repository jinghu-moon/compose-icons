package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ClockClockwise: ImageVector
    get() {
        if (_clockClockwise != null) return _clockClockwise!!
        _clockClockwise = phosphorLightIcon(
            name = "ClockClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M134 80v44.6l37.09 22.25c2.844 1.707 3.767 5.396 2.06 8.24-1.707 2.844-5.396 3.767-8.24 2.06l-40-24C123.102 132.064 121.998 130.109 122 128v-48c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM224 58c-3.314 0-6 2.686-6 6v23.36C210.52 78.53 203.06 70.23 194.47 61.53 158.011 25.071 98.987 24.786 62.178 60.892 25.368 96.998 24.515 156.016 60.265 193.172c35.75 37.155 94.757 38.578 132.255 3.188 2.325-2.292 2.391-6.021 .149-8.394-2.242-2.373-5.97-2.518-8.389-.326-32.719 30.857-84.188 29.602-115.363-2.814C37.741 152.41 38.494 100.931 70.604 69.44 102.714 37.95 154.197 38.199 186 70c9.24 9.36 17.18 18.3 25.31 28h-27.31c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h40c3.314 0 6-2.686 6-6v-40c0-3.314-2.686-6-6-6Z"),
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
        return _clockClockwise!!
    }

private var _clockClockwise: ImageVector? = null
