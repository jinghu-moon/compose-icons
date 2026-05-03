package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Laptop: ImageVector
    get() {
        if (_laptop != null) return _laptop!!
        _laptop = radixIcon(
            name = "Laptop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.750 3.000 C 13.440 3.000 14.000 3.560 14.000 4.250 L 14.000 12.000 L 15.000 12.000 L 15.000 12.500 C 15.000 12.776 14.776 13.000 14.500 13.000 L 0.500 13.000 C 0.224 13.000 0.000 12.776 0.000 12.500 L 0.000 12.000 L 1.000 12.000 L 1.000 4.250 C 1.000 3.560 1.560 3.000 2.250 3.000 L 12.750 3.000 ZM 2.250 4.000 C 2.112 4.000 2.000 4.112 2.000 4.250 L 2.000 11.500 L 13.000 11.500 L 13.000 4.250 C 13.000 4.112 12.888 4.000 12.750 4.000 L 2.250 4.000 Z"),
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
        return _laptop!!
    }

private var _laptop: ImageVector? = null
