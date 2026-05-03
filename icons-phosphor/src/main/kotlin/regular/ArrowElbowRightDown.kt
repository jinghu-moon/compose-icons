package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowElbowRightDown: ImageVector
    get() {
        if (_arrowElbowRightDown != null) return _arrowElbowRightDown!!
        _arrowElbowRightDown = phosphorRegularIcon(
            name = "ArrowElbowRightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 229.660 165.660 L 181.660 213.660 C 180.159 215.162 178.123 216.006 176.000 216.006 C 173.877 216.006 171.841 215.162 170.340 213.660 L 122.340 165.660 C 119.214 162.534 119.214 157.466 122.340 154.340 C 125.466 151.214 130.534 151.214 133.660 154.340 L 168.000 188.690 L 168.000 72.000 L 32.000 72.000 C 27.582 72.000 24.000 68.418 24.000 64.000 C 24.000 59.582 27.582 56.000 32.000 56.000 L 176.000 56.000 C 180.418 56.000 184.000 59.582 184.000 64.000 L 184.000 188.690 L 218.340 154.340 C 221.466 151.214 226.534 151.214 229.660 154.340 C 232.786 157.466 232.786 162.534 229.660 165.660 Z"),
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
        return _arrowElbowRightDown!!
    }

private var _arrowElbowRightDown: ImageVector? = null
