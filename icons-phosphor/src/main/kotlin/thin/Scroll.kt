package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Scroll: ImageVector
    get() {
        if (_scroll != null) return _scroll!!
        _scroll = phosphorThinIcon(
            name = "Scroll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 100.000 104.000 C 100.000 101.791 101.791 100.000 104.000 100.000 L 168.000 100.000 C 170.209 100.000 172.000 101.791 172.000 104.000 C 172.000 106.209 170.209 108.000 168.000 108.000 L 104.000 108.000 C 101.791 108.000 100.000 106.209 100.000 104.000 ZM 104.000 140.000 L 168.000 140.000 C 170.209 140.000 172.000 138.209 172.000 136.000 C 172.000 133.791 170.209 132.000 168.000 132.000 L 104.000 132.000 C 101.791 132.000 100.000 133.791 100.000 136.000 C 100.000 138.209 101.791 140.000 104.000 140.000 ZM 228.000 192.000 C 228.000 207.464 215.464 220.000 200.000 220.000 L 88.000 220.000 C 72.536 220.000 60.000 207.464 60.000 192.000 L 60.000 64.000 C 60.000 52.954 51.046 44.000 40.000 44.000 C 28.954 44.000 20.000 52.954 20.000 64.000 C 20.000 71.780 26.340 76.750 26.400 76.800 C 28.167 78.125 28.525 80.633 27.200 82.400 C 25.875 84.167 23.367 84.525 21.600 83.200 C 21.210 82.910 12.000 75.860 12.000 64.000 C 12.000 48.536 24.536 36.000 40.000 36.000 L 176.000 36.000 C 191.464 36.000 204.000 48.536 204.000 64.000 L 204.000 172.000 L 216.000 172.000 C 216.865 172.000 217.708 172.281 218.400 172.800 C 218.790 173.090 228.000 180.140 228.000 192.000 ZM 108.000 192.000 C 108.000 184.220 101.660 179.250 101.600 179.200 C 100.223 178.167 99.661 176.368 100.205 174.735 C 100.750 173.102 102.278 172.000 104.000 172.000 L 196.000 172.000 L 196.000 64.000 C 196.000 52.954 187.046 44.000 176.000 44.000 L 59.570 44.000 C 64.964 49.256 68.005 56.469 68.000 64.000 L 68.000 192.000 C 68.000 203.046 76.954 212.000 88.000 212.000 C 99.046 212.000 108.000 203.046 108.000 192.000 ZM 220.000 192.000 C 220.000 186.000 216.260 181.700 214.500 180.000 L 112.610 180.000 C 114.809 183.618 115.981 187.766 116.000 192.000 C 116.003 199.529 112.967 206.740 107.580 212.000 L 200.000 212.000 C 211.046 212.000 220.000 203.046 220.000 192.000 Z"),
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
