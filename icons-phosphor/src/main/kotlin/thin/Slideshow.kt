package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Slideshow: ImageVector
    get() {
        if (_slideshow != null) return _slideshow!!
        _slideshow = phosphorThinIcon(
            name = "Slideshow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 52.000 L 64.000 52.000 C 57.373 52.000 52.000 57.373 52.000 64.000 L 52.000 192.000 C 52.000 198.627 57.373 204.000 64.000 204.000 L 192.000 204.000 C 198.627 204.000 204.000 198.627 204.000 192.000 L 204.000 64.000 C 204.000 57.373 198.627 52.000 192.000 52.000 ZM 196.000 192.000 C 196.000 194.209 194.209 196.000 192.000 196.000 L 64.000 196.000 C 61.791 196.000 60.000 194.209 60.000 192.000 L 60.000 64.000 C 60.000 61.791 61.791 60.000 64.000 60.000 L 192.000 60.000 C 194.209 60.000 196.000 61.791 196.000 64.000 ZM 236.000 56.000 L 236.000 200.000 C 236.000 202.209 234.209 204.000 232.000 204.000 C 229.791 204.000 228.000 202.209 228.000 200.000 L 228.000 56.000 C 228.000 53.791 229.791 52.000 232.000 52.000 C 234.209 52.000 236.000 53.791 236.000 56.000 ZM 28.000 56.000 L 28.000 200.000 C 28.000 202.209 26.209 204.000 24.000 204.000 C 21.791 204.000 20.000 202.209 20.000 200.000 L 20.000 56.000 C 20.000 53.791 21.791 52.000 24.000 52.000 C 26.209 52.000 28.000 53.791 28.000 56.000 Z"),
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
