package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowULeftUp: ImageVector
    get() {
        if (_arrowULeftUp != null) return _arrowULeftUp!!
        _arrowULeftUp = phosphorRegularIcon(
            name = "ArrowULeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 80.000 L 208.000 168.000 C 208.000 203.346 179.346 232.000 144.000 232.000 C 108.654 232.000 80.000 203.346 80.000 168.000 L 80.000 51.310 L 45.660 85.660 C 42.534 88.786 37.466 88.786 34.340 85.660 C 31.214 82.534 31.214 77.466 34.340 74.340 L 82.340 26.340 C 83.841 24.838 85.877 23.994 88.000 23.994 C 90.123 23.994 92.159 24.838 93.660 26.340 L 141.660 74.340 C 144.786 77.466 144.786 82.534 141.660 85.660 C 138.534 88.786 133.466 88.786 130.340 85.660 L 96.000 51.310 L 96.000 168.000 C 96.000 194.510 117.490 216.000 144.000 216.000 C 170.510 216.000 192.000 194.510 192.000 168.000 L 192.000 80.000 C 192.000 75.582 195.582 72.000 200.000 72.000 C 204.418 72.000 208.000 75.582 208.000 80.000 Z"),
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
        return _arrowULeftUp!!
    }

private var _arrowULeftUp: ImageVector? = null
