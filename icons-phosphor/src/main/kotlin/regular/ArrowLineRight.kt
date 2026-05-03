package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowLineRight: ImageVector
    get() {
        if (_arrowLineRight != null) return _arrowLineRight!!
        _arrowLineRight = phosphorRegularIcon(
            name = "ArrowLineRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 189.660 122.340 C 191.162 123.841 192.006 125.877 192.006 128.000 C 192.006 130.123 191.162 132.159 189.660 133.660 L 117.660 205.660 C 114.534 208.786 109.466 208.786 106.340 205.660 C 103.214 202.534 103.214 197.466 106.340 194.340 L 164.690 136.000 L 32.000 136.000 C 27.582 136.000 24.000 132.418 24.000 128.000 C 24.000 123.582 27.582 120.000 32.000 120.000 L 164.690 120.000 L 106.340 61.660 C 103.214 58.534 103.214 53.466 106.340 50.340 C 109.466 47.214 114.534 47.214 117.660 50.340 ZM 216.000 32.000 C 211.582 32.000 208.000 35.582 208.000 40.000 L 208.000 216.000 C 208.000 220.418 211.582 224.000 216.000 224.000 C 220.418 224.000 224.000 220.418 224.000 216.000 L 224.000 40.000 C 224.000 35.582 220.418 32.000 216.000 32.000 Z"),
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
        return _arrowLineRight!!
    }

private var _arrowLineRight: ImageVector? = null
