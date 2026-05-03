package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSeven: ImageVector
    get() {
        if (_numberSeven != null) return _numberSeven!!
        _numberSeven = phosphorLightIcon(
            name = "NumberSeven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 173.750 49.720 L 125.750 209.720 C 124.797 212.896 121.451 214.698 118.275 213.745 C 115.099 212.792 113.297 209.446 114.250 206.270 L 159.940 54.000 L 88.000 54.000 C 84.686 54.000 82.000 51.314 82.000 48.000 C 82.000 44.686 84.686 42.000 88.000 42.000 L 168.000 42.000 C 169.896 41.999 171.681 42.895 172.814 44.416 C 173.946 45.937 174.294 47.903 173.750 49.720 Z"),
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
        return _numberSeven!!
    }

private var _numberSeven: ImageVector? = null
