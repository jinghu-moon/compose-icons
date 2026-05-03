package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChartLine: ImageVector
    get() {
        if (_chartLine != null) return _chartLine!!
        _chartLine = phosphorLightIcon(
            name = "ChartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.000 208.000 C 230.000 211.314 227.314 214.000 224.000 214.000 L 32.000 214.000 C 28.686 214.000 26.000 211.314 26.000 208.000 L 26.000 48.000 C 26.000 44.686 28.686 42.000 32.000 42.000 C 35.314 42.000 38.000 44.686 38.000 48.000 L 38.000 146.780 L 92.050 99.480 C 94.185 97.615 97.333 97.498 99.600 99.200 L 159.710 144.280 L 220.050 91.480 C 222.557 89.549 226.133 89.897 228.221 92.275 C 230.308 94.654 230.190 98.244 227.950 100.480 L 163.950 156.480 C 161.815 158.345 158.667 158.462 156.400 156.760 L 96.290 111.720 L 38.000 162.720 L 38.000 202.000 L 224.000 202.000 C 227.314 202.000 230.000 204.686 230.000 208.000 Z"),
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
        return _chartLine!!
    }

private var _chartLine: ImageVector? = null
