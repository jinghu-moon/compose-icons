package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowUDownLeft: ImageVector
    get() {
        if (_arrowUDownLeft != null) return _arrowUDownLeft!!
        _arrowUDownLeft = phosphorRegularIcon(
            name = "ArrowUDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 112.000 C 231.961 147.330 203.330 175.961 168.000 176.000 L 51.310 176.000 L 85.660 210.340 C 88.786 213.466 88.786 218.534 85.660 221.660 C 82.534 224.786 77.466 224.786 74.340 221.660 L 26.340 173.660 C 24.838 172.159 23.994 170.123 23.994 168.000 C 23.994 165.877 24.838 163.841 26.340 162.340 L 74.340 114.340 C 77.466 111.214 82.534 111.214 85.660 114.340 C 88.786 117.466 88.786 122.534 85.660 125.660 L 51.310 160.000 L 168.000 160.000 C 194.510 160.000 216.000 138.510 216.000 112.000 C 216.000 85.490 194.510 64.000 168.000 64.000 L 80.000 64.000 C 75.582 64.000 72.000 60.418 72.000 56.000 C 72.000 51.582 75.582 48.000 80.000 48.000 L 168.000 48.000 C 203.330 48.039 231.961 76.670 232.000 112.000 Z"),
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
