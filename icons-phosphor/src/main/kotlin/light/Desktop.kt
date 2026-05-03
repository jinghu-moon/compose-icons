package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Desktop: ImageVector
    get() {
        if (_desktop != null) return _desktop!!
        _desktop = phosphorLightIcon(
            name = "Desktop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 42.000 L 48.000 42.000 C 35.850 42.000 26.000 51.850 26.000 64.000 L 26.000 176.000 C 26.000 188.150 35.850 198.000 48.000 198.000 L 122.000 198.000 L 122.000 218.000 L 96.000 218.000 C 92.686 218.000 90.000 220.686 90.000 224.000 C 90.000 227.314 92.686 230.000 96.000 230.000 L 160.000 230.000 C 163.314 230.000 166.000 227.314 166.000 224.000 C 166.000 220.686 163.314 218.000 160.000 218.000 L 134.000 218.000 L 134.000 198.000 L 208.000 198.000 C 220.150 198.000 230.000 188.150 230.000 176.000 L 230.000 64.000 C 230.000 51.850 220.150 42.000 208.000 42.000 ZM 48.000 54.000 L 208.000 54.000 C 213.523 54.000 218.000 58.477 218.000 64.000 L 218.000 146.000 L 38.000 146.000 L 38.000 64.000 C 38.000 58.477 42.477 54.000 48.000 54.000 ZM 208.000 186.000 L 48.000 186.000 C 42.477 186.000 38.000 181.523 38.000 176.000 L 38.000 158.000 L 218.000 158.000 L 218.000 176.000 C 218.000 181.523 213.523 186.000 208.000 186.000 Z"),
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
        return _desktop!!
    }

private var _desktop: ImageVector? = null
