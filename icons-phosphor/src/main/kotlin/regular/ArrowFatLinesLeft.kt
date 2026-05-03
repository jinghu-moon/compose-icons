package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowFatLinesLeft: ImageVector
    get() {
        if (_arrowFatLinesLeft != null) return _arrowFatLinesLeft!!
        _arrowFatLinesLeft = phosphorRegularIcon(
            name = "ArrowFatLinesLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 152.000 72.000 L 128.000 72.000 L 128.000 32.000 C 128.003 28.762 126.053 25.842 123.062 24.603 C 120.071 23.364 116.628 24.049 114.340 26.340 L 18.340 122.340 C 16.838 123.841 15.994 125.877 15.994 128.000 C 15.994 130.123 16.838 132.159 18.340 133.660 L 114.340 229.660 C 116.628 231.951 120.071 232.636 123.062 231.397 C 126.053 230.158 128.003 227.238 128.000 224.000 L 128.000 184.000 L 152.000 184.000 C 156.418 184.000 160.000 180.418 160.000 176.000 L 160.000 80.000 C 160.000 75.582 156.418 72.000 152.000 72.000 ZM 144.000 168.000 L 120.000 168.000 C 115.582 168.000 112.000 171.582 112.000 176.000 L 112.000 204.690 L 35.310 128.000 L 112.000 51.310 L 112.000 80.000 C 112.000 84.418 115.582 88.000 120.000 88.000 L 144.000 88.000 ZM 224.000 80.000 L 224.000 176.000 C 224.000 180.418 220.418 184.000 216.000 184.000 C 211.582 184.000 208.000 180.418 208.000 176.000 L 208.000 80.000 C 208.000 75.582 211.582 72.000 216.000 72.000 C 220.418 72.000 224.000 75.582 224.000 80.000 ZM 192.000 80.000 L 192.000 176.000 C 192.000 180.418 188.418 184.000 184.000 184.000 C 179.582 184.000 176.000 180.418 176.000 176.000 L 176.000 80.000 C 176.000 75.582 179.582 72.000 184.000 72.000 C 188.418 72.000 192.000 75.582 192.000 80.000 Z"),
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
        return _arrowFatLinesLeft!!
    }

private var _arrowFatLinesLeft: ImageVector? = null
