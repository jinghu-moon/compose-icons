package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowUpRight: ImageVector
    get() {
        if (_arrowUpRight != null) return _arrowUpRight!!
        _arrowUpRight = phosphorDuotoneIcon(
            name = "ArrowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 192.000 64.000 L 192.000 168.000 L 88.000 64.000 Z"),
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
        pathData = parseSvgPathData("M 192.000 56.000 L 88.000 56.000 C 84.762 55.997 81.842 57.947 80.603 60.938 C 79.364 63.929 80.049 67.372 82.340 69.660 L 128.690 116.000 L 58.340 186.340 C 55.214 189.466 55.214 194.534 58.340 197.660 C 61.466 200.786 66.534 200.786 69.660 197.660 L 140.000 127.310 L 186.340 173.660 C 188.628 175.951 192.071 176.636 195.062 175.397 C 198.053 174.158 200.003 171.238 200.000 168.000 L 200.000 64.000 C 200.000 59.582 196.418 56.000 192.000 56.000 ZM 184.000 148.690 L 145.660 110.350 L 145.660 110.350 L 107.310 72.000 L 184.000 72.000 Z"),
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
        return _arrowUpRight!!
    }

private var _arrowUpRight: ImageVector? = null
