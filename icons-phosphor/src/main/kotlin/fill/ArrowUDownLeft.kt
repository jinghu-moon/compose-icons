package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowUDownLeft: ImageVector
    get() {
        if (_arrowUDownLeft != null) return _arrowUDownLeft!!
        _arrowUDownLeft = phosphorFillIcon(
            name = "ArrowUDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 112.000 C 231.961 147.330 203.330 175.961 168.000 176.000 L 88.000 176.000 L 88.000 216.000 C 88.003 219.238 86.053 222.158 83.062 223.397 C 80.071 224.636 76.628 223.951 74.340 221.660 L 26.340 173.660 C 24.838 172.159 23.994 170.123 23.994 168.000 C 23.994 165.877 24.838 163.841 26.340 162.340 L 74.340 114.340 C 76.628 112.049 80.071 111.364 83.062 112.603 C 86.053 113.842 88.003 116.762 88.000 120.000 L 88.000 160.000 L 168.000 160.000 C 194.510 160.000 216.000 138.510 216.000 112.000 C 216.000 85.490 194.510 64.000 168.000 64.000 L 80.000 64.000 C 75.582 64.000 72.000 60.418 72.000 56.000 C 72.000 51.582 75.582 48.000 80.000 48.000 L 168.000 48.000 C 203.330 48.039 231.961 76.670 232.000 112.000 Z"),
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
        return _arrowUDownLeft!!
    }

private var _arrowUDownLeft: ImageVector? = null
