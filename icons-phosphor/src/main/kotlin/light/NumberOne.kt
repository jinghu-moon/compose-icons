package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberOne: ImageVector
    get() {
        if (_numberOne != null) return _numberOne!!
        _numberOne = phosphorLightIcon(
            name = "NumberOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 142.000 48.000 L 142.000 208.000 C 142.000 211.314 139.314 214.000 136.000 214.000 C 132.686 214.000 130.000 211.314 130.000 208.000 L 130.000 58.600 L 99.090 77.140 C 96.248 78.847 92.562 77.927 90.855 75.085 C 89.148 72.243 90.068 68.557 92.910 66.850 L 132.910 42.850 C 134.765 41.736 137.075 41.706 138.958 42.773 C 140.840 43.839 142.002 45.837 142.000 48.000 Z"),
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
        return _numberOne!!
    }

private var _numberOne: ImageVector? = null
