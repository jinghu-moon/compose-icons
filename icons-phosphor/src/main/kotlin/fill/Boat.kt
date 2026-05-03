package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Boat: ImageVector
    get() {
        if (_boat != null) return _boat!!
        _boat = phosphorFillIcon(
            name = "Boat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 221.060 110.590 L 208.000 106.230 L 208.000 56.000 C 208.000 47.163 200.837 40.000 192.000 40.000 L 136.000 40.000 L 136.000 24.000 C 136.000 19.582 132.418 16.000 128.000 16.000 C 123.582 16.000 120.000 19.582 120.000 24.000 L 120.000 40.000 L 64.000 40.000 C 55.163 40.000 48.000 47.163 48.000 56.000 L 48.000 106.230 L 34.940 110.590 C 28.406 112.768 23.999 118.883 24.000 125.770 L 24.000 152.000 C 24.000 213.540 121.890 238.720 126.060 239.760 C 127.334 240.078 128.666 240.078 129.940 239.760 C 134.110 238.720 232.000 213.540 232.000 152.000 L 232.000 125.770 C 232.001 118.883 227.594 112.768 221.060 110.590 ZM 136.000 168.000 C 136.000 172.418 132.418 176.000 128.000 176.000 C 123.582 176.000 120.000 172.418 120.000 168.000 L 120.000 104.870 C 120.000 100.452 123.582 96.870 128.000 96.870 C 132.418 96.870 136.000 100.452 136.000 104.870 ZM 192.000 100.900 L 130.530 80.410 C 128.888 79.863 127.112 79.863 125.470 80.410 L 64.000 100.900 L 64.000 56.000 L 192.000 56.000 Z"),
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
