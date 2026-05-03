package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Boat: ImageVector
    get() {
        if (_boat != null) return _boat!!
        _boat = phosphorBoldIcon(
            name = "Boat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 222.330 106.790 L 212.000 103.350 L 212.000 56.000 C 212.000 44.954 203.046 36.000 192.000 36.000 L 140.000 36.000 L 140.000 24.000 C 140.000 17.373 134.627 12.000 128.000 12.000 C 121.373 12.000 116.000 17.373 116.000 24.000 L 116.000 36.000 L 64.000 36.000 C 52.954 36.000 44.000 44.954 44.000 56.000 L 44.000 103.350 L 33.670 106.790 C 25.496 109.517 19.988 117.173 20.000 125.790 L 20.000 152.000 C 20.000 216.630 120.800 242.570 125.090 243.640 C 127.000 244.120 129.000 244.120 130.910 243.640 C 135.200 242.570 236.000 216.630 236.000 152.000 L 236.000 125.770 C 236.004 117.161 230.497 109.515 222.330 106.790 ZM 68.000 60.000 L 188.000 60.000 L 188.000 95.350 L 131.790 76.620 C 129.331 75.790 126.669 75.790 124.210 76.620 L 68.000 95.350 ZM 212.000 152.000 C 212.000 188.690 153.920 212.430 128.000 219.590 C 102.060 212.420 44.000 188.690 44.000 152.000 L 44.000 128.650 L 116.000 104.650 L 116.000 168.000 C 116.000 174.627 121.373 180.000 128.000 180.000 C 134.627 180.000 140.000 174.627 140.000 168.000 L 140.000 104.650 L 212.000 128.650 Z"),
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
        return _boat!!
    }

private var _boat: ImageVector? = null
