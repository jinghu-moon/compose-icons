package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NotSupersetOf: ImageVector
    get() {
        if (_notSupersetOf != null) return _notSupersetOf!!
        _notSupersetOf = phosphorThinIcon(
            name = "NotSupersetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 196.000 L 71.590 196.000 L 100.680 164.000 L 152.000 164.000 C 176.337 163.979 198.251 149.260 207.474 126.738 C 216.697 104.217 211.402 78.355 194.070 61.270 L 211.000 42.690 C 212.486 41.033 212.347 38.486 210.690 37.000 C 209.033 35.514 206.486 35.653 205.000 37.310 L 188.000 56.000 C 177.623 48.193 164.985 43.980 152.000 44.000 L 56.000 44.000 C 53.791 44.000 52.000 45.791 52.000 48.000 C 52.000 50.209 53.791 52.000 56.000 52.000 L 152.000 52.000 C 163.004 51.995 173.723 55.498 182.600 62.000 L 97.140 156.000 L 56.000 156.000 C 53.791 156.000 52.000 157.791 52.000 160.000 C 52.000 162.209 53.791 164.000 56.000 164.000 L 89.870 164.000 L 45.000 213.310 C 43.514 214.967 43.653 217.514 45.310 219.000 C 46.967 220.486 49.514 220.347 51.000 218.690 L 64.310 204.000 L 208.000 204.000 C 210.209 204.000 212.000 202.209 212.000 200.000 C 212.000 197.791 210.209 196.000 208.000 196.000 ZM 188.690 67.190 C 203.581 82.048 208.053 104.413 200.021 123.855 C 191.989 143.297 173.035 155.984 152.000 156.000 L 108.000 156.000 Z"),
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
        return _notSupersetOf!!
    }

private var _notSupersetOf: ImageVector? = null
