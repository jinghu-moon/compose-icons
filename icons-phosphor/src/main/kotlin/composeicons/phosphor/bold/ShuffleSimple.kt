package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShuffleSimple: ImageVector
    get() {
        if (_shuffleSimple != null) return _shuffleSimple!!
        _shuffleSimple = phosphorBoldIcon(
            name = "ShuffleSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 48v40c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-11l-31.23 31.2c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L179 60h-11c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h40c6.627 0 12 5.373 12 12ZM208 156c-6.627 0-12 5.373-12 12v11L56.49 39.51c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L179 196h-11c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h40c6.627 0 12-5.373 12-12v-40c0-6.627-5.373-12-12-12ZM91.23 147.8 39.51 199.51c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0l51.71-51.72c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0Z"),
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
        return _shuffleSimple!!
    }

private var _shuffleSimple: ImageVector? = null
