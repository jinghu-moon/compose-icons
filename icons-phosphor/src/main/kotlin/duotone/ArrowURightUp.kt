package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowURightUp: ImageVector
    get() {
        if (_arrowURightUp != null) return _arrowURightUp!!
        _arrowURightUp = phosphorDuotoneIcon(
            name = "ArrowURightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 80.000 L 120.000 80.000 L 168.000 32.000 Z"),
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
        pathData = parseSvgPathData("M 221.660 74.340 L 173.660 26.340 C 172.159 24.838 170.123 23.994 168.000 23.994 C 165.877 23.994 163.841 24.838 162.340 26.340 L 114.340 74.340 C 112.049 76.628 111.364 80.071 112.603 83.062 C 113.842 86.053 116.762 88.003 120.000 88.000 L 160.000 88.000 L 160.000 168.000 C 160.000 194.510 138.510 216.000 112.000 216.000 C 85.490 216.000 64.000 194.510 64.000 168.000 L 64.000 80.000 C 64.000 75.582 60.418 72.000 56.000 72.000 C 51.582 72.000 48.000 75.582 48.000 80.000 L 48.000 168.000 C 48.000 203.346 76.654 232.000 112.000 232.000 C 147.346 232.000 176.000 203.346 176.000 168.000 L 176.000 88.000 L 216.000 88.000 C 219.238 88.003 222.158 86.053 223.397 83.062 C 224.636 80.071 223.951 76.628 221.660 74.340 ZM 139.310 72.000 L 168.000 43.310 L 196.690 72.000 Z"),
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
        return _arrowURightUp!!
    }

private var _arrowURightUp: ImageVector? = null
