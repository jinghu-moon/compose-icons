package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MedalMilitary: ImageVector
    get() {
        if (_medalMilitary != null) return _medalMilitary!!
        _medalMilitary = phosphorThinIcon(
            name = "MedalMilitary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 207.000 44.000 L 49.000 44.000 C 41.820 44.000 36.000 49.820 36.000 57.000 L 36.000 106.210 C 36.017 111.292 38.994 115.897 43.620 118.000 L 114.340 150.140 C 93.778 156.855 81.147 177.520 84.547 198.882 C 87.947 220.244 106.369 235.966 128.000 235.966 C 149.631 235.966 168.053 220.244 171.453 198.882 C 174.853 177.520 162.222 156.855 141.660 150.140 L 212.380 118.000 C 217.006 115.897 219.983 111.292 220.000 106.210 L 220.000 57.000 C 220.000 49.820 214.180 44.000 207.000 44.000 ZM 164.000 52.000 L 164.000 131.240 L 128.000 147.610 L 92.000 131.240 L 92.000 52.000 ZM 44.000 106.210 L 44.000 57.000 C 44.000 54.239 46.239 52.000 49.000 52.000 L 84.000 52.000 L 84.000 127.610 L 46.930 110.760 C 45.146 109.949 44.001 108.170 44.000 106.210 ZM 164.000 192.000 C 164.000 211.882 147.882 228.000 128.000 228.000 C 108.118 228.000 92.000 211.882 92.000 192.000 C 92.000 172.118 108.118 156.000 128.000 156.000 C 147.882 156.000 164.000 172.118 164.000 192.000 ZM 212.000 106.210 C 211.999 108.170 210.854 109.949 209.070 110.760 L 172.000 127.610 L 172.000 52.000 L 207.000 52.000 C 209.761 52.000 212.000 54.239 212.000 57.000 Z"),
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
        return _medalMilitary!!
    }

private var _medalMilitary: ImageVector? = null
