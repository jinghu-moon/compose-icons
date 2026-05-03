package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Scroll: ImageVector
    get() {
        if (_scroll != null) return _scroll!!
        _scroll = phosphorBoldIcon(
            name = "Scroll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 92.000 92.000 C 92.000 85.373 97.373 80.000 104.000 80.000 L 164.000 80.000 C 170.627 80.000 176.000 85.373 176.000 92.000 C 176.000 98.627 170.627 104.000 164.000 104.000 L 104.000 104.000 C 97.373 104.000 92.000 98.627 92.000 92.000 ZM 104.000 144.000 L 164.000 144.000 C 170.627 144.000 176.000 138.627 176.000 132.000 C 176.000 125.373 170.627 120.000 164.000 120.000 L 104.000 120.000 C 97.373 120.000 92.000 125.373 92.000 132.000 C 92.000 138.627 97.373 144.000 104.000 144.000 ZM 236.000 192.000 C 236.000 211.882 219.882 228.000 200.000 228.000 L 88.000 228.000 C 68.118 228.000 52.000 211.882 52.000 192.000 L 52.000 64.000 C 52.000 57.373 46.627 52.000 40.000 52.000 C 33.373 52.000 28.000 57.373 28.000 64.000 C 28.000 67.730 31.350 70.510 31.380 70.540 L 31.200 70.400 L 31.200 70.400 C 34.796 72.909 36.737 77.180 36.262 81.540 C 35.788 85.899 32.973 89.652 28.922 91.329 C 24.870 93.006 20.226 92.339 16.810 89.590 L 16.810 89.590 C 15.490 88.620 4.000 79.550 4.000 64.000 C 4.000 44.118 20.118 28.000 40.000 28.000 L 176.000 28.000 C 195.882 28.000 212.000 44.118 212.000 64.000 L 212.000 164.000 L 216.000 164.000 C 218.596 164.000 221.123 164.842 223.200 166.400 C 224.510 167.380 236.000 176.450 236.000 192.000 ZM 92.620 172.200 C 94.255 167.303 98.838 164.001 104.000 164.000 L 188.000 164.000 L 188.000 64.000 C 188.000 57.373 182.627 52.000 176.000 52.000 L 73.940 52.000 C 75.305 55.853 76.002 59.912 76.000 64.000 L 76.000 192.000 C 76.000 198.627 81.373 204.000 88.000 204.000 C 94.627 204.000 100.000 198.627 100.000 192.000 C 100.000 188.420 96.830 185.620 96.800 185.600 C 92.667 182.499 90.983 177.101 92.620 172.200 ZM 212.000 192.000 C 211.965 190.578 211.535 189.193 210.760 188.000 L 123.760 188.000 C 123.935 189.326 124.022 190.662 124.020 192.000 C 124.023 196.088 123.326 200.147 121.960 204.000 L 200.000 204.000 C 206.627 204.000 212.000 198.627 212.000 192.000 Z"),
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
        return _scroll!!
    }

private var _scroll: ImageVector? = null
