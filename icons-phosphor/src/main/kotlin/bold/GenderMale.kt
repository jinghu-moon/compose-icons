package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GenderMale: ImageVector
    get() {
        if (_genderMale != null) return _genderMale!!
        _genderMale = phosphorBoldIcon(
            name = "GenderMale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 28.000 L 168.000 28.000 C 161.373 28.000 156.000 33.373 156.000 40.000 C 156.000 46.627 161.373 52.000 168.000 52.000 L 187.000 52.000 L 154.280 84.740 C 118.992 58.368 69.325 63.738 40.489 97.043 C 11.654 130.348 13.447 180.272 44.597 211.423 C 75.748 242.573 125.672 244.366 158.977 215.531 C 192.282 186.695 197.652 137.028 171.280 101.740 L 204.000 69.000 L 204.000 88.000 C 204.000 94.627 209.373 100.000 216.000 100.000 C 222.627 100.000 228.000 94.627 228.000 88.000 L 228.000 40.000 C 228.000 33.373 222.627 28.000 216.000 28.000 ZM 146.410 194.460 C 122.976 217.884 84.991 217.879 61.563 194.449 C 38.135 171.018 38.135 133.032 61.563 109.601 C 84.991 86.171 122.976 86.166 146.410 109.590 C 169.798 133.046 169.798 171.004 146.410 194.460 Z"),
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
        return _genderMale!!
    }

private var _genderMale: ImageVector? = null
