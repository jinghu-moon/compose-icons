package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowElbowRightUp: ImageVector
    get() {
        if (_arrowElbowRightUp != null) return _arrowElbowRightUp!!
        _arrowElbowRightUp = phosphorDuotoneIcon(
            name = "ArrowElbowRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 96.000 L 120.000 96.000 L 168.000 48.000 Z"),
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
        pathData = parseSvgPathData("M 221.660 90.340 L 173.660 42.340 C 172.159 40.838 170.123 39.994 168.000 39.994 C 165.877 39.994 163.841 40.838 162.340 42.340 L 114.340 90.340 C 112.049 92.628 111.364 96.071 112.603 99.062 C 113.842 102.053 116.762 104.003 120.000 104.000 L 160.000 104.000 L 160.000 184.000 L 24.000 184.000 C 19.582 184.000 16.000 187.582 16.000 192.000 C 16.000 196.418 19.582 200.000 24.000 200.000 L 168.000 200.000 C 172.418 200.000 176.000 196.418 176.000 192.000 L 176.000 104.000 L 216.000 104.000 C 219.238 104.003 222.158 102.053 223.397 99.062 C 224.636 96.071 223.951 92.628 221.660 90.340 ZM 139.310 88.000 L 168.000 59.310 L 196.690 88.000 Z"),
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
        return _arrowElbowRightUp!!
    }

private var _arrowElbowRightUp: ImageVector? = null
