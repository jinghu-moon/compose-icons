package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Disc: ImageVector
    get() {
        if (_disc != null) return _disc!!
        _disc = phosphorBoldIcon(
            name = "Disc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM170.32 116c-.932-3.288-2.244-6.456-3.91-9.44L195.25 77.72c8.424 11.224 13.886 24.389 15.88 38.28ZM148 128c0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20ZM128 212C91.456 212.023 59.09 188.417 47.947 153.613 36.804 118.809 49.441 80.795 79.203 59.589c29.762-21.206 69.82-20.736 99.077 1.161L149.43 89.59C133.072 80.459 112.726 82.688 98.732 95.143 84.738 107.598 80.165 127.548 87.337 144.855c7.172 17.307 24.516 28.174 43.218 27.08 18.702-1.094 34.66-13.91 39.765-31.935h40.81c-6.013 41.299-41.396 71.944-83.13 72Z"),
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
        return _disc!!
    }

private var _disc: ImageVector? = null
