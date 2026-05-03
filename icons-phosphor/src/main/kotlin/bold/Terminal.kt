package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Terminal: ImageVector
    get() {
        if (_terminal != null) return _terminal!!
        _terminal = phosphorBoldIcon(
            name = "Terminal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 120.000 137.000 L 48.000 201.000 C 43.029 205.418 35.418 204.971 31.000 200.000 C 26.582 195.029 27.029 187.418 32.000 183.000 L 93.910 128.000 L 32.000 73.000 C 27.029 68.582 26.582 60.971 31.000 56.000 C 35.418 51.029 43.029 50.582 48.000 55.000 L 120.000 119.000 C 122.583 121.278 124.063 124.556 124.063 128.000 C 124.063 131.444 122.583 134.722 120.000 137.000 ZM 216.000 180.000 L 120.000 180.000 C 113.373 180.000 108.000 185.373 108.000 192.000 C 108.000 198.627 113.373 204.000 120.000 204.000 L 216.000 204.000 C 222.627 204.000 228.000 198.627 228.000 192.000 C 228.000 185.373 222.627 180.000 216.000 180.000 Z"),
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
        return _terminal!!
    }

private var _terminal: ImageVector? = null
