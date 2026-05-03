package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowLineRight: ImageVector
    get() {
        if (_arrowLineRight != null) return _arrowLineRight!!
        _arrowLineRight = phosphorFillIcon(
            name = "ArrowLineRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 40.000 L 224.000 216.000 C 224.000 220.418 220.418 224.000 216.000 224.000 C 211.582 224.000 208.000 220.418 208.000 216.000 L 208.000 40.000 C 208.000 35.582 211.582 32.000 216.000 32.000 C 220.418 32.000 224.000 35.582 224.000 40.000 ZM 117.660 50.340 C 115.372 48.049 111.929 47.364 108.938 48.603 C 105.947 49.842 103.997 52.762 104.000 56.000 L 104.000 120.000 L 32.000 120.000 C 27.582 120.000 24.000 123.582 24.000 128.000 C 24.000 132.418 27.582 136.000 32.000 136.000 L 104.000 136.000 L 104.000 200.000 C 103.997 203.238 105.947 206.158 108.938 207.397 C 111.929 208.636 115.372 207.951 117.660 205.660 L 189.660 133.660 C 191.162 132.159 192.006 130.123 192.006 128.000 C 192.006 125.877 191.162 123.841 189.660 122.340 Z"),
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
        return _arrowLineRight!!
    }

private var _arrowLineRight: ImageVector? = null
