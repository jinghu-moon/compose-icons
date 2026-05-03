package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowLineUpRight: ImageVector
    get() {
        if (_arrowLineUpRight != null) return _arrowLineUpRight!!
        _arrowLineUpRight = phosphorDuotoneIcon(
            name = "ArrowLineUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 192.000 56.000 L 192.000 152.000 L 96.000 56.000 Z"),
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
        pathData = parseSvgPathData("M 224.000 216.000 C 224.000 220.418 220.418 224.000 216.000 224.000 L 40.000 224.000 C 35.582 224.000 32.000 220.418 32.000 216.000 C 32.000 211.582 35.582 208.000 40.000 208.000 L 216.000 208.000 C 220.418 208.000 224.000 211.582 224.000 216.000 ZM 74.340 173.660 C 72.838 172.159 71.994 170.123 71.994 168.000 C 71.994 165.877 72.838 163.841 74.340 162.340 L 132.690 104.000 L 90.340 61.660 C 88.049 59.372 87.364 55.929 88.603 52.938 C 89.842 49.947 92.762 47.997 96.000 48.000 L 192.000 48.000 C 196.418 48.000 200.000 51.582 200.000 56.000 L 200.000 152.000 C 200.003 155.238 198.053 158.158 195.062 159.397 C 192.071 160.636 188.628 159.951 186.340 157.660 L 144.000 115.310 L 85.660 173.660 C 84.159 175.162 82.123 176.006 80.000 176.006 C 77.877 176.006 75.841 175.162 74.340 173.660 ZM 115.310 64.000 L 149.660 98.340 L 149.660 98.340 L 184.000 132.690 L 184.000 64.000 Z"),
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
        return _arrowLineUpRight!!
    }

private var _arrowLineUpRight: ImageVector? = null
