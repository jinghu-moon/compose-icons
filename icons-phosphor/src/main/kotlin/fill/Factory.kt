package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Factory: ImageVector
    get() {
        if (_factory != null) return _factory!!
        _factory = phosphorFillIcon(
            name = "Factory",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 208.000 L 224.000 208.000 L 224.000 136.000 C 224.000 135.950 224.000 135.910 224.000 135.860 C 224.000 135.810 224.000 135.570 224.000 135.430 C 224.000 135.290 224.000 135.150 224.000 135.020 C 224.005 134.970 224.005 134.920 224.000 134.870 L 209.000 29.740 C 207.837 21.836 201.049 15.985 193.060 16.000 L 174.940 16.000 C 166.989 16.034 160.257 21.874 159.100 29.740 L 147.540 110.650 L 108.800 81.600 C 106.376 79.782 103.133 79.489 100.422 80.845 C 97.712 82.200 96.000 84.970 96.000 88.000 L 96.000 120.000 L 44.800 81.600 C 42.376 79.782 39.133 79.489 36.422 80.845 C 33.712 82.200 32.000 84.970 32.000 88.000 L 32.000 208.000 L 24.000 208.000 C 19.582 208.000 16.000 211.582 16.000 216.000 C 16.000 220.418 19.582 224.000 24.000 224.000 L 232.000 224.000 C 236.418 224.000 240.000 220.418 240.000 216.000 C 240.000 211.582 236.418 208.000 232.000 208.000 ZM 108.000 184.000 L 80.000 184.000 C 75.582 184.000 72.000 180.418 72.000 176.000 C 72.000 171.582 75.582 168.000 80.000 168.000 L 108.000 168.000 C 112.418 168.000 116.000 171.582 116.000 176.000 C 116.000 180.418 112.418 184.000 108.000 184.000 ZM 176.000 184.000 L 148.000 184.000 C 143.582 184.000 140.000 180.418 140.000 176.000 C 140.000 171.582 143.582 168.000 148.000 168.000 L 176.000 168.000 C 180.418 168.000 184.000 171.582 184.000 176.000 C 184.000 180.418 180.418 184.000 176.000 184.000 ZM 170.670 128.000 L 162.140 121.600 L 174.940 32.000 L 193.060 32.000 L 206.780 128.000 Z"),
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
        return _factory!!
    }

private var _factory: ImageVector? = null
