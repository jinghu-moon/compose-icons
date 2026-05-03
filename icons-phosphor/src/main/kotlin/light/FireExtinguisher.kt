package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) return _fireExtinguisher!!
        _fireExtinguisher = phosphorLightIcon(
            name = "FireExtinguisher",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 217.720 50.250 L 152.210 30.600 L 186.680 13.370 C 189.646 11.890 190.850 8.286 189.370 5.320 C 187.890 2.354 184.286 1.150 181.320 2.630 L 134.510 26.000 C 92.031 26.849 58.030 61.512 58.000 104.000 L 58.000 208.000 C 58.000 211.314 60.686 214.000 64.000 214.000 C 67.314 214.000 70.000 211.314 70.000 208.000 L 70.000 174.000 L 90.000 174.000 L 90.000 232.000 C 90.000 239.732 96.268 246.000 104.000 246.000 L 168.000 246.000 C 175.732 246.000 182.000 239.732 182.000 232.000 L 182.000 104.000 C 181.966 80.928 164.870 61.440 142.000 58.400 L 142.000 40.070 L 214.270 61.750 C 214.832 61.915 215.414 62.000 216.000 62.000 C 218.980 62.003 221.511 59.818 221.943 56.869 C 222.374 53.920 220.576 51.101 217.720 50.250 ZM 70.000 162.000 L 70.000 104.000 C 70.042 69.893 96.037 41.423 130.000 38.290 L 130.000 58.400 C 107.130 61.440 90.034 80.928 90.000 104.000 L 90.000 162.000 ZM 168.000 234.000 L 104.000 234.000 C 102.895 234.000 102.000 233.105 102.000 232.000 L 102.000 174.000 L 170.000 174.000 L 170.000 232.000 C 170.000 233.105 169.105 234.000 168.000 234.000 ZM 170.000 104.000 L 170.000 162.000 L 102.000 162.000 L 102.000 104.000 C 102.000 85.222 117.222 70.000 136.000 70.000 C 154.778 70.000 170.000 85.222 170.000 104.000 Z"),
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
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null
