package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowArcLeft: ImageVector
    get() {
        if (_arrowArcLeft != null) return _arrowArcLeft!!
        _arrowArcLeft = phosphorFillIcon(
            name = "ArrowArcLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 184.000 C 232.000 188.418 228.418 192.000 224.000 192.000 C 219.582 192.000 216.000 188.418 216.000 184.000 C 215.986 148.844 195.049 117.070 162.750 103.187 C 130.451 89.305 92.988 95.978 67.470 120.160 L 93.660 146.340 C 95.951 148.628 96.636 152.071 95.397 155.062 C 94.158 158.053 91.238 160.003 88.000 160.000 L 24.000 160.000 C 19.582 160.000 16.000 156.418 16.000 152.000 L 16.000 88.000 C 15.997 84.762 17.947 81.842 20.938 80.603 C 23.929 79.364 27.372 80.049 29.660 82.340 L 56.140 108.820 C 86.239 80.050 130.596 72.006 168.881 88.373 C 207.166 104.739 232.000 142.363 232.000 184.000 Z"),
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
        return _arrowArcLeft!!
    }

private var _arrowArcLeft: ImageVector? = null
