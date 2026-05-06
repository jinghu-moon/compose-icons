package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ClockCounterClockwise: ImageVector
    get() {
        if (_clockCounterClockwise != null) return _clockCounterClockwise!!
        _clockCounterClockwise = phosphorBoldIcon(
            name = "ClockCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M140 80v41.21l34.17 20.5c3.761 2.164 6.061 6.189 6.015 10.528-.046 4.339-2.43 8.315-6.235 10.399-3.806 2.084-8.44 1.952-12.12-.346l-40-24C118.214 136.122 116.001 132.216 116 128v-48c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM128 28C101.44 27.932 75.958 38.497 57.24 57.34c-4.69 4.74-9 9.37-13.24 14v-7.34C44 57.373 38.627 52 32 52 25.373 52 20 57.373 20 64v40c0 6.627 5.373 12 12 12h40c6.627 0 12-5.373 12-12C84 97.373 78.627 92 72 92h-14.23C63 86 68.37 80.22 74.26 74.26c29.475-29.484 77.199-29.719 106.964-.527 29.764 29.192 30.456 76.912 1.55 106.954-28.906 30.042-76.617 31.19-106.934 2.573-4.821-4.551-12.419-4.331-16.97 .49-4.551 4.821-4.331 12.419 .49 16.97 32.654 30.823 81.85 36.101 120.299 12.905 38.449-23.196 56.722-69.176 44.683-112.436C212.302 57.929 172.904 27.999 128 28Z"),
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
