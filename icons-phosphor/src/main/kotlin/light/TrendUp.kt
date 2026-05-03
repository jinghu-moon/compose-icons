package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TrendUp: ImageVector
    get() {
        if (_trendUp != null) return _trendUp!!
        _trendUp = phosphorLightIcon(
            name = "TrendUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 238.000 56.000 L 238.000 120.000 C 238.000 123.314 235.314 126.000 232.000 126.000 C 228.686 126.000 226.000 123.314 226.000 120.000 L 226.000 70.480 L 140.240 156.240 C 137.897 158.580 134.103 158.580 131.760 156.240 L 96.000 120.490 L 28.240 188.240 C 25.876 190.443 22.192 190.378 19.907 188.093 C 17.622 185.808 17.557 182.124 19.760 179.760 L 91.760 107.760 C 94.103 105.420 97.897 105.420 100.240 107.760 L 136.000 143.510 L 217.520 62.000 L 168.000 62.000 C 164.686 62.000 162.000 59.314 162.000 56.000 C 162.000 52.686 164.686 50.000 168.000 50.000 L 232.000 50.000 C 235.314 50.000 238.000 52.686 238.000 56.000 Z"),
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
        return _trendUp!!
    }

private var _trendUp: ImageVector? = null
