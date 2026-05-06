package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BracketsRound: ImageVector
    get() {
        if (_bracketsRound != null) return _bracketsRound!!
        _bracketsRound = phosphorBoldIcon(
            name = "BracketsRound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M82.33 222.19c-1.642 2.735-4.305 4.703-7.401 5.47-3.096 .767-6.37 .271-9.099-1.38C64 225.16 20 198 20 128 20 58 64 30.84 65.83 29.72c5.65-3.19 12.812-1.31 16.169 4.242 3.356 5.553 1.691 12.768-3.759 16.288C76.71 51.21 44 72.31 44 128c0 55.69 32.85 76.88 34.25 77.75 5.656 3.421 7.48 10.772 4.08 16.44ZM190.17 29.72c-3.672-2.33-8.316-2.491-12.14-.421-3.824 2.069-6.23 6.046-6.288 10.394-.058 4.348 2.241 8.387 6.008 10.558C179.15 51.12 212 72.19 212 128c0 55.81-32.85 76.88-34.17 77.7-3.761 2.164-6.061 6.189-6.015 10.528 .046 4.339 2.43 8.315 6.235 10.399 3.806 2.084 8.44 1.952 12.12-.346C192 225.16 236 198 236 128 236 58 192 30.84 190.17 29.72Z"),
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
        return _bracketsRound!!
    }

private var _bracketsRound: ImageVector? = null
