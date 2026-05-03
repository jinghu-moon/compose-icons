package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretDoubleRight: ImageVector
    get() {
        if (_caretDoubleRight != null) return _caretDoubleRight!!
        _caretDoubleRight = phosphorRegularIcon(
            name = "CaretDoubleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 141.660 133.660 L 61.660 213.660 C 58.534 216.786 53.466 216.786 50.340 213.660 C 47.214 210.534 47.214 205.466 50.340 202.340 L 124.690 128.000 L 50.340 53.660 C 47.214 50.534 47.214 45.466 50.340 42.340 C 53.466 39.214 58.534 39.214 61.660 42.340 L 141.660 122.340 C 143.162 123.841 144.006 125.877 144.006 128.000 C 144.006 130.123 143.162 132.159 141.660 133.660 ZM 221.660 122.340 L 141.660 42.340 C 138.534 39.214 133.466 39.214 130.340 42.340 C 127.214 45.466 127.214 50.534 130.340 53.660 L 204.690 128.000 L 130.340 202.340 C 127.214 205.466 127.214 210.534 130.340 213.660 C 133.466 216.786 138.534 216.786 141.660 213.660 L 221.660 133.660 C 223.162 132.159 224.006 130.123 224.006 128.000 C 224.006 125.877 223.162 123.841 221.660 122.340 Z"),
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
        return _caretDoubleRight!!
    }

private var _caretDoubleRight: ImageVector? = null
