package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowElbowRightUp: ImageVector
    get() {
        if (_arrowElbowRightUp != null) return _arrowElbowRightUp!!
        _arrowElbowRightUp = phosphorRegularIcon(
            name = "ArrowElbowRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 221.660 101.660 C 220.159 103.162 218.123 104.006 216.000 104.006 C 213.877 104.006 211.841 103.162 210.340 101.660 L 176.000 67.310 L 176.000 192.000 C 176.000 196.418 172.418 200.000 168.000 200.000 L 24.000 200.000 C 19.582 200.000 16.000 196.418 16.000 192.000 C 16.000 187.582 19.582 184.000 24.000 184.000 L 160.000 184.000 L 160.000 67.310 L 125.660 101.660 C 122.534 104.786 117.466 104.786 114.340 101.660 C 111.214 98.534 111.214 93.466 114.340 90.340 L 162.340 42.340 C 163.841 40.838 165.877 39.994 168.000 39.994 C 170.123 39.994 172.159 40.838 173.660 42.340 L 221.660 90.340 C 223.162 91.841 224.006 93.877 224.006 96.000 C 224.006 98.123 223.162 100.159 221.660 101.660 Z"),
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
        return _arrowElbowRightUp!!
    }

private var _arrowElbowRightUp: ImageVector? = null
