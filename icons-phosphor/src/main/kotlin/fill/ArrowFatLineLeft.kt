package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowFatLineLeft: ImageVector
    get() {
        if (_arrowFatLineLeft != null) return _arrowFatLineLeft!!
        _arrowFatLineLeft = phosphorFillIcon(
            name = "ArrowFatLineLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 80.000 L 192.000 176.000 C 192.000 180.418 188.418 184.000 184.000 184.000 L 128.000 184.000 L 128.000 224.000 C 128.003 227.238 126.053 230.158 123.062 231.397 C 120.071 232.636 116.628 231.951 114.340 229.660 L 18.340 133.660 C 16.838 132.159 15.994 130.123 15.994 128.000 C 15.994 125.877 16.838 123.841 18.340 122.340 L 114.340 26.340 C 116.628 24.049 120.071 23.364 123.062 24.603 C 126.053 25.842 128.003 28.762 128.000 32.000 L 128.000 72.000 L 184.000 72.000 C 188.418 72.000 192.000 75.582 192.000 80.000 ZM 216.000 72.000 C 211.582 72.000 208.000 75.582 208.000 80.000 L 208.000 176.000 C 208.000 180.418 211.582 184.000 216.000 184.000 C 220.418 184.000 224.000 180.418 224.000 176.000 L 224.000 80.000 C 224.000 75.582 220.418 72.000 216.000 72.000 Z"),
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
        return _arrowFatLineLeft!!
    }

private var _arrowFatLineLeft: ImageVector? = null
