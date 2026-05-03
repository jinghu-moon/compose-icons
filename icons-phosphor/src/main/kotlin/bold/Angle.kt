package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Angle: ImageVector
    get() {
        if (_angle != null) return _angle!!
        _angle = phosphorBoldIcon(
            name = "Angle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 252.000 200.000 C 252.000 206.627 246.627 212.000 240.000 212.000 L 72.000 212.000 C 65.373 212.000 60.000 206.627 60.000 200.000 L 60.000 84.000 L 32.000 84.000 C 25.373 84.000 20.000 78.627 20.000 72.000 C 20.000 65.373 25.373 60.000 32.000 60.000 L 60.000 60.000 L 60.000 32.000 C 60.000 25.373 65.373 20.000 72.000 20.000 C 78.627 20.000 84.000 25.373 84.000 32.000 L 84.000 188.000 L 240.000 188.000 C 246.627 188.000 252.000 193.373 252.000 200.000 ZM 111.000 84.290 C 151.860 87.710 184.280 120.130 187.700 160.990 C 188.220 167.205 193.413 171.986 199.650 171.990 C 199.980 171.990 200.310 171.990 200.650 171.990 C 203.837 171.736 206.791 170.220 208.856 167.779 C 210.921 165.339 211.927 162.175 211.650 158.990 C 207.252 106.441 165.550 64.752 113.000 60.370 C 106.395 59.818 100.592 64.725 100.040 71.330 C 99.488 77.935 104.395 83.738 111.000 84.290 Z"),
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
        return _angle!!
    }

private var _angle: ImageVector? = null
