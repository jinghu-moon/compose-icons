package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TrayArrowUp: ImageVector
    get() {
        if (_trayArrowUp != null) return _trayArrowUp!!
        _trayArrowUp = phosphorBoldIcon(
            name = "TrayArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 52.000 L 204.000 144.000 L 179.310 144.000 C 174.003 143.986 168.911 146.096 165.170 149.860 L 147.000 168.000 L 109.000 168.000 L 90.830 149.860 C 87.089 146.096 81.997 143.986 76.690 144.000 L 52.000 144.000 L 52.000 52.000 ZM 52.000 204.000 L 52.000 168.000 L 75.000 168.000 L 93.140 186.140 C 96.888 189.912 101.993 192.022 107.310 192.000 L 148.690 192.000 C 153.997 192.014 159.089 189.904 162.830 186.140 L 181.000 168.000 L 204.000 168.000 L 204.000 204.000 ZM 87.510 116.490 C 85.251 114.238 83.981 111.180 83.981 107.990 C 83.981 104.800 85.251 101.742 87.510 99.490 L 119.510 67.490 C 121.762 65.231 124.820 63.961 128.010 63.961 C 131.200 63.961 134.258 65.231 136.510 67.490 L 168.510 99.490 C 173.204 104.184 173.204 111.796 168.510 116.490 C 163.816 121.184 156.204 121.184 151.510 116.490 L 140.000 105.000 L 140.000 140.000 C 140.000 146.627 134.627 152.000 128.000 152.000 C 121.373 152.000 116.000 146.627 116.000 140.000 L 116.000 105.000 L 104.490 116.520 C 102.235 118.769 99.179 120.030 95.994 120.024 C 92.809 120.019 89.757 118.747 87.510 116.490 Z"),
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
        return _trayArrowUp!!
    }

private var _trayArrowUp: ImageVector? = null
