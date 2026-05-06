package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.FileMinus: ImageVector
    get() {
        if (_fileMinus != null) return _fileMinus!!
        _fileMinus = radixIcon(
            name = "FileMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.598 1.01c.096 .019 .185 .066 .256 .137l2.927 2.927c.141 .141 .22 .331 .22 .53v7.896C13 13.328 12.328 14 11.5 14h-8C2.672 14 2 13.328 2 12.5v-10C2 1.672 2.672 1 3.5 1h6l.098 .01ZM3.5 2C3.224 2 3 2.224 3 2.5v10c0 .276 .224 .5 .5 .5h8c.276 0 .5-.224 .5-.5v-7.793L9.293 2h-5.793ZM9.75 7c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-4.5C4.974 8 4.75 7.776 4.75 7.5 4.75 7.224 4.974 7 5.25 7h4.5Z"),
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
        return _fileMinus!!
    }

private var _fileMinus: ImageVector? = null
