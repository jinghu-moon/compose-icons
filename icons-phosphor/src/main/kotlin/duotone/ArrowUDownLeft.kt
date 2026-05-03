package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowUDownLeft: ImageVector
    get() {
        if (_arrowUDownLeft != null) return _arrowUDownLeft!!
        _arrowUDownLeft = phosphorDuotoneIcon(
            name = "ArrowUDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 80.000 120.000 L 80.000 216.000 L 32.000 168.000 Z"),
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
        pathData = parseSvgPathData("M 168.000 48.000 L 80.000 48.000 C 75.582 48.000 72.000 51.582 72.000 56.000 C 72.000 60.418 75.582 64.000 80.000 64.000 L 168.000 64.000 C 194.510 64.000 216.000 85.490 216.000 112.000 C 216.000 138.510 194.510 160.000 168.000 160.000 L 88.000 160.000 L 88.000 120.000 C 88.003 116.762 86.053 113.842 83.062 112.603 C 80.071 111.364 76.628 112.049 74.340 114.340 L 26.340 162.340 C 24.838 163.841 23.994 165.877 23.994 168.000 C 23.994 170.123 24.838 172.159 26.340 173.660 L 74.340 221.660 C 76.628 223.951 80.071 224.636 83.062 223.397 C 86.053 222.158 88.003 219.238 88.000 216.000 L 88.000 176.000 L 168.000 176.000 C 203.346 176.000 232.000 147.346 232.000 112.000 C 232.000 76.654 203.346 48.000 168.000 48.000 ZM 72.000 196.690 L 43.310 168.000 L 72.000 139.310 Z"),
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
        return _arrowUDownLeft!!
    }

private var _arrowUDownLeft: ImageVector? = null
