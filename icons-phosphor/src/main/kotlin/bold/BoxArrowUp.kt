package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BoxArrowUp: ImageVector
    get() {
        if (_boxArrowUp != null) return _boxArrowUp!!
        _boxArrowUp = phosphorBoldIcon(
            name = "BoxArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 226.730 66.630 L 210.730 34.630 C 208.697 30.567 204.543 28.001 200.000 28.000 L 56.000 28.000 C 51.457 28.001 47.303 30.567 45.270 34.630 L 29.270 66.630 C 28.435 68.297 28.000 70.136 28.000 72.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 72.000 C 228.000 70.136 227.565 68.297 226.730 66.630 ZM 192.580 52.000 L 198.580 64.000 L 57.420 64.000 L 63.420 52.000 ZM 52.000 204.000 L 52.000 88.000 L 204.000 88.000 L 204.000 204.000 ZM 168.490 135.510 C 173.184 140.204 173.184 147.816 168.490 152.510 C 163.796 157.204 156.184 157.204 151.490 152.510 L 140.000 141.000 L 140.000 180.000 C 140.000 186.627 134.627 192.000 128.000 192.000 C 121.373 192.000 116.000 186.627 116.000 180.000 L 116.000 141.000 L 104.490 152.520 C 99.796 157.214 92.184 157.214 87.490 152.520 C 82.796 147.826 82.796 140.214 87.490 135.520 L 119.490 103.520 C 121.742 101.261 124.800 99.991 127.990 99.991 C 131.180 99.991 134.238 101.261 136.490 103.520 Z"),
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
        return _boxArrowUp!!
    }

private var _boxArrowUp: ImageVector? = null
