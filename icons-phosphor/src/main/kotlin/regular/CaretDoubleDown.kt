package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretDoubleDown: ImageVector
    get() {
        if (_caretDoubleDown != null) return _caretDoubleDown!!
        _caretDoubleDown = phosphorRegularIcon(
            name = "CaretDoubleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 213.660 130.340 C 215.162 131.841 216.006 133.877 216.006 136.000 C 216.006 138.123 215.162 140.159 213.660 141.660 L 133.660 221.660 C 132.159 223.162 130.123 224.006 128.000 224.006 C 125.877 224.006 123.841 223.162 122.340 221.660 L 42.340 141.660 C 39.214 138.534 39.214 133.466 42.340 130.340 C 45.466 127.214 50.534 127.214 53.660 130.340 L 128.000 204.690 L 202.340 130.340 C 203.841 128.838 205.877 127.994 208.000 127.994 C 210.123 127.994 212.159 128.838 213.660 130.340 ZM 122.340 141.660 C 123.841 143.162 125.877 144.006 128.000 144.006 C 130.123 144.006 132.159 143.162 133.660 141.660 L 213.660 61.660 C 216.786 58.534 216.786 53.466 213.660 50.340 C 210.534 47.214 205.466 47.214 202.340 50.340 L 128.000 124.690 L 53.660 50.340 C 50.534 47.214 45.466 47.214 42.340 50.340 C 39.214 53.466 39.214 58.534 42.340 61.660 Z"),
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
        return _caretDoubleDown!!
    }

private var _caretDoubleDown: ImageVector? = null
