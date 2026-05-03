package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Factory: ImageVector
    get() {
        if (_factory != null) return _factory!!
        _factory = phosphorRegularIcon(
            name = "Factory",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 116.000 176.000 C 116.000 180.418 112.418 184.000 108.000 184.000 L 80.000 184.000 C 75.582 184.000 72.000 180.418 72.000 176.000 C 72.000 171.582 75.582 168.000 80.000 168.000 L 108.000 168.000 C 112.418 168.000 116.000 171.582 116.000 176.000 ZM 176.000 168.000 L 148.000 168.000 C 143.582 168.000 140.000 171.582 140.000 176.000 C 140.000 180.418 143.582 184.000 148.000 184.000 L 176.000 184.000 C 180.418 184.000 184.000 180.418 184.000 176.000 C 184.000 171.582 180.418 168.000 176.000 168.000 ZM 240.000 216.000 C 240.000 220.418 236.418 224.000 232.000 224.000 L 24.000 224.000 C 19.582 224.000 16.000 220.418 16.000 216.000 C 16.000 211.582 19.582 208.000 24.000 208.000 L 32.000 208.000 L 32.000 88.000 C 32.000 84.970 33.712 82.200 36.422 80.845 C 39.133 79.489 42.376 79.782 44.800 81.600 L 96.000 120.000 L 96.000 88.000 C 96.000 84.970 97.712 82.200 100.422 80.845 C 103.133 79.489 106.376 79.782 108.800 81.600 L 147.540 110.650 L 159.100 29.740 C 160.257 21.874 166.989 16.034 174.940 16.000 L 193.060 16.000 C 201.011 16.034 207.743 21.874 208.900 29.740 L 223.900 134.870 C 223.900 134.870 223.980 135.650 223.980 136.000 L 223.980 208.000 L 231.980 208.000 C 234.105 207.995 236.145 208.835 237.650 210.336 C 239.154 211.837 240.000 213.875 240.000 216.000 ZM 162.140 121.600 L 170.670 128.000 L 206.780 128.000 L 193.060 32.000 L 174.940 32.000 ZM 48.000 208.000 L 208.000 208.000 L 208.000 144.000 L 168.000 144.000 C 166.269 144.000 164.585 143.439 163.200 142.400 L 148.800 131.600 L 148.800 131.600 L 112.000 104.000 L 112.000 136.000 C 112.000 139.030 110.288 141.800 107.578 143.155 C 104.867 144.511 101.624 144.218 99.200 142.400 L 48.000 104.000 Z"),
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
        return _factory!!
    }

private var _factory: ImageVector? = null
