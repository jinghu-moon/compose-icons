package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LockSimpleOpen: ImageVector
    get() {
        if (_lockSimpleOpen != null) return _lockSimpleOpen!!
        _lockSimpleOpen = phosphorBoldIcon(
            name = "LockSimpleOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 76.000 L 100.000 76.000 L 100.000 56.000 C 100.000 40.536 112.536 28.000 128.000 28.000 C 141.510 28.000 153.650 37.620 156.240 50.390 C 157.560 56.885 163.895 61.080 170.390 59.760 C 176.885 58.440 181.080 52.105 179.760 45.610 C 174.870 21.500 153.100 4.000 128.000 4.000 C 99.295 4.033 76.033 27.295 76.000 56.000 L 76.000 76.000 L 48.000 76.000 C 36.954 76.000 28.000 84.954 28.000 96.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 96.000 C 228.000 84.954 219.046 76.000 208.000 76.000 ZM 204.000 204.000 L 52.000 204.000 L 52.000 100.000 L 204.000 100.000 Z"),
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
        return _lockSimpleOpen!!
    }

private var _lockSimpleOpen: ImageVector? = null
