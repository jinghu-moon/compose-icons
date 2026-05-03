package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TrendDown: ImageVector
    get() {
        if (_trendDown != null) return _trendDown!!
        _trendDown = phosphorLightIcon(
            name = "TrendDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 238.000 128.000 L 238.000 192.000 C 238.000 195.314 235.314 198.000 232.000 198.000 L 168.000 198.000 C 164.686 198.000 162.000 195.314 162.000 192.000 C 162.000 188.686 164.686 186.000 168.000 186.000 L 217.520 186.000 L 136.000 104.490 L 100.240 140.240 C 97.897 142.580 94.103 142.580 91.760 140.240 L 19.760 68.240 C 17.557 65.876 17.622 62.192 19.907 59.907 C 22.192 57.622 25.876 57.557 28.240 59.760 L 96.000 127.510 L 131.760 91.760 C 134.103 89.420 137.897 89.420 140.240 91.760 L 226.000 177.520 L 226.000 128.000 C 226.000 124.686 228.686 122.000 232.000 122.000 C 235.314 122.000 238.000 124.686 238.000 128.000 Z"),
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
        return _trendDown!!
    }

private var _trendDown: ImageVector? = null
