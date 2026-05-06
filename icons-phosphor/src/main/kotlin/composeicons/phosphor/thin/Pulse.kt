package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pulse: ImageVector
    get() {
        if (_pulse != null) return _pulse!!
        _pulse = phosphorThinIcon(
            name = "Pulse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 128c0 2.209-1.791 4-4 4h-29.53l-38.89 77.79c-.678 1.355-2.064 2.211-3.58 2.21h-.2c-1.588-.08-2.978-1.093-3.54-2.58L95.67 50.42l-36 79.28c-.667 1.42-2.102 2.319-3.67 2.3h-32c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h29.42L92.36 38.35c.668-1.47 2.153-2.394 3.767-2.344 1.614 .05 3.039 1.066 3.613 2.574l60.76 159.48 35.92-71.85c.678-1.355 2.064-2.211 3.58-2.21h32c2.209 0 4 1.791 4 4Z"),
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
        return _pulse!!
    }

private var _pulse: ImageVector? = null
