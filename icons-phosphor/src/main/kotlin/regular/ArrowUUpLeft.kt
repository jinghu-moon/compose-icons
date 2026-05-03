package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowUUpLeft: ImageVector
    get() {
        if (_arrowUUpLeft != null) return _arrowUUpLeft!!
        _arrowUUpLeft = phosphorRegularIcon(
            name = "ArrowUUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 144.000 C 231.961 179.330 203.330 207.961 168.000 208.000 L 80.000 208.000 C 75.582 208.000 72.000 204.418 72.000 200.000 C 72.000 195.582 75.582 192.000 80.000 192.000 L 168.000 192.000 C 194.510 192.000 216.000 170.510 216.000 144.000 C 216.000 117.490 194.510 96.000 168.000 96.000 L 51.310 96.000 L 85.660 130.340 C 88.786 133.466 88.786 138.534 85.660 141.660 C 82.534 144.786 77.466 144.786 74.340 141.660 L 26.340 93.660 C 24.838 92.159 23.994 90.123 23.994 88.000 C 23.994 85.877 24.838 83.841 26.340 82.340 L 74.340 34.340 C 77.466 31.214 82.534 31.214 85.660 34.340 C 88.786 37.466 88.786 42.534 85.660 45.660 L 51.310 80.000 L 168.000 80.000 C 203.330 80.039 231.961 108.670 232.000 144.000 Z"),
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
        return _arrowUUpLeft!!
    }

private var _arrowUUpLeft: ImageVector? = null
