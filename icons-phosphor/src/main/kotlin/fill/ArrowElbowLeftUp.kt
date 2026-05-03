package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowElbowLeftUp: ImageVector
    get() {
        if (_arrowElbowLeftUp != null) return _arrowElbowLeftUp!!
        _arrowElbowLeftUp = phosphorFillIcon(
            name = "ArrowElbowLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 192.000 C 240.000 196.418 236.418 200.000 232.000 200.000 L 88.000 200.000 C 83.582 200.000 80.000 196.418 80.000 192.000 L 80.000 104.000 L 40.000 104.000 C 36.762 104.003 33.842 102.053 32.603 99.062 C 31.364 96.071 32.049 92.628 34.340 90.340 L 82.340 42.340 C 83.841 40.838 85.877 39.994 88.000 39.994 C 90.123 39.994 92.159 40.838 93.660 42.340 L 141.660 90.340 C 143.951 92.628 144.636 96.071 143.397 99.062 C 142.158 102.053 139.238 104.003 136.000 104.000 L 96.000 104.000 L 96.000 184.000 L 232.000 184.000 C 236.418 184.000 240.000 187.582 240.000 192.000 Z"),
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
        return _arrowElbowLeftUp!!
    }

private var _arrowElbowLeftUp: ImageVector? = null
