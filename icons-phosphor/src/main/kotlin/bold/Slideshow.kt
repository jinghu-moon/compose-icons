package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Slideshow: ImageVector
    get() {
        if (_slideshow != null) return _slideshow!!
        _slideshow = phosphorBoldIcon(
            name = "Slideshow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 44.000 L 72.000 44.000 C 60.954 44.000 52.000 52.954 52.000 64.000 L 52.000 192.000 C 52.000 203.046 60.954 212.000 72.000 212.000 L 184.000 212.000 C 195.046 212.000 204.000 203.046 204.000 192.000 L 204.000 64.000 C 204.000 52.954 195.046 44.000 184.000 44.000 ZM 180.000 188.000 L 76.000 188.000 L 76.000 68.000 L 180.000 68.000 ZM 244.000 56.000 L 244.000 200.000 C 244.000 206.627 238.627 212.000 232.000 212.000 C 225.373 212.000 220.000 206.627 220.000 200.000 L 220.000 56.000 C 220.000 49.373 225.373 44.000 232.000 44.000 C 238.627 44.000 244.000 49.373 244.000 56.000 ZM 36.000 56.000 L 36.000 200.000 C 36.000 206.627 30.627 212.000 24.000 212.000 C 17.373 212.000 12.000 206.627 12.000 200.000 L 12.000 56.000 C 12.000 49.373 17.373 44.000 24.000 44.000 C 30.627 44.000 36.000 49.373 36.000 56.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _slideshow!!
    }

private var _slideshow: ImageVector? = null
