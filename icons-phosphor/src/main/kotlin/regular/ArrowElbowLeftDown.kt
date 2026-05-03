package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowElbowLeftDown: ImageVector
    get() {
        if (_arrowElbowLeftDown != null) return _arrowElbowLeftDown!!
        _arrowElbowLeftDown = phosphorRegularIcon(
            name = "ArrowElbowLeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 72.000 C 240.000 76.418 236.418 80.000 232.000 80.000 L 96.000 80.000 L 96.000 196.690 L 130.340 162.340 C 133.466 159.214 138.534 159.214 141.660 162.340 C 144.786 165.466 144.786 170.534 141.660 173.660 L 93.660 221.660 C 92.159 223.162 90.123 224.006 88.000 224.006 C 85.877 224.006 83.841 223.162 82.340 221.660 L 34.340 173.660 C 31.214 170.534 31.214 165.466 34.340 162.340 C 37.466 159.214 42.534 159.214 45.660 162.340 L 80.000 196.690 L 80.000 72.000 C 80.000 67.582 83.582 64.000 88.000 64.000 L 232.000 64.000 C 236.418 64.000 240.000 67.582 240.000 72.000 Z"),
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
        return _arrowElbowLeftDown!!
    }

private var _arrowElbowLeftDown: ImageVector? = null
