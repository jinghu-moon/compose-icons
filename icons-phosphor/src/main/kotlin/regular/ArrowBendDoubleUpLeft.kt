package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowBendDoubleUpLeft: ImageVector
    get() {
        if (_arrowBendDoubleUpLeft != null) return _arrowBendDoubleUpLeft!!
        _arrowBendDoubleUpLeft = phosphorRegularIcon(
            name = "ArrowBendDoubleUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 85.660 146.340 C 88.786 149.466 88.786 154.534 85.660 157.660 C 82.534 160.786 77.466 160.786 74.340 157.660 L 26.340 109.660 C 24.838 108.159 23.994 106.123 23.994 104.000 C 23.994 101.877 24.838 99.841 26.340 98.340 L 74.340 50.340 C 77.466 47.214 82.534 47.214 85.660 50.340 C 88.786 53.466 88.786 58.534 85.660 61.660 L 43.310 104.000 ZM 128.000 96.000 L 99.310 96.000 L 133.660 61.660 C 136.786 58.534 136.786 53.466 133.660 50.340 C 130.534 47.214 125.466 47.214 122.340 50.340 L 74.340 98.340 C 72.838 99.841 71.994 101.877 71.994 104.000 C 71.994 106.123 72.838 108.159 74.340 109.660 L 122.340 157.660 C 125.466 160.786 130.534 160.786 133.660 157.660 C 136.786 154.534 136.786 149.466 133.660 146.340 L 99.310 112.000 L 128.000 112.000 C 176.578 112.055 215.945 151.422 216.000 200.000 C 216.000 204.418 219.582 208.000 224.000 208.000 C 228.418 208.000 232.000 204.418 232.000 200.000 C 231.939 142.588 185.412 96.061 128.000 96.000 Z"),
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
        return _arrowBendDoubleUpLeft!!
    }

private var _arrowBendDoubleUpLeft: ImageVector? = null
