package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) return _arrowUp!!
        _arrowUp = phosphorRegularIcon(
            name = "ArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 205.660 117.660 C 204.159 119.162 202.123 120.006 200.000 120.006 C 197.877 120.006 195.841 119.162 194.340 117.660 L 136.000 59.310 L 136.000 216.000 C 136.000 220.418 132.418 224.000 128.000 224.000 C 123.582 224.000 120.000 220.418 120.000 216.000 L 120.000 59.310 L 61.660 117.660 C 58.534 120.786 53.466 120.786 50.340 117.660 C 47.214 114.534 47.214 109.466 50.340 106.340 L 122.340 34.340 C 123.841 32.838 125.877 31.994 128.000 31.994 C 130.123 31.994 132.159 32.838 133.660 34.340 L 205.660 106.340 C 207.162 107.841 208.006 109.877 208.006 112.000 C 208.006 114.123 207.162 116.159 205.660 117.660 Z"),
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
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
