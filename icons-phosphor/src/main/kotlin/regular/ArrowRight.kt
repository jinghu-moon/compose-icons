package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowRight: ImageVector
    get() {
        if (_arrowRight != null) return _arrowRight!!
        _arrowRight = phosphorRegularIcon(
            name = "ArrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 221.660 133.660 L 149.660 205.660 C 146.534 208.786 141.466 208.786 138.340 205.660 C 135.214 202.534 135.214 197.466 138.340 194.340 L 196.690 136.000 L 40.000 136.000 C 35.582 136.000 32.000 132.418 32.000 128.000 C 32.000 123.582 35.582 120.000 40.000 120.000 L 196.690 120.000 L 138.340 61.660 C 135.214 58.534 135.214 53.466 138.340 50.340 C 141.466 47.214 146.534 47.214 149.660 50.340 L 221.660 122.340 C 223.162 123.841 224.006 125.877 224.006 128.000 C 224.006 130.123 223.162 132.159 221.660 133.660 Z"),
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
        return _arrowRight!!
    }

private var _arrowRight: ImageVector? = null
