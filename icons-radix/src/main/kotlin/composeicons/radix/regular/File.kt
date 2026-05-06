package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.File: ImageVector
    get() {
        if (_file != null) return _file!!
        _file = radixIcon(
            name = "File",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.598 1.01c.096 .019 .185 .066 .256 .137l4 4c.094 .094 .146 .221 .146 .354v7C13 13.328 12.328 14 11.5 14h-8C2.672 14 2 13.328 2 12.5v-10C2 1.672 2.672 1 3.5 1h5l.098 .01ZM3.5 2C3.224 2 3 2.224 3 2.5v10c0 .276 .224 .5 .5 .5h8c.276 0 .5-.224 .5-.5v-6.5h-3.5C8.224 6 8 5.776 8 5.5v-3.5h-4.5ZM9 5h2.293L9 2.707v2.293Z"),
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
        return _file!!
    }

private var _file: ImageVector? = null
