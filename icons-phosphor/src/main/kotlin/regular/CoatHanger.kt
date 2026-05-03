package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CoatHanger: ImageVector
    get() {
        if (_coatHanger != null) return _coatHanger!!
        _coatHanger = phosphorRegularIcon(
            name = "CoatHanger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 241.570 171.200 L 141.330 96.000 L 164.790 78.400 C 166.808 76.891 167.998 74.520 168.000 72.000 C 168.000 49.909 150.091 32.000 128.000 32.000 C 105.909 32.000 88.000 49.909 88.000 72.000 C 88.000 76.418 91.582 80.000 96.000 80.000 C 100.418 80.000 104.000 76.418 104.000 72.000 C 104.034 59.505 113.648 49.127 126.104 48.139 C 138.559 47.152 149.689 55.887 151.690 68.220 L 123.340 89.490 L 123.060 89.700 L 14.430 171.200 C 8.925 175.329 6.676 182.515 8.846 189.045 C 11.016 195.576 17.119 199.987 24.000 200.000 L 232.000 200.000 C 238.887 200.000 245.001 195.593 247.179 189.060 C 249.357 182.526 247.110 175.332 241.600 171.200 ZM 232.000 184.000 L 24.000 184.000 L 128.000 106.000 L 232.000 184.000 Z"),
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
        return _coatHanger!!
    }

private var _coatHanger: ImageVector? = null
