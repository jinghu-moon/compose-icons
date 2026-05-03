package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Archive: ImageVector
    get() {
        if (_archive != null) return _archive!!
        _archive = radixIcon(
            name = "Archive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.691 1.000 C 12.070 1.000 12.416 1.214 12.585 1.553 L 13.947 4.276 L 13.986 4.385 C 13.995 4.422 14.000 4.461 14.000 4.500 L 14.000 13.000 C 14.000 13.552 13.552 14.000 13.000 14.000 L 2.000 14.000 C 1.448 14.000 1.000 13.552 1.000 13.000 L 1.000 4.500 C 1.000 4.422 1.018 4.346 1.053 4.276 L 2.415 1.553 L 2.486 1.432 C 2.671 1.164 2.977 1.000 3.309 1.000 L 11.691 1.000 ZM 2.000 13.000 L 13.000 13.000 L 13.000 5.000 L 2.000 5.000 L 2.000 13.000 ZM 9.500 7.000 C 9.776 7.000 10.000 7.224 10.000 7.500 C 10.000 7.776 9.776 8.000 9.500 8.000 L 5.500 8.000 C 5.224 8.000 5.000 7.776 5.000 7.500 C 5.000 7.224 5.224 7.000 5.500 7.000 L 9.500 7.000 ZM 2.309 4.000 L 7.000 4.000 L 7.000 2.000 L 3.309 2.000 L 2.309 4.000 ZM 8.000 4.000 L 12.691 4.000 L 11.691 2.000 L 8.000 2.000 L 8.000 4.000 Z"),
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
        return _archive!!
    }

private var _archive: ImageVector? = null
