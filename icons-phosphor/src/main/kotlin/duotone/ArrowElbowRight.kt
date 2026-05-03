package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowElbowRight: ImageVector
    get() {
        if (_arrowElbowRight != null) return _arrowElbowRight!!
        _arrowElbowRight = phosphorDuotoneIcon(
            name = "ArrowElbowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 232.000 80.000 L 232.000 152.000 L 160.000 80.000 Z"),
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
        pathData = parseSvgPathData("M 232.000 72.000 L 160.000 72.000 C 156.762 71.997 153.842 73.947 152.603 76.938 C 151.364 79.929 152.049 83.372 154.340 85.660 L 184.690 116.000 L 120.000 180.690 L 29.660 90.340 C 26.534 87.214 21.466 87.214 18.340 90.340 C 15.214 93.466 15.214 98.534 18.340 101.660 L 114.340 197.660 C 115.841 199.162 117.877 200.006 120.000 200.006 C 122.123 200.006 124.159 199.162 125.660 197.660 L 196.000 127.310 L 226.340 157.660 C 228.628 159.951 232.071 160.636 235.062 159.397 C 238.053 158.158 240.003 155.238 240.000 152.000 L 240.000 80.000 C 240.000 75.582 236.418 72.000 232.000 72.000 ZM 224.000 132.690 L 179.310 88.000 L 224.000 88.000 Z"),
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
        return _arrowElbowRight!!
    }

private var _arrowElbowRight: ImageVector? = null
