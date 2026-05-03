package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.EnvelopeClosed: ImageVector
    get() {
        if (_envelopeClosed != null) return _envelopeClosed!!
        _envelopeClosed = radixIcon(
            name = "EnvelopeClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 2.000 C 14.552 2.000 15.000 2.448 15.000 3.000 L 15.000 12.000 C 15.000 12.552 14.552 13.000 14.000 13.000 L 1.000 13.000 C 0.448 13.000 0.000 12.552 0.000 12.000 L 0.000 3.000 C 0.000 2.448 0.448 2.000 1.000 2.000 L 14.000 2.000 ZM 7.741 8.880 C 7.612 8.962 7.452 8.972 7.315 8.910 L 7.259 8.880 L 1.000 4.907 L 1.000 12.000 L 14.000 12.000 L 14.000 4.907 L 7.741 8.880 ZM 1.000 3.925 C 1.054 3.925 1.107 3.934 1.159 3.954 L 1.241 3.995 L 7.500 7.967 L 13.759 3.995 C 13.834 3.948 13.917 3.925 14.000 3.925 L 14.000 3.000 L 1.000 3.000 L 1.000 3.925 Z"),
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
        return _envelopeClosed!!
    }

private var _envelopeClosed: ImageVector? = null
