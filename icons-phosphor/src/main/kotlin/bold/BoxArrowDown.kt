package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BoxArrowDown: ImageVector
    get() {
        if (_boxArrowDown != null) return _boxArrowDown!!
        _boxArrowDown = phosphorBoldIcon(
            name = "BoxArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 226.730 66.630 L 210.730 34.630 C 208.697 30.567 204.543 28.001 200.000 28.000 L 56.000 28.000 C 51.457 28.001 47.303 30.567 45.270 34.630 L 29.270 66.630 C 28.435 68.297 28.000 70.136 28.000 72.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 72.000 C 228.000 70.136 227.565 68.297 226.730 66.630 ZM 192.580 52.000 L 198.580 64.000 L 57.420 64.000 L 63.420 52.000 ZM 52.000 204.000 L 52.000 88.000 L 204.000 88.000 L 204.000 204.000 ZM 168.490 139.510 C 170.749 141.762 172.019 144.820 172.019 148.010 C 172.019 151.200 170.749 154.258 168.490 156.510 L 136.490 188.510 C 134.238 190.769 131.180 192.039 127.990 192.039 C 124.800 192.039 121.742 190.769 119.490 188.510 L 87.490 156.510 C 82.796 151.816 82.796 144.204 87.490 139.510 C 92.184 134.816 99.796 134.816 104.490 139.510 L 116.000 151.000 L 116.000 112.000 C 116.000 105.373 121.373 100.000 128.000 100.000 C 134.627 100.000 140.000 105.373 140.000 112.000 L 140.000 151.000 L 151.510 139.480 C 153.765 137.231 156.821 135.970 160.006 135.976 C 163.191 135.981 166.243 137.253 168.490 139.510 Z"),
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
        return _boxArrowDown!!
    }

private var _boxArrowDown: ImageVector? = null
