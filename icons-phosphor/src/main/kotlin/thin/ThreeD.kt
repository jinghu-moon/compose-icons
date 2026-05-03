package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ThreeD: ImageVector
    get() {
        if (_threeD != null) return _threeD!!
        _threeD = phosphorThinIcon(
            name = "ThreeD",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 100.000 148.000 C 100.000 134.745 89.255 124.000 76.000 124.000 C 74.509 124.000 73.142 123.171 72.453 121.849 C 71.764 120.528 71.867 118.932 72.720 117.710 L 96.320 84.000 L 56.000 84.000 C 53.791 84.000 52.000 82.209 52.000 80.000 C 52.000 77.791 53.791 76.000 56.000 76.000 L 104.000 76.000 C 105.491 76.000 106.858 76.829 107.547 78.151 C 108.236 79.472 108.133 81.068 107.280 82.290 L 83.120 116.800 C 96.406 119.849 106.302 130.981 107.775 144.533 C 109.247 158.085 101.973 171.082 89.651 176.913 C 77.330 182.745 62.667 180.130 53.120 170.400 C 51.574 168.820 51.600 166.286 53.180 164.740 C 54.760 163.194 57.294 163.220 58.840 164.800 C 65.663 171.778 76.033 173.930 85.070 170.241 C 94.106 166.553 100.009 157.760 100.000 148.000 ZM 160.000 76.000 C 188.719 76.000 212.000 99.281 212.000 128.000 C 212.000 156.719 188.719 180.000 160.000 180.000 L 136.000 180.000 C 133.791 180.000 132.000 178.209 132.000 176.000 L 132.000 80.000 C 132.000 77.791 133.791 76.000 136.000 76.000 ZM 160.000 84.000 L 140.000 84.000 L 140.000 172.000 L 160.000 172.000 C 184.301 172.000 204.000 152.301 204.000 128.000 C 204.000 103.699 184.301 84.000 160.000 84.000 ZM 32.000 52.000 L 224.000 52.000 C 226.209 52.000 228.000 50.209 228.000 48.000 C 228.000 45.791 226.209 44.000 224.000 44.000 L 32.000 44.000 C 29.791 44.000 28.000 45.791 28.000 48.000 C 28.000 50.209 29.791 52.000 32.000 52.000 ZM 224.000 204.000 L 32.000 204.000 C 29.791 204.000 28.000 205.791 28.000 208.000 C 28.000 210.209 29.791 212.000 32.000 212.000 L 224.000 212.000 C 226.209 212.000 228.000 210.209 228.000 208.000 C 228.000 205.791 226.209 204.000 224.000 204.000 Z"),
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
        return _threeD!!
    }

private var _threeD: ImageVector? = null
