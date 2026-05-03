package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CheckFat: ImageVector
    get() {
        if (_checkFat != null) return _checkFat!!
        _checkFat = phosphorLightIcon(
            name = "CheckFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 241.870 69.660 L 217.870 46.100 C 212.406 40.652 203.564 40.652 198.100 46.100 L 104.000 139.000 L 65.900 102.100 C 63.274 99.474 59.713 97.999 56.000 97.999 C 52.287 97.999 48.726 99.474 46.100 102.100 L 22.100 126.100 C 16.639 131.566 16.639 140.424 22.100 145.890 L 93.720 217.890 C 96.346 220.516 99.907 221.991 103.620 221.991 C 107.333 221.991 110.894 220.516 113.520 217.890 L 241.910 89.500 C 244.543 86.868 246.019 83.295 246.011 79.572 C 246.004 75.849 244.513 72.282 241.870 69.660 ZM 233.420 81.000 L 105.000 209.410 C 104.221 210.179 102.969 210.179 102.190 209.410 L 30.570 137.410 C 29.795 136.630 29.795 135.370 30.570 134.590 L 54.570 110.590 C 54.948 110.209 55.463 109.997 56.000 110.000 C 56.565 110.005 57.105 110.235 57.500 110.640 L 99.850 151.720 C 102.182 154.000 105.908 154.000 108.240 151.720 L 206.610 54.610 C 206.987 54.222 207.504 54.003 208.045 54.003 C 208.586 54.003 209.103 54.222 209.480 54.610 L 233.480 78.170 C 233.848 78.553 234.048 79.067 234.037 79.597 C 234.025 80.128 233.804 80.633 233.420 81.000 Z"),
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
        return _checkFat!!
    }

private var _checkFat: ImageVector? = null
