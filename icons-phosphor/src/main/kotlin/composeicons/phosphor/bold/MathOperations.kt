package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MathOperations: ImageVector
    get() {
        if (_mathOperations != null) return _mathOperations!!
        _mathOperations = phosphorBoldIcon(
            name = "MathOperations",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M116 72c0 6.627-5.373 12-12 12h-64C33.373 84 28 78.627 28 72 28 65.373 33.373 60 40 60h64c6.627 0 12 5.373 12 12ZM104 172h-20v-20c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v20h-20c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h20v20c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-20h20c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM152 176h64c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-64c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM216 192h-64c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h64c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM151.51 104.49c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529L184 89l15.51 15.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17L201 72 216.52 56.49c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0L184 55 168.49 39.51c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L167 72 151.51 87.51c-2.253 2.251-3.519 5.305-3.519 8.49 0 3.185 1.266 6.239 3.519 8.49Z"),
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
        return _mathOperations!!
    }

private var _mathOperations: ImageVector? = null
