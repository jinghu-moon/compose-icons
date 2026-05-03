package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Share: ImageVector
    get() {
        if (_share != null) return _share!!
        _share = phosphorLightIcon(
            name = "Share",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.240 108.240 L 180.240 156.240 C 177.876 158.443 174.192 158.378 171.907 156.093 C 169.622 153.808 169.557 150.124 171.760 147.760 L 209.510 110.000 L 165.000 110.000 C 123.943 109.966 88.074 137.741 77.830 177.500 C 77.002 180.709 73.729 182.638 70.520 181.810 C 67.311 180.982 65.382 177.709 66.210 174.500 C 77.822 129.442 118.470 97.966 165.000 98.000 L 209.530 98.000 L 171.760 60.240 C 169.557 57.876 169.622 54.192 171.907 51.907 C 174.192 49.622 177.876 49.557 180.240 51.760 L 228.240 99.760 C 230.580 102.103 230.580 105.897 228.240 108.240 ZM 192.000 210.000 L 38.000 210.000 L 38.000 88.000 C 38.000 84.686 35.314 82.000 32.000 82.000 C 28.686 82.000 26.000 84.686 26.000 88.000 L 26.000 216.000 C 26.000 219.314 28.686 222.000 32.000 222.000 L 192.000 222.000 C 195.314 222.000 198.000 219.314 198.000 216.000 C 198.000 212.686 195.314 210.000 192.000 210.000 Z"),
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
        return _share!!
    }

private var _share: ImageVector? = null
