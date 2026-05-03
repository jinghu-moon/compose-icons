package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bulldozer: ImageVector
    get() {
        if (_bulldozer != null) return _bulldozer!!
        _bulldozer = phosphorBoldIcon(
            name = "Bulldozer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.000 196.000 L 236.000 196.000 C 233.791 196.000 232.000 194.209 232.000 192.000 L 232.000 160.000 C 232.000 157.791 233.791 156.000 236.000 156.000 L 244.000 156.000 C 250.627 156.000 256.000 150.627 256.000 144.000 C 256.000 137.373 250.627 132.000 244.000 132.000 L 236.000 132.000 C 220.536 132.000 208.000 144.536 208.000 160.000 L 208.000 164.000 L 198.320 164.000 C 193.760 148.031 180.621 135.974 164.320 132.800 L 129.120 48.310 C 126.017 40.860 118.740 36.005 110.670 36.000 L 24.000 36.000 C 12.954 36.000 4.000 44.954 4.000 56.000 L 4.000 157.700 C -2.228 171.319 -1.102 187.171 6.989 199.772 C 15.079 212.374 29.024 219.995 44.000 220.000 L 156.000 220.000 C 175.668 219.974 192.937 206.917 198.320 188.000 L 208.000 188.000 L 208.000 192.000 C 208.000 207.464 220.536 220.000 236.000 220.000 L 244.000 220.000 C 250.627 220.000 256.000 214.627 256.000 208.000 C 256.000 201.373 250.627 196.000 244.000 196.000 ZM 138.000 132.000 L 68.000 132.000 L 68.000 60.000 L 108.000 60.000 ZM 44.000 60.000 L 44.000 132.000 C 38.526 131.993 33.099 133.010 28.000 135.000 L 28.000 60.000 ZM 156.000 196.000 L 44.000 196.000 C 32.954 196.000 24.000 187.046 24.000 176.000 C 24.000 164.954 32.954 156.000 44.000 156.000 L 156.000 156.000 C 167.046 156.000 176.000 164.954 176.000 176.000 C 176.000 187.046 167.046 196.000 156.000 196.000 Z"),
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
        return _bulldozer!!
    }

private var _bulldozer: ImageVector? = null
