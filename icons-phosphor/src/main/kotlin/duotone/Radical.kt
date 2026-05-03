package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Radical: ImageVector
    get() {
        if (_radical != null) return _radical!!
        _radical = phosphorDuotoneIcon(
            name = "Radical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 240.000 80.000 L 240.000 192.000 C 240.000 200.837 232.837 208.000 224.000 208.000 L 48.000 208.000 C 39.163 208.000 32.000 200.837 32.000 192.000 L 32.000 80.000 Z"),
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
        pathData = parseSvgPathData("M 248.000 80.000 L 248.000 104.000 C 248.000 108.418 244.418 112.000 240.000 112.000 C 235.582 112.000 232.000 108.418 232.000 104.000 L 232.000 88.000 L 133.550 88.000 L 87.490 210.810 C 86.326 213.946 83.335 216.026 79.990 216.026 C 76.645 216.026 73.654 213.946 72.490 210.810 L 24.490 82.810 C 22.938 78.668 25.038 74.052 29.180 72.500 C 33.322 70.948 37.938 73.048 39.490 77.190 L 80.000 185.220 L 120.510 77.220 C 121.671 74.086 124.658 72.005 128.000 72.000 L 240.000 72.000 C 244.418 72.000 248.000 75.582 248.000 80.000 Z"),
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
        return _radical!!
    }

private var _radical: ImageVector? = null
