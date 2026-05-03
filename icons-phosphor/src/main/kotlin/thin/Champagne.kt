package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Champagne: ImageVector
    get() {
        if (_champagne != null) return _champagne!!
        _champagne = phosphorThinIcon(
            name = "Champagne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 142.300 12.000 L 97.700 12.000 C 95.970 12.001 94.436 13.115 93.900 14.760 C 92.450 19.230 58.700 124.510 87.770 164.540 C 94.500 173.790 104.000 178.920 116.000 179.830 L 116.000 236.000 L 96.000 236.000 C 93.791 236.000 92.000 237.791 92.000 240.000 C 92.000 242.209 93.791 244.000 96.000 244.000 L 144.000 244.000 C 146.209 244.000 148.000 242.209 148.000 240.000 C 148.000 237.791 146.209 236.000 144.000 236.000 L 124.000 236.000 L 124.000 179.830 C 136.000 178.920 145.500 173.830 152.220 164.540 C 181.300 124.540 147.550 19.230 146.100 14.760 C 145.564 13.115 144.030 12.001 142.300 12.000 ZM 100.650 20.000 L 139.350 20.000 C 144.099 35.777 147.988 51.801 151.000 68.000 L 89.000 68.000 C 92.025 51.804 95.914 35.781 100.650 20.000 ZM 145.750 159.830 C 139.800 168.000 131.380 172.000 120.000 172.000 C 108.620 172.000 100.200 168.000 94.250 159.840 C 81.000 141.630 82.600 106.720 87.600 76.000 L 152.410 76.000 C 158.860 116.000 156.570 144.940 145.750 159.830 ZM 228.000 52.000 C 228.000 56.418 224.418 60.000 220.000 60.000 C 215.582 60.000 212.000 56.418 212.000 52.000 C 212.000 47.582 215.582 44.000 220.000 44.000 C 224.418 44.000 228.000 47.582 228.000 52.000 ZM 204.000 20.000 C 204.000 24.418 200.418 28.000 196.000 28.000 C 191.582 28.000 188.000 24.418 188.000 20.000 C 188.000 15.582 191.582 12.000 196.000 12.000 C 200.418 12.000 204.000 15.582 204.000 20.000 ZM 204.000 100.000 C 204.000 104.418 200.418 108.000 196.000 108.000 C 191.582 108.000 188.000 104.418 188.000 100.000 C 188.000 95.582 191.582 92.000 196.000 92.000 C 200.418 92.000 204.000 95.582 204.000 100.000 Z"),
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
        return _champagne!!
    }

private var _champagne: ImageVector? = null
