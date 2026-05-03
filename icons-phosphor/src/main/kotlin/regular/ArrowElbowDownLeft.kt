package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowElbowDownLeft: ImageVector
    get() {
        if (_arrowElbowDownLeft != null) return _arrowElbowDownLeft!!
        _arrowElbowDownLeft = phosphorRegularIcon(
            name = "ArrowElbowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 32.000 L 200.000 176.000 C 200.000 180.418 196.418 184.000 192.000 184.000 L 67.310 184.000 L 101.660 218.340 C 104.786 221.466 104.786 226.534 101.660 229.660 C 98.534 232.786 93.466 232.786 90.340 229.660 L 42.340 181.660 C 40.838 180.159 39.994 178.123 39.994 176.000 C 39.994 173.877 40.838 171.841 42.340 170.340 L 90.340 122.340 C 93.466 119.214 98.534 119.214 101.660 122.340 C 104.786 125.466 104.786 130.534 101.660 133.660 L 67.310 168.000 L 184.000 168.000 L 184.000 32.000 C 184.000 27.582 187.582 24.000 192.000 24.000 C 196.418 24.000 200.000 27.582 200.000 32.000 Z"),
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
        return _arrowElbowDownLeft!!
    }

private var _arrowElbowDownLeft: ImageVector? = null
