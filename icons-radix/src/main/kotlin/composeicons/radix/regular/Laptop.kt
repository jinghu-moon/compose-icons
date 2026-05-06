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
                pathData = parseSvgPathData("M12.75 3C13.44 3 14 3.56 14 4.25v7.75h1v.5c0 .276-.224 .5-.5 .5h-14C.224 13 0 12.776 0 12.5v-.5h1v-7.75C1 3.56 1.56 3 2.25 3h10.5ZM2.25 4C2.112 4 2 4.112 2 4.25v7.25h11v-7.25C13 4.112 12.888 4 12.75 4h-10.5Z"),
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
