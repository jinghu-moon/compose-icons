package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MaskHappy: ImageVector
    get() {
        if (_maskHappy != null) return _maskHappy!!
        _maskHappy = phosphorLightIcon(
            name = "MaskHappy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188.47 124c1.488 1.588 2 3.858 1.337 5.931-.663 2.073-2.397 3.625-4.531 4.054-2.134 .43-4.333-.33-5.746-1.985-3.06-3.42-9.74-6-15.53-6-5.79 0-12.47 2.58-15.53 6-2.229 2.379-5.95 2.542-8.379 .368-2.429-2.174-2.678-5.89-.561-8.368 5.35-6 15.19-10 24.47-10 9.28 0 19.12 4 24.47 10ZM107.53 132c1.414 1.655 3.613 2.415 5.746 1.985 2.134-.43 3.867-1.981 4.531-4.054 .663-2.073 .151-4.343-1.337-5.931C111.12 118 101.28 114 92 114c-9.28 0-19.12 4-24.47 10-1.488 1.588-2 3.858-1.337 5.931 .663 2.073 2.397 3.625 4.531 4.054 2.134 .43 4.333-.33 5.746-1.985 3.06-3.42 9.74-6 15.53-6 5.79 0 12.47 2.58 15.53 6ZM166.26 163.43c-1.211-1.033-2.782-1.543-4.369-1.417-1.587 .126-3.058 .877-4.091 2.087-7.389 8.812-18.3 13.902-29.8 13.902-11.5 0-22.411-5.09-29.8-13.902-2.151-2.521-5.939-2.821-8.46-.67-2.521 2.151-2.821 5.939-.67 8.46 9.671 11.482 23.918 18.109 38.93 18.109 15.012 0 29.259-6.627 38.93-18.109 1.033-1.211 1.543-2.782 1.417-4.369-.126-1.587-.877-3.058-2.087-4.091ZM222 48v55.77c0 35.45-9.53 68.86-26.83 94.06C177.4 223.74 153.54 238 128 238 102.46 238 78.6 223.74 60.83 197.84 43.53 172.64 34 139.23 34 103.78v-55.78c.018-4.61 2.303-8.915 6.111-11.512C43.919 33.89 48.762 33.334 53.06 35 67.25 40.46 95.86 49.7 128 49.7c32.14 0 60.75-9.24 74.94-14.7 4.298-1.666 9.141-1.11 12.949 1.488 3.808 2.597 6.094 6.903 6.111 11.512ZM210 48c.003-.663-.323-1.285-.87-1.66-.54-.382-1.238-.462-1.85-.21C192.31 52 162.1 61.7 128 61.7 93.9 61.7 63.69 52 48.72 46.14c-.614-.239-1.306-.16-1.85 .21-.544 .373-.87 .99-.87 1.65v55.76C46 171.17 82.79 226 128 226c45.21 0 82-54.83 82-122.22Z"),
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
        return _maskHappy!!
    }

private var _maskHappy: ImageVector? = null
