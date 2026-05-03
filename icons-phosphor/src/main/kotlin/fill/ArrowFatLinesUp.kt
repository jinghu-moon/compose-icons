package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowFatLinesUp: ImageVector
    get() {
        if (_arrowFatLinesUp != null) return _arrowFatLinesUp!!
        _arrowFatLinesUp = phosphorFillIcon(
            name = "ArrowFatLinesUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 216.000 C 184.000 220.418 180.418 224.000 176.000 224.000 L 80.000 224.000 C 75.582 224.000 72.000 220.418 72.000 216.000 C 72.000 211.582 75.582 208.000 80.000 208.000 L 176.000 208.000 C 180.418 208.000 184.000 211.582 184.000 216.000 ZM 229.660 114.340 L 133.660 18.340 C 132.159 16.838 130.123 15.994 128.000 15.994 C 125.877 15.994 123.841 16.838 122.340 18.340 L 26.340 114.340 C 24.049 116.628 23.364 120.071 24.603 123.062 C 25.842 126.053 28.762 128.003 32.000 128.000 L 72.000 128.000 L 72.000 152.000 C 72.000 156.418 75.582 160.000 80.000 160.000 L 176.000 160.000 C 180.418 160.000 184.000 156.418 184.000 152.000 L 184.000 128.000 L 224.000 128.000 C 227.238 128.003 230.158 126.053 231.397 123.062 C 232.636 120.071 231.951 116.628 229.660 114.340 ZM 176.000 176.000 L 80.000 176.000 C 75.582 176.000 72.000 179.582 72.000 184.000 C 72.000 188.418 75.582 192.000 80.000 192.000 L 176.000 192.000 C 180.418 192.000 184.000 188.418 184.000 184.000 C 184.000 179.582 180.418 176.000 176.000 176.000 Z"),
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
        return _arrowFatLinesUp!!
    }

private var _arrowFatLinesUp: ImageVector? = null
