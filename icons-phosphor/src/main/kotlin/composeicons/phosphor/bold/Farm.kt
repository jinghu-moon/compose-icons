package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Farm: ImageVector
    get() {
        if (_farm != null) return _farm!!
        _farm = phosphorBoldIcon(
            name = "Farm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M177.17 207.11c4.907 4.465 5.265 12.063 .8 16.97-4.465 4.907-12.063 5.265-16.97 .8C123.505 190.819 74.656 171.964 24 172c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 56.635-.054 111.253 21.024 153.17 59.11ZM102.43 205.11C77.839 193.78 51.075 187.942 24 188c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 23.615-.06 46.959 5.025 68.41 14.9 3.915 1.908 8.556 1.546 12.127-.946 3.571-2.493 5.511-6.725 5.07-11.057-.442-4.333-3.196-8.086-7.197-9.807ZM244 160c0 6.627-5.373 12-12 12-10.506-.005-20.997 .798-31.38 2.4 11.837 10.391 22.742 21.798 32.59 34.09 2.842 3.328 3.647 7.94 2.1 12.034-1.547 4.094-5.2 7.021-9.533 7.639-4.333 .617-8.658-1.173-11.287-4.672C168.272 165.535 98.128 131.846 24 132c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 14.74 .001 29.456 1.205 44 3.6v-31.6c0-3.777 1.778-7.334 4.8-9.6l64-48c4.267-3.2 10.133-3.2 14.4 0l64 48C218.222 72.666 220 76.223 220 80v28.28c4-.17 8-.28 12-.28 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-25.256-.043-50.365 3.854-74.42 11.55q9.28 5.35 18.15 11.46C194.123 150.347 213.025 147.992 232 148c6.627 0 12 5.373 12 12ZM156 108h-24v19.3q11.83-4.77 24-8.39ZM92 116.69c5.39 1.4 10.72 3 16 4.72v-25.41c0-6.627 5.373-12 12-12h48c6.627 0 12 5.373 12 12v17q8-1.56 16-2.65v-24.35L144 47 92 86Z"),
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
        return _farm!!
    }

private var _farm: ImageVector? = null
