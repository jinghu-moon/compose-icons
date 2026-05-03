package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Slideshow: ImageVector
    get() {
        if (_slideshow != null) return _slideshow!!
        _slideshow = phosphorLightIcon(
            name = "Slideshow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 50.000 L 64.000 50.000 C 56.268 50.000 50.000 56.268 50.000 64.000 L 50.000 192.000 C 50.000 199.732 56.268 206.000 64.000 206.000 L 192.000 206.000 C 199.732 206.000 206.000 199.732 206.000 192.000 L 206.000 64.000 C 206.000 56.268 199.732 50.000 192.000 50.000 ZM 194.000 192.000 C 194.000 193.105 193.105 194.000 192.000 194.000 L 64.000 194.000 C 62.895 194.000 62.000 193.105 62.000 192.000 L 62.000 64.000 C 62.000 62.895 62.895 62.000 64.000 62.000 L 192.000 62.000 C 193.105 62.000 194.000 62.895 194.000 64.000 ZM 238.000 56.000 L 238.000 200.000 C 238.000 203.314 235.314 206.000 232.000 206.000 C 228.686 206.000 226.000 203.314 226.000 200.000 L 226.000 56.000 C 226.000 52.686 228.686 50.000 232.000 50.000 C 235.314 50.000 238.000 52.686 238.000 56.000 ZM 30.000 56.000 L 30.000 200.000 C 30.000 203.314 27.314 206.000 24.000 206.000 C 20.686 206.000 18.000 203.314 18.000 200.000 L 18.000 56.000 C 18.000 52.686 20.686 50.000 24.000 50.000 C 27.314 50.000 30.000 52.686 30.000 56.000 Z"),
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
