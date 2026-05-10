package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ClockCounterClockwise: ImageVector
    get() {
        if (_clockCounterClockwise != null) return _clockCounterClockwise!!
        _clockCounterClockwise = phosphorFillIcon(
            name = "ClockCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c.001 38.324-22.792 72.977-57.982 88.154C130.827 231.331 89.982 224.124 62.11 197.82c-3.214-3.038-3.358-8.106-.32-11.32 3.038-3.214 8.106-3.358 11.32-.32 31.919 30.113 82.138 28.893 112.557-2.734 30.419-31.627 29.684-81.855-1.648-112.578C152.687 40.145 102.454 40.396 71.43 71.43 67.9 75 64.58 78.51 61.35 82L77.66 98.34c2.291 2.288 2.976 5.731 1.737 8.722C78.158 110.053 75.238 112.003 72 112h-40c-4.418 0-8-3.582-8-8v-40c-.003-3.238 1.947-6.158 4.938-7.397 2.991-1.239 6.434-.554 8.722 1.737L50 70.7c3.22-3.49 6.54-7 10.06-10.55C87.506 32.657 128.817 24.415 164.712 39.271 200.607 54.127 224.01 89.152 224 128ZM128 72c-4.418 0-8 3.582-8 8v48c-.001 2.809 1.472 5.413 3.88 6.86l40 24c3.789 2.275 8.705 1.049 10.98-2.74 2.275-3.789 1.049-8.705-2.74-10.98L136 123.47v-43.47c0-4.418-3.582-8-8-8Z"),
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
