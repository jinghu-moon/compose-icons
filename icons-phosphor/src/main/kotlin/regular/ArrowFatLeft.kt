package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowFatLeft: ImageVector
    get() {
        if (_arrowFatLeft != null) return _arrowFatLeft!!
        _arrowFatLeft = phosphorRegularIcon(
            name = "ArrowFatLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 72.000 L 128.000 72.000 L 128.000 32.000 C 128.003 28.762 126.053 25.842 123.062 24.603 C 120.071 23.364 116.628 24.049 114.340 26.340 L 18.340 122.340 C 16.838 123.841 15.994 125.877 15.994 128.000 C 15.994 130.123 16.838 132.159 18.340 133.660 L 114.340 229.660 C 116.628 231.951 120.071 232.636 123.062 231.397 C 126.053 230.158 128.003 227.238 128.000 224.000 L 128.000 184.000 L 208.000 184.000 C 216.837 184.000 224.000 176.837 224.000 168.000 L 224.000 88.000 C 224.000 79.163 216.837 72.000 208.000 72.000 ZM 208.000 168.000 L 120.000 168.000 C 115.582 168.000 112.000 171.582 112.000 176.000 L 112.000 204.690 L 35.310 128.000 L 112.000 51.310 L 112.000 80.000 C 112.000 84.418 115.582 88.000 120.000 88.000 L 208.000 88.000 Z"),
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
        return _arrowFatLeft!!
    }

private var _arrowFatLeft: ImageVector? = null
