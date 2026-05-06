package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Crosshair2: ImageVector
    get() {
        if (_crosshair2 != null) return _crosshair2!!
        _crosshair2 = radixIcon(
            name = "Crosshair2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 0C7.776 0 8 .224 8 .5v1.308c2.692 .287 4.815 2.473 5.005 5.192h1.495c.276 0 .5 .224 .5 .5C15 7.776 14.776 8 14.5 8h-1.513C12.708 10.624 10.624 12.708 8 12.987v1.513C8 14.776 7.776 15 7.5 15 7.224 15 7 14.776 7 14.5v-1.496C4.28 12.814 2.095 10.692 1.809 8h-1.309C.224 8 0 7.776 0 7.5 0 7.224 .224 7 .5 7h1.291C1.986 4.212 4.212 1.986 7 1.791v-1.291C7 .224 7.224 0 7.5 0ZM7 2.742C4.737 2.933 2.934 4.737 2.743 7h2.757C5.776 7 6 7.224 6 7.5 6 7.776 5.776 8 5.5 8h-2.735c.279 2.167 2.041 3.867 4.235 4.052v-2.552C7 9.224 7.224 9 7.5 9 7.776 9 8 9.224 8 9.5v2.53C10.099 11.76 11.76 10.099 12.03 8h-2.53C9.224 8 9 7.776 9 7.5 9 7.224 9.224 7 9.5 7h2.552C11.867 4.805 10.167 3.044 8 2.765v2.735C8 5.776 7.776 6 7.5 6 7.224 6 7 5.776 7 5.5v-2.758Z"),
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
        return _crosshair2!!
    }

private var _crosshair2: ImageVector? = null
