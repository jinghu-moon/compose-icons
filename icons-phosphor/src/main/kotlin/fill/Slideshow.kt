package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Slideshow: ImageVector
    get() {
        if (_slideshow != null) return _slideshow!!
        _slideshow = phosphorFillIcon(
            name = "Slideshow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 64.000 L 208.000 192.000 C 208.000 200.837 200.837 208.000 192.000 208.000 L 64.000 208.000 C 55.163 208.000 48.000 200.837 48.000 192.000 L 48.000 64.000 C 48.000 55.163 55.163 48.000 64.000 48.000 L 192.000 48.000 C 200.837 48.000 208.000 55.163 208.000 64.000 ZM 232.000 48.000 C 227.582 48.000 224.000 51.582 224.000 56.000 L 224.000 200.000 C 224.000 204.418 227.582 208.000 232.000 208.000 C 236.418 208.000 240.000 204.418 240.000 200.000 L 240.000 56.000 C 240.000 51.582 236.418 48.000 232.000 48.000 ZM 24.000 48.000 C 19.582 48.000 16.000 51.582 16.000 56.000 L 16.000 200.000 C 16.000 204.418 19.582 208.000 24.000 208.000 C 28.418 208.000 32.000 204.418 32.000 200.000 L 32.000 56.000 C 32.000 51.582 28.418 48.000 24.000 48.000 Z"),
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
