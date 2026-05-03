package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowUpLeft: ImageVector
    get() {
        if (_arrowUpLeft != null) return _arrowUpLeft!!
        _arrowUpLeft = phosphorDuotoneIcon(
            name = "ArrowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 168.000 64.000 L 64.000 168.000 L 64.000 64.000 Z"),
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
        pathData = parseSvgPathData("M 197.660 186.340 L 127.310 116.000 L 173.660 69.660 C 175.951 67.372 176.636 63.929 175.397 60.938 C 174.158 57.947 171.238 55.997 168.000 56.000 L 64.000 56.000 C 59.582 56.000 56.000 59.582 56.000 64.000 L 56.000 168.000 C 55.997 171.238 57.947 174.158 60.938 175.397 C 63.929 176.636 67.372 175.951 69.660 173.660 L 116.000 127.310 L 186.340 197.660 C 189.466 200.786 194.534 200.786 197.660 197.660 C 200.786 194.534 200.786 189.466 197.660 186.340 ZM 72.000 72.000 L 148.690 72.000 L 110.350 110.340 L 110.350 110.340 L 72.000 148.690 Z"),
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
        return _arrowUpLeft!!
    }

private var _arrowUpLeft: ImageVector? = null
