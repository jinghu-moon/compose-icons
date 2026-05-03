package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowLineDown: ImageVector
    get() {
        if (_arrowLineDown != null) return _arrowLineDown!!
        _arrowLineDown = phosphorFillIcon(
            name = "ArrowLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 50.340 117.660 C 48.049 115.372 47.364 111.929 48.603 108.938 C 49.842 105.947 52.762 103.997 56.000 104.000 L 120.000 104.000 L 120.000 32.000 C 120.000 27.582 123.582 24.000 128.000 24.000 C 132.418 24.000 136.000 27.582 136.000 32.000 L 136.000 104.000 L 200.000 104.000 C 203.238 103.997 206.158 105.947 207.397 108.938 C 208.636 111.929 207.951 115.372 205.660 117.660 L 133.660 189.660 C 132.159 191.162 130.123 192.006 128.000 192.006 C 125.877 192.006 123.841 191.162 122.340 189.660 ZM 216.000 208.000 L 40.000 208.000 C 35.582 208.000 32.000 211.582 32.000 216.000 C 32.000 220.418 35.582 224.000 40.000 224.000 L 216.000 224.000 C 220.418 224.000 224.000 220.418 224.000 216.000 C 224.000 211.582 220.418 208.000 216.000 208.000 Z"),
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
        return _arrowLineDown!!
    }

private var _arrowLineDown: ImageVector? = null
