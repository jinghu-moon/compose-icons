package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ClockClockwise: ImageVector
    get() {
        if (_clockClockwise != null) return _clockClockwise!!
        _clockClockwise = phosphorBoldIcon(
            name = "ClockClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M140 80v41.21l34.17 20.5c3.761 2.164 6.061 6.189 6.015 10.528-.046 4.339-2.43 8.315-6.235 10.399-3.806 2.084-8.44 1.952-12.12-.346l-40-24C118.214 136.122 116.001 132.216 116 128v-48c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM224 52c-6.627 0-12 5.373-12 12v7.37c-4.21-4.67-8.58-9.31-13.29-14.08C159.922 18.506 97.131 18.206 57.975 56.618 18.818 95.03 17.912 157.815 55.944 197.34c38.032 39.526 100.805 41.038 140.696 3.39 4.821-4.551 5.041-12.149 .49-16.97-4.551-4.821-12.149-5.041-16.97-.49-30.312 28.606-78.008 27.463-106.914-2.563C44.34 150.681 45.009 102.976 74.746 73.773c29.737-29.203 77.446-29.008 106.944 .437C187.61 80.2 193 86 198.23 92h-14.23c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h40c6.627 0 12-5.373 12-12v-40c0-6.627-5.373-12-12-12Z"),
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
