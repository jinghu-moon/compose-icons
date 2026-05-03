package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowElbowRightUp: ImageVector
    get() {
        if (_arrowElbowRightUp != null) return _arrowElbowRightUp!!
        _arrowElbowRightUp = phosphorFillIcon(
            name = "ArrowElbowRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 223.390 99.060 C 222.152 102.050 219.236 103.999 216.000 104.000 L 176.000 104.000 L 176.000 192.000 C 176.000 196.418 172.418 200.000 168.000 200.000 L 24.000 200.000 C 19.582 200.000 16.000 196.418 16.000 192.000 C 16.000 187.582 19.582 184.000 24.000 184.000 L 160.000 184.000 L 160.000 104.000 L 120.000 104.000 C 116.762 104.003 113.842 102.053 112.603 99.062 C 111.364 96.071 112.049 92.628 114.340 90.340 L 162.340 42.340 C 163.841 40.838 165.877 39.994 168.000 39.994 C 170.123 39.994 172.159 40.838 173.660 42.340 L 221.660 90.340 C 223.947 92.629 224.630 96.071 223.390 99.060 Z"),
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
        return _arrowElbowRightUp!!
    }

private var _arrowElbowRightUp: ImageVector? = null
