package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CoatHanger: ImageVector
    get() {
        if (_coatHanger != null) return _coatHanger!!
        _coatHanger = phosphorDuotoneIcon(
            name = "CoatHanger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 232.000 192.000 L 24.000 192.000 C 20.557 192.000 17.499 189.797 16.411 186.530 C 15.322 183.263 16.445 179.666 19.200 177.600 L 128.000 96.000 L 236.790 177.600 C 239.543 179.665 240.667 183.259 239.581 186.525 C 238.495 189.791 235.442 191.996 232.000 192.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 241.570 171.200 L 141.330 96.000 L 164.790 78.400 C 166.808 76.891 167.998 74.520 168.000 72.000 C 168.000 49.909 150.091 32.000 128.000 32.000 C 105.909 32.000 88.000 49.909 88.000 72.000 C 88.000 76.418 91.582 80.000 96.000 80.000 C 100.418 80.000 104.000 76.418 104.000 72.000 C 104.034 59.505 113.648 49.127 126.104 48.139 C 138.559 47.152 149.689 55.887 151.690 68.220 L 123.340 89.490 L 123.060 89.710 L 14.430 171.200 C 8.925 175.329 6.676 182.515 8.846 189.045 C 11.016 195.576 17.119 199.987 24.000 200.000 L 232.000 200.000 C 238.887 200.000 245.001 195.593 247.179 189.060 C 249.357 182.526 247.110 175.332 241.600 171.200 ZM 232.000 184.000 L 24.000 184.000 L 128.000 106.000 L 232.000 184.000 Z"),
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
        return _coatHanger!!
    }

private var _coatHanger: ImageVector? = null
