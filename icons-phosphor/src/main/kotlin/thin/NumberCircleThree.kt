package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberCircleThree: ImageVector
    get() {
        if (_numberCircleThree != null) return _numberCircleThree!!
        _numberCircleThree = phosphorThinIcon(
            name = "NumberCircleThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 156.000 152.000 C 156.003 165.004 148.136 176.717 136.096 181.633 C 124.057 186.549 110.240 183.690 101.140 174.400 C 99.594 172.820 99.620 170.286 101.200 168.740 C 102.780 167.194 105.314 167.220 106.860 168.800 C 114.485 176.579 126.391 178.247 135.860 172.864 C 145.329 167.481 149.986 156.396 147.202 145.866 C 144.418 135.336 134.892 128.000 124.000 128.000 C 122.509 128.000 121.142 127.171 120.453 125.849 C 119.764 124.528 119.867 122.932 120.720 121.710 L 144.320 88.000 L 104.000 88.000 C 101.791 88.000 100.000 86.209 100.000 84.000 C 100.000 81.791 101.791 80.000 104.000 80.000 L 152.000 80.000 C 153.491 80.000 154.858 80.829 155.547 82.151 C 156.236 83.472 156.133 85.068 155.280 86.290 L 131.120 120.800 C 145.664 124.142 155.979 137.077 156.000 152.000 Z"),
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
        return _numberCircleThree!!
    }

private var _numberCircleThree: ImageVector? = null
