package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BehanceLogo: ImageVector
    get() {
        if (_behanceLogo != null) return _behanceLogo!!
        _behanceLogo = phosphorThinIcon(
            name = "BehanceLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 108.160 122.740 C 120.953 114.654 126.861 99.085 122.653 84.547 C 118.445 70.009 105.135 60.003 90.000 60.000 L 32.000 60.000 C 29.791 60.000 28.000 61.791 28.000 64.000 L 28.000 192.000 C 28.000 194.209 29.791 196.000 32.000 196.000 L 94.000 196.000 C 112.203 195.996 127.847 183.084 131.301 165.211 C 134.756 147.339 125.051 129.527 108.160 122.740 ZM 36.000 68.000 L 90.000 68.000 C 104.359 68.000 116.000 79.641 116.000 94.000 C 116.000 108.359 104.359 120.000 90.000 120.000 L 36.000 120.000 ZM 94.000 188.000 L 36.000 188.000 L 36.000 128.000 L 94.000 128.000 C 110.569 128.000 124.000 141.431 124.000 158.000 C 124.000 174.569 110.569 188.000 94.000 188.000 ZM 164.000 80.000 C 164.000 77.791 165.791 76.000 168.000 76.000 L 232.000 76.000 C 234.209 76.000 236.000 77.791 236.000 80.000 C 236.000 82.209 234.209 84.000 232.000 84.000 L 168.000 84.000 C 165.791 84.000 164.000 82.209 164.000 80.000 ZM 200.000 108.000 C 179.311 108.004 161.419 122.420 157.016 142.635 C 152.612 162.850 162.887 183.402 181.700 192.010 C 200.513 200.619 222.782 194.958 235.200 178.410 C 236.528 176.643 236.172 174.133 234.405 172.805 C 232.638 171.477 230.128 171.833 228.800 173.600 C 219.944 185.411 204.775 190.618 190.532 186.737 C 176.289 182.855 165.859 170.671 164.220 156.000 L 240.000 156.000 C 242.209 156.000 244.000 154.209 244.000 152.000 C 243.972 127.711 224.289 108.028 200.000 108.000 ZM 164.220 148.000 C 166.245 129.768 181.656 115.974 200.000 115.974 C 218.344 115.974 233.755 129.768 235.780 148.000 Z"),
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
        return _behanceLogo!!
    }

private var _behanceLogo: ImageVector? = null
