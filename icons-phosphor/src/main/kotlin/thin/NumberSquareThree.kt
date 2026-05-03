package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberSquareThree: ImageVector
    get() {
        if (_numberSquareThree != null) return _numberSquareThree!!
        _numberSquareThree = phosphorThinIcon(
            name = "NumberSquareThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 ZM 156.000 148.000 C 156.003 161.004 148.136 172.717 136.096 177.633 C 124.057 182.549 110.240 179.690 101.140 170.400 C 99.594 168.820 99.620 166.286 101.200 164.740 C 102.780 163.194 105.314 163.220 106.860 164.800 C 114.485 172.579 126.391 174.247 135.860 168.864 C 145.329 163.481 149.986 152.396 147.202 141.866 C 144.418 131.336 134.892 124.000 124.000 124.000 C 122.509 124.000 121.142 123.171 120.453 121.849 C 119.764 120.528 119.867 118.932 120.720 117.710 L 144.320 84.000 L 104.000 84.000 C 101.791 84.000 100.000 82.209 100.000 80.000 C 100.000 77.791 101.791 76.000 104.000 76.000 L 152.000 76.000 C 153.491 76.000 154.858 76.829 155.547 78.151 C 156.236 79.472 156.133 81.068 155.280 82.290 L 131.120 116.800 C 145.664 120.142 155.979 133.077 156.000 148.000 Z"),
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
        return _numberSquareThree!!
    }

private var _numberSquareThree: ImageVector? = null
