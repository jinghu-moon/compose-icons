package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Desktop: ImageVector
    get() {
        if (_desktop != null) return _desktop!!
        _desktop = radixIcon(
            name = "Desktop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.878 2.007C14.508 2.071 15 2.603 15 3.25v7.5C15 11.44 14.44 12 13.75 12h-3.823l.243 1.299 .01 .125c-.012 .287-.249 .526-.55 .526h-4.26c-.344-0-.603-.313-.54-.651L5.073 12h-3.823C.56 12 0 11.44 0 10.75v-7.5C0 2.56 .56 2 1.25 2h12.5l.128 .007ZM5.989 12l-.196 1.05h3.414L9.011 12h-3.021ZM1.25 3C1.112 3 1 3.112 1 3.25v7.5c0 .138 .112 .25 .25 .25h12.5c.138 0 .25-.112 .25-.25v-7.5c0-.121-.085-.222-.199-.245L13.75 3h-12.5Z"),
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
        return _desktop!!
    }

private var _desktop: ImageVector? = null
