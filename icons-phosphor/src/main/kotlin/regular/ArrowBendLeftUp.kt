package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowBendLeftUp: ImageVector
    get() {
        if (_arrowBendLeftUp != null) return _arrowBendLeftUp!!
        _arrowBendLeftUp = phosphorRegularIcon(
            name = "ArrowBendLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 224.000 C 208.000 228.418 204.418 232.000 200.000 232.000 C 142.588 231.939 96.061 185.412 96.000 128.000 L 96.000 51.310 L 61.660 85.660 C 58.534 88.786 53.466 88.786 50.340 85.660 C 47.214 82.534 47.214 77.466 50.340 74.340 L 98.340 26.340 C 99.841 24.838 101.877 23.994 104.000 23.994 C 106.123 23.994 108.159 24.838 109.660 26.340 L 157.660 74.340 C 160.786 77.466 160.786 82.534 157.660 85.660 C 154.534 88.786 149.466 88.786 146.340 85.660 L 112.000 51.310 L 112.000 128.000 C 112.055 176.578 151.422 215.945 200.000 216.000 C 204.418 216.000 208.000 219.582 208.000 224.000 Z"),
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
        return _arrowBendLeftUp!!
    }

private var _arrowBendLeftUp: ImageVector? = null
