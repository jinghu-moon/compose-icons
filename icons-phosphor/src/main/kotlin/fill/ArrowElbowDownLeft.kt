package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowElbowDownLeft: ImageVector
    get() {
        if (_arrowElbowDownLeft != null) return _arrowElbowDownLeft!!
        _arrowElbowDownLeft = phosphorFillIcon(
            name = "ArrowElbowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 32.000 L 200.000 176.000 C 200.000 180.418 196.418 184.000 192.000 184.000 L 104.000 184.000 L 104.000 224.000 C 104.003 227.238 102.053 230.158 99.062 231.397 C 96.071 232.636 92.628 231.951 90.340 229.660 L 42.340 181.660 C 40.838 180.159 39.994 178.123 39.994 176.000 C 39.994 173.877 40.838 171.841 42.340 170.340 L 90.340 122.340 C 92.628 120.049 96.071 119.364 99.062 120.603 C 102.053 121.842 104.003 124.762 104.000 128.000 L 104.000 168.000 L 184.000 168.000 L 184.000 32.000 C 184.000 27.582 187.582 24.000 192.000 24.000 C 196.418 24.000 200.000 27.582 200.000 32.000 Z"),
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
        return _arrowElbowDownLeft!!
    }

private var _arrowElbowDownLeft: ImageVector? = null
