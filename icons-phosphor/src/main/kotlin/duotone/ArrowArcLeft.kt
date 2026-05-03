package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowArcLeft: ImageVector
    get() {
        if (_arrowArcLeft != null) return _arrowArcLeft!!
        _arrowArcLeft = phosphorDuotoneIcon(
            name = "ArrowArcLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 88.000 152.000 L 24.000 152.000 L 24.000 88.000 Z"),
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
        pathData = parseSvgPathData("M 201.540 110.460 C 161.569 70.495 96.997 69.771 56.140 108.830 L 29.660 82.340 C 27.372 80.049 23.929 79.364 20.938 80.603 C 17.947 81.842 15.997 84.762 16.000 88.000 L 16.000 152.000 C 16.000 156.418 19.582 160.000 24.000 160.000 L 88.000 160.000 C 91.238 160.003 94.158 158.053 95.397 155.062 C 96.636 152.071 95.951 148.628 93.660 146.340 L 67.470 120.160 C 92.988 95.978 130.451 89.305 162.750 103.187 C 195.049 117.070 215.986 148.844 216.000 184.000 C 216.000 188.418 219.582 192.000 224.000 192.000 C 228.418 192.000 232.000 188.418 232.000 184.000 C 232.075 156.403 221.107 129.922 201.540 110.460 ZM 32.000 144.000 L 32.000 107.310 L 68.690 144.000 Z"),
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
        return _arrowArcLeft!!
    }

private var _arrowArcLeft: ImageVector? = null
