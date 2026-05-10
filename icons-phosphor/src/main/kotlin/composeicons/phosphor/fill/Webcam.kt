package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Webcam: ImageVector
    get() {
        if (_webcam != null) return _webcam!!
        _webcam = phosphorFillIcon(
            name = "Webcam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 104c0 17.673-14.327 32-32 32C110.327 136 96 121.673 96 104 96 86.327 110.327 72 128 72c17.673 0 32 14.327 32 32ZM232 208c0 4.418-3.582 8-8 8h-192c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h88v-16.4C77.588 179.337 45.966 142.569 48.1 99.996 50.234 57.423 85.374 24.001 128 24.001c42.626 0 77.766 33.422 79.9 75.995 2.134 42.573-29.487 79.341-71.9 83.604v16.4h88c4.418 0 8 3.582 8 8ZM128 152c26.51 0 48-21.49 48-48C176 77.49 154.51 56 128 56 101.49 56 80 77.49 80 104c.028 26.498 21.502 47.972 48 48Z"),
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
        return _webcam!!
    }

private var _webcam: ImageVector? = null
