package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BracketsRound: ImageVector
    get() {
        if (_bracketsRound != null) return _bracketsRound!!
        _bracketsRound = phosphorLightIcon(
            name = "BracketsRound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 56.520 64.000 C 44.230 81.460 38.000 103.000 38.000 128.000 C 38.000 153.000 44.230 174.540 56.520 192.000 C 65.690 205.000 75.010 210.810 75.110 210.870 C 77.855 212.621 78.703 216.242 77.020 219.030 C 75.337 221.817 71.738 222.754 68.910 221.140 C 67.160 220.090 26.000 194.630 26.000 128.000 C 26.000 61.370 67.160 35.910 68.910 34.860 C 71.738 33.246 75.337 34.183 77.020 36.970 C 78.703 39.758 77.855 43.379 75.110 45.130 C 75.000 45.190 65.690 51.000 56.520 64.000 ZM 187.090 34.860 C 184.262 33.246 180.663 34.183 178.980 36.970 C 177.297 39.758 178.145 43.379 180.890 45.130 C 180.990 45.190 190.310 50.970 199.480 64.000 C 211.770 81.460 218.000 103.000 218.000 128.000 C 218.000 153.000 211.770 174.540 199.480 192.000 C 190.310 205.000 180.990 210.810 180.910 210.850 C 178.068 212.557 177.148 216.243 178.855 219.085 C 180.562 221.926 184.248 222.847 187.090 221.140 C 188.840 220.140 230.000 194.630 230.000 128.000 C 230.000 61.370 188.840 35.910 187.090 34.860 Z"),
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
        return _bracketsRound!!
    }

private var _bracketsRound: ImageVector? = null
