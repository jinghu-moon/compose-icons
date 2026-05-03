package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CodaLogo: ImageVector
    get() {
        if (_codaLogo != null) return _codaLogo!!
        _codaLogo = phosphorThinIcon(
            name = "CodaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 84.000 C 184.378 83.933 192.599 86.268 199.690 90.730 C 202.151 92.304 205.274 92.411 207.838 91.010 C 210.401 89.608 211.996 86.921 212.000 84.000 L 212.000 48.000 C 212.000 41.373 206.627 36.000 200.000 36.000 L 56.000 36.000 C 49.373 36.000 44.000 41.373 44.000 48.000 L 44.000 208.000 C 44.000 214.627 49.373 220.000 56.000 220.000 L 200.000 220.000 C 206.627 220.000 212.000 214.627 212.000 208.000 L 212.000 172.000 C 211.997 169.085 210.408 166.402 207.854 164.998 C 205.299 163.594 202.183 163.690 199.720 165.250 C 191.720 170.390 184.900 172.340 176.160 171.990 L 176.000 171.990 C 151.699 171.990 132.000 152.291 132.000 127.990 C 132.000 103.689 151.699 83.990 176.000 83.990 ZM 124.000 128.000 C 124.027 156.676 147.244 179.928 175.920 180.000 C 186.270 180.400 194.680 178.000 204.000 172.000 L 204.000 208.000 C 204.000 210.209 202.209 212.000 200.000 212.000 L 56.000 212.000 C 53.791 212.000 52.000 210.209 52.000 208.000 L 52.000 48.000 C 52.000 45.791 53.791 44.000 56.000 44.000 L 200.000 44.000 C 202.209 44.000 204.000 45.791 204.000 48.000 L 204.000 84.000 C 187.938 73.924 167.678 73.342 151.064 82.480 C 134.450 91.617 124.092 109.040 124.000 128.000 Z"),
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
        return _codaLogo!!
    }

private var _codaLogo: ImageVector? = null
