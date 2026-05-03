package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowULeftUp: ImageVector
    get() {
        if (_arrowULeftUp != null) return _arrowULeftUp!!
        _arrowULeftUp = phosphorDuotoneIcon(
            name = "ArrowULeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 136.000 80.000 L 40.000 80.000 L 88.000 32.000 Z"),
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
        pathData = parseSvgPathData("M 200.000 72.000 C 195.582 72.000 192.000 75.582 192.000 80.000 L 192.000 168.000 C 192.000 194.510 170.510 216.000 144.000 216.000 C 117.490 216.000 96.000 194.510 96.000 168.000 L 96.000 88.000 L 136.000 88.000 C 139.238 88.003 142.158 86.053 143.397 83.062 C 144.636 80.071 143.951 76.628 141.660 74.340 L 93.660 26.340 C 92.159 24.838 90.123 23.994 88.000 23.994 C 85.877 23.994 83.841 24.838 82.340 26.340 L 34.340 74.340 C 32.049 76.628 31.364 80.071 32.603 83.062 C 33.842 86.053 36.762 88.003 40.000 88.000 L 80.000 88.000 L 80.000 168.000 C 80.000 203.346 108.654 232.000 144.000 232.000 C 179.346 232.000 208.000 203.346 208.000 168.000 L 208.000 80.000 C 208.000 75.582 204.418 72.000 200.000 72.000 ZM 88.000 43.310 L 116.690 72.000 L 59.310 72.000 Z"),
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
        return _arrowULeftUp!!
    }

private var _arrowULeftUp: ImageVector? = null
